/**
 */
package studyplan.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import studyplan.Course;
import studyplan.Semester;
import studyplan.SemesterOptionalCourseGroup;
import studyplan.StudyplanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyplan.impl.SemesterImpl#getProgramsSemesterOrderNr <em>Programs Semester Order Nr</em>}</li>
 *   <li>{@link studyplan.impl.SemesterImpl#getOptionalCourseGroups <em>Optional Course Groups</em>}</li>
 *   <li>{@link studyplan.impl.SemesterImpl#getTotalCreditsValue <em>Total Credits Value</em>}</li>
 *   <li>{@link studyplan.impl.SemesterImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getProgramsSemesterOrderNr() <em>Programs Semester Order Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramsSemesterOrderNr()
	 * @generated
	 * @ordered
	 */
	protected static final int PROGRAMS_SEMESTER_ORDER_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProgramsSemesterOrderNr() <em>Programs Semester Order Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramsSemesterOrderNr()
	 * @generated
	 * @ordered
	 */
	protected int programsSemesterOrderNr = PROGRAMS_SEMESTER_ORDER_NR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptionalCourseGroups() <em>Optional Course Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalCourseGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SemesterOptionalCourseGroup> optionalCourseGroups;

	/**
	 * The default value of the '{@link #getTotalCreditsValue() <em>Total Credits Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCreditsValue()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_CREDITS_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalCreditsValue() <em>Total Credits Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCreditsValue()
	 * @generated
	 * @ordered
	 */
	protected double totalCreditsValue = TOTAL_CREDITS_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatoryCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplanPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProgramsSemesterOrderNr() {
		return programsSemesterOrderNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramsSemesterOrderNr(int newProgramsSemesterOrderNr) {
		int oldProgramsSemesterOrderNr = programsSemesterOrderNr;
		programsSemesterOrderNr = newProgramsSemesterOrderNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER__PROGRAMS_SEMESTER_ORDER_NR, oldProgramsSemesterOrderNr, programsSemesterOrderNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getMandatoryCourses() {
		if (mandatoryCourses == null) {
			mandatoryCourses = new EObjectResolvingEList<Course>(Course.class, this, StudyplanPackage.SEMESTER__MANDATORY_COURSES);
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SemesterOptionalCourseGroup> getOptionalCourseGroups() {
		if (optionalCourseGroups == null) {
			optionalCourseGroups = new EObjectContainmentWithInverseEList<SemesterOptionalCourseGroup>(SemesterOptionalCourseGroup.class, this, StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS, StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP__SEMESTER);
		}
		return optionalCourseGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double getTotalCreditsValue() {
		double totalCreditsValue = 0.0;
		for(Course course: mandatoryCourses) {
			totalCreditsValue += course.getCredits();
		}
		for (SemesterOptionalCourseGroup optionalCourseGroup: this.getOptionalCourseGroups()) {
			double contributingCredits = optionalCourseGroup.getNrOfOptionalFromGroup() * optionalCourseGroup.getOptionalCourses().get(0).getCredits();
			totalCreditsValue += contributingCredits;
			
		}
		return totalCreditsValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOptionalCourseGroups()).basicAdd(otherEnd, msgs);
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
			case StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS:
				return ((InternalEList<?>)getOptionalCourseGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER__PROGRAMS_SEMESTER_ORDER_NR:
				return getProgramsSemesterOrderNr();
			case StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS:
				return getOptionalCourseGroups();
			case StudyplanPackage.SEMESTER__TOTAL_CREDITS_VALUE:
				return getTotalCreditsValue();
			case StudyplanPackage.SEMESTER__MANDATORY_COURSES:
				return getMandatoryCourses();
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
			case StudyplanPackage.SEMESTER__PROGRAMS_SEMESTER_ORDER_NR:
				setProgramsSemesterOrderNr((Integer)newValue);
				return;
			case StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS:
				getOptionalCourseGroups().clear();
				getOptionalCourseGroups().addAll((Collection<? extends SemesterOptionalCourseGroup>)newValue);
				return;
			case StudyplanPackage.SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				getMandatoryCourses().addAll((Collection<? extends Course>)newValue);
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
			case StudyplanPackage.SEMESTER__PROGRAMS_SEMESTER_ORDER_NR:
				setProgramsSemesterOrderNr(PROGRAMS_SEMESTER_ORDER_NR_EDEFAULT);
				return;
			case StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS:
				getOptionalCourseGroups().clear();
				return;
			case StudyplanPackage.SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
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
			case StudyplanPackage.SEMESTER__PROGRAMS_SEMESTER_ORDER_NR:
				return programsSemesterOrderNr != PROGRAMS_SEMESTER_ORDER_NR_EDEFAULT;
			case StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS:
				return optionalCourseGroups != null && !optionalCourseGroups.isEmpty();
			case StudyplanPackage.SEMESTER__TOTAL_CREDITS_VALUE:
				return totalCreditsValue != TOTAL_CREDITS_VALUE_EDEFAULT;
			case StudyplanPackage.SEMESTER__MANDATORY_COURSES:
				return mandatoryCourses != null && !mandatoryCourses.isEmpty();
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
		result.append(" (programsSemesterOrderNr: ");
		result.append(programsSemesterOrderNr);
		result.append(", totalCreditsValue: ");
		result.append(totalCreditsValue);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
