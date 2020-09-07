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
 *   <li>{@link studyplan.Studyplan#getCourseGroups <em>Course Groups</em>}</li>
 *   <li>{@link studyplan.Studyplan#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getStudyplan()
 * @model
 * @generated
 */
public interface Studyplan extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Groups</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.CourseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Groups</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getStudyplan_CourseGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseGroup> getCourseGroups();

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

} // Studyplan
