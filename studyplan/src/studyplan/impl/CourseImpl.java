/**
 */
package studyplan.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import studyplan.Course;
import studyplan.CourseLevel;
import studyplan.StudyplanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyplan.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyplan.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link studyplan.impl.CourseImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link studyplan.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link studyplan.impl.CourseImpl#isTaughtInAutumn <em>Taught In Autumn</em>}</li>
 *   <li>{@link studyplan.impl.CourseImpl#isTaughtInSpring <em>Taught In Spring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CourseLevel LEVEL_EDEFAULT = CourseLevel.LEVEL1;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected CourseLevel level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDITS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected double credits = CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #isTaughtInAutumn() <em>Taught In Autumn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaughtInAutumn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAUGHT_IN_AUTUMN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTaughtInAutumn() <em>Taught In Autumn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaughtInAutumn()
	 * @generated
	 * @ordered
	 */
	protected boolean taughtInAutumn = TAUGHT_IN_AUTUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #isTaughtInSpring() <em>Taught In Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaughtInSpring()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAUGHT_IN_SPRING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTaughtInSpring() <em>Taught In Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaughtInSpring()
	 * @generated
	 * @ordered
	 */
	protected boolean taughtInSpring = TAUGHT_IN_SPRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplanPackage.Literals.COURSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(CourseLevel newLevel) {
		CourseLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredits(double newCredits) {
		double oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTaughtInAutumn() {
		return taughtInAutumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaughtInAutumn(boolean newTaughtInAutumn) {
		boolean oldTaughtInAutumn = taughtInAutumn;
		taughtInAutumn = newTaughtInAutumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE__TAUGHT_IN_AUTUMN, oldTaughtInAutumn, taughtInAutumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTaughtInSpring() {
		return taughtInSpring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaughtInSpring(boolean newTaughtInSpring) {
		boolean oldTaughtInSpring = taughtInSpring;
		taughtInSpring = newTaughtInSpring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE__TAUGHT_IN_SPRING, oldTaughtInSpring, taughtInSpring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyplanPackage.COURSE__NAME:
				return getName();
			case StudyplanPackage.COURSE__CODE:
				return getCode();
			case StudyplanPackage.COURSE__LEVEL:
				return getLevel();
			case StudyplanPackage.COURSE__CREDITS:
				return getCredits();
			case StudyplanPackage.COURSE__TAUGHT_IN_AUTUMN:
				return isTaughtInAutumn();
			case StudyplanPackage.COURSE__TAUGHT_IN_SPRING:
				return isTaughtInSpring();
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
			case StudyplanPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case StudyplanPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case StudyplanPackage.COURSE__LEVEL:
				setLevel((CourseLevel)newValue);
				return;
			case StudyplanPackage.COURSE__CREDITS:
				setCredits((Double)newValue);
				return;
			case StudyplanPackage.COURSE__TAUGHT_IN_AUTUMN:
				setTaughtInAutumn((Boolean)newValue);
				return;
			case StudyplanPackage.COURSE__TAUGHT_IN_SPRING:
				setTaughtInSpring((Boolean)newValue);
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
			case StudyplanPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyplanPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case StudyplanPackage.COURSE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case StudyplanPackage.COURSE__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case StudyplanPackage.COURSE__TAUGHT_IN_AUTUMN:
				setTaughtInAutumn(TAUGHT_IN_AUTUMN_EDEFAULT);
				return;
			case StudyplanPackage.COURSE__TAUGHT_IN_SPRING:
				setTaughtInSpring(TAUGHT_IN_SPRING_EDEFAULT);
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
			case StudyplanPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyplanPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case StudyplanPackage.COURSE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case StudyplanPackage.COURSE__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case StudyplanPackage.COURSE__TAUGHT_IN_AUTUMN:
				return taughtInAutumn != TAUGHT_IN_AUTUMN_EDEFAULT;
			case StudyplanPackage.COURSE__TAUGHT_IN_SPRING:
				return taughtInSpring != TAUGHT_IN_SPRING_EDEFAULT;
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
		result.append(", code: ");
		result.append(code);
		result.append(", level: ");
		result.append(level);
		result.append(", credits: ");
		result.append(credits);
		result.append(", taughtInAutumn: ");
		result.append(taughtInAutumn);
		result.append(", taughtInSpring: ");
		result.append(taughtInSpring);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
