# Assignment 2

The repository is part of the delivery in the second assignment related to the course TDT4250 Advanced Software Design at the Norwegian University of Science and Technology (NTNU). The purpose of the assignment was to get experience with transformations. The assignment builds on the previous assignment, where the expected learning outcome was to learn modeling with the Eclipse Modeling Framework (EMF) and Ecore.

## Content

The repository contains two projects, the main model - **_studyplan_** - and related tests - **_studyplan.tests_** -.

### Studyplan

Within the model project, the two most significant folders are the **_model_** and **_src_** folders.

#### Model

The model folder contains the initial models related to the project:

- **_studyplan.ecore_** is the Ecore model where classes and other structures have been defined according to the Ecore format.
- **_studyplan.genmodel_** is the generator model, which is a dynamic extension of the Ecore model, used to generate Java code that conforms to the structure set in the mentioned model.
- **_Studyplan.xmi_** is a dynamic instance of the model, with the eClass **Studyplan** as its root resource. This instance currently holds a draft of the alternative study plans for the 5-year computer science program at NTNU.

#### Src

The source folder contains the generated code based on the Ecore model. Along with the generated code, manually written code covers some constraints, derived features, operations, and datatypes. Examples of these are mentioned in the Technical approach section.

#### HTML Transformation

The main learning outcome of assignment 2 has been to get experience with converting between data formats. I choose to look at how I could transform an xmi-instance to content in HTML-file. This is done in **_studyplan.impl.HtmlConversionStudyplan_**, and the transformation is stored in **_filename.html_** with the similar path. The HTML-file can be generated from scratch by running **_HtmlConversionStudyplan_**. To make the transformed file "prettier" I have created **_styles.css_**, which gives the HTML a bit more user-friendly look.

### Studyplan.tests

The studyplan.tests project contains the tests related to the studyplan-model. Most of the code is generated based on the .genmodel from studyplan, but manually written code in the model has manually written tests accordingly. This includes operations related to selecting and unselecting optional courses. Test-files that are all manually written are **_StudyplanValidatorTest.java_** and **_StudyplanDatatypeTest.java_**. To simplify the setup of tests, the **_StudyplanValidatorTest.xmi_** helps provide valid and invalid instances from the studyplan model.

## Technical approach

This section covers how most of the features in the task specification and use of EMF is handled in the delivery.

- **Constraints**: The constraints are set in the Ecore model. Most of these are handled as OCL through the use of Acceleo and the corresponding AQL. These constraints can be found as eAnnotations within the eClasses of the model. Together with these, one can find defined constraints that are not covered by the use of Acceleo. These constraints are set directly in the code in the class **_studyplan.util.StudyplanValidator_**. Examples of constraints from eClass **Course** handled through Acceleo: _codeIsUnique_ and _taughtInAutumnOrSpring_. Example of constraints from eClass **Course** handled with manually written code: _hasValidCreditValue_.
- **Derived features**: I have chosen to integrate the use of derived features to only one attribute. The feature, _totalCreditsValue_, can be found in eClass **Semester** and is the total value of all courses mandatory or estimated based on optional courses for the semester.
- **Operations**: Due to lack of imagination the only included operations are _selectOptionalCourse_ and _unselectOptionalCourse_, which adds and removes courses from the _currentlySelected_-list in eClass **SemesterOptionalCourseGroup**. The eClass is used to keep track of a set of optional courses within a semester, and how many courses the student may choose from the given courses. Eventually, the eClass might hold the course(s) which a student has chosen for his/her studyplan.
- **DataTypes**: Currently, the only custom made eDataType is **CourseCode**. An alternative attribute I considered making its eDataType was _Credits_. However, I had already configured these values limitations through constraints and did not see enough to gain by changing it to a custom eData Type. The Enums below could, naturally, also have been turned into data types, due to the similarities in qualities.
- **Enums**: _ProgramTypeAndDuration_ holds the valid program types within my system and the duration of these program types, given in semesters. _CourseLevel_ holds the different levels of courses, inspired by NTNU courses.

## Assumptions

These are some of the assumptions made during the work on this assignment, which may differ from the real-life study planning pages at NTNU:

- Valid course credit values have been set to 5, 7.5, 10, 15, and 30.
- Courses taught both in autumn and spring have only one code.
- All specializations within a program or another specialization have the same duration.
- The maximum depth of specializations within a program is 2.
- All optional courses within the same group of optional courses have the same credits.

## Changes from assignment 1

Below is a list of the most significant changes I made to the repository after the due date for delivering assignment 1.

- Large changes to the ecore-model as a result of misunderstanding the perspective of the model. This leads to changes in many changes in eAttributes, eReferences, and constraints. And eventually a rather large change to get a more suitable xmi-instance. Some changes were also a result of getting more comfortable with the use of emf in general.
- Changed some manually written constraints to OCL to avoid an unnecessarily large number of manually written tests.
- Removed the eClass CourseGroup because I did not manage to utilize it good enough after I refactored the ecore-model. It could probably still have served some purpose, but I decided to use lists of courses more frequently instead.
- Removed the derived feature _durationPreSpecialization_ in eClass **Program** because I found it a bit trivial after I refactored the ecore-model.
- The constraint in **Program** named _masterLevelHasMaxLimitOfLevelThreeCoures_ is postponed and will be specified if I choose to implement that a student can pick out his/her whole studyplan. Before that, I feel that this constraint is a bit unnecessary.

## Workflow

By looking at the commit history, it is possible to get a view of how the workflow has been related to the assignment. Naturally, the work started by creating a proper Ecore model based on the case description. This model has changed dynamically through the work with the assignment since I have learned new features within the Ecore format while working on the model. Especially through the work on assignment 2, I felt there were a lot of changes to make with the model. After creating a model draft, I started working on defining constraints, first as OCL those that easily could be defined AQL, and afterward with manually written code. Some of the other manual code was written during the modeling, as needed, or after the model was iterated further. After writing the manual code, I generated the test-plugin and wrote manual tests related to the manually written code from the model-project.
