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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import studyplan.Course;
import studyplan.CourseGroup;
import studyplan.Program;
import studyplan.Semester;
import studyplan.SemesterOptionalCourseGroup;
import studyplan.Specialization;
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
 *   <li>{@link studyplan.impl.SemesterImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link studyplan.impl.SemesterImpl#getOptionalCourseGroups <em>Optional Course Groups</em>}</li>
 *   <li>{@link studyplan.impl.SemesterImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link studyplan.impl.SemesterImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link studyplan.impl.SemesterImpl#getTotalCreditsValue <em>Total Credits Value</em>}</li>
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
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected CourseGroup mandatoryCourses;

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
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Specialization specialization;

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
	public CourseGroup getMandatoryCourses() {
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMandatoryCourses(CourseGroup newMandatoryCourses, NotificationChain msgs) {
		CourseGroup oldMandatoryCourses = mandatoryCourses;
		mandatoryCourses = newMandatoryCourses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER__MANDATORY_COURSES, oldMandatoryCourses, newMandatoryCourses);
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
	public void setMandatoryCourses(CourseGroup newMandatoryCourses) {
		if (newMandatoryCourses != mandatoryCourses) {
			NotificationChain msgs = null;
			if (mandatoryCourses != null)
				msgs = ((InternalEObject)mandatoryCourses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.SEMESTER__MANDATORY_COURSES, null, msgs);
			if (newMandatoryCourses != null)
				msgs = ((InternalEObject)newMandatoryCourses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.SEMESTER__MANDATORY_COURSES, null, msgs);
			msgs = basicSetMandatoryCourses(newMandatoryCourses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER__MANDATORY_COURSES, newMandatoryCourses, newMandatoryCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SemesterOptionalCourseGroup> getOptionalCourseGroups() {
		if (optionalCourseGroups == null) {
			optionalCourseGroups = new EObjectContainmentEList<SemesterOptionalCourseGroup>(SemesterOptionalCourseGroup.class, this, StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS);
		}
		return optionalCourseGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program getProgram() {
		if (eContainerFeatureID() != StudyplanPackage.SEMESTER__PROGRAM) return null;
		return (Program)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgram, StudyplanPackage.SEMESTER__PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(Program newProgram) {
		if (newProgram != eInternalContainer() || (eContainerFeatureID() != StudyplanPackage.SEMESTER__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, StudyplanPackage.PROGRAM__SEMESTERS, Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization getSpecialization() {
		if (specialization != null && specialization.eIsProxy()) {
			InternalEObject oldSpecialization = (InternalEObject)specialization;
			specialization = (Specialization)eResolveProxy(oldSpecialization);
			if (specialization != oldSpecialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyplanPackage.SEMESTER__SPECIALIZATION, oldSpecialization, specialization));
			}
		}
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization basicGetSpecialization() {
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialization(Specialization newSpecialization) {
		Specialization oldSpecialization = specialization;
		specialization = newSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER__SPECIALIZATION, oldSpecialization, specialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double getTotalCreditsValue() {
		double totalCreditsValue = 0.0;
		for(Course course: mandatoryCourses.getCourses()) {
			totalCreditsValue += course.getCredits();
		}
		for (SemesterOptionalCourseGroup optionalCourseGroup: this.getOptionalCourseGroups()) {
			for (Course selectedCourse: optionalCourseGroup.getCurrentlySelected()) {
				totalCreditsValue += selectedCourse.getCredits();
			}
		}
		return totalCreditsValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER__PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgram((Program)otherEnd, msgs);
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
			case StudyplanPackage.SEMESTER__MANDATORY_COURSES:
				return basicSetMandatoryCourses(null, msgs);
			case StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS:
				return ((InternalEList<?>)getOptionalCourseGroups()).basicRemove(otherEnd, msgs);
			case StudyplanPackage.SEMESTER__PROGRAM:
				return basicSetProgram(null, msgs);
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
			case StudyplanPackage.SEMESTER__PROGRAM:
				return eInternalContainer().eInverseRemove(this, StudyplanPackage.PROGRAM__SEMESTERS, Program.class, msgs);
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
			case StudyplanPackage.SEMESTER__PROGRAMS_SEMESTER_ORDER_NR:
				return getProgramsSemesterOrderNr();
			case StudyplanPackage.SEMESTER__MANDATORY_COURSES:
				return getMandatoryCourses();
			case StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS:
				return getOptionalCourseGroups();
			case StudyplanPackage.SEMESTER__PROGRAM:
				return getProgram();
			case StudyplanPackage.SEMESTER__SPECIALIZATION:
				if (resolve) return getSpecialization();
				return basicGetSpecialization();
			case StudyplanPackage.SEMESTER__TOTAL_CREDITS_VALUE:
				return getTotalCreditsValue();
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
			case StudyplanPackage.SEMESTER__MANDATORY_COURSES:
				setMandatoryCourses((CourseGroup)newValue);
				return;
			case StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS:
				getOptionalCourseGroups().clear();
				getOptionalCourseGroups().addAll((Collection<? extends SemesterOptionalCourseGroup>)newValue);
				return;
			case StudyplanPackage.SEMESTER__PROGRAM:
				setProgram((Program)newValue);
				return;
			case StudyplanPackage.SEMESTER__SPECIALIZATION:
				setSpecialization((Specialization)newValue);
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
			case StudyplanPackage.SEMESTER__MANDATORY_COURSES:
				setMandatoryCourses((CourseGroup)null);
				return;
			case StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS:
				getOptionalCourseGroups().clear();
				return;
			case StudyplanPackage.SEMESTER__PROGRAM:
				setProgram((Program)null);
				return;
			case StudyplanPackage.SEMESTER__SPECIALIZATION:
				setSpecialization((Specialization)null);
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
			case StudyplanPackage.SEMESTER__MANDATORY_COURSES:
				return mandatoryCourses != null;
			case StudyplanPackage.SEMESTER__OPTIONAL_COURSE_GROUPS:
				return optionalCourseGroups != null && !optionalCourseGroups.isEmpty();
			case StudyplanPackage.SEMESTER__PROGRAM:
				return getProgram() != null;
			case StudyplanPackage.SEMESTER__SPECIALIZATION:
				return specialization != null;
			case StudyplanPackage.SEMESTER__TOTAL_CREDITS_VALUE:
				return totalCreditsValue != TOTAL_CREDITS_VALUE_EDEFAULT;
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
