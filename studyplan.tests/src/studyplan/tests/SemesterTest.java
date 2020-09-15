/**
 */
package studyplan.tests;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

import junit.textui.TestRunner;
import studyplan.Course;
import studyplan.CourseGroup;
import studyplan.Semester;
import studyplan.StudyplanFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link studyplan.Semester#getTotalCreditsValue() <em>Total Credits Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SemesterTest extends TestCase {

	/**
	 * The fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semester fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemesterTest.class);
	}

	/**
	 * Constructs a new Semester test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Semester fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semester getFixture() {
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
		setFixture(StudyplanFactory.eINSTANCE.createSemester());
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
	 * Tests the '{@link studyplan.Semester#getTotalCreditsValue() <em>Total Credits Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.Semester#getTotalCreditsValue()
	 * @generated NOT
	 */
	public void testGetTotalCreditsValue() {
		List<Course> courses = new ArrayList<>();
		Course course1 = StudyplanFactory.eINSTANCE.createCourse();
		course1.setCredits(7.5);
		courses.add(course1);
		Course course2 = StudyplanFactory.eINSTANCE.createCourse();
		course2.setCredits(7.5);
		courses.add(course2);
		Course course3 = StudyplanFactory.eINSTANCE.createCourse();
		course3.setCredits(7.5);
		courses.add(course3);
		
		CourseGroup courseGroup1 = StudyplanFactory.eINSTANCE.createCourseGroup();
		
		
		//courseGroup1.eSet(, course1);
		
		//System.out.print(courseGroup1.getCourses());
		
		
		Semester semester = StudyplanFactory.eINSTANCE.createSemester();
		semester.setMandatoryCourses(courseGroup1);
		
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SemesterTest
