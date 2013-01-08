package org.openforis.calc.server.rest;

import javax.ws.rs.GET;

import org.openforis.calc.persistence.ObservationUnitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 
 * @author G. Miceli
 *
 */
@Component
@Scope("request")
public class ObservationUnitResource extends CalcResource<String> {

	@Autowired
	private ObservationUnitDao observationUnitDao;

	@Autowired
	private SurveyResource surveyResource;

	@GET
	public String getUnit() {
		return "unit for survey: "+surveyResource.getId();
	}
}
