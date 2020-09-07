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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import studyplan.CourseGroup;
import studyplan.Program;
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
 *   <li>{@link studyplan.impl.SpecializationImpl#getDurationInSemesters <em>Duration In Semesters</em>}</li>
 *   <li>{@link studyplan.impl.SpecializationImpl#getParentSpecialization <em>Parent Specialization</em>}</li>
 *   <li>{@link studyplan.impl.SpecializationImpl#getSubSpecializations <em>Sub Specializations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected CourseGroup mandatoryCourses;

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
	 * The cached value of the '{@link #getParentSpecialization() <em>Parent Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Specialization parentSpecialization;

	/**
	 * The cached value of the '{@link #getSubSpecializations() <em>Sub Specializations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> subSpecializations;

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
		if (eContainerFeatureID() != StudyplanPackage.SPECIALIZATION__PROGRAM) return null;
		return (Program)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgram, StudyplanPackage.SPECIALIZATION__PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(Program newProgram) {
		if (newProgram != eInternalContainer() || (eContainerFeatureID() != StudyplanPackage.SPECIALIZATION__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, StudyplanPackage.PROGRAM__SPECIALIZATIONS, Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SPECIALIZATION__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseGroup getMandatoryCourses() {
		if (mandatoryCourses != null && mandatoryCourses.eIsProxy()) {
			InternalEObject oldMandatoryCourses = (InternalEObject)mandatoryCourses;
			mandatoryCourses = (CourseGroup)eResolveProxy(oldMandatoryCourses);
			if (mandatoryCourses != oldMandatoryCourses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyplanPackage.SPECIALIZATION__MANDATORY_COURSES, oldMandatoryCourses, mandatoryCourses));
			}
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseGroup basicGetMandatoryCourses() {
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatoryCourses(CourseGroup newMandatoryCourses) {
		CourseGroup oldMandatoryCourses = mandatoryCourses;
		mandatoryCourses = newMandatoryCourses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SPECIALIZATION__MANDATORY_COURSES, oldMandatoryCourses, mandatoryCourses));
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
	public EList<Specialization> getSubSpecializations() {
		if (subSpecializations == null) {
			subSpecializations = new EObjectResolvingEList<Specialization>(Specialization.class, this, StudyplanPackage.SPECIALIZATION__SUB_SPECIALIZATIONS);
		}
		return subSpecializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.SPECIALIZATION__PROGRAM:
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
	public Specialization getParentSpecialization() {
		if (parentSpecialization != null && parentSpecialization.eIsProxy()) {
			InternalEObject oldParentSpecialization = (InternalEObject)parentSpecialization;
			parentSpecialization = (Specialization)eResolveProxy(oldParentSpecialization);
			if (parentSpecialization != oldParentSpecialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyplanPackage.SPECIALIZATION__PARENT_SPECIALIZATION, oldParentSpecialization, parentSpecialization));
			}
		}
		return parentSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization basicGetParentSpecialization() {
		return parentSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentSpecialization(Specialization newParentSpecialization) {
		Specialization oldParentSpecialization = parentSpecialization;
		parentSpecialization = newParentSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SPECIALIZATION__PARENT_SPECIALIZATION, oldParentSpecialization, parentSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.SPECIALIZATION__PROGRAM:
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
			case StudyplanPackage.SPECIALIZATION__PROGRAM:
				return eInternalContainer().eInverseRemove(this, StudyplanPackage.PROGRAM__SPECIALIZATIONS, Program.class, msgs);
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
			case StudyplanPackage.SPECIALIZATION__PROGRAM:
				return getProgram();
			case StudyplanPackage.SPECIALIZATION__MANDATORY_COURSES:
				if (resolve) return getMandatoryCourses();
				return basicGetMandatoryCourses();
			case StudyplanPackage.SPECIALIZATION__NAME:
				return getName();
			case StudyplanPackage.SPECIALIZATION__DURATION_IN_SEMESTERS:
				return getDurationInSemesters();
			case StudyplanPackage.SPECIALIZATION__PARENT_SPECIALIZATION:
				if (resolve) return getParentSpecialization();
				return basicGetParentSpecialization();
			case StudyplanPackage.SPECIALIZATION__SUB_SPECIALIZATIONS:
				return getSubSpecializations();
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
				setMandatoryCourses((CourseGroup)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__NAME:
				setName((String)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__DURATION_IN_SEMESTERS:
				setDurationInSemesters((Integer)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__PARENT_SPECIALIZATION:
				setParentSpecialization((Specialization)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__SUB_SPECIALIZATIONS:
				getSubSpecializations().clear();
				getSubSpecializations().addAll((Collection<? extends Specialization>)newValue);
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
				setMandatoryCourses((CourseGroup)null);
				return;
			case StudyplanPackage.SPECIALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyplanPackage.SPECIALIZATION__DURATION_IN_SEMESTERS:
				setDurationInSemesters(DURATION_IN_SEMESTERS_EDEFAULT);
				return;
			case StudyplanPackage.SPECIALIZATION__PARENT_SPECIALIZATION:
				setParentSpecialization((Specialization)null);
				return;
			case StudyplanPackage.SPECIALIZATION__SUB_SPECIALIZATIONS:
				getSubSpecializations().clear();
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
				return getProgram() != null;
			case StudyplanPackage.SPECIALIZATION__MANDATORY_COURSES:
				return mandatoryCourses != null;
			case StudyplanPackage.SPECIALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyplanPackage.SPECIALIZATION__DURATION_IN_SEMESTERS:
				return durationInSemesters != DURATION_IN_SEMESTERS_EDEFAULT;
			case StudyplanPackage.SPECIALIZATION__PARENT_SPECIALIZATION:
				return parentSpecialization != null;
			case StudyplanPackage.SPECIALIZATION__SUB_SPECIALIZATIONS:
				return subSpecializations != null && !subSpecializations.isEmpty();
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
