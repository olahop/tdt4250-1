/**
 */
package studyplan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
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
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SEMESTERS = 3;

	/**
	 * The feature id for the '<em><b>Mandatory Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__MANDATORY_COURSES = 4;

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
	 * The meta object id for the '{@link studyplan.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.impl.SpecializationImpl
	 * @see studyplan.impl.StudyplanPackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sub Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SUB_SPECIALIZATIONS = 1;

	/**
	 * The feature id for the '<em><b>Mandatory Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__MANDATORY_COURSES = 2;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SEMESTERS = 3;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 4;

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
	int SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Programs Semester Order Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__PROGRAMS_SEMESTER_ORDER_NR = 0;

	/**
	 * The feature id for the '<em><b>Optional Course Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__OPTIONAL_COURSE_GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Total Credits Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__TOTAL_CREDITS_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Mandatory Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__MANDATORY_COURSES = 3;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 4;

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
	int SEMESTER_OPTIONAL_COURSE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Nr Of Optional From Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP__NR_OF_OPTIONAL_FROM_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Currently Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP__CURRENTLY_SELECTED = 2;

	/**
	 * The feature id for the '<em><b>Optional Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP__OPTIONAL_COURSES = 3;

	/**
	 * The number of structural features of the '<em>Semester Optional Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Select Optional Course</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP___SELECT_OPTIONAL_COURSE__COURSE = 0;

	/**
	 * The operation id for the '<em>Unselect Optional Course</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP___UNSELECT_OPTIONAL_COURSE__COURSE = 1;

	/**
	 * The number of operations of the '<em>Semester Optional Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPTIONAL_COURSE_GROUP_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link studyplan.impl.StudyplanImpl <em>Studyplan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.impl.StudyplanImpl
	 * @see studyplan.impl.StudyplanPackageImpl#getStudyplan()
	 * @generated
	 */
	int STUDYPLAN = 5;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPLAN__PROGRAMS = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPLAN__COURSES = 1;

	/**
	 * The number of structural features of the '<em>Studyplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPLAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Studyplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPLAN_OPERATION_COUNT = 0;

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
	 * The meta object id for the '<em>Course Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see studyplan.impl.StudyplanPackageImpl#getCourseCode()
	 * @generated
	 */
	int COURSE_CODE = 8;


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
	 * Returns the meta object for the reference list '{@link studyplan.Program#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory Courses</em>'.
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
	 * Returns the meta object for class '{@link studyplan.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see studyplan.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the reference list '{@link studyplan.Specialization#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory Courses</em>'.
	 * @see studyplan.Specialization#getMandatoryCourses()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_MandatoryCourses();

	/**
	 * Returns the meta object for the containment reference list '{@link studyplan.Specialization#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see studyplan.Specialization#getSemesters()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Semesters();

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
	 * Returns the meta object for the containment reference list '{@link studyplan.Specialization#getSubSpecializations <em>Sub Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Specializations</em>'.
	 * @see studyplan.Specialization#getSubSpecializations()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_SubSpecializations();

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
	 * Returns the meta object for the reference list '{@link studyplan.Semester#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory Courses</em>'.
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
	 * Returns the meta object for the attribute '{@link studyplan.Semester#getTotalCreditsValue <em>Total Credits Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Credits Value</em>'.
	 * @see studyplan.Semester#getTotalCreditsValue()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_TotalCreditsValue();

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
	 * Returns the meta object for the container reference '{@link studyplan.SemesterOptionalCourseGroup#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semester</em>'.
	 * @see studyplan.SemesterOptionalCourseGroup#getSemester()
	 * @see #getSemesterOptionalCourseGroup()
	 * @generated
	 */
	EReference getSemesterOptionalCourseGroup_Semester();

	/**
	 * Returns the meta object for the reference list '{@link studyplan.SemesterOptionalCourseGroup#getCurrentlySelected <em>Currently Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Currently Selected</em>'.
	 * @see studyplan.SemesterOptionalCourseGroup#getCurrentlySelected()
	 * @see #getSemesterOptionalCourseGroup()
	 * @generated
	 */
	EReference getSemesterOptionalCourseGroup_CurrentlySelected();

	/**
	 * Returns the meta object for the reference list '{@link studyplan.SemesterOptionalCourseGroup#getOptionalCourses <em>Optional Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional Courses</em>'.
	 * @see studyplan.SemesterOptionalCourseGroup#getOptionalCourses()
	 * @see #getSemesterOptionalCourseGroup()
	 * @generated
	 */
	EReference getSemesterOptionalCourseGroup_OptionalCourses();

	/**
	 * Returns the meta object for the '{@link studyplan.SemesterOptionalCourseGroup#selectOptionalCourse(studyplan.Course) <em>Select Optional Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Select Optional Course</em>' operation.
	 * @see studyplan.SemesterOptionalCourseGroup#selectOptionalCourse(studyplan.Course)
	 * @generated
	 */
	EOperation getSemesterOptionalCourseGroup__SelectOptionalCourse__Course();

	/**
	 * Returns the meta object for the '{@link studyplan.SemesterOptionalCourseGroup#unselectOptionalCourse(studyplan.Course) <em>Unselect Optional Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unselect Optional Course</em>' operation.
	 * @see studyplan.SemesterOptionalCourseGroup#unselectOptionalCourse(studyplan.Course)
	 * @generated
	 */
	EOperation getSemesterOptionalCourseGroup__UnselectOptionalCourse__Course();

	/**
	 * Returns the meta object for class '{@link studyplan.Studyplan <em>Studyplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Studyplan</em>'.
	 * @see studyplan.Studyplan
	 * @generated
	 */
	EClass getStudyplan();

	/**
	 * Returns the meta object for the containment reference list '{@link studyplan.Studyplan#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see studyplan.Studyplan#getPrograms()
	 * @see #getStudyplan()
	 * @generated
	 */
	EReference getStudyplan_Programs();

	/**
	 * Returns the meta object for the containment reference list '{@link studyplan.Studyplan#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see studyplan.Studyplan#getCourses()
	 * @see #getStudyplan()
	 * @generated
	 */
	EReference getStudyplan_Courses();

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
	 * Returns the meta object for data type '{@link java.lang.String <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Course Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCourseCode();

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
		 * The meta object literal for the '<em><b>Mandatory Courses</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link studyplan.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyplan.impl.SpecializationImpl
		 * @see studyplan.impl.StudyplanPackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Mandatory Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__MANDATORY_COURSES = eINSTANCE.getSpecialization_MandatoryCourses();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SEMESTERS = eINSTANCE.getSpecialization_Semesters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__NAME = eINSTANCE.getSpecialization_Name();

		/**
		 * The meta object literal for the '<em><b>Sub Specializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SUB_SPECIALIZATIONS = eINSTANCE.getSpecialization_SubSpecializations();

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
		 * The meta object literal for the '<em><b>Mandatory Courses</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Total Credits Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__TOTAL_CREDITS_VALUE = eINSTANCE.getSemester_TotalCreditsValue();

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
		 * The meta object literal for the '<em><b>Semester</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER = eINSTANCE.getSemesterOptionalCourseGroup_Semester();

		/**
		 * The meta object literal for the '<em><b>Currently Selected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_OPTIONAL_COURSE_GROUP__CURRENTLY_SELECTED = eINSTANCE.getSemesterOptionalCourseGroup_CurrentlySelected();

		/**
		 * The meta object literal for the '<em><b>Optional Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_OPTIONAL_COURSE_GROUP__OPTIONAL_COURSES = eINSTANCE.getSemesterOptionalCourseGroup_OptionalCourses();

		/**
		 * The meta object literal for the '<em><b>Select Optional Course</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMESTER_OPTIONAL_COURSE_GROUP___SELECT_OPTIONAL_COURSE__COURSE = eINSTANCE.getSemesterOptionalCourseGroup__SelectOptionalCourse__Course();

		/**
		 * The meta object literal for the '<em><b>Unselect Optional Course</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMESTER_OPTIONAL_COURSE_GROUP___UNSELECT_OPTIONAL_COURSE__COURSE = eINSTANCE.getSemesterOptionalCourseGroup__UnselectOptionalCourse__Course();

		/**
		 * The meta object literal for the '{@link studyplan.impl.StudyplanImpl <em>Studyplan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyplan.impl.StudyplanImpl
		 * @see studyplan.impl.StudyplanPackageImpl#getStudyplan()
		 * @generated
		 */
		EClass STUDYPLAN = eINSTANCE.getStudyplan();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDYPLAN__PROGRAMS = eINSTANCE.getStudyplan_Programs();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDYPLAN__COURSES = eINSTANCE.getStudyplan_Courses();

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

		/**
		 * The meta object literal for the '<em>Course Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see studyplan.impl.StudyplanPackageImpl#getCourseCode()
		 * @generated
		 */
		EDataType COURSE_CODE = eINSTANCE.getCourseCode();

	}

} //StudyplanPackage
