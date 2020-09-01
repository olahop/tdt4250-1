/**
 */
package studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.Program#getType <em>Type</em>}</li>
 *   <li>{@link studyplan.Program#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link studyplan.Program#getSemestersPreSpecialization <em>Semesters Pre Specialization</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getProgram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='totalNrOfSemestersShouldMatchType allSpecsSimilarDuration noDuplicateCourses masterLevelHasMaxLimitOfLevelThreeCoures'"
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link studyplan.ProgramTypeAndDuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see studyplan.ProgramTypeAndDuration
	 * @see #setType(ProgramTypeAndDuration)
	 * @see studyplan.StudyplanPackage#getProgram_Type()
	 * @model
	 * @generated
	 */
	ProgramTypeAndDuration getType();

	/**
	 * Sets the value of the '{@link studyplan.Program#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see studyplan.ProgramTypeAndDuration
	 * @see #getType()
	 * @generated
	 */
	void setType(ProgramTypeAndDuration value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getProgram_Specializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Semesters Pre Specialization</b></em>' reference list.
	 * The list contents are of type {@link studyplan.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters Pre Specialization</em>' reference list.
	 * @see studyplan.StudyplanPackage#getProgram_SemestersPreSpecialization()
	 * @model lower="4" upper="10"
	 * @generated
	 */
	EList<Semester> getSemestersPreSpecialization();

} // Program
