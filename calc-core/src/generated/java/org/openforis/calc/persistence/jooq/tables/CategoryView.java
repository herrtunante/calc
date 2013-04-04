/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class CategoryView extends org.jooq.impl.TableImpl<org.openforis.calc.persistence.jooq.tables.records.CategoryViewRecord> {

	private static final long serialVersionUID = -1450654177;

	/**
	 * The singleton instance of calc.category_view
	 */
	public static final org.openforis.calc.persistence.jooq.tables.CategoryView CATEGORY_VIEW = new org.openforis.calc.persistence.jooq.tables.CategoryView();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.CategoryViewRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.CategoryViewRecord.class;
	}

	/**
	 * The table column <code>calc.category_view.variable_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryViewRecord, java.lang.Integer> VARIABLE_ID = createField("variable_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.category_view.variable_type</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryViewRecord, java.lang.String> VARIABLE_TYPE = createField("variable_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.category_view.variable_name</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryViewRecord, java.lang.String> VARIABLE_NAME = createField("variable_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.category_view.variable_order</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryViewRecord, java.lang.Integer> VARIABLE_ORDER = createField("variable_order", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.category_view.category_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryViewRecord, java.lang.Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.category_view.category_code</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryViewRecord, java.lang.String> CATEGORY_CODE = createField("category_code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.category_view.category_label</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryViewRecord, java.lang.String> CATEGORY_LABEL = createField("category_label", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.category_view.category_order</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryViewRecord, java.lang.Integer> CATEGORY_ORDER = createField("category_order", org.jooq.impl.SQLDataType.INTEGER, this);

	public CategoryView() {
		super("category_view", org.openforis.calc.persistence.jooq.Calc.CALC);
	}

	public CategoryView(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.Calc.CALC, org.openforis.calc.persistence.jooq.tables.CategoryView.CATEGORY_VIEW);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.CategoryView as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.CategoryView(alias);
	}
}
