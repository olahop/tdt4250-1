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
 *   <li>{@link studyplan.Program#getName <em>Name</em>}</li>
 *   <li>{@link studyplan.Program#getType <em>Type</em>}</li>
 *   <li>{@link studyplan.Program#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link studyplan.Program#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyplan.Program#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getProgram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='totalNrOfSemestersShouldMatchType masterLevelHasMaxLimitOfLevelThreeCoures allMainSpecsSimilarDuration mandatoryCoursesCovered noDuplicateCourses'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 totalNrOfSemestersShouldMatchType='self.specializations.subSpecializations-&gt;forAll(sub | sub.semesters-&gt;union(sub.eContainer().semesters)-&gt;union(sub.eContainer().eContainer().semesters)-&gt;size() = self.type.value)' allMainSpecsSimilarDuration='self.specializations-&gt;forAll(spe | spe.semesters.programsSemesterOrderNr-&gt;union(spe.subSpecializations.semesters.programsSemesterOrderNr)-&gt;asSet()-&gt;size() = self.specializations-&gt;first().semesters.programsSemesterOrderNr-&gt;union(self.specializations.subSpecializations.semesters.programsSemesterOrderNr)-&gt;asSet()-&gt;size())' mandatoryCoursesCovered='self.specializations.subSpecializations-&gt;forAll(sub | sub.semesters.mandatoryCourses-&gt;union(sub.eContainer().semesters.mandatoryCourses)-&gt;union(sub.eContainer().eContainer().semesters.mandatoryCourses)-&gt;includesAll(self.mandatoryCourses))' noDuplicateCourses='self.specializations.subSpecializations-&gt;forAll(sub | sub.semesters.mandatoryCourses-&gt;union(sub.eContainer().semesters.mandatoryCourses)-&gt;union(sub.eContainer().eContainer().semesters.mandatoryCourses)-&gt;isUnique(c | c.code))'"
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
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' reference list.
	 * The list contents are of type {@link studyplan.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' reference list.
	 * @see studyplan.StudyplanPackage#getProgram_MandatoryCourses()
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
	 * @see studyplan.StudyplanPackage#getProgram_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyplan.StudyplanPackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyplan.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Program
