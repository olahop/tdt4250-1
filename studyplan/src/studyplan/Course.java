/**
 */
package studyplan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.Course#getName <em>Name</em>}</li>
 *   <li>{@link studyplan.Course#getCode <em>Code</em>}</li>
 *   <li>{@link studyplan.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link studyplan.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link studyplan.Course#isTaughtInAutumn <em>Taught In Autumn</em>}</li>
 *   <li>{@link studyplan.Course#isTaughtInSpring <em>Taught In Spring</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasValidCreditValue codeIsUnique taughtInAutumnOrSpring'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyplan.StudyplanPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyplan.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see studyplan.StudyplanPackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link studyplan.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link studyplan.CourseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see studyplan.CourseLevel
	 * @see #setLevel(CourseLevel)
	 * @see studyplan.StudyplanPackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	CourseLevel getLevel();

	/**
	 * Sets the value of the '{@link studyplan.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see studyplan.CourseLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(CourseLevel value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(double)
	 * @see studyplan.StudyplanPackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	double getCredits();

	/**
	 * Sets the value of the '{@link studyplan.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(double value);

	/**
	 * Returns the value of the '<em><b>Taught In Autumn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taught In Autumn</em>' attribute.
	 * @see #setTaughtInAutumn(boolean)
	 * @see studyplan.StudyplanPackage#getCourse_TaughtInAutumn()
	 * @model
	 * @generated
	 */
	boolean isTaughtInAutumn();

	/**
	 * Sets the value of the '{@link studyplan.Course#isTaughtInAutumn <em>Taught In Autumn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taught In Autumn</em>' attribute.
	 * @see #isTaughtInAutumn()
	 * @generated
	 */
	void setTaughtInAutumn(boolean value);

	/**
	 * Returns the value of the '<em><b>Taught In Spring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taught In Spring</em>' attribute.
	 * @see #setTaughtInSpring(boolean)
	 * @see studyplan.StudyplanPackage#getCourse_TaughtInSpring()
	 * @model
	 * @generated
	 */
	boolean isTaughtInSpring();

	/**
	 * Sets the value of the '{@link studyplan.Course#isTaughtInSpring <em>Taught In Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taught In Spring</em>' attribute.
	 * @see #isTaughtInSpring()
	 * @generated
	 */
	void setTaughtInSpring(boolean value);

} // Course
