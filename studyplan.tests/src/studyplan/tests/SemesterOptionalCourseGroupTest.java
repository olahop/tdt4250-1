/**
 */
package studyplan.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyplan.SemesterOptionalCourseGroup;
import studyplan.StudyplanFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semester Optional Course Group</b></em>'.
 * <!-- end-user-doc -->
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

} //SemesterOptionalCourseGroupTest
