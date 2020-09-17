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
 *   <li>{@link studyplan.Program#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link studyplan.Program#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyplan.Program#getDurationPreSpecialization <em>Duration Pre Specialization</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getProgram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='totalNrOfSemestersShouldMatchType masterLevelHasMaxLimitOfLevelThreeCoures allSpecsDurationShorterThanProgram allMainSpecsSimilarDuration mandatoryCoursesCovered semestersHasUniqueOrderNr noDuplicateCourses'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 totalNrOfSemestersShouldMatchType='self.type.value = self.semesters-&gt;size()' allSpecsDurationShorterThanProgram='self.specializations-&gt;collect(spec | spec.durationInSemesters)-&gt;forAll(num | num &lt;= self.type.value)' allMainSpecsSimilarDuration='self.specializations-&gt;select(spec | spec.parentSpecialization = null)-&gt;collect(spec | spec.durationInSemesters)-&gt;forAll(num | num = self.specializations-&gt;first().durationInSemesters)' semestersHasUniqueOrderNr='self.semesters-&gt;isUnique(sem | sem.ProgramsSemesterOrderNr)' masterLevelHasMaxLimitOfLevelThreeCoures='self.semesters-&gt;subSequence(self.semesters-&gt;size()-3, self.semesters-&gt;size()).mandatoryCourses.courses-&gt;union(self.semesters-&gt;subSequence(self.semesters-&gt;size()-3, self.semesters-&gt;size()).optionalCourseGroups.currentlySelected)-&gt;select( c | c.level.value &lt; 3).credits-&gt;sum() &lt;= 22.5'"
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
	 * It is bidirectional and its opposite is '{@link studyplan.Specialization#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getProgram_Specializations()
	 * @see studyplan.Specialization#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' containment reference.
	 * @see #setMandatoryCourses(CourseGroup)
	 * @see studyplan.StudyplanPackage#getProgram_MandatoryCourses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CourseGroup getMandatoryCourses();

	/**
	 * Sets the value of the '{@link studyplan.Program#getMandatoryCourses <em>Mandatory Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Courses</em>' containment reference.
	 * @see #getMandatoryCourses()
	 * @generated
	 */
	void setMandatoryCourses(CourseGroup value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.Semester}.
	 * It is bidirectional and its opposite is '{@link studyplan.Semester#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getProgram_Semesters()
	 * @see studyplan.Semester#getProgram
	 * @model opposite="program" containment="true" lower="4" upper="10"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Duration Pre Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Pre Specialization</em>' attribute.
	 * @see studyplan.StudyplanPackage#getProgram_DurationPreSpecialization()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	int getDurationPreSpecialization();

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
