/**
 */
package studyplan.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyplan.Studyplan;
import studyplan.StudyplanFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Studyplan</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyplanTest extends TestCase {

	/**
	 * The fixture for this Studyplan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Studyplan fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudyplanTest.class);
	}

	/**
	 * Constructs a new Studyplan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyplanTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Studyplan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Studyplan fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Studyplan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Studyplan getFixture() {
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
		setFixture(StudyplanFactory.eINSTANCE.createStudyplan());
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

} //StudyplanTest
