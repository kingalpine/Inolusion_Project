


-- Creating the THERAPIST_STATUS table --
CREATE Table [THERAPIST_STATUS] (
                                                      [THERAPIST_STATUS_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                                      [STATUS_TYPE] VARCHAR(50) NOT NULL DEFAULT 'ACTIVE',
);

-- Creating the THERAPIST table --
CREATE Table [THERAPIST] (
                                               [THERAPIST_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                               [FIRST_NAME] VARCHAR(50) NOT NULL,
                                               [LAST_NAME] VARCHAR(50) NOT NULL,
                                               [EMAIL] VARCHAR(100) NOT NULL,
                                               [START_DATE] DATE NOT NULL,
                                               [PRIMARY_PHONE] VARCHAR(13) NOT NULL,
                                               [SECONDARY_PHONE] VARCHAR(13)  NULL,
                                               [STATUS_ID] INT  NOT NULL REFERENCES THERAPIST_STATUS(THERAPIST_STATUS_ID)
);


-- Creating the PATIENT_STATUS table --
CREATE Table [PATIENT_STATUS] (
                                                    [PATIENT_STATUS_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                                    [STATUS_TYPE] VARCHAR(50) NOT NULL DEFAULT 'ACTIVE',
);


-- Creating the THERAPY_STATUS table --
CREATE Table [THERAPY_STATUS] (
                                                    [THERAPY_STATUS_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                                    [STATUS_TYPE] VARCHAR(20) NOT NULL DEFAULT 'ACTIVE',
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

-- Creating the COUNTRY table --
CREATE Table [COUNTRY] (
                                             [COUNTRY_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                             [NAME] VARCHAR(100) NOT NULL DEFAULT 'United States',
                                             [COUNTRY_ABBREVIATION] VARCHAR (5) NOT NULL DEFAULT 'US',

);
-- Creating the REGION table --
CREATE Table [REGION] (
                                            [REGION_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                            [COUNTRY_ID] INT NOT NULL REFERENCES COUNTRY(COUNTRY_ID),
                                            [NAME] VARCHAR(255) NOT NULL DEFAULT 'TEXAS',
                                            [REGION_ABBERVIATION]VARCHAR(10) NOT NULL DEFAULT 'TX',

);

-- Creating the ASSESSMENT_PROGRESS table --
CREATE Table [ASSESSMENT_PROGRESS] (
                                                         [ASSESSMENT_PROGRESS_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                                         [NAME] VARCHAR(500) NOT NULL,
);


-- Creating the DISCHARGE table --
CREATE Table [DISCHARGE] (
                                               [DISCHARGE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                               [DISCHARGE_PLAN] VARCHAR(255) NOT NULL,
);






-- Creating the PATIENT table --
CREATE Table [PATIENT] (
                                             [PATIENT_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                             [FIRST_NAME] VARCHAR(50) NOT NULL,
                                             [LAST_NAME] VARCHAR(50) NOT NULL,
                                             [START_DATE] DATE NOT NULL DEFAULT 'SYSDATE',
                                             [SEX_ID]INT NOT NULL REFERENCES SEX_TYPE(SEX_TYPE_ID),
                                             [ADDRESS_LINE] VARCHAR(255) NOT NULL,
                                             [CITY] VARCHAR(100) NOT NULL,
                                             [ZIPCODE] VARCHAR(10) NOT NULL,
                                             [REGION_ID] INT NOT NULL REFERENCES REGION(REGION_ID),
                                             [COUNTRY_ID] INT NOT NULL REFERENCES COUNTRY(COUNTRY_ID),
                                             [EMAIL] VARCHAR(100) NOT NULL,
                                             [DOB] DATE NOT NULL,
                                             [PRIMARY_PHONE] VARCHAR(13) NOT NULL,
                                             [SECONDARY_PHONE] VARCHAR(13) NULL,
                                             [Gurardian_Name] VARCHAR (50) NOT NULL,
                                             [STATUS_ID] INT  NOT NULL REFERENCES PATIENT_STATUS(PATIENT_STATUS_ID),


);

-- Creating the THERAPY table --
CREATE Table [THERAPY] (
                                             [THERAPY_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                             [PATIENT_ID] INT  NOT NULL REFERENCES PATIENT(PATIENT_ID),
                                             [OBJECTIVE_GOALS] VARCHAR(500) NULL,
                                             [OBJECTIVE_STATEMENT] VARCHAR(500) NULL,
                                             [ASSESSMENT_TREATMENT_ACTIVITY] VARCHAR(500) NULL,
                                             [ASSESSMENT_TREATMENT] VARCHAR(500) NULL,
                                             [ASSESSMENT_PROGRESS_ID] INT NOT NULL REFERENCES ASSESSMENT_PROGRESS(ASSESSMENT_PROGRESS_ID),
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
                                              [STATUS_ID] INT  NOT NULL REFERENCES INCIDENT_STATUS(INCIDENT_STATUS_ID),


);
-- Creating the THERAPY_MEDICATION table --
CREATE Table [THERAPY_MEDICATION] (
                                                        [THERAPY_MEDICATION_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                                        [MEDICATION_ID] INT  NOT NULL REFERENCES MEDICATION(MEDICATION_ID),
                                                        [START_DATE] DATE NULL,
                                                        [THERAPY_ID] INT  NOT NULL REFERENCES THERAPY(THERAPY_ID),

);

-- Creating the MEDICATION_HISTORY table --
CREATE Table [MEDICATION_HISTORY] (
                                                        [MEDICATION_HISTORY_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                                        [PATIENT_ID] INT  NOT NULL REFERENCES PATIENT(PATIENT_ID),
                                                        [START_DATE] DATE NULL,
                                                        [MEDICATION_ID] INT  NOT NULL REFERENCES MEDICATION(MEDICATION_ID),
                                                        [DOSAGE] VARCHAR(15) NULL,
                                                        [NOTES] VARCHAR(500) NULL,

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
                                                      [INCIDENT_NOTES] VARCHAR (100) NULL,
                                                      [DATE] DATE  NOT NULL DEFAULT 'SYSDATE',
                                                      [TIME] TIME NOT NULL DEFAULT 'SYSTIME',
);
-- Creating the THERAPIST_INCIDENT table --
CREATE Table [THERAPIST_INCIDENT] (
                                                        [THERAPIST_INCIDENT_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                                        [THERAPIST_ID] INT  NOT NULL REFERENCES THERAPIST(THERAPIST_ID),
                                                        [INCIDENT_ID] INT  NOT NULL REFERENCES INCIDENT(INCIDENT_ID),
                                                        [INCIDENT_NOTES] VARCHAR (100) Null,
                                                        [DATE] DATE  NOT NULL DEFAULT 'SYSDATE',
                                                        [TIME] TIME NOT NULL DEFAULT 'SYSTIME',
);

-- Creating the PATIENT_INSURANCE table --
CREATE Table [PATIENT_INSURANCE] (
                                                       [PATIENT_INSURANCE_ID] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                                                       [EFFECTIVE_DATE] DATE  NOT NULL DEFAULT 'SYSDATE',
                                                       [GROUP_NUMBER] VARCHAR (8) NOT NULL,
                                                       [MEDICAID_NUMBER] VARCHAR (8) NOT NULL,
                                                       [INSURANCE_ID] INT  NOT NULL REFERENCES INSURANCE(INSURANCE_ID),
                                                       [PATIENT_ID] INT  NOT NULL REFERENCES PATIENT(PATIENT_ID),
);

