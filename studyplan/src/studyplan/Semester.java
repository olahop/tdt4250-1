/**
 */
package studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.Semester#getProgramsSemesterOrderNr <em>Programs Semester Order Nr</em>}</li>
 *   <li>{@link studyplan.Semester#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link studyplan.Semester#getOptionalCourseGroups <em>Optional Course Groups</em>}</li>
 *   <li>{@link studyplan.Semester#getProgram <em>Program</em>}</li>
 *   <li>{@link studyplan.Semester#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link studyplan.Semester#getTotalCreditsValue <em>Total Credits Value</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='shouldContainEnoughCredits coursesTaughtCurrentSemester'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Programs Semester Order Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs Semester Order Nr</em>' attribute.
	 * @see #setProgramsSemesterOrderNr(int)
	 * @see studyplan.StudyplanPackage#getSemester_ProgramsSemesterOrderNr()
	 * @model
	 * @generated
	 */
	int getProgramsSemesterOrderNr();

	/**
	 * Sets the value of the '{@link studyplan.Semester#getProgramsSemesterOrderNr <em>Programs Semester Order Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programs Semester Order Nr</em>' attribute.
	 * @see #getProgramsSemesterOrderNr()
	 * @generated
	 */
	void setProgramsSemesterOrderNr(int value);

	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' containment reference.
	 * @see #setMandatoryCourses(CourseGroup)
	 * @see studyplan.StudyplanPackage#getSemester_MandatoryCourses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CourseGroup getMandatoryCourses();

	/**
	 * Sets the value of the '{@link studyplan.Semester#getMandatoryCourses <em>Mandatory Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Courses</em>' containment reference.
	 * @see #getMandatoryCourses()
	 * @generated
	 */
	void setMandatoryCourses(CourseGroup value);

	/**
	 * Returns the value of the '<em><b>Optional Course Groups</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.SemesterOptionalCourseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Course Groups</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getSemester_OptionalCourseGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemesterOptionalCourseGroup> getOptionalCourseGroups();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyplan.Program#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see studyplan.StudyplanPackage#getSemester_Program()
	 * @see studyplan.Program#getSemesters
	 * @model opposite="semesters" required="true" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link studyplan.Semester#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' reference.
	 * @see #setSpecialization(Specialization)
	 * @see studyplan.StudyplanPackage#getSemester_Specialization()
	 * @model
	 * @generated
	 */
	Specialization getSpecialization();

	/**
	 * Sets the value of the '{@link studyplan.Semester#getSpecialization <em>Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specialization value);

	/**
	 * Returns the value of the '<em><b>Total Credits Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Credits Value</em>' attribute.
	 * @see studyplan.StudyplanPackage#getSemester_TotalCreditsValue()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	double getTotalCreditsValue();

} // Semester
