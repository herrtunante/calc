package org.openforis.calc.r;

//import org.rosuda.JRI.RMainLoopCallbacks;
//import org.rosuda.JRI.Rengine;
import java.lang.reflect.InvocationTargetException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.REngine;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.REngineStdOutput;
import org.rosuda.REngine.JRI.JRIEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/*
 * Synchronized access to R native engine
 * 
 * To use:
	1. Install R and rJava using sudo calc/lib/install.sh
	2. Set env R_HOME=/usr/lib/R or equivalent
	3. Add to Java param -Djava.library.path=.:/usr/local/lib/R/site-library/rJava/jri or equivalent
 * 
 * @author G. Miceli
 *
 */
@Component
public class R {
	private static final String[] R_PARAMS = {"--vanilla", "--slave"};
	private REngine engine;
	private Logger logger;

	public R() {
		this.logger = LoggerFactory.getLogger(getClass());
	}
	
	@PostConstruct
	synchronized
	public void startup() {
		try {
			this.engine = REngine.engineForClass(JRIEngine.class.getName(), R_PARAMS, new RCallbacks(), true);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("JRIEngine not found", e);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException("Invalid JRI version?", e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException("Invalid JRI version?", e);
		}
	}
	
	@PreDestroy
	synchronized
	public void shutdown() {
		engine.close();
	}
	
	private class RCallbacks extends REngineStdOutput {
		@Override
		public void RWriteConsole(REngine engine, String text, int oType) {
			logger.debug(text);
		}
	}
//
//	public REXP assign(String var, Object o) {
//		REXP ref = engine.createRJavaRef(o);
//		engine.assign("dataSource", ref);
//		return ref;
//	}

	public REnvironment newEnvironment() throws RException {
		try {
			REXP env = engine.newEnvironment(null, false);
			return new REnvironment(this, env);
		} catch (REXPMismatchException e) {
			throw new RException(e);
		} catch (REngineException e) {
			throw new RException(e);
		}

	}
	
	synchronized
	REXP eval(String expr, REXP env, boolean resolve) throws RException {
		try {
			return engine.parseAndEval(expr, env, resolve);
		} catch (REXPMismatchException e) {
			throw new RException(e);
		} catch (REngineException e) {
			throw new RException(e);
		}
	}

	synchronized
	void assign(String symbol, REXP value, REXP env) throws RException {
		try {
			engine.assign(symbol, value, env);
		} catch (REXPMismatchException e) {
			throw new RException(e);
		} catch (REngineException e) {
			throw new RException(e);
		}
	}

}