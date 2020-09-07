/**
 */
package studyplan.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import studyplan.CourseGroup;
import studyplan.Semester;
import studyplan.SemesterOptionalCourseGroup;
import studyplan.StudyplanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester Optional Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyplan.impl.SemesterOptionalCourseGroupImpl#getNrOfOptionalFromGroup <em>Nr Of Optional From Group</em>}</li>
 *   <li>{@link studyplan.impl.SemesterOptionalCourseGroupImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyplan.impl.SemesterOptionalCourseGroupImpl#getCourseGroup <em>Course Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterOptionalCourseGroupImpl extends MinimalEObjectImpl.Container implements SemesterOptionalCourseGroup {
	/**
	 * The default value of the '{@link #getNrOfOptionalFromGroup() <em>Nr Of Optional From Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfOptionalFromGroup()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_OPTIONAL_FROM_GROUP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfOptionalFromGroup() <em>Nr Of Optional From Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfOptionalFromGroup()
	 * @generated
	 * @ordered
	 */
	protected int nrOfOptionalFromGroup = NR_OF_OPTIONAL_FROM_GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester semester;

	/**
	 * The cached value of the '{@link #getCourseGroup() <em>Course Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroup()
	 * @generated
	 * @ordered
	 */
	protected CourseGroup courseGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterOptionalCourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplanPackage.Literals.SEMESTER_OPTIONAL_COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNrOfOptionalFromGroup() {
		return nrOfOptionalFromGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNrOfOptionalFromGroup(int newNrOfOptionalFromGroup) {
		int oldNrOfOptionalFromGroup = nrOfOptionalFromGroup;
		nrOfOptionalFromGroup = newNrOfOptionalFromGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__NR_OF_OPTIONAL_FROM_GROUP, oldNrOfOptionalFromGroup, nrOfOptionalFromGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSemester() {
		if (semester != null && semester.eIsProxy()) {
			InternalEObject oldSemester = (InternalEObject)semester;
			semester = (Semester)eResolveProxy(oldSemester);
			if (semester != oldSemester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER, oldSemester, semester));
			}
		}
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester basicGetSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemester(Semester newSemester) {
		Semester oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseGroup getCourseGroup() {
		if (courseGroup != null && courseGroup.eIsProxy()) {
			InternalEObject oldCourseGroup = (InternalEObject)courseGroup;
			courseGroup = (CourseGroup)eResolveProxy(oldCourseGroup);
			if (courseGroup != oldCourseGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP, oldCourseGroup, courseGroup));
			}
		}
		return courseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseGroup basicGetCourseGroup() {
		return courseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseGroup(CourseGroup newCourseGroup) {
		CourseGroup oldCourseGroup = courseGroup;
		courseGroup = newCourseGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP, oldCourseGroup, courseGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__NR_OF_OPTIONAL_FROM_GROUP:
				return getNrOfOptionalFromGroup();
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER:
				if (resolve) return getSemester();
				return basicGetSemester();
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP:
				if (resolve) return getCourseGroup();
				return basicGetCourseGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__NR_OF_OPTIONAL_FROM_GROUP:
				setNrOfOptionalFromGroup((Integer)newValue);
				return;
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP:
				setCourseGroup((CourseGroup)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__NR_OF_OPTIONAL_FROM_GROUP:
				setNrOfOptionalFromGroup(NR_OF_OPTIONAL_FROM_GROUP_EDEFAULT);
				return;
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER:
				setSemester((Semester)null);
				return;
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP:
				setCourseGroup((CourseGroup)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__NR_OF_OPTIONAL_FROM_GROUP:
				return nrOfOptionalFromGroup != NR_OF_OPTIONAL_FROM_GROUP_EDEFAULT;
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER:
				return semester != null;
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP:
				return courseGroup != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nrOfOptionalFromGroup: ");
		result.append(nrOfOptionalFromGroup);
		result.append(')');
		return result.toString();
	}

} //SemesterOptionalCourseGroupImpl
