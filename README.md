# Assignment 1

The repository is part of the delivery in the first assignment related to the course TDT4250 Advanced Software Design at the Norwegian University of Science and Technology (NTNU). The purpose of the assignment is to learn modeling with Eclipse Modeling Framework (EMF) and Ecore.

## Content

The two most significant folders are the **_model_** and **_src_** folders.

### Model

The model folder contains the initial models related to the project:

- **_studyplan.ecore_** is the Ecore model where classes and other structures has been defined according to the Ecore format.
- **_studyplan.genmodel_** is the generator model, which is a dynamic extension of the Ecore model, used to generate Java code which conform to the structure set in the mentioned model.
- **_Studyplan.xmi_** is a dynamic instance of the model, with the eCLass **Studyplan** as its root resource. This instance currently holds a draft of the study plan for the 5-year computer science program at NTNU.

### Src

The source folder contains the generated code based on the Ecore model. Along with the generated code, manually written code covers some constraints, derived feature, operations, and datatypes. Some of these are specified below.

## Technical approach

This section covers how most of the features in the task specification and use of EMF is handled in the delivery.

- **Constraints**: There are a lot of constraints set in the Ecore model. Most of these are handled through the use of Acceleo and the corresponding AQL. These constraints can be found as eAnnotations within the eClasses of the model. Together with these, one can find defined constraints that are not covered by the use of Acceleo. These constraints are set directly in the code in the class **_studyplan.util.StudyplanValidator_**. Examples of constraints from eClass **Program** handled through Acceleo: _totalNrOfSemestersShouldMatchType_ and _allMainSpecsSimilarDuration_. Examples of constraints from eClass **Program** handled with manually written code: _noDuplicateCourses_ and _mandatoryCoursesCovered_.
- **Derived features**: I have chosen to integrate the use of derived features to two attributes. The first, _durationPreSpecialization_ is found in eClass **Program** and is calculated by the use of the program type and the length of specializations. The second, _totalCreditsValue_, can be found in eClass **Semester** and is the total value of all courses mandatory or selected for the semester.
- **Operations**: Due to lack of imagination the only included operations are _selectOptionalCourse_ and _unselectOptionalCourse_, which adds and removes courses from the _currentlySelected_-list in eClass **SemesterOptionalCourseGroup**. Maybe these eventually can be used to keep track of a student's decision in the study plan to enroll or remove a course.
- **DataTypes**: Currently, the only custom made eDataType is **CourseCode**. An alternative attribute I considered making its own eDataType was _Credits_. However, I had already configured these values limitations through constraints and did not see enough to gain by changing it to a custom eData Type. The Enums below could, naturally, also have been turned into data types, due to the similarities in qualities.
- **Enums**: _ProgramTypeAndDuration_ holds the valid program types within my system and the duration of these program types, given in semesters. _CourseLevel_ holds the different levels of courses, inspired by NTNU courses.

## Workflow

By looking at the commit history, it is possible to get a view of how the workflow has been related to the assignment. Naturally, the work started by creating a proper Ecore model based on the case description. This model has changed dynamically through the work with the assignment since I have learned new features within the Ecore format while working on the model. After creating a model draft, I started working on defining constraints, first as OCL those that easily could be defined AQL, and afterward with manually written code. Some of the other manual code was written during the modeling, as needed, or after the model was iterated further.
