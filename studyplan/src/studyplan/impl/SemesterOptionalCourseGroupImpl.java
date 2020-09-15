/**
 */
package studyplan.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import studyplan.Course;
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
 *   <li>{@link studyplan.impl.SemesterOptionalCourseGroupImpl#getCurrentlySelected <em>Currently Selected</em>}</li>
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
	 * The cached value of the '{@link #getCourseGroup() <em>Course Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroup()
	 * @generated
	 * @ordered
	 */
	protected CourseGroup courseGroup;

	/**
	 * The cached value of the '{@link #getCurrentlySelected() <em>Currently Selected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlySelected()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> currentlySelected;

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
		if (eContainerFeatureID() != StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER) return null;
		return (Semester)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemester(Semester newSemester, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemester, StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemester(Semester newSemester) {
		if (newSemester != eInternalContainer() || (eContainerFeatureID() != StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER && newSemester != null)) {
			if (EcoreUtil.isAncestor(this, newSemester))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemester != null)
				msgs = ((InternalEObject)newSemester).eInverseAdd(this, StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS, Semester.class, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER, newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseGroup getCourseGroup() {
		return courseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseGroup(CourseGroup newCourseGroup, NotificationChain msgs) {
		CourseGroup oldCourseGroup = courseGroup;
		courseGroup = newCourseGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP, oldCourseGroup, newCourseGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseGroup(CourseGroup newCourseGroup) {
		if (newCourseGroup != courseGroup) {
			NotificationChain msgs = null;
			if (courseGroup != null)
				msgs = ((InternalEObject)courseGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP, null, msgs);
			if (newCourseGroup != null)
				msgs = ((InternalEObject)newCourseGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP, null, msgs);
			msgs = basicSetCourseGroup(newCourseGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP, newCourseGroup, newCourseGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCurrentlySelected() {
		if (currentlySelected == null) {
			currentlySelected = new EObjectResolvingEList.Unsettable<Course>(Course.class, this, StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__CURRENTLY_SELECTED);
		}
		return currentlySelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCurrentlySelected() {
		if (currentlySelected != null) ((InternalEList.Unsettable<?>)currentlySelected).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCurrentlySelected() {
		return currentlySelected != null && ((InternalEList.Unsettable<?>)currentlySelected).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void selectOptionalCourse(Course course) {
				
		if(this.getCourseGroup().getCourses().contains(course) && ! this.getCurrentlySelected().contains(course)){
			this.getCurrentlySelected().add(course);
		} else {
			throw new IllegalArgumentException("Course not part of alternatives");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void unselectOptionalCourse(Course course) {
		this.getCurrentlySelected().remove(course);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSemester((Semester)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER:
				return basicSetSemester(null, msgs);
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP:
				return basicSetCourseGroup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER:
				return eInternalContainer().eInverseRemove(this, StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS, Semester.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
				return getSemester();
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP:
				return getCourseGroup();
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__CURRENTLY_SELECTED:
				return getCurrentlySelected();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__CURRENTLY_SELECTED:
				getCurrentlySelected().clear();
				getCurrentlySelected().addAll((Collection<? extends Course>)newValue);
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
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__CURRENTLY_SELECTED:
				unsetCurrentlySelected();
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
				return getSemester() != null;
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__COURSE_GROUP:
				return courseGroup != null;
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__CURRENTLY_SELECTED:
				return isSetCurrentlySelected();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP___SELECT_OPTIONAL_COURSE__COURSE:
				selectOptionalCourse((Course)arguments.get(0));
				return null;
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP___UNSELECT_OPTIONAL_COURSE__COURSE:
				unselectOptionalCourse((Course)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
