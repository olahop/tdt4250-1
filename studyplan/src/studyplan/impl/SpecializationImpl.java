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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import studyplan.Course;
import studyplan.CourseGroup;
import studyplan.Program;
import studyplan.Semester;
import studyplan.Specialization;
import studyplan.StudyplanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyplan.impl.SpecializationImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link studyplan.impl.SpecializationImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link studyplan.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyplan.impl.SpecializationImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyplan.impl.SpecializationImpl#getSubSpecializations <em>Sub Specializations</em>}</li>
 *   <li>{@link studyplan.impl.SpecializationImpl#getDurationInSemesters <em>Duration In Semesters</em>}</li>
 *   <li>{@link studyplan.impl.SpecializationImpl#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected Program program;

	/**
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseGroup> mandatoryCourses;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getSubSpecializations() <em>Sub Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> subSpecializations;

	/**
	 * The default value of the '{@link #getDurationInSemesters() <em>Duration In Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationInSemesters()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_IN_SEMESTERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDurationInSemesters() <em>Duration In Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationInSemesters()
	 * @generated
	 * @ordered
	 */
	protected int durationInSemesters = DURATION_IN_SEMESTERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplanPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program getProgram() {
		if (program != null && program.eIsProxy()) {
			InternalEObject oldProgram = (InternalEObject)program;
			program = (Program)eResolveProxy(oldProgram);
			if (program != oldProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyplanPackage.SPECIALIZATION__PROGRAM, oldProgram, program));
			}
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program basicGetProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(Program newProgram) {
		Program oldProgram = program;
		program = newProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SPECIALIZATION__PROGRAM, oldProgram, program));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseGroup> getMandatoryCourses() {
		if (mandatoryCourses == null) {
			mandatoryCourses = new EObjectResolvingEList<CourseGroup>(CourseGroup.class, this, StudyplanPackage.SPECIALIZATION__MANDATORY_COURSES);
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SPECIALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, StudyplanPackage.SPECIALIZATION__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getSubSpecializations() {
		if (subSpecializations == null) {
			subSpecializations = new EObjectContainmentEList<Specialization>(Specialization.class, this, StudyplanPackage.SPECIALIZATION__SUB_SPECIALIZATIONS);
		}
		return subSpecializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDurationInSemesters() {
		return durationInSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationInSemesters(int newDurationInSemesters) {
		int oldDurationInSemesters = durationInSemesters;
		durationInSemesters = newDurationInSemesters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SPECIALIZATION__DURATION_IN_SEMESTERS, oldDurationInSemesters, durationInSemesters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this, StudyplanPackage.SPECIALIZATION__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.SPECIALIZATION__SUB_SPECIALIZATIONS:
				return ((InternalEList<?>)getSubSpecializations()).basicRemove(otherEnd, msgs);
			case StudyplanPackage.SPECIALIZATION__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
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
			case StudyplanPackage.SPECIALIZATION__PROGRAM:
				if (resolve) return getProgram();
				return basicGetProgram();
			case StudyplanPackage.SPECIALIZATION__MANDATORY_COURSES:
				return getMandatoryCourses();
			case StudyplanPackage.SPECIALIZATION__NAME:
				return getName();
			case StudyplanPackage.SPECIALIZATION__COURSES:
				return getCourses();
			case StudyplanPackage.SPECIALIZATION__SUB_SPECIALIZATIONS:
				return getSubSpecializations();
			case StudyplanPackage.SPECIALIZATION__DURATION_IN_SEMESTERS:
				return getDurationInSemesters();
			case StudyplanPackage.SPECIALIZATION__SEMESTERS:
				return getSemesters();
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
			case StudyplanPackage.SPECIALIZATION__PROGRAM:
				setProgram((Program)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				getMandatoryCourses().addAll((Collection<? extends CourseGroup>)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__NAME:
				setName((String)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__SUB_SPECIALIZATIONS:
				getSubSpecializations().clear();
				getSubSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__DURATION_IN_SEMESTERS:
				setDurationInSemesters((Integer)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
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
			case StudyplanPackage.SPECIALIZATION__PROGRAM:
				setProgram((Program)null);
				return;
			case StudyplanPackage.SPECIALIZATION__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				return;
			case StudyplanPackage.SPECIALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyplanPackage.SPECIALIZATION__COURSES:
				getCourses().clear();
				return;
			case StudyplanPackage.SPECIALIZATION__SUB_SPECIALIZATIONS:
				getSubSpecializations().clear();
				return;
			case StudyplanPackage.SPECIALIZATION__DURATION_IN_SEMESTERS:
				setDurationInSemesters(DURATION_IN_SEMESTERS_EDEFAULT);
				return;
			case StudyplanPackage.SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
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
			case StudyplanPackage.SPECIALIZATION__PROGRAM:
				return program != null;
			case StudyplanPackage.SPECIALIZATION__MANDATORY_COURSES:
				return mandatoryCourses != null && !mandatoryCourses.isEmpty();
			case StudyplanPackage.SPECIALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyplanPackage.SPECIALIZATION__COURSES:
				return courses != null && !courses.isEmpty();
			case StudyplanPackage.SPECIALIZATION__SUB_SPECIALIZATIONS:
				return subSpecializations != null && !subSpecializations.isEmpty();
			case StudyplanPackage.SPECIALIZATION__DURATION_IN_SEMESTERS:
				return durationInSemesters != DURATION_IN_SEMESTERS_EDEFAULT;
			case StudyplanPackage.SPECIALIZATION__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", durationInSemesters: ");
		result.append(durationInSemesters);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
