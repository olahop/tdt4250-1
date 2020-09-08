/**
 */
package studyplan.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import studyplan.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see studyplan.StudyplanPackage
 * @generated
 */
public class StudyplanValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyplanValidator INSTANCE = new StudyplanValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "studyplan";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyplanValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyplanPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyplanPackage.PROGRAM:
				return validateProgram((Program)value, diagnostics, context);
			case StudyplanPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyplanPackage.COURSE_GROUP:
				return validateCourseGroup((CourseGroup)value, diagnostics, context);
			case StudyplanPackage.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case StudyplanPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudyplanPackage.SEMESTER_OPTIONAL_COURSE_GROUP:
				return validateSemesterOptionalCourseGroup((SemesterOptionalCourseGroup)value, diagnostics, context);
			case StudyplanPackage.STUDYPLAN:
				return validateStudyplan((Studyplan)value, diagnostics, context);
			case StudyplanPackage.PROGRAM_TYPE_AND_DURATION:
				return validateProgramTypeAndDuration((ProgramTypeAndDuration)value, diagnostics, context);
			case StudyplanPackage.COURSE_LEVEL:
				return validateCourseLevel((CourseLevel)value, diagnostics, context);
			case StudyplanPackage.COURSE_CODE:
				return validateCourseCode((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(program, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(program, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgram_totalNrOfSemestersShouldMatchType(program, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgram_noDuplicateCourses(program, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgram_masterLevelHasMaxLimitOfLevelThreeCoures(program, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgram_allSpecsDurationShorterThanProgram(program, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgram_allMainSpecsSimilarDuration(program, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgram_mandatoryCoursesCovered(program, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the totalNrOfSemestersShouldMatchType constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROGRAM__TOTAL_NR_OF_SEMESTERS_SHOULD_MATCH_TYPE__EEXPRESSION = "self.type.value = self.semesters->size()";

	/**
	 * Validates the totalNrOfSemestersShouldMatchType constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_totalNrOfSemestersShouldMatchType(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyplanPackage.Literals.PROGRAM,
				 program,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "totalNrOfSemestersShouldMatchType",
				 PROGRAM__TOTAL_NR_OF_SEMESTERS_SHOULD_MATCH_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the noDuplicateCourses constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_noDuplicateCourses(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "noDuplicateCourses", getObjectLabel(program, context) },
						 new Object[] { program },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the masterLevelHasMaxLimitOfLevelThreeCoures constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_masterLevelHasMaxLimitOfLevelThreeCoures(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "masterLevelHasMaxLimitOfLevelThreeCoures", getObjectLabel(program, context) },
						 new Object[] { program },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the allSpecsDurationShorterThanProgram constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROGRAM__ALL_SPECS_DURATION_SHORTER_THAN_PROGRAM__EEXPRESSION = "self.specializations->collect(spec | spec.durationInSemesters)->forAll(num | num <= self.type.value)";

	/**
	 * Validates the allSpecsDurationShorterThanProgram constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_allSpecsDurationShorterThanProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyplanPackage.Literals.PROGRAM,
				 program,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "allSpecsDurationShorterThanProgram",
				 PROGRAM__ALL_SPECS_DURATION_SHORTER_THAN_PROGRAM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the allMainSpecsSimilarDuration constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROGRAM__ALL_MAIN_SPECS_SIMILAR_DURATION__EEXPRESSION = "self.specializations->collect(spec | spec.durationInSemesters)->forAll(num | num = self.specializations->first().durationInSemesters)";

	/**
	 * Validates the allMainSpecsSimilarDuration constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_allMainSpecsSimilarDuration(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyplanPackage.Literals.PROGRAM,
				 program,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "allMainSpecsSimilarDuration",
				 PROGRAM__ALL_MAIN_SPECS_SIMILAR_DURATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the mandatoryCoursesCovered constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_mandatoryCoursesCovered(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "mandatoryCoursesCovered", getObjectLabel(program, context) },
						 new Object[] { program },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_hasValidCreditValue(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_codeIsUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_taughtInAutumnOrSpring(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasValidCreditValue constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_hasValidCreditValue(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasValidCreditValue", getObjectLabel(course, context) },
						 new Object[] { course },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the codeIsUnique constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_codeIsUnique(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "codeIsUnique", getObjectLabel(course, context) },
						 new Object[] { course },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the taughtInAutumnOrSpring constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_taughtInAutumnOrSpring(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "taughtInAutumnOrSpring", getObjectLabel(course, context) },
						 new Object[] { course },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseGroup(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specialization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialization_allSubspecsSimilarLength(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialization_subspecsShorterThanParent(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialization_mandatoryCoursesAreCovered(specialization, diagnostics, context);
		return result;
	}

	/**
	 * Validates the allSubspecsSimilarLength constraint of '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization_allSubspecsSimilarLength(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "allSubspecsSimilarLength", getObjectLabel(specialization, context) },
						 new Object[] { specialization },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the subspecsShorterThanParent constraint of '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SPECIALIZATION__SUBSPECS_SHORTER_THAN_PARENT__EEXPRESSION = "self.subSpecializations->collect(spec | spec.durationInSemesters)->forAll(num | num <= self.durationInSemesters)";

	/**
	 * Validates the subspecsShorterThanParent constraint of '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization_subspecsShorterThanParent(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyplanPackage.Literals.SPECIALIZATION,
				 specialization,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "subspecsShorterThanParent",
				 SPECIALIZATION__SUBSPECS_SHORTER_THAN_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the mandatoryCoursesAreCovered constraint of '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization_mandatoryCoursesAreCovered(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "mandatoryCoursesAreCovered", getObjectLabel(specialization, context) },
						 new Object[] { specialization },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_shouldContainEnoughCredits(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_coursesTaughtCurrentSemester(semester, diagnostics, context);
		return result;
	}

	/**
	 * Validates the shouldContainEnoughCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_shouldContainEnoughCredits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "shouldContainEnoughCredits", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the coursesTaughtCurrentSemester constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_coursesTaughtCurrentSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "coursesTaughtCurrentSemester", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterOptionalCourseGroup(SemesterOptionalCourseGroup semesterOptionalCourseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semesterOptionalCourseGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semesterOptionalCourseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semesterOptionalCourseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semesterOptionalCourseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semesterOptionalCourseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semesterOptionalCourseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semesterOptionalCourseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semesterOptionalCourseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semesterOptionalCourseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemesterOptionalCourseGroup_nrOfOptionalMustBeLessThanSizeOfGroup(semesterOptionalCourseGroup, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nrOfOptionalMustBeLessThanSizeOfGroup constraint of '<em>Semester Optional Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER_OPTIONAL_COURSE_GROUP__NR_OF_OPTIONAL_MUST_BE_LESS_THAN_SIZE_OF_GROUP__EEXPRESSION = "self.courseGroup->size() >= self.nrOfOptionalFromGroup";

	/**
	 * Validates the nrOfOptionalMustBeLessThanSizeOfGroup constraint of '<em>Semester Optional Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterOptionalCourseGroup_nrOfOptionalMustBeLessThanSizeOfGroup(SemesterOptionalCourseGroup semesterOptionalCourseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyplanPackage.Literals.SEMESTER_OPTIONAL_COURSE_GROUP,
				 semesterOptionalCourseGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "nrOfOptionalMustBeLessThanSizeOfGroup",
				 SEMESTER_OPTIONAL_COURSE_GROUP__NR_OF_OPTIONAL_MUST_BE_LESS_THAN_SIZE_OF_GROUP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyplan(Studyplan studyplan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyplan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramTypeAndDuration(ProgramTypeAndDuration programTypeAndDuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseLevel(CourseLevel courseLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyplanValidator
