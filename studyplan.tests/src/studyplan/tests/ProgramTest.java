/**
 */
package studyplan.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyplan.Program;
import studyplan.ProgramTypeAndDuration;
import studyplan.Specialization;
import studyplan.StudyplanFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramTest extends TestCase {

	/**
	 * The fixture for this Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Program fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgramTest.class);
	}

	/**
	 * Constructs a new Program test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Program fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Program getFixture() {
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
		setFixture(StudyplanFactory.eINSTANCE.createProgram());
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
	 * Tests the '{@link studyplan.Program#getDurationPreSpecialization() <em>Duration Pre Specialization</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyplan.Program#getDurationPreSpecialization()
	 * @generated
	 */
	public void testGetDurationPreSpecialization() {
		Program program = StudyplanFactory.eINSTANCE.createProgram();		
		Specialization specialization = StudyplanFactory.eINSTANCE.createSpecialization();
		specialization.setProgram(program);
		specialization.setDurationInSemesters(3);
		program.setType(ProgramTypeAndDuration.BACHELOR);
		assertEquals(3, program.getDurationPreSpecialization());
		
		program.setType(ProgramTypeAndDuration.INTEGRATED_MASTER);
		assertEquals(7, program.getDurationPreSpecialization());
		
		program.setType(ProgramTypeAndDuration.MASTER);
		assertEquals(1, program.getDurationPreSpecialization());
	}

} //ProgramTest
