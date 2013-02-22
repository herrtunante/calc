/*
Script generated by Aqua Data Studio 12.0.14 on Jan-05-2013 05:49:39 PM
Database: null
Schema: <All Schemas>
*/

CREATE TABLE "calc"."aoi"  ( 
	"id"          	serial NOT NULL,
	"hierarchy_id"	integer NOT NULL,
	"code"        	varchar(255) NULL,
	"name"        	varchar(255) NOT NULL,
	"shape"       	polygon NOT NULL,
	"area"        	numeric(15,5) NOT NULL,
	"parent_id"   	integer NULL,
	"level"       	integer NOT NULL,
	PRIMARY KEY("id")
)
GO
COMMENT ON TABLE "calc"."aoi" IS 'Each area of interest (AOI) may be divided into sub-parts such that the sub-parts add up to the area of the whole (i.e. a compositional containment hierarchy)'
GO

CREATE TABLE "calc"."aoi_hierarchy"  ( 
	"id"       	serial NOT NULL,
	"survey_id"	integer NOT NULL,
	"name"     	varchar(255) NULL,
	PRIMARY KEY("id")
)
GO
COMMENT ON TABLE "calc"."aoi_hierarchy" IS 'A particular AOI hierarchy, such as "Administrative Units" or "Ecological Zones".'
GO

CREATE TABLE "calc"."category"  ( 
	"id"                        	serial NOT NULL,
	"variable_id"               	integer NOT NULL,
	"code"                      	varchar(255) NULL,
	"default_label"             	varchar(255) NULL,
	"order"                     	integer NULL,
	"banding_interval"          	varchar(255) NULL,
	"banding_source_variable_id"	integer NULL,
	PRIMARY KEY("id")
)
GO
COMMENT ON COLUMN "calc"."category"."banding_interval" IS 'Interval in standard math notation (e.g. "[1,20)"  "(-Inf,20]")'
GO

CREATE TABLE "calc"."cluster"  ( 
	"id"       	serial NOT NULL,
	"survey_id"	integer NOT NULL,
	"code"     	varchar(25) NOT NULL,
	"x_index"  	integer NULL,
	"y_index"  	integer NULL,
	PRIMARY KEY("id")
)
GO
COMMENT ON TABLE "calc"."cluster" IS 'A grouping of sample plots.'
GO

CREATE TABLE "calc"."observation_unit"  ( 
	"id"       	serial NOT NULL,
	"survey_id"	integer NOT NULL,
	"name"     	varchar(255) NULL,
	"type"     	varchar(25) NULL,
	"parent_id"	integer NULL,
	PRIMARY KEY("id")
)
GO
COMMENT ON COLUMN "calc"."observation_unit"."name" IS 'Free text. Examples: "microplot", "tree", "bamboo"'
GO
COMMENT ON COLUMN "calc"."observation_unit"."type" IS 'plot|specimen'
GO

CREATE TABLE "calc"."operation"  ( 
	"id"         	serial NOT NULL,
	"name"       	varchar(255) NULL,
	"description"	varchar(255) NULL,
	"class"      	varchar(255) NULL,
	PRIMARY KEY("id")
)
GO

CREATE TABLE "calc"."operation_parameter"  ( 
	"id"        	serial NOT NULL,
	"process_id"	integer NOT NULL,
	"name"      	varchar(255) NULL,
	"value"     	varchar(255) NOT NULL,
	PRIMARY KEY("id")
)
GO

CREATE TABLE "calc"."plot_category"  ( 
	"id"             	serial NOT NULL,
	"plot_section_id"	integer NOT NULL,
	"category_id"    	integer NOT NULL,
	"computed"       	boolean NOT NULL,
	PRIMARY KEY("id")
)
GO

CREATE TABLE "calc"."plot_measurement"  ( 
	"id"             	serial NOT NULL,
	"plot_section_id"	integer NOT NULL,
	"variable_id"    	integer NOT NULL,
	"value"          	double precision NOT NULL,
	"computed"       	boolean NOT NULL,
	PRIMARY KEY("id")
)
GO

CREATE TABLE "calc"."plot_section"  ( 
	"id"            	serial NOT NULL,
	"sample_plot_id"	integer NOT NULL,
	"section"       	char(1) NULL,
	"visit_type"    	char(2) NOT NULL DEFAULT 'P',
	"survey_date"   	date NULL,
	"percent_share" 	double precision NULL,
	"gps_reading"   	point NULL,
	"direction"     	double precision NULL,
	"distance"      	double precision NULL,
	"location"      	point NULL,
	"accessible"    	boolean NOT NULL,
	"step"          	integer NOT NULL,
	"shape"         	polygon NULL,
	"area"          	integer NULL,
	PRIMARY KEY("id")
)
GO
COMMENT ON COLUMN "calc"."plot_section"."visit_type" IS 'P|R|QA - Primary/Remeasurement/QA'
GO
COMMENT ON COLUMN "calc"."plot_section"."step" IS '1=Incomplete 2=Dirty 3=Clean'
GO

CREATE TABLE "calc"."process"  ( 
	"id"          	serial NOT NULL,
	"chain_id"    	integer NOT NULL,
	"operation_id"	integer NOT NULL,
	"name"        	varchar(255) NULL,
	"description" 	varchar(1024) NULL,
	"order"       	integer NOT NULL,
	PRIMARY KEY("id")
)
GO

CREATE TABLE "calc"."processing_chain"  ( 
	"id"         	serial NOT NULL,
	"survey_id"  	integer NOT NULL,
	"name"       	varchar(255) NULL,
	"description"	varchar(255) NULL,
	PRIMARY KEY("id")
)
GO

CREATE TABLE "calc"."sample_plot"  ( 
	"id"            	serial NOT NULL,
	"obs_unit_id"   	integer NOT NULL,
	"no"            	integer NOT NULL,
	"location"      	point NULL,
	"shape"         	polygon NULL,
	"phase"         	integer NULL,
	"permanent_plot"	boolean NOT NULL,
	"ground_plot"   	boolean NOT NULL,
	"cluster_id"    	integer NULL,
	"stratum_id"    	integer NULL,
	PRIMARY KEY("id")
)
GO
COMMENT ON TABLE "calc"."sample_plot" IS 'A spatially contiguous area.'
GO
COMMENT ON COLUMN "calc"."sample_plot"."cluster_id" IS 'May be null if clusters are not used'
GO

CREATE TABLE "calc"."specimen"  ( 
	"id"         	serial NOT NULL,
	"plot_id"    	integer NOT NULL,
	"obs_unit_id"	integer NOT NULL,
	"no"         	integer NULL,
	"code"       	varchar(25) NULL,
	"taxon_id"   	integer NULL,
	"survey_date"	date NULL,
	PRIMARY KEY("id")
)
GO

CREATE TABLE "calc"."specimen_category"  ( 
	"id"         	serial NOT NULL,
	"specimen_id"	integer NOT NULL,
	"category_id"	integer NOT NULL,
	"computed"   	boolean NOT NULL,
	PRIMARY KEY("id")
)
GO

CREATE TABLE "calc"."specimen_measurement"  ( 
	"id"         	serial NOT NULL,
	"specimen_id"	integer NOT NULL,
	"variable_id"	integer NOT NULL,
	"value"      	double precision NOT NULL,
	"computed"   	boolean NOT NULL,
	PRIMARY KEY("id")
)
GO

CREATE TABLE "calc"."stratum"  ( 
	"id"           	serial NOT NULL,
	"survey_id"    	integer NOT NULL,
	"no"           	integer NOT NULL,
	"default_label"	varchar(255) NULL,
	PRIMARY KEY("id")
)
GO
COMMENT ON TABLE "calc"."stratum" IS 'A homogenous subgroup of the population of sampling units. '
GO

CREATE TABLE "calc"."survey"  ( 
	"id"           	serial NOT NULL,
	"uri"          	varchar(255) NOT NULL,
	"name"         	varchar(25) NOT NULL,
	"default_label"	varchar(255) NULL,
	"description"  	varchar(255) NULL,
	"cycle"        	varchar(255) NULL,
	"from_date"    	date NULL,
	"to_date"      	date NULL,
	PRIMARY KEY("id")
)
GO
COMMENT ON TABLE "calc"."survey" IS 'One cycle of an inventory.'
GO

CREATE TABLE "calc"."taxon"  ( 
	"id"                   	serial NOT NULL,
	"checklist_id"         	integer NOT NULL,
	"code"                 	varchar(255) NULL,
	"scientific_name_id"   	varchar(255) NULL,
	"scientific_name"      	varchar(255) NOT NULL,
	"according_to"         	varchar(255) NULL,
	"published_in"         	varchar(255) NULL,
	"published_in_year"    	integer NULL,
	"specific_epithet"     	varchar(255) NULL,
	"infraspecific_epithet"	varchar(255) NULL,
	"rank"                 	varchar(25) NOT NULL,
	"authorship"           	varchar(255) NOT NULL,
	"nomenclatural_code"   	varchar(25) NULL,
	"taxonomic_status"     	varchar(25) NULL,
	"nomenclatural_status" 	varchar(255) NULL,
	"remarks"              	varchar(1024) NULL,
	"references"           	varchar(255) NULL,
	"parent_id"            	integer NULL,
	"original_name_id"     	integer NULL,
	"accepted_name_id"     	integer NULL,
	PRIMARY KEY("id")
)
GO
COMMENT ON TABLE "calc"."taxon" IS 'See:
http://www.gbif.org/orc/?doc_id=4752
http://rs.tdwg.org/dwc/terms/
http://rs.gbif.org/core/dwc_taxon.xml
http://code.google.com/p/darwincore/wiki/Taxon'
GO
COMMENT ON COLUMN "calc"."taxon"."scientific_name_id" IS 'Exclusively used to reference an external and resolvable identifier that returns nomenclatural (not taxonomic) details of a name. Use taxonID to refer to taxa. see also http://rs.tdwg.org/dwc/terms/index.htm#scientificNameID  Examples: urn:lsid:ipni.org:names:37829-1:1.3'
GO
COMMENT ON COLUMN "calc"."taxon"."scientific_name" IS 'The full scientific name, with authorship and date information if known. Examples: "Coleoptera" (order), "Vespertilionidae" (family), "Manis" (genus), "Ctenomys sociabilis" (genus + specificEpithet), "Ambystoma tigrinum diaboli" (genus + specificEpithet + infraspecificEpithet), "Roptrocerus typographi (Györfi, 1952)" (genus + specificEpithet + scientificNameAuthorship), "Quercus agrifolia var. oxyadenia (Torr.) J.T. Howell" (genus + specificEpithet + taxonRank + infraspecificEpithet + scientificNameAuthorship).'
GO
COMMENT ON COLUMN "calc"."taxon"."according_to" IS 'The reference to the source in which the specific taxon concept circumscription is defined or implied - traditionally signified by the Latin "sensu" or "sec." (from secundum, meaning "according to"). Example: "McCranie, J. R., D. B. Wake, and L. D. Wilson. 1996. The taxonomic status of Bolitoglossa schmidti, with comments on the biology of the Mesoamerican salamander Bolitoglossa dofleini (Caudata: Plethodontidae). Carib. J. Sci. 32:395-398.", "Werner Greuter 2008", "Lilljeborg 1861, Upsala Univ. Arsskrift, Math. Naturvet., pp. 4, 5".'
GO
COMMENT ON COLUMN "calc"."taxon"."published_in" IS 'A reference for the publication in which the scientificName was originally established under the rules of the associated nomenclaturalCode. Examples: "Pearson O. P., and M. I. Christie. 1985. Historia Natural, 5(37):388", "Forel, Auguste, Diagnosies provisoires de quelques espèces nouvelles de fourmis de Madagascar, récoltées par M. Grandidier., Annales de la Societe Entomologique de Belgique, Comptes-rendus des Seances 30, 1886".'
GO
COMMENT ON COLUMN "calc"."taxon"."published_in_year" IS 'The four-digit year in which the scientificName was published.'
GO
COMMENT ON COLUMN "calc"."taxon"."specific_epithet" IS 'The name of the first or species epithet of the scientificName. Example: "concolor", "gottschei". '
GO
COMMENT ON COLUMN "calc"."taxon"."infraspecific_epithet" IS 'The name of the lowest or terminal infraspecific epithet of the scientificName, excluding any rank designation. Example: "concolor", "oxyadenia", "sayi".'
GO
COMMENT ON COLUMN "calc"."taxon"."rank" IS 'The taxonomic rank of the most specific name in the scientificName. Recommended vocabulary: http://rs.gbif.org/vocabulary/gbif/rank.xml see also http://rs.tdwg.org/dwc/terms/index.htm#taxonRank'
GO
COMMENT ON COLUMN "calc"."taxon"."authorship" IS 'The authorship information for the scientificName formatted according to the conventions of the applicable nomenclaturalCode. see also http://rs.tdwg.org/dwc/terms/index.htm#scientificNameAuthorship.  Examples: "(Torr.) J.T. Howell", "(Martinovský) Tzvelev", "(Linnaeus 1768)"'
GO
COMMENT ON COLUMN "calc"."taxon"."nomenclatural_code" IS 'The nomenclatural code under which the scientificName is constructed. see also http://rs.tdwg.org/dwc/terms/index.htm#nomenclaturalCode Examples: ICBN; ICZN'
GO
COMMENT ON COLUMN "calc"."taxon"."taxonomic_status" IS 'The status of the use of the scientificName as a label for a taxon. Requires taxonomic opinion to define the scope of a taxon. Rules of priority then are used to define the taxonomic status of the nomenclature contained in that scope, combined with the experts opinion. It must be linked to a specific taxonomic reference that defines the concept. Recommended vocabulary: http://rs.gbif.org/vocabulary/gbif/taxonomic_status.xml see also http://rs.tdwg.org/dwc/terms/index.htm#taxonomicStatus Examples: "invalid", "misapplied", "homotypic synonym", "accepted"'
GO
COMMENT ON COLUMN "calc"."taxon"."nomenclatural_status" IS 'The status related to the original publication of the name and its conformance to the relevant rules of nomenclature. It is based essentially on an algorithm according to the business rules of the code. It requires no taxonomic opinion. Recommended vocabulary: http://rs.gbif.org/vocabulary/gbif/nomenclatural_status.xml see also http://rs.tdwg.org/dwc/terms/index.htm#nomenclaturalStatus Examples: "nom. ambig.", "nom. illeg.", "nom. subnud."'
GO
COMMENT ON COLUMN "calc"."taxon"."remarks" IS 'Comments or notes about the taxon or name. see also http://rs.tdwg.org/dwc/terms/index.htm#taxonRemarks'
GO
COMMENT ON COLUMN "calc"."taxon"."references" IS 'A URL to a related resource that is referenced, cited, or otherwise pointed to by the described resource. Often another webpage showing the same, but richer resource see also http://rs.tdwg.org/dwc/terms/index.htm#dcterms:references  Examples: http://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=552479'
GO

CREATE TABLE "calc"."taxon_vernacular_name"  ( 
	"id"              	serial NOT NULL,
	"accepted_name_id"	integer NOT NULL,
	"name"            	varchar(255) NULL,
	"language_code"   	varchar(2) NULL,
	"language_variant"	varchar(255) NULL,
	"qualifier"       	varchar(25) NULL,
	"remarks"         	varchar(1024) NULL,
	PRIMARY KEY("id")
)
GO
COMMENT ON COLUMN "calc"."taxon_vernacular_name"."qualifier" IS 'For qualifying usage by region or other parameters'
GO

CREATE TABLE "calc"."taxonomic_checklist"  ( 
	"id"       	serial NOT NULL,
	"survey_id"	integer NOT NULL,
	"name"     	varchar(255) NULL,
	PRIMARY KEY("id")
)
GO

CREATE TABLE "calc"."variable"  ( 
	"id"           	serial NOT NULL,
	"obs_unit_id"  	integer NOT NULL,
	"name"         	varchar(25) NOT NULL,
	"type"         	varchar(25) NOT NULL,
	"default_label"	varchar(255) NULL,
	"order"        	integer NULL,
	PRIMARY KEY("id")
)
GO
COMMENT ON COLUMN "calc"."variable"."type" IS 'Num: count|interval|ratio  Cat: ordinal|nominal|multiple|binary'
GO

ALTER TABLE "calc"."category"
	ADD CONSTRAINT "uk_category_code"
	UNIQUE ("variable_id", "code")
GO

ALTER TABLE "calc"."cluster"
	ADD CONSTRAINT "uk_cluster_code"
	UNIQUE ("survey_id", "code")
GO

ALTER TABLE "calc"."observation_unit"
	ADD CONSTRAINT "uk_observation_unit"
	UNIQUE ("survey_id", "name")
GO

ALTER TABLE "calc"."plot_section"
	ADD CONSTRAINT "uk_plot_section"
	UNIQUE ("sample_plot_id", "section", "visit_type")
GO

ALTER TABLE "calc"."sample_plot"
	ADD CONSTRAINT "uk_sample_plot"
	UNIQUE ("obs_unit_id", "no")
GO

ALTER TABLE "calc"."stratum"
	ADD CONSTRAINT "uk_stratum_no"
	UNIQUE ("survey_id", "no")
GO

ALTER TABLE "calc"."survey"
	ADD CONSTRAINT "uk_survey_uri"
	UNIQUE ("uri")
GO

ALTER TABLE "calc"."survey"
	ADD CONSTRAINT "uk_survey_name"
	UNIQUE ("name")
GO

ALTER TABLE "calc"."variable"
	ADD CONSTRAINT "uk_variable_name"
	UNIQUE ("obs_unit_id", "name")
GO

ALTER TABLE "calc"."aoi"
	ADD CONSTRAINT "fk_aoi_parent"
	FOREIGN KEY("parent_id")
	REFERENCES "calc"."aoi"("id")
GO

ALTER TABLE "calc"."aoi"
	ADD CONSTRAINT "fk_aoi_hierarchy"
	FOREIGN KEY("hierarchy_id")
	REFERENCES "calc"."aoi_hierarchy"("id")
GO

ALTER TABLE "calc"."plot_category"
	ADD CONSTRAINT "fk_plot_category_category"
	FOREIGN KEY("category_id")
	REFERENCES "calc"."category"("id")
GO

ALTER TABLE "calc"."specimen_category"
	ADD CONSTRAINT "fk_specimen_category_category"
	FOREIGN KEY("category_id")
	REFERENCES "calc"."category"("id")
GO

ALTER TABLE "calc"."sample_plot"
	ADD CONSTRAINT "fk_sample_plot_cluster"
	FOREIGN KEY("cluster_id")
	REFERENCES "calc"."cluster"("id")
	ON DELETE NO ACTION 
	ON UPDATE NO ACTION 
GO

ALTER TABLE "calc"."variable"
	ADD CONSTRAINT "fk_variable_obs_unit"
	FOREIGN KEY("obs_unit_id")
	REFERENCES "calc"."observation_unit"("id")
GO

ALTER TABLE "calc"."observation_unit"
	ADD CONSTRAINT "fk_obs_unit_parent"
	FOREIGN KEY("parent_id")
	REFERENCES "calc"."observation_unit"("id")
GO

ALTER TABLE "calc"."specimen"
	ADD CONSTRAINT "fk_specimen_obs_unit"
	FOREIGN KEY("obs_unit_id")
	REFERENCES "calc"."observation_unit"("id")
GO

ALTER TABLE "calc"."sample_plot"
	ADD CONSTRAINT "fk_sample_plot_obs_unit"
	FOREIGN KEY("obs_unit_id")
	REFERENCES "calc"."observation_unit"("id")
	ON DELETE NO ACTION 
	ON UPDATE NO ACTION 
GO

ALTER TABLE "calc"."process"
	ADD CONSTRAINT "fk_process_operation"
	FOREIGN KEY("operation_id")
	REFERENCES "calc"."operation"("id")
GO

ALTER TABLE "calc"."plot_category"
	ADD CONSTRAINT "fk_plot_category_section"
	FOREIGN KEY("plot_section_id")
	REFERENCES "calc"."plot_section"("id")
	ON DELETE NO ACTION 
	ON UPDATE NO ACTION 
GO

ALTER TABLE "calc"."plot_measurement"
	ADD CONSTRAINT "fk_plot_measurement_section"
	FOREIGN KEY("plot_section_id")
	REFERENCES "calc"."plot_section"("id")
	ON DELETE NO ACTION 
	ON UPDATE NO ACTION 
GO

ALTER TABLE "calc"."specimen"
	ADD CONSTRAINT "fk_specimen_plot_section"
	FOREIGN KEY("plot_id")
	REFERENCES "calc"."plot_section"("id")
	ON DELETE NO ACTION 
	ON UPDATE NO ACTION 
GO

ALTER TABLE "calc"."operation_parameter"
	ADD CONSTRAINT "fk_operation_parameter_process"
	FOREIGN KEY("process_id")
	REFERENCES "calc"."process"("id")
GO

ALTER TABLE "calc"."process"
	ADD CONSTRAINT "fk_process_processing_chain"
	FOREIGN KEY("chain_id")
	REFERENCES "calc"."processing_chain"("id")
GO

ALTER TABLE "calc"."plot_section"
	ADD CONSTRAINT "fk_plot_section_sample_plot"
	FOREIGN KEY("sample_plot_id")
	REFERENCES "calc"."sample_plot"("id")
	ON DELETE NO ACTION 
	ON UPDATE NO ACTION 
GO

ALTER TABLE "calc"."specimen_category"
	ADD CONSTRAINT "fk_specimen_category_specimen"
	FOREIGN KEY("specimen_id")
	REFERENCES "calc"."specimen"("id")
GO

ALTER TABLE "calc"."specimen_measurement"
	ADD CONSTRAINT "fk_specimen_measurement_specimen"
	FOREIGN KEY("specimen_id")
	REFERENCES "calc"."specimen"("id")
	ON DELETE NO ACTION 
	ON UPDATE NO ACTION 
GO

ALTER TABLE "calc"."sample_plot"
	ADD CONSTRAINT "fk_sample_plot_stratum"
	FOREIGN KEY("stratum_id")
	REFERENCES "calc"."stratum"("id")
	ON DELETE NO ACTION 
	ON UPDATE NO ACTION 
GO

ALTER TABLE "calc"."aoi_hierarchy"
	ADD CONSTRAINT "fk_aoi_hierarchy_survey"
	FOREIGN KEY("survey_id")
	REFERENCES "calc"."survey"("id")
GO

ALTER TABLE "calc"."observation_unit"
	ADD CONSTRAINT "fk_obs_unit_survey"
	FOREIGN KEY("survey_id")
	REFERENCES "calc"."survey"("id")
GO

ALTER TABLE "calc"."processing_chain"
	ADD CONSTRAINT "fk_processing_chain_survey"
	FOREIGN KEY("survey_id")
	REFERENCES "calc"."survey"("id")
GO

ALTER TABLE "calc"."stratum"
	ADD CONSTRAINT "fk_stratum_survey"
	FOREIGN KEY("survey_id")
	REFERENCES "calc"."survey"("id")
GO

ALTER TABLE "calc"."taxonomic_checklist"
	ADD CONSTRAINT "fk_taxonomic_checklist_survey"
	FOREIGN KEY("survey_id")
	REFERENCES "calc"."survey"("id")
GO

ALTER TABLE "calc"."cluster"
	ADD CONSTRAINT "fk_cluster_survey"
	FOREIGN KEY("survey_id")
	REFERENCES "calc"."survey"("id")
GO

ALTER TABLE "calc"."specimen"
	ADD CONSTRAINT "fk_specimen_taxon"
	FOREIGN KEY("taxon_id")
	REFERENCES "calc"."taxon"("id")
GO

ALTER TABLE "calc"."taxon"
	ADD CONSTRAINT "fk_taxon_accepted_name"
	FOREIGN KEY("accepted_name_id")
	REFERENCES "calc"."taxon"("id")
GO

ALTER TABLE "calc"."taxon"
	ADD CONSTRAINT "fk_taxon_original_name"
	FOREIGN KEY("original_name_id")
	REFERENCES "calc"."taxon"("id")
GO

ALTER TABLE "calc"."taxon"
	ADD CONSTRAINT "fk_taxon_parent"
	FOREIGN KEY("parent_id")
	REFERENCES "calc"."taxon"("id")
GO

ALTER TABLE "calc"."taxon_vernacular_name"
	ADD CONSTRAINT "fk_taxon_vernacular_name_accepted_usage"
	FOREIGN KEY("accepted_name_id")
	REFERENCES "calc"."taxon"("id")
GO

ALTER TABLE "calc"."taxon"
	ADD CONSTRAINT "fk_taxon_checklist"
	FOREIGN KEY("checklist_id")
	REFERENCES "calc"."taxonomic_checklist"("id")
GO

ALTER TABLE "calc"."category"
	ADD CONSTRAINT "fk_category_variable"
	FOREIGN KEY("variable_id")
	REFERENCES "calc"."variable"("id")
GO

ALTER TABLE "calc"."category"
	ADD CONSTRAINT "fk_category_banding_source_variable"
	FOREIGN KEY("banding_source_variable_id")
	REFERENCES "calc"."variable"("id")
GO

ALTER TABLE "calc"."specimen_measurement"
	ADD CONSTRAINT "fk_specimen_measurement_variable"
	FOREIGN KEY("variable_id")
	REFERENCES "calc"."variable"("id")
GO

ALTER TABLE "calc"."plot_measurement"
	ADD CONSTRAINT "fk_plot_measurement_variable"
	FOREIGN KEY("variable_id")
	REFERENCES "calc"."variable"("id")
	ON DELETE NO ACTION 
	ON UPDATE NO ACTION 
GO

CREATE VIEW "calc"."aoi_view"
AS
select 1
GO

CREATE VIEW "calc"."cluster_view"
AS
select 1
GO
COMMENT ON VIEW "calc"."cluster_view" IS 'Summary of data at cluster level'
GO

CREATE VIEW "calc"."ground_plot_view"
AS
select     
    *
from plot_view 
where ground_plot

GO
COMMENT ON VIEW "calc"."ground_plot_view" IS 'All sampling design plots designated for in situ observations'
GO

CREATE VIEW "calc"."plot_category_view"
AS
select     
    ps.survey_id,
    ps.stratum_id,
    ps.stratum_no,
    ps.stratum_code,
    ps.cluster_id,
    ps.cluster_no,
    ps.cluster_code,
    ps.cluster_x,
    ps.cluster_y,
    ps.plot_id,
    ps.plot_survey_parent_id,
    ps.plot_no,
    ps.plot_code,
    ps.plot_survey_id,
    ps.plot_section,
    ps.survey_type,
    ps.obs_unit_id,
    ps.obs_unit_name,
    ps.step,
    v.name as variable_name,
    cat.code as category_code,
    pc.computed
from "calc"."plot_category" pc
inner join "calc"."plot_survey_view" ps
    on pc.plot_survey_id = ps.plot_survey_id
inner join "calc"."category" cat
    on pc.category_id = cat.id
inner join "calc"."variable" v
    on cat.variable_id = v.id

GO
COMMENT ON VIEW "calc"."plot_category_view" IS 'Plot categories and related codes, variable names and plot, cluster and stratum codes'
GO

CREATE VIEW "calc"."plot_measurement_view"
AS
select     
    ps.survey_id,
    ps.stratum_id,
    ps.stratum_no,
    ps.stratum_code,
    ps.cluster_id,
    ps.cluster_no,
    ps.cluster_code,
    ps.cluster_x,
    ps.cluster_y,
    ps.plot_id,
    ps.plot_survey_parent_id,
    ps.plot_no,
    ps.plot_code,
    ps.plot_survey_id,
    ps.plot_section,
    ps.survey_type,
    ps.obs_unit_id,
    ps.obs_unit_name,
    ps.step,
    v.name as variable_name,
    pm.value,
    pm.computed
from "calc"."plot_measurement" pm
inner join "calc"."plot_survey_view" ps
    on pm.plot_survey_id = ps.plot_survey_id
inner join "calc"."variable" v
    on pm.variable_id = v.id

GO
COMMENT ON VIEW "calc"."plot_measurement_view" IS 'Plot measurements and related variable names and plot, cluster and stratum codes'
GO

CREATE VIEW "calc"."plot_survey_view"
AS
select     
    p.*,
    ps.id as plot_survey_id,
    ps.section_no as plot_section,
    ps.survey_date,
    ps.gps_reading,
    ps.direction,
    ps.distance,
    ps.location as survey_location,
    ps.accessible,
    ps.parent_id as plot_survey_parent_id,
    ps.survey_type,
    ps.step,
    ps.shape as plot_survey_shape,
    ps.area as plot_survey_area,
    ps.percent_share,
    u.id as obs_unit_id,
    u.name as obs_unit_name
from "calc"."plot_survey" ps
inner join "calc"."ground_plot_view" p
    on ps.plot_id = p.plot_id
inner join "calc"."observation_unit" u 
    on ps.obs_unit_id = u.id
GO
COMMENT ON VIEW "calc"."plot_survey_view" IS 'Observed plot sections and respective sampling design attributes'
GO

CREATE VIEW "calc"."plot_view"
AS
select     
    p.survey_id,
    str.id as stratum_id,
    str.no as stratum_no,
    str.code as stratum_code,
    c.id as cluster_id,
    c.no as cluster_no,
    c.code as cluster_code,
    c.x_index as cluster_x,
    c.y_index as cluster_y,
    p.id as plot_id,
    p.no as plot_no,
    p.code as plot_code,
    p.location,
    p.shape,
    p.phase,
    p.ground_plot,
    p.permanent_plot
from "calc"."plot" p
inner join "calc"."cluster" c
    on p.cluster_id = c.id
inner join "calc"."stratum" str
    on p.stratum_id = str.id
GO
COMMENT ON VIEW "calc"."plot_view" IS 'Denormalized sampling design '
GO

CREATE VIEW "calc"."stratum_view"
AS
select 1
GO
COMMENT ON VIEW "calc"."stratum_view" IS 'Summary of data at stratum level'
GO

CREATE INDEX "idx_plot_ground_plot"
	ON "calc"."sample_plot"("ground_plot")
GO
