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
 *   <li>{@link studyplan.Specialization#getDurationInSemesters <em>Duration In Semesters</em>}</li>
 *   <li>{@link studyplan.Specialization#getParentSpecialization <em>Parent Specialization</em>}</li>
 *   <li>{@link studyplan.Specialization#getSubSpecializations <em>Sub Specializations</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getSpecialization()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='allSubspecsSimilarLength subspecsShorterThanParent semestersCoverMandatoryCourses'"
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyplan.Program#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see studyplan.StudyplanPackage#getSpecialization_Program()
	 * @see studyplan.Program#getSpecializations
	 * @model opposite="specializations" required="true" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link studyplan.Specialization#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' reference.
	 * @see #setMandatoryCourses(CourseGroup)
	 * @see studyplan.StudyplanPackage#getSpecialization_MandatoryCourses()
	 * @model required="true"
	 * @generated
	 */
	CourseGroup getMandatoryCourses();

	/**
	 * Sets the value of the '{@link studyplan.Specialization#getMandatoryCourses <em>Mandatory Courses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Courses</em>' reference.
	 * @see #getMandatoryCourses()
	 * @generated
	 */
	void setMandatoryCourses(CourseGroup value);

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
	 * Returns the value of the '<em><b>Sub Specializations</b></em>' reference list.
	 * The list contents are of type {@link studyplan.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Specializations</em>' reference list.
	 * @see studyplan.StudyplanPackage#getSpecialization_SubSpecializations()
	 * @model derived="true"
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
	 * Returns the value of the '<em><b>Parent Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Specialization</em>' reference.
	 * @see #setParentSpecialization(Specialization)
	 * @see studyplan.StudyplanPackage#getSpecialization_ParentSpecialization()
	 * @model
	 * @generated
	 */
	Specialization getParentSpecialization();

	/**
	 * Sets the value of the '{@link studyplan.Specialization#getParentSpecialization <em>Parent Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Specialization</em>' reference.
	 * @see #getParentSpecialization()
	 * @generated
	 */
	void setParentSpecialization(Specialization value);

} // Specialization
