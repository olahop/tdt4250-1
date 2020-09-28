/**
 */
package studyplan;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester Optional Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.SemesterOptionalCourseGroup#getNrOfOptionalFromGroup <em>Nr Of Optional From Group</em>}</li>
 *   <li>{@link studyplan.SemesterOptionalCourseGroup#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyplan.SemesterOptionalCourseGroup#getCurrentlySelected <em>Currently Selected</em>}</li>
 *   <li>{@link studyplan.SemesterOptionalCourseGroup#getOptionalCourses <em>Optional Courses</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getSemesterOptionalCourseGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nrOfOptionalMustBeLessThanSizeOfGroup currentlySelectedInOptions currentlySelectedCorrectSize'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 nrOfOptionalMustBeLessThanSizeOfGroup='self.optionalCourses-&gt;size() &gt;= self.nrOfOptionalFromGroup' currentlySelectedCorrectSize='self.currentlySelected-&gt;size() &lt;= self.nrOfOptionalFromGroup' currentlySelectedInOptions='self.optionalCourses-&gt;includesAll(self.currentlySelected)'"
 * @generated
 */
public interface SemesterOptionalCourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Nr Of Optional From Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Optional From Group</em>' attribute.
	 * @see #setNrOfOptionalFromGroup(int)
	 * @see studyplan.StudyplanPackage#getSemesterOptionalCourseGroup_NrOfOptionalFromGroup()
	 * @model required="true"
	 * @generated
	 */
	int getNrOfOptionalFromGroup();

	/**
	 * Sets the value of the '{@link studyplan.SemesterOptionalCourseGroup#getNrOfOptionalFromGroup <em>Nr Of Optional From Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Optional From Group</em>' attribute.
	 * @see #getNrOfOptionalFromGroup()
	 * @generated
	 */
	void setNrOfOptionalFromGroup(int value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyplan.Semester#getOptionalCourseGroups <em>Optional Course Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see studyplan.StudyplanPackage#getSemesterOptionalCourseGroup_Semester()
	 * @see studyplan.Semester#getOptionalCourseGroups
	 * @model opposite="optionalCourseGroups" required="true" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link studyplan.SemesterOptionalCourseGroup#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Currently Selected</b></em>' reference list.
	 * The list contents are of type {@link studyplan.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currently Selected</em>' reference list.
	 * @see #isSetCurrentlySelected()
	 * @see #unsetCurrentlySelected()
	 * @see studyplan.StudyplanPackage#getSemesterOptionalCourseGroup_CurrentlySelected()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<Course> getCurrentlySelected();

	/**
	 * Unsets the value of the '{@link studyplan.SemesterOptionalCourseGroup#getCurrentlySelected <em>Currently Selected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentlySelected()
	 * @see #getCurrentlySelected()
	 * @generated
	 */
	void unsetCurrentlySelected();

	/**
	 * Returns whether the value of the '{@link studyplan.SemesterOptionalCourseGroup#getCurrentlySelected <em>Currently Selected</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Currently Selected</em>' reference list is set.
	 * @see #unsetCurrentlySelected()
	 * @see #getCurrentlySelected()
	 * @generated
	 */
	boolean isSetCurrentlySelected();

	/**
	 * Returns the value of the '<em><b>Optional Courses</b></em>' reference list.
	 * The list contents are of type {@link studyplan.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Courses</em>' reference list.
	 * @see studyplan.StudyplanPackage#getSemesterOptionalCourseGroup_OptionalCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getOptionalCourses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void selectOptionalCourse(Course course);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unselectOptionalCourse(Course course);

} // SemesterOptionalCourseGroup
