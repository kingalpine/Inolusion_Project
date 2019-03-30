-- Creating the THERAPIST_STATUS table --
CREATE Table [THERAPIST_STATUS] (
                                    [THERAPIST_STATUS_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                    [STATUS_TYPE] VARCHAR(255) NOT NULL,
);

-- Creating the THERAPIST table --
CREATE Table [THERAPIST] (
                             [THERAPIST_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                             [FIRST_NAME] VARCHAR(50) NOT NULL,
                             [LAST_NAME] VARCHAR(50) NOT NULL,
                             [EMAIL] VARCHAR(100) NULL,
                             [START_DATE] DATE NOT NULL,
                             [HOME_PHONE] VARCHAR(15) NOT NULL,
                             [MOBILE_PHONE] VARCHAR(15) NOT NULL,
                             [STATUS_ID] INT  NOT NULL REFERENCES THERAPIST_STATUS(THERAPIST_STATUS_ID)
);


-- Creating the PATIENT_STATUS table --
CREATE Table [PATIENT_STATUS] (
                                  [PATIENT_STATUS_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                  [STATUS_TYPE] VARCHAR(25) NOT NULL,
);


-- Creating the THERAPY_STATUS table --
CREATE Table [THERAPY_STATUS] (
                                  [THERAPY_STATUS_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                  [STATUS_TYPE] VARCHAR(20) NOT NULL,
);


-- Creating the INCIDENT_STATUS table --
CREATE Table [INCIDENT_STATUS] (
                                   [INCIDENT_STATUS_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                   [STATUS_TYPE] VARCHAR(25) NOT NULL,
);

-- Creating the INCIDENT_TYPE table --
CREATE Table [INCIDENT_TYPE] (
                                 [INCIDENT_TYPE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                 [NAME] VARCHAR(255) NOT NULL,
);

-- Creating the SEX_TYPE table --
CREATE Table [SEX_TYPE] (
                            [SEX_TYPE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                            [SEX] VARCHAR(10) NOT NULL,
);


-- Creating the ALLERGY table --
CREATE Table [ALLERGY] (
                           [ALLERGY_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                           [NAME] VARCHAR(255)  NULL,
);

-- Creating the MEDICATION table --
CREATE Table [MEDICATION] (
                              [MEDICATION_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                              [NAME] VARCHAR(255) NOT NULL,
);


-- Creating the INTERVENTION_CODE table --
CREATE Table [INTERVENTION_CODE] (
                                     [INTERVENTION_CODE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                     [NAME] VARCHAR(255) NOT NULL,
);


-- Creating the PLAN_CODE table --
CREATE Table [PLAN_CODE] (
                             [PLAN_CODE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                             [NAME] VARCHAR(255) NOT NULL,

);
-- Creating the SPEECH_CPT_CODE table --
CREATE Table [SPEECH_CPT_CODE] (
                                   [SPEECH_CPT_CODE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                   [CODE] INT NOT NULL,
                                   [NAME] VARCHAR(255)  NULL,

);
-- Creating the SUBJECTIVE_CODE table --
CREATE Table [SUBJECTIVE_CODE] (
                                   [SUBJECTIVE_CODE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                   [NAME] VARCHAR(255) NOT NULL,

);
-- Creating the INSURANCE table --
CREATE Table [INSURANCE] (
                             [INSURANCE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                             [NAME] VARCHAR(255) NOT NULL,

);



-- Creating the OBJECTIVE table --
CREATE Table [OBJECTIVE] (
                             [OBJECTIVE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                             [GOALS] VARCHAR (500) NULL,
                             [STATEMENT] VARCHAR (500) NULL,

);

-- Creating the COUNTRY table --
CREATE Table [COUNTRY] (
                           [COUNTRY_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                           [NAME] VARCHAR(100) NOT NULL,
                           [COUNTRY_ABBREVIATION] VARCHAR (5) NOT NULL,

);
-- Creating the REGION table --
CREATE Table [REGION] (
                          [REGION_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                          [COUNTRY_ID] INT NOT NULL REFERENCES COUNTRY(COUNTRY_ID),
                          [NAME] VARCHAR(255) NOT NULL,
                          [REGION_ABBERVIATION]VARCHAR(10) NOT NULL,

);

-- Creating the ASSESSMENT table --
CREATE Table [ASSESSMENT] (
                              [ASSESSMENT_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                              [TREATMENT_ACTIVITY] VARCHAR(500) NULL,
                              [TREATMENT_ASSESMENT]VARCHAR(500) NULL,

);


-- Creating the DISCHARGE table --
CREATE Table [DISCHARGE] (
                             [DISCHARGE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                             [DISCHARGE_PLAN] VARCHAR(255) NULL,
);





-- Creating the PATIENT table --
CREATE Table [PATIENT] (
                           [PATIENT_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                           [FIRST_NAME] VARCHAR(50) NOT NULL,
                           [LAST_NAME] VARCHAR(50) NOT NULL,
                           [START_DATE] DATE NOT NULL,
                           [SEX_ID]INT NOT NULL REFERENCES SEX_TYPE(SEX_TYPE_ID),
                           [ADDRESS_LINE] VARCHAR(255) NOT NULL,
                           [CITY] VARCHAR(100) NOT NULL,
                           [ZIPCODE] VARCHAR(10) NOT NULL,
                           [REGION_ID] INT NOT NULL REFERENCES REGION(REGION_ID),
                           [COUNTRY_ID] INT NOT NULL REFERENCES COUNTRY(COUNTRY_ID),
                           [EMAIL] VARCHAR(100) NULL,
                           [DOB] DATE NOT NULL,
                           [HOME_PHONE] VARCHAR(20) NOT NULL,
                           [MOBILE_PHONE] VARCHAR(20) NULL,
                           [INSURANCE_ID] INT NOT NULL REFERENCES INSURANCE(INSURANCE_ID),
                           [STATUS_ID] INT  NOT NULL REFERENCES PATIENT_STATUS(PATIENT_STATUS_ID),


);

-- Creating the THERAPY table --
CREATE Table [THERAPY] (
                           [THERAPY_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                           [PATIENT_ID] INT  NOT NULL REFERENCES PATIENT(PATIENT_ID),
                           [Objective_ID] INT  NOT NULL REFERENCES Objective(Objective_ID),
                           [ASSESSMENT_ID] INT NOT NULL REFERENCES ASSESSMENT(ASSESSMENT_ID),
                           [DATE] DATE NOT NULL,
                           [TIME_IN] TIME NOT NULL,
                           [TIME_OUT] TIME  NULL,
                           [THERAPY_STATUS_ID] INT NOT NULL REFERENCES THERAPY_STATUS(THERAPY_STATUS_ID),
                           [DISCHARGE_ID] INT NOT NULL REFERENCES DISCHARGE(DISCHARGE_ID),
                           [THERAPIST_SIGNATURE] VARCHAR (500) NOT NULL,
                           [THERAPIST_ID] INT NOT NULL REFERENCES THERAPIST(THERAPIST_ID)

);


-- Creating the SUBJECTIVE_ANALYSIS table --
CREATE Table [SUBJECTIVE_ANALYSIS] (
                                       [SUBJECTIVE_ANALYSIS_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                       [SUBJECTIVE_CODE_ID] INT NOT NULL REFERENCES SUBJECTIVE_CODE(SUBJECTIVE_CODE_ID),
                                       [NOTE] VARCHAR (500) NULL,
                                       [THERAPY_ID] INT NOT NULL REFERENCES THERAPY(THERAPY_ID),
);


-- Creating the PLAN table --
CREATE Table [PLAN] (
                        [PLAN_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                        [THERAPY_ID] INT  NOT NULL REFERENCES THERAPY(THERAPY_ID),
                        [NOTE] VARCHAR(500) NULL,
                        [PLAN_CODE_ID] INT NOT NULL REFERENCES PLAN_CODE(PLAN_CODE_ID)
);






-- Creating the INCIDENT table --
CREATE Table [INCIDENT] (
                            [INCIDENT_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                            [TYPE_ID] INT NOT NULL REFERENCES INCIDENT_TYPE(INCIDENT_TYPE_ID),
                            [THERAPY_ID] INT NOT NULL REFERENCES THERAPY(THERAPY_ID),
                            [NOTES] VARCHAR(500) NULL,
                            [STATUS_ID] INT  NOT NULL REFERENCES INCIDENT_STATUS(INCIDENT_STATUS_ID),


);
-- Creating the THERAPY_MEDICATION table --
CREATE Table [THERAPY_MEDICATION] (
                                      [THERAPY_MEDICATION_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                      [MEDICATION_ID] INT  NOT NULL REFERENCES MEDICATION(MEDICATION_ID),
                                      [START_DATE] DATE NOT NULL,
                                      [THERAPY_ID] INT  NOT NULL REFERENCES THERAPY(THERAPY_ID),

);

-- Creating the MEDICATION_HISTORY table --
CREATE Table [MEDICATION_HISTORY] (
                                      [MEDICATION_HISTORY_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                      [PATIENT_ID] INT  NOT NULL REFERENCES PATIENT(PATIENT_ID),
                                      [START_DATE] DATE NULL,
                                      [MEDICATION_ID] INT  NOT NULL REFERENCES MEDICATION(MEDICATION_ID),
                                      [DOSAGE] VARCHAR(255) NULL,

);





-- Creating the INTERVENTION_PROGRESS_CODE table --
CREATE Table [INTERVENTION_PROGRESS_CODE] (
                                              [INTERVENTION_PROGRESS_CODE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                              [INTERVENTION_CODE_ID] INT  NOT NULL REFERENCES INTERVENTION_CODE(INTERVENTION_CODE_ID),
                                              [INTERVENTION_CODE_DESC] VARCHAR(255) NULL,
                                              [THERAPY_ID] INT  NOT NULL REFERENCES THERAPY(THERAPY_ID),

);

-- Creating the PATIENT_ALLERGY table --
CREATE Table [PATIENT_ALLERGY] (
                                   [PATIENT_ALLERGY_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                   [PATIENT_ID] INT  NOT NULL REFERENCES PATIENT(PATIENT_ID),
                                   [ALLERGY_ID] INT  NOT NULL REFERENCES ALLERGY(ALLERGY_ID),
                                   [ALLERGY_DESC] VARCHAR(255) NULL,

);

-- Creating the SPEECH_CPT_THERAPY_PROGRESS_CODE table --
CREATE Table [SPEECH_CPT_THERAPY_PROGRESS_CODE] (
                                                    [SPEECH_CPT_THERAPY_PROGRESS_CODE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                                    [SPEECH_CPT_CODE_ID] INT  NOT NULL REFERENCES SPEECH_CPT_CODE([SPEECH_CPT_CODE_ID]),
                                                    [SPEECH_CPT_DESC] VARCHAR(255) NULL,
                                                    [THERAPY_ID] INT  NOT NULL REFERENCES THERAPY(THERAPY_ID),

);

-- Creating the PATIENT_INCIDENT table --
CREATE Table [PATIENT_INCIDENT] (
                                    [PATIENT_INCIDENT_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                    [PATIENT_ID] INT  NOT NULL REFERENCES PATIENT(PATIENT_ID),
                                    [INCIDENT_ID] INT  NOT NULL REFERENCES INCIDENT(INCIDENT_ID),
                                    [DATE] DATE  NULL,
                                    [TIME] TIME NOT NULL,
);
-- Creating the THERAPIST_INCIDENT table --
CREATE Table [THERAPIST_INCIDENT] (
                                      [THERAPIST_INCIDENT_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                      [THERAPIST_ID] INT  NOT NULL REFERENCES THERAPIST(THERAPIST_ID),
                                      [INCIDENT_ID] INT  NOT NULL REFERENCES INCIDENT(INCIDENT_ID),
                                      [DATE] DATE  NULL,
                                      [TIME] TIME NOT NULL,
);

