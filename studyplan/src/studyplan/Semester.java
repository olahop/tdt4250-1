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
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='shouldContainEnoughCredits courseIsTaughtCurrentSemester'"
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
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getSemester_MandatoryCourses()
	 * @model containment="true" upper="6"
	 * @generated
	 */
	EList<Course> getMandatoryCourses();

	/**
	 * Returns the value of the '<em><b>Optional Course Groups</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.CourseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Course Groups</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getSemester_OptionalCourseGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseGroup> getOptionalCourseGroups();

} // Semester
