/**
 */
package studyplan.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import studyplan.Course;
import studyplan.CourseGroup;
import studyplan.SemesterOptionalCourseGroup;
import studyplan.StudyplanFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semester Optional Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link studyplan.SemesterOptionalCourseGroup#selectOptionalCourse(studyplan.Course) <em>Select Optional Course</em>}</li>
 *   <li>{@link studyplan.SemesterOptionalCourseGroup#unselectOptionalCourse(studyplan.Course) <em>Unselect Optional Course</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SemesterOptionalCourseGroupTest extends TestCase {

	/**
	 * The fixture for this Semester Optional Course Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterOptionalCourseGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemesterOptionalCourseGroupTest.class);
	}

	/**
	 * Constructs a new Semester Optional Course Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterOptionalCourseGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Semester Optional Course Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SemesterOptionalCourseGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Semester Optional Course Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterOptionalCourseGroup getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyplanFactory.eINSTANCE.createSemesterOptionalCourseGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link studyplan.SemesterOptionalCourseGroup#selectOptionalCourse(studyplan.Course) <em>Select Optional Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.SemesterOptionalCourseGroup#selectOptionalCourse(studyplan.Course)
	 * @generated NOT
	 */
	public void testSelectOptionalCourse__Course() {
		CourseGroup optionalCourses = StudyplanFactory.eINSTANCE.createCourseGroup();
		Course course1 = StudyplanFactory.eINSTANCE.createCourse();
		course1.setCredits(7.5);
		optionalCourses.getCourses().add(course1);
		Course course2 = StudyplanFactory.eINSTANCE.createCourse();
		course2.setCredits(7.5);
		optionalCourses.getCourses().add(course2);
		
		SemesterOptionalCourseGroup socg = StudyplanFactory.eINSTANCE.createSemesterOptionalCourseGroup();
		socg.setCourseGroup(optionalCourses);
		socg.selectOptionalCourse(course1);
		
		assertFalse(socg.getCurrentlySelected().isEmpty());
		assertEquals(1, socg.getCurrentlySelected().size());
		assertEquals(course1, socg.getCurrentlySelected().get(0));
	}

	/**
	 * Tests the '{@link studyplan.SemesterOptionalCourseGroup#unselectOptionalCourse(studyplan.Course) <em>Unselect Optional Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.SemesterOptionalCourseGroup#unselectOptionalCourse(studyplan.Course)
	 * @generated NOT
	 */
	public void testUnselectOptionalCourse__Course() {
		CourseGroup optionalCourses = StudyplanFactory.eINSTANCE.createCourseGroup();
		Course course1 = StudyplanFactory.eINSTANCE.createCourse();
		course1.setCredits(7.5);
		optionalCourses.getCourses().add(course1);
		
		SemesterOptionalCourseGroup socg = StudyplanFactory.eINSTANCE.createSemesterOptionalCourseGroup();
		socg.setCourseGroup(optionalCourses);
		socg.selectOptionalCourse(course1);		
		socg.unselectOptionalCourse(course1);
		
		assertTrue(socg.getCurrentlySelected().isEmpty());
	}

} //SemesterOptionalCourseGroupTest
