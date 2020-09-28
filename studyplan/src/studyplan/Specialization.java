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
 *   <li>{@link studyplan.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link studyplan.Specialization#getSubSpecializations <em>Sub Specializations</em>}</li>
 *   <li>{@link studyplan.Specialization#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link studyplan.Specialization#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getSpecialization()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='allSubspecsSimilarLength mandatoryCoursesAreCovered'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 mandatoryCoursesAreCovered='self.subSpecializations-&gt;forAll(sub | sub.semesters.mandatoryCourses-&gt;union(sub.eContainer().semesters.mandatoryCourses)-&gt;includesAll(self.mandatoryCourses))' allSubspecsSimilarLength='self.subSpecializations-&gt;forAll(sub | sub.semesters-&gt;size() = self.subSpecializations-&gt;first().semesters-&gt;size())'"
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' reference list.
	 * The list contents are of type {@link studyplan.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' reference list.
	 * @see studyplan.StudyplanPackage#getSpecialization_MandatoryCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getMandatoryCourses();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getSpecialization_Semesters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

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

} // Specialization
