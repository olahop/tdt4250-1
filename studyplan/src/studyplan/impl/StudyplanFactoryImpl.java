/**
 */
package studyplan.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import studyplan.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyplanFactoryImpl extends EFactoryImpl implements StudyplanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StudyplanFactory init() {
		try {
			StudyplanFactory theStudyplanFactory = (StudyplanFactory)EPackage.Registry.INSTANCE.getEFactory(StudyplanPackage.eNS_URI);
			if (theStudyplanFactory != null) {
				return theStudyplanFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StudyplanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyplanFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StudyplanPackage.PROGRAM: return createProgram();
			case StudyplanPackage.COURSE: return createCourse();
			case StudyplanPackage.SPECIALIZATION: return createSpecialization();
			case StudyplanPackage.SEMESTER: return createSemester();
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP: return createSemesterOptionalCourseGroup();
			case StudyplanPackage.STUDYPLAN: return createStudyplan();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StudyplanPackage.PROGRAM_TYPE_AND_DURATION:
				return createProgramTypeAndDurationFromString(eDataType, initialValue);
			case StudyplanPackage.COURSE_LEVEL:
				return createCourseLevelFromString(eDataType, initialValue);
			case StudyplanPackage.COURSE_CODE:
				return createCourseCodeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StudyplanPackage.PROGRAM_TYPE_AND_DURATION:
				return convertProgramTypeAndDurationToString(eDataType, instanceValue);
			case StudyplanPackage.COURSE_LEVEL:
				return convertCourseLevelToString(eDataType, instanceValue);
			case StudyplanPackage.COURSE_CODE:
				return convertCourseCodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization createSpecialization() {
		SpecializationImpl specialization = new SpecializationImpl();
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterOptionalCourseGroup createSemesterOptionalCourseGroup() {
		SemesterOptionalCourseGroupImpl semesterOptionalCourseGroup = new SemesterOptionalCourseGroupImpl();
		return semesterOptionalCourseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Studyplan createStudyplan() {
		StudyplanImpl studyplan = new StudyplanImpl();
		return studyplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramTypeAndDuration createProgramTypeAndDurationFromString(EDataType eDataType, String initialValue) {
		ProgramTypeAndDuration result = ProgramTypeAndDuration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgramTypeAndDurationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseLevel createCourseLevelFromString(EDataType eDataType, String initialValue) {
		CourseLevel result = CourseLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String createCourseCodeFromString(EDataType eDataType, String initialValue) {
		if(! initialValue.matches("[A-Z]+[0-9]+")) {
			throw new IllegalArgumentException("Course code must have correct format");
		}
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertCourseCodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyplanPackage getStudyplanPackage() {
		return (StudyplanPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StudyplanPackage getPackage() {
		return StudyplanPackage.eINSTANCE;
	}

} //StudyplanFactoryImpl
