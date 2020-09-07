/**
 */
package studyplan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see studyplan.StudyplanFactory
 * @model kind="package"
 * @generated
 */
public interface StudyplanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "studyplan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.studyplan.model/model/studyplan.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "studyplan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyplanPackage eINSTANCE = studyplan.impl.StudyplanPackageImpl.init();

	/**
	 * The meta object id for the '{@link studyplan.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.impl.ProgramImpl
	 * @see studyplan.impl.StudyplanPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SPECIALIZATIONS = 2;

	/**
	 * The feature id for the '<em><b>Mandatory Courses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__MANDATORY_COURSES = 3;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SEMESTERS = 4;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyplan.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.impl.CourseImpl
	 * @see studyplan.impl.StudyplanPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 3;

	/**
	 * The feature id for the '<em><b>Taught In Autumn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TAUGHT_IN_AUTUMN = 4;

	/**
	 * The feature id for the '<em><b>Taught In Spring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TAUGHT_IN_SPRING = 5;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyplan.impl.CourseGroupImpl <em>Course Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.impl.CourseGroupImpl
	 * @see studyplan.impl.StudyplanPackageImpl#getCourseGroup()
	 * @generated
	 */
	int COURSE_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyplan.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.impl.SpecializationImpl
	 * @see studyplan.impl.StudyplanPackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 3;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Mandatory Courses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__MANDATORY_COURSES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Duration In Semesters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__DURATION_IN_SEMESTERS = 3;

	/**
	 * The feature id for the '<em><b>Parent Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__PARENT_SPECIALIZATION = 4;

	/**
	 * The feature id for the '<em><b>Sub Specializations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SUB_SPECIALIZATIONS = 5;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyplan.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.impl.SemesterImpl
	 * @see studyplan.impl.StudyplanPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 4;

	/**
	 * The feature id for the '<em><b>Programs Semester Order Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__PROGRAMS_SEMESTER_ORDER_NR = 0;

	/**
	 * The feature id for the '<em><b>Mandatory Courses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__MANDATORY_COURSES = 1;

	/**
	 * The feature id for the '<em><b>Optional Course Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__OPTIONAL_COURSE_GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SPECIALIZATION = 4;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyplan.impl.SemesterOptionalCourseGroupImpl <em>Semester Optional Course Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.impl.SemesterOptionalCourseGroupImpl
	 * @see studyplan.impl.StudyplanPackageImpl#getSemesterOptionalCourseGroup()
	 * @generated
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Nr Of Optional From Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP__NR_OF_OPTIONAL_FROM_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Course Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP = 2;

	/**
	 * The number of structural features of the '<em>Semester Optional Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester Optional Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyplan.ProgramTypeAndDuration <em>Program Type And Duration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.ProgramTypeAndDuration
	 * @see studyplan.impl.StudyplanPackageImpl#getProgramTypeAndDuration()
	 * @generated
	 */
	int PROGRAM_TYPE_AND_DURATION = 6;

	/**
	 * The meta object id for the '{@link studyplan.CourseLevel <em>Course Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.CourseLevel
	 * @see studyplan.impl.StudyplanPackageImpl#getCourseLevel()
	 * @generated
	 */
	int COURSE_LEVEL = 7;


	/**
	 * Returns the meta object for class '{@link studyplan.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see studyplan.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.Program#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see studyplan.Program#getType()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link studyplan.Program#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializations</em>'.
	 * @see studyplan.Program#getSpecializations()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Specializations();

	/**
	 * Returns the meta object for the reference '{@link studyplan.Program#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mandatory Courses</em>'.
	 * @see studyplan.Program#getMandatoryCourses()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_MandatoryCourses();

	/**
	 * Returns the meta object for the containment reference list '{@link studyplan.Program#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see studyplan.Program#getSemesters()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Semesters();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyplan.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for class '{@link studyplan.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see studyplan.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyplan.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see studyplan.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see studyplan.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see studyplan.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.Course#isTaughtInAutumn <em>Taught In Autumn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taught In Autumn</em>'.
	 * @see studyplan.Course#isTaughtInAutumn()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_TaughtInAutumn();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.Course#isTaughtInSpring <em>Taught In Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taught In Spring</em>'.
	 * @see studyplan.Course#isTaughtInSpring()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_TaughtInSpring();

	/**
	 * Returns the meta object for class '{@link studyplan.CourseGroup <em>Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Group</em>'.
	 * @see studyplan.CourseGroup
	 * @generated
	 */
	EClass getCourseGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link studyplan.CourseGroup#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see studyplan.CourseGroup#getCourses()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EReference getCourseGroup_Courses();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.CourseGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see studyplan.CourseGroup#getDescription()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_Description();

	/**
	 * Returns the meta object for class '{@link studyplan.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see studyplan.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the container reference '{@link studyplan.Specialization#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see studyplan.Specialization#getProgram()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Program();

	/**
	 * Returns the meta object for the reference '{@link studyplan.Specialization#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mandatory Courses</em>'.
	 * @see studyplan.Specialization#getMandatoryCourses()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_MandatoryCourses();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.Specialization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyplan.Specialization#getName()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_Name();

	/**
	 * Returns the meta object for the reference list '{@link studyplan.Specialization#getSubSpecializations <em>Sub Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Specializations</em>'.
	 * @see studyplan.Specialization#getSubSpecializations()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_SubSpecializations();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.Specialization#getDurationInSemesters <em>Duration In Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration In Semesters</em>'.
	 * @see studyplan.Specialization#getDurationInSemesters()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_DurationInSemesters();

	/**
	 * Returns the meta object for the reference '{@link studyplan.Specialization#getParentSpecialization <em>Parent Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Specialization</em>'.
	 * @see studyplan.Specialization#getParentSpecialization()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_ParentSpecialization();

	/**
	 * Returns the meta object for class '{@link studyplan.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see studyplan.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.Semester#getProgramsSemesterOrderNr <em>Programs Semester Order Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Programs Semester Order Nr</em>'.
	 * @see studyplan.Semester#getProgramsSemesterOrderNr()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_ProgramsSemesterOrderNr();

	/**
	 * Returns the meta object for the reference '{@link studyplan.Semester#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mandatory Courses</em>'.
	 * @see studyplan.Semester#getMandatoryCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_MandatoryCourses();

	/**
	 * Returns the meta object for the containment reference list '{@link studyplan.Semester#getOptionalCourseGroups <em>Optional Course Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optional Course Groups</em>'.
	 * @see studyplan.Semester#getOptionalCourseGroups()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_OptionalCourseGroups();

	/**
	 * Returns the meta object for the container reference '{@link studyplan.Semester#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see studyplan.Semester#getProgram()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Program();

	/**
	 * Returns the meta object for the reference '{@link studyplan.Semester#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialization</em>'.
	 * @see studyplan.Semester#getSpecialization()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Specialization();

	/**
	 * Returns the meta object for class '{@link studyplan.SemesterOptionalCourseGroup <em>Semester Optional Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester Optional Course Group</em>'.
	 * @see studyplan.SemesterOptionalCourseGroup
	 * @generated
	 */
	EClass getSemesterOptionalCourseGroup();

	/**
	 * Returns the meta object for the attribute '{@link studyplan.SemesterOptionalCourseGroup#getNrOfOptionalFromGroup <em>Nr Of Optional From Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Optional From Group</em>'.
	 * @see studyplan.SemesterOptionalCourseGroup#getNrOfOptionalFromGroup()
	 * @see #getSemesterOptionalCourseGroup()
	 * @generated
	 */
	EAttribute getSemesterOptionalCourseGroup_NrOfOptionalFromGroup();

	/**
	 * Returns the meta object for the reference '{@link studyplan.SemesterOptionalCourseGroup#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semester</em>'.
	 * @see studyplan.SemesterOptionalCourseGroup#getSemester()
	 * @see #getSemesterOptionalCourseGroup()
	 * @generated
	 */
	EReference getSemesterOptionalCourseGroup_Semester();

	/**
	 * Returns the meta object for the reference '{@link studyplan.SemesterOptionalCourseGroup#getCourseGroup <em>Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course Group</em>'.
	 * @see studyplan.SemesterOptionalCourseGroup#getCourseGroup()
	 * @see #getSemesterOptionalCourseGroup()
	 * @generated
	 */
	EReference getSemesterOptionalCourseGroup_CourseGroup();

	/**
	 * Returns the meta object for enum '{@link studyplan.ProgramTypeAndDuration <em>Program Type And Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Program Type And Duration</em>'.
	 * @see studyplan.ProgramTypeAndDuration
	 * @generated
	 */
	EEnum getProgramTypeAndDuration();

	/**
	 * Returns the meta object for enum '{@link studyplan.CourseLevel <em>Course Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Level</em>'.
	 * @see studyplan.CourseLevel
	 * @generated
	 */
	EEnum getCourseLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyplanFactory getStudyplanFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link studyplan.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyplan.impl.ProgramImpl
		 * @see studyplan.impl.StudyplanPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__TYPE = eINSTANCE.getProgram_Type();

		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SPECIALIZATIONS = eINSTANCE.getProgram_Specializations();

		/**
		 * The meta object literal for the '<em><b>Mandatory Courses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__MANDATORY_COURSES = eINSTANCE.getProgram_MandatoryCourses();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SEMESTERS = eINSTANCE.getProgram_Semesters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '{@link studyplan.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyplan.impl.CourseImpl
		 * @see studyplan.impl.StudyplanPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Taught In Autumn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__TAUGHT_IN_AUTUMN = eINSTANCE.getCourse_TaughtInAutumn();

		/**
		 * The meta object literal for the '<em><b>Taught In Spring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__TAUGHT_IN_SPRING = eINSTANCE.getCourse_TaughtInSpring();

		/**
		 * The meta object literal for the '{@link studyplan.impl.CourseGroupImpl <em>Course Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyplan.impl.CourseGroupImpl
		 * @see studyplan.impl.StudyplanPackageImpl#getCourseGroup()
		 * @generated
		 */
		EClass COURSE_GROUP = eINSTANCE.getCourseGroup();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_GROUP__COURSES = eINSTANCE.getCourseGroup_Courses();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__DESCRIPTION = eINSTANCE.getCourseGroup_Description();

		/**
		 * The meta object literal for the '{@link studyplan.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyplan.impl.SpecializationImpl
		 * @see studyplan.impl.StudyplanPackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__PROGRAM = eINSTANCE.getSpecialization_Program();

		/**
		 * The meta object literal for the '<em><b>Mandatory Courses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__MANDATORY_COURSES = eINSTANCE.getSpecialization_MandatoryCourses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__NAME = eINSTANCE.getSpecialization_Name();

		/**
		 * The meta object literal for the '<em><b>Sub Specializations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SUB_SPECIALIZATIONS = eINSTANCE.getSpecialization_SubSpecializations();

		/**
		 * The meta object literal for the '<em><b>Duration In Semesters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__DURATION_IN_SEMESTERS = eINSTANCE.getSpecialization_DurationInSemesters();

		/**
		 * The meta object literal for the '<em><b>Parent Specialization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__PARENT_SPECIALIZATION = eINSTANCE.getSpecialization_ParentSpecialization();

		/**
		 * The meta object literal for the '{@link studyplan.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyplan.impl.SemesterImpl
		 * @see studyplan.impl.StudyplanPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Programs Semester Order Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__PROGRAMS_SEMESTER_ORDER_NR = eINSTANCE.getSemester_ProgramsSemesterOrderNr();

		/**
		 * The meta object literal for the '<em><b>Mandatory Courses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__MANDATORY_COURSES = eINSTANCE.getSemester_MandatoryCourses();

		/**
		 * The meta object literal for the '<em><b>Optional Course Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__OPTIONAL_COURSE_GROUPS = eINSTANCE.getSemester_OptionalCourseGroups();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__PROGRAM = eINSTANCE.getSemester_Program();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SPECIALIZATION = eINSTANCE.getSemester_Specialization();

		/**
		 * The meta object literal for the '{@link studyplan.impl.SemesterOptionalCourseGroupImpl <em>Semester Optional Course Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyplan.impl.SemesterOptionalCourseGroupImpl
		 * @see studyplan.impl.StudyplanPackageImpl#getSemesterOptionalCourseGroup()
		 * @generated
		 */
		EClass SEMESTER_OPTIONAL_COURSE_GROUP = eINSTANCE.getSemesterOptionalCourseGroup();

		/**
		 * The meta object literal for the '<em><b>Nr Of Optional From Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER_OPTIONAL_COURSE_GROUP__NR_OF_OPTIONAL_FROM_GROUP = eINSTANCE.getSemesterOptionalCourseGroup_NrOfOptionalFromGroup();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER = eINSTANCE.getSemesterOptionalCourseGroup_Semester();

		/**
		 * The meta object literal for the '<em><b>Course Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP = eINSTANCE.getSemesterOptionalCourseGroup_CourseGroup();

		/**
		 * The meta object literal for the '{@link studyplan.ProgramTypeAndDuration <em>Program Type And Duration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyplan.ProgramTypeAndDuration
		 * @see studyplan.impl.StudyplanPackageImpl#getProgramTypeAndDuration()
		 * @generated
		 */
		EEnum PROGRAM_TYPE_AND_DURATION = eINSTANCE.getProgramTypeAndDuration();

		/**
		 * The meta object literal for the '{@link studyplan.CourseLevel <em>Course Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyplan.CourseLevel
		 * @see studyplan.impl.StudyplanPackageImpl#getCourseLevel()
		 * @generated
		 */
		EEnum COURSE_LEVEL = eINSTANCE.getCourseLevel();

	}

} //StudyplanPackage
