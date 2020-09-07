/**
 */
package studyplan;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Studyplan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.Studyplan#getPrograms <em>Programs</em>}</li>
 *   <li>{@link studyplan.Studyplan#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getStudyplan()
 * @model
 * @generated
 */
public interface Studyplan extends EObject {
	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getStudyplan_Programs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getPrograms();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getStudyplan_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // Studyplan
