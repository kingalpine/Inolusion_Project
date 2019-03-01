/* Patient Table Creation Script 2/17/19 
	No Foreign Keys*/
	
/*
CREATE TABLE doctor_referral (
	doctor_id FK
	referral_id FK
	) */
	
	
CREATE TABLE administrator_status (
	administrator_status_id INT IDENTITY(1,1) PRIMARY KEY,
	administrator_status_desc VARCHAR(255),
	)

	CREATE TABLE administrator(
	administrator_id INT IDENTITY(1,1) PRIMARY KEY,
	administrator_fname VARCHAR(255),
	administrator_lname VARCHAR(255),
	administrator_email VARCHAR(255),
	administrator_dob DATE,
	administrator_hphone INT,
	administrator_mphone INT,
	)
	
/* administrator_status_id INT; FK */

CREATE TABLE allergy (
	allergy_id INT IDENTITY(1,1) PRIMARY KEY,
	allergy_name VARCHAR(25),
	allergy_desc VARCHAR(255),
	)

CREATE TABLE assessment (
	assessment_id INT IDENTITY(1,1) PRIMARY KEY,
	assessment_summary VARCHAR(255),
	)


	CREATE TABLE country(
	country_id INT IDENTITY(1,1) PRIMARY KEY,
	country_name VARCHAR (255),
	country_code VARCHAR(2),
	)
/*
CREATE TABLE doctor_referral (
	doctor_id FK
	referral_id FK
	) */
	
	
CREATE TABLE doctor_status (
	doctor_status_id INT IDENTITY(1,1) PRIMARY KEY,
	doctor_status_desc VARCHAR(255),
	)

CREATE TABLE doctor (
	doctor_id INT IDENTITY(1,1) PRIMARY KEY,
	doctor_fname VARCHAR(255),
	doctor_lname VARCHAR(255),
	doctor_address VARCHAR(255),
	doctor_email VARCHAR(255),
	doctor_office_num INT,
	)
	
	/*doctor_status_id INT; FK */

CREATE TABLE evaluation_status (
	evaluation_status_id INT IDENTITY(1,1) PRIMARY KEY,
	evaluation_status_desc VARCHAR(255),
	)

CREATE TABLE evaluation (
	evaluation_id INT IDENTITY(1,1) PRIMARY KEY,
	evaluation_summary VARCHAR(255),
	)

CREATE TABLE front_desk_status (
	front_desk_status_id INT IDENTITY(1,1) PRIMARY KEY,
	front_desk_status_description VARCHAR(255),
	)

CREATE TABLE front_desk (
	front_desk_id INT IDENTITY(1,1) PRIMARY KEY,
	front_desk_fname VARCHAR(255),
	front_desk_lname VARCHAR(255),
	front_desk_address VARCHAR(255),
	front_desk_email VARCHAR(255),
	front_desk_dob DATE,
	front_desk_hphone INT,
	front_desk_mphone INT,
	)
/*
CREATE TABLE incident_history (
	incident_id INT; FK
	  therapy_session_id INT; FK */

CREATE TABLE incident_status (
	incident_status_id INT IDENTITY(1,1) PRIMARY KEY,
	incident_status_desc VARCHAR(255),
	)

CREATE TABLE incident (
	incident_id INT IDENTITY(1,1) PRIMARY KEY,
	/* patient_id INT; FK */
	incident_day DATE,
	/* incident_type_id INT; FK */
	/* incident_status_id INT; FK */
)

CREATE TABLE incident_type (
	incident_type_id INT IDENTITY(1,1) PRIMARY KEY,
	incident_type_desc VARCHAR(255),
	)

CREATE TABLE insurance (
	insurance_id INT IDENTITY(1,1) PRIMARY KEY,
	insurance_name VARCHAR(255),
	insurance_group_number INT,
	insurance_group_id INT,
	)
/*	
CREATE TABLE intake_form (
	   patient_id INT; FK
	   insurance_id INT; FK
	   medical_history INT; FK
	   )*/

CREATE TABLE intervention_code (
	intervention_code_id INT IDENTITY(1,1) PRIMARY KEY,
	intervention_code_name VARCHAR(255),
	intervention_code_desc VARCHAR(255),
	)
CREATE TABLE medication (
	medication_id INT IDENTITY(1,1) PRIMARY KEY,
	medication_name VARCHAR(255),
	/*patient_id INT; FK */
	)
CREATE TABLE objective (
	objective_id INT IDENTITY(1,1) PRIMARY KEY,
	objective_summary VARCHAR(255),
	)
/*
CREATE TABLE patient_allergy (
	   patient_allergy_id INT; FK
	   allergy_id INT; FK
	   ) */
/*
CREATE TABLE patient_medication (
	patient_id INT; FK
	medication_id INT; FK 
	) */

CREATE TABLE patient_status (
	patient_status_id INT IDENTITY(1,1) PRIMARY KEY,
	patient_status_desc VARCHAR(255),
	)



	CREATE TABLE patient(
	patient_id INT PRIMARY KEY,
	patient_fname VARCHAR(255),
	patient_lname VARCHAR(255),
	patient_address VARCHAR(255),
	patient_email VARCHAR(255),
	patient_dob DATE,
	patient_hphone VARCHAR(255),
	patient_mphone VARCHAR(255),
	)

	/*patient_status_id INT; FK
	  insurance_id INT; FK */

CREATE TABLE "plan" (
	plan_id INT IDENTITY(1,1) PRIMARY KEY,
	plan_option VARCHAR(255),
	plan_other VARCHAR(255),
	)
	
CREATE TABLE referral_approval (
	referral_approval_id INT IDENTITY(1,1) PRIMARY KEY,
	referral_decision VARCHAR(255),
	)

CREATE TABLE referral (
	referral_id INT IDENTITY(1,1) PRIMARY KEY,
	referral_date DATE,
	patient_name VARCHAR(255),
	patient_age INT,
	patient_parent_name VARCHAR(255),
	patient_phone INT,
	patient_residence VARCHAR(255),
	)
	/* doctor_id INT; FK
	   insurance_id INT; FK */

	CREATE TABLE region(
	region_id INT IDENTITY(1,1) PRIMARY KEY,
	region_code VARCHAR(2),
	region VARCHAR(255),
	)

CREATE TABLE sex (
	sex_id INT IDENTITY(1,1) PRIMARY KEY,
	sex_name VARCHAR(5),
	)

CREATE TABLE speech_cpt_code (
	speech_cpt_code_id INT IDENTITY(1,1) PRIMARY KEY,
	speech_cpt_code_name VARCHAR(255),
	speech_cpt_code_desc VARCHAR(255),
	)

CREATE TABLE subjective (
	subjective_id INT IDENTITY(1,1) PRIMARY KEY,
	subjective_option VARCHAR(255),
	subjective_other VARCHAR(255),
	)

CREATE TABLE therapist_status (
	therapist_status_id INT IDENTITY(1,1) PRIMARY KEY,
	therapist_status_desc VARCHAR(255),
	)

CREATE TABLE therapist (
	therapist_id INT IDENTITY(1,1) PRIMARY KEY,
	therapist_fname VARCHAR(255),
	therapist_lname VARCHAR(255),
	therapist_address VARCHAR(255),
	therapist_email VARCHAR(255),
	therapist_dob DATE,
	therapist_hphone INT,
	therapist_mphone INT,
	)
	/* therapist_status_id ITN; FK */

CREATE TABLE therapy_progress_note (
	therapy_progress_note_id INT IDENTITY(1,1) PRIMARY KEY,
/*	patient_id INT; FK
	therapy_session_id INT; FK
	subjective_id INT; FK
	objective_id INT; FK
	assessment_id INT; FK
	plan_id INT; FK */
	therapist_signature VARCHAR(255),
	)

CREATE TABLE therapy_session (
	therapy_session_id INT IDENTITY(1,1) PRIMARY KEY,
	therapy_session_date DATE,
	therapy_session_time TIME,
/*	therapist_id INT; FK
	patient_id INT; FK */
	)
