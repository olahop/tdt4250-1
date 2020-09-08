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
 *   <li>{@link studyplan.SemesterOptionalCourseGroup#getCourseGroup <em>Course Group</em>}</li>
 *   <li>{@link studyplan.SemesterOptionalCourseGroup#getCurrentlySelected <em>Currently Selected</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getSemesterOptionalCourseGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nrOfOptionalMustBeLessThanSizeOfGroup currentlySelectedInOptions currentlySelectedCorrectSize'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 nrOfOptionalMustBeLessThanSizeOfGroup='self.courseGroup.courses-&gt;size() &gt;= self.nrOfOptionalFromGroup' currentlySelectedCorrectSize='self.currentlySelected-&gt;size() = self.nrOfOptionalFromGroup' currentlySelectedInOptions='self.courseGroup.courses-&gt;includesAll(self.currentlySelected)'"
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
	 * Returns the value of the '<em><b>Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' reference.
	 * @see #setSemester(Semester)
	 * @see studyplan.StudyplanPackage#getSemesterOptionalCourseGroup_Semester()
	 * @model required="true"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link studyplan.SemesterOptionalCourseGroup#getSemester <em>Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Course Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Group</em>' containment reference.
	 * @see #setCourseGroup(CourseGroup)
	 * @see studyplan.StudyplanPackage#getSemesterOptionalCourseGroup_CourseGroup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CourseGroup getCourseGroup();

	/**
	 * Sets the value of the '{@link studyplan.SemesterOptionalCourseGroup#getCourseGroup <em>Course Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Group</em>' containment reference.
	 * @see #getCourseGroup()
	 * @generated
	 */
	void setCourseGroup(CourseGroup value);

	/**
	 * Returns the value of the '<em><b>Currently Selected</b></em>' reference list.
	 * The list contents are of type {@link studyplan.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currently Selected</em>' reference list.
	 * @see studyplan.StudyplanPackage#getSemesterOptionalCourseGroup_CurrentlySelected()
	 * @model
	 * @generated
	 */
	EList<Course> getCurrentlySelected();

} // SemesterOptionalCourseGroup
