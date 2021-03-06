/**
 */
package studyplan.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import studyplan.Course;
import studyplan.CourseLevel;
import studyplan.Program;
import studyplan.ProgramTypeAndDuration;
import studyplan.Semester;
import studyplan.SemesterOptionalCourseGroup;
import studyplan.Specialization;
import studyplan.Studyplan;
import studyplan.StudyplanFactory;
import studyplan.StudyplanPackage;
import studyplan.util.StudyplanValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyplanPackageImpl extends EPackageImpl implements StudyplanPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterOptionalCourseGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyplanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum programTypeAndDurationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType courseCodeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see studyplan.StudyplanPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StudyplanPackageImpl() {
		super(eNS_URI, StudyplanFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StudyplanPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StudyplanPackage init() {
		if (isInited) return (StudyplanPackage)EPackage.Registry.INSTANCE.getEPackage(StudyplanPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStudyplanPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StudyplanPackageImpl theStudyplanPackage = registeredStudyplanPackage instanceof StudyplanPackageImpl ? (StudyplanPackageImpl)registeredStudyplanPackage : new StudyplanPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStudyplanPackage.createPackageContents();

		// Initialize created meta-data
		theStudyplanPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theStudyplanPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return StudyplanValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theStudyplanPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StudyplanPackage.eNS_URI, theStudyplanPackage);
		return theStudyplanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgram_Type() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_Specializations() {
		return (EReference)programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_MandatoryCourses() {
		return (EReference)programEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_Semesters() {
		return (EReference)programEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgram_Name() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Name() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Code() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Level() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Credits() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_TaughtInAutumn() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_TaughtInSpring() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecialization() {
		return specializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialization_MandatoryCourses() {
		return (EReference)specializationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialization_Semesters() {
		return (EReference)specializationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecialization_Name() {
		return (EAttribute)specializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialization_SubSpecializations() {
		return (EReference)specializationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemester() {
		return semesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemester_ProgramsSemesterOrderNr() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemester_MandatoryCourses() {
		return (EReference)semesterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemester_OptionalCourseGroups() {
		return (EReference)semesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemester_TotalCreditsValue() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemesterOptionalCourseGroup() {
		return semesterOptionalCourseGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemesterOptionalCourseGroup_NrOfOptionalFromGroup() {
		return (EAttribute)semesterOptionalCourseGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemesterOptionalCourseGroup_Semester() {
		return (EReference)semesterOptionalCourseGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemesterOptionalCourseGroup_CurrentlySelected() {
		return (EReference)semesterOptionalCourseGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemesterOptionalCourseGroup_OptionalCourses() {
		return (EReference)semesterOptionalCourseGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSemesterOptionalCourseGroup__SelectOptionalCourse__Course() {
		return semesterOptionalCourseGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSemesterOptionalCourseGroup__UnselectOptionalCourse__Course() {
		return semesterOptionalCourseGroupEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStudyplan() {
		return studyplanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudyplan_Programs() {
		return (EReference)studyplanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudyplan_Courses() {
		return (EReference)studyplanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProgramTypeAndDuration() {
		return programTypeAndDurationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCourseLevel() {
		return courseLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCourseCode() {
		return courseCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyplanFactory getStudyplanFactory() {
		return (StudyplanFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		programEClass = createEClass(PROGRAM);
		createEAttribute(programEClass, PROGRAM__NAME);
		createEAttribute(programEClass, PROGRAM__TYPE);
		createEReference(programEClass, PROGRAM__SPECIALIZATIONS);
		createEReference(programEClass, PROGRAM__SEMESTERS);
		createEReference(programEClass, PROGRAM__MANDATORY_COURSES);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__CODE);
		createEAttribute(courseEClass, COURSE__LEVEL);
		createEAttribute(courseEClass, COURSE__CREDITS);
		createEAttribute(courseEClass, COURSE__TAUGHT_IN_AUTUMN);
		createEAttribute(courseEClass, COURSE__TAUGHT_IN_SPRING);

		specializationEClass = createEClass(SPECIALIZATION);
		createEAttribute(specializationEClass, SPECIALIZATION__NAME);
		createEReference(specializationEClass, SPECIALIZATION__SUB_SPECIALIZATIONS);
		createEReference(specializationEClass, SPECIALIZATION__MANDATORY_COURSES);
		createEReference(specializationEClass, SPECIALIZATION__SEMESTERS);

		semesterEClass = createEClass(SEMESTER);
		createEAttribute(semesterEClass, SEMESTER__PROGRAMS_SEMESTER_ORDER_NR);
		createEReference(semesterEClass, SEMESTER__OPTIONAL_COURSE_GROUPS);
		createEAttribute(semesterEClass, SEMESTER__TOTAL_CREDITS_VALUE);
		createEReference(semesterEClass, SEMESTER__MANDATORY_COURSES);

		semesterOptionalCourseGroupEClass = createEClass(SEMESTER_OPTIONAL_COURSE_GROUP);
		createEAttribute(semesterOptionalCourseGroupEClass, SEMESTER_OPTIONAL_COURSE_GROUP__NR_OF_OPTIONAL_FROM_GROUP);
		createEReference(semesterOptionalCourseGroupEClass, SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER);
		createEReference(semesterOptionalCourseGroupEClass, SEMESTER_OPTIONAL_COURSE_GROUP__CURRENTLY_SELECTED);
		createEReference(semesterOptionalCourseGroupEClass, SEMESTER_OPTIONAL_COURSE_GROUP__OPTIONAL_COURSES);
		createEOperation(semesterOptionalCourseGroupEClass, SEMESTER_OPTIONAL_COURSE_GROUP___SELECT_OPTIONAL_COURSE__COURSE);
		createEOperation(semesterOptionalCourseGroupEClass, SEMESTER_OPTIONAL_COURSE_GROUP___UNSELECT_OPTIONAL_COURSE__COURSE);

		studyplanEClass = createEClass(STUDYPLAN);
		createEReference(studyplanEClass, STUDYPLAN__PROGRAMS);
		createEReference(studyplanEClass, STUDYPLAN__COURSES);

		// Create enums
		programTypeAndDurationEEnum = createEEnum(PROGRAM_TYPE_AND_DURATION);
		courseLevelEEnum = createEEnum(COURSE_LEVEL);

		// Create data types
		courseCodeEDataType = createEDataType(COURSE_CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgram_Type(), this.getProgramTypeAndDuration(), "type", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Specializations(), this.getSpecialization(), null, "specializations", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Semesters(), this.getSemester(), null, "semesters", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_MandatoryCourses(), this.getCourse(), null, "mandatoryCourses", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Code(), this.getCourseCode(), "code", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Level(), this.getCourseLevel(), "level", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credits(), ecorePackage.getEDouble(), "credits", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_TaughtInAutumn(), ecorePackage.getEBoolean(), "taughtInAutumn", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_TaughtInSpring(), ecorePackage.getEBoolean(), "taughtInSpring", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specializationEClass, Specialization.class, "Specialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecialization_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialization_SubSpecializations(), this.getSpecialization(), null, "subSpecializations", null, 0, -1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialization_MandatoryCourses(), this.getCourse(), null, "mandatoryCourses", null, 0, -1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialization_Semesters(), this.getSemester(), null, "semesters", null, 1, -1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semesterEClass, Semester.class, "Semester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemester_ProgramsSemesterOrderNr(), ecorePackage.getEInt(), "programsSemesterOrderNr", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_OptionalCourseGroups(), this.getSemesterOptionalCourseGroup(), this.getSemesterOptionalCourseGroup_Semester(), "optionalCourseGroups", null, 0, -1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemester_TotalCreditsValue(), ecorePackage.getEDouble(), "totalCreditsValue", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_MandatoryCourses(), this.getCourse(), null, "mandatoryCourses", null, 0, -1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semesterOptionalCourseGroupEClass, SemesterOptionalCourseGroup.class, "SemesterOptionalCourseGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemesterOptionalCourseGroup_NrOfOptionalFromGroup(), ecorePackage.getEInt(), "nrOfOptionalFromGroup", null, 1, 1, SemesterOptionalCourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemesterOptionalCourseGroup_Semester(), this.getSemester(), this.getSemester_OptionalCourseGroups(), "semester", null, 1, 1, SemesterOptionalCourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemesterOptionalCourseGroup_CurrentlySelected(), this.getCourse(), null, "currentlySelected", null, 0, -1, SemesterOptionalCourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemesterOptionalCourseGroup_OptionalCourses(), this.getCourse(), null, "optionalCourses", null, 0, -1, SemesterOptionalCourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSemesterOptionalCourseGroup__SelectOptionalCourse__Course(), null, "selectOptionalCourse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCourse(), "course", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSemesterOptionalCourseGroup__UnselectOptionalCourse__Course(), null, "unselectOptionalCourse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCourse(), "course", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(studyplanEClass, Studyplan.class, "Studyplan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudyplan_Programs(), this.getProgram(), null, "programs", null, 0, -1, Studyplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyplan_Courses(), this.getCourse(), null, "courses", null, 0, -1, Studyplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(programTypeAndDurationEEnum, ProgramTypeAndDuration.class, "ProgramTypeAndDuration");
		addEEnumLiteral(programTypeAndDurationEEnum, ProgramTypeAndDuration.BACHELOR);
		addEEnumLiteral(programTypeAndDurationEEnum, ProgramTypeAndDuration.MASTER);
		addEEnumLiteral(programTypeAndDurationEEnum, ProgramTypeAndDuration.INTEGRATED_MASTER);

		initEEnum(courseLevelEEnum, CourseLevel.class, "CourseLevel");
		addEEnumLiteral(courseLevelEEnum, CourseLevel.LEVEL1);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.LEVEL2);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.LEVEL3);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.HIGHER);

		// Initialize data types
		initEDataType(courseCodeEDataType, String.class, "CourseCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (programEClass,
		   source,
		   new String[] {
			   "constraints", "totalNrOfSemestersShouldMatchType masterLevelHasMaxLimitOfLevelThreeCoures allMainSpecsSimilarDuration mandatoryCoursesCovered noDuplicateCourses"
		   });
		addAnnotation
		  (courseEClass,
		   source,
		   new String[] {
			   "constraints", "hasValidCreditValue codeIsUnique taughtInAutumnOrSpring"
		   });
		addAnnotation
		  (specializationEClass,
		   source,
		   new String[] {
			   "constraints", "allSubspecsSimilarLength mandatoryCoursesAreCovered"
		   });
		addAnnotation
		  (semesterEClass,
		   source,
		   new String[] {
			   "constraints", "shouldContainEnoughCredits coursesTaughtCurrentSemester optionGroupsCorrectSemester"
		   });
		addAnnotation
		  (semesterOptionalCourseGroupEClass,
		   source,
		   new String[] {
			   "constraints", "nrOfOptionalMustBeLessThanSizeOfGroup currentlySelectedInOptions currentlySelectedCorrectSize"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (programEClass,
		   source,
		   new String[] {
			   "totalNrOfSemestersShouldMatchType", "self.specializations.subSpecializations->forAll(sub | sub.semesters->union(sub.eContainer().semesters)->union(sub.eContainer().eContainer().semesters)->size() = self.type.value)",
			   "allMainSpecsSimilarDuration", "self.specializations->forAll(spe | spe.semesters.programsSemesterOrderNr->union(spe.subSpecializations.semesters.programsSemesterOrderNr)->asSet()->size() = self.specializations->first().semesters.programsSemesterOrderNr->union(self.specializations.subSpecializations.semesters.programsSemesterOrderNr)->asSet()->size())",
			   "mandatoryCoursesCovered", "self.specializations.subSpecializations->forAll(sub | sub.semesters.mandatoryCourses->union(sub.eContainer().semesters.mandatoryCourses)->union(sub.eContainer().eContainer().semesters.mandatoryCourses)->includesAll(self.mandatoryCourses))",
			   "noDuplicateCourses", "self.specializations.subSpecializations->forAll(sub | sub.semesters.mandatoryCourses->union(sub.eContainer().semesters.mandatoryCourses)->union(sub.eContainer().eContainer().semesters.mandatoryCourses)->isUnique(c | c.code))"
		   });
		addAnnotation
		  (courseEClass,
		   source,
		   new String[] {
			   "codeIsUnique", "self.eContainer().courses->isUnique(course | course.code)",
			   "taughtInAutumnOrSpring", " self.taughtInAutumn or self.taughtInSpring"
		   });
		addAnnotation
		  (specializationEClass,
		   source,
		   new String[] {
			   "mandatoryCoursesAreCovered", "self.subSpecializations->forAll(sub | sub.semesters.mandatoryCourses->union(sub.eContainer().semesters.mandatoryCourses)->includesAll(self.mandatoryCourses))",
			   "allSubspecsSimilarLength", "self.subSpecializations->forAll(sub | sub.semesters->size() = self.subSpecializations->first().semesters->size())"
		   });
		addAnnotation
		  (semesterEClass,
		   source,
		   new String[] {
			   "shouldContainEnoughCredits", "self.totalCreditsValue >= 30.0",
			   "optionGroupsCorrectSemester", "self.optionalCourseGroups->forAll(optionalGroup | optionalGroup.semester = self)"
		   });
		addAnnotation
		  (semesterOptionalCourseGroupEClass,
		   source,
		   new String[] {
			   "nrOfOptionalMustBeLessThanSizeOfGroup", "self.optionalCourses->size() >= self.nrOfOptionalFromGroup",
			   "currentlySelectedCorrectSize", "self.currentlySelected->size() <= self.nrOfOptionalFromGroup",
			   "currentlySelectedInOptions", "self.optionalCourses->includesAll(self.currentlySelected)"
		   });
	}

} //StudyplanPackageImpl
