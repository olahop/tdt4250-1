/**
 */
package studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.Specialization#getProgram <em>Program</em>}</li>
 *   <li>{@link studyplan.Specialization#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link studyplan.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link studyplan.Specialization#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyplan.Specialization#getSubSpecializations <em>Sub Specializations</em>}</li>
 *   <li>{@link studyplan.Specialization#getDurationInSemesters <em>Duration In Semesters</em>}</li>
 *   <li>{@link studyplan.Specialization#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getSpecialization()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='allSubspecsSimilarLength subspecsShorterThanParent totalDurationShorterThanProgram semestersCoverMandatoryCourses'"
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(Program)
	 * @see studyplan.StudyplanPackage#getSpecialization_Program()
	 * @model required="true"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link studyplan.Specialization#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' reference list.
	 * The list contents are of type {@link studyplan.CourseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' reference list.
	 * @see studyplan.StudyplanPackage#getSpecialization_MandatoryCourses()
	 * @model
	 * @generated
	 */
	EList<CourseGroup> getMandatoryCourses();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyplan.StudyplanPackage#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyplan.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link studyplan.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see studyplan.StudyplanPackage#getSpecialization_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Sub Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Specializations</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getSpecialization_SubSpecializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSubSpecializations();

	/**
	 * Returns the value of the '<em><b>Duration In Semesters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration In Semesters</em>' attribute.
	 * @see #setDurationInSemesters(int)
	 * @see studyplan.StudyplanPackage#getSpecialization_DurationInSemesters()
	 * @model
	 * @generated
	 */
	int getDurationInSemesters();

	/**
	 * Sets the value of the '{@link studyplan.Specialization#getDurationInSemesters <em>Duration In Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration In Semesters</em>' attribute.
	 * @see #getDurationInSemesters()
	 * @generated
	 */
	void setDurationInSemesters(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getSpecialization_Semesters()
	 * @model containment="true" required="true" upper="10"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Specialization
