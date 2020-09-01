/**
 */
package studyplan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Program Duration In Semesters</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see studyplan.StudyplanPackage#getProgramDurationInSemesters()
 * @model
 * @generated
 */
public enum ProgramDurationInSemesters implements Enumerator {
	/**
	 * The '<em><b>Bachelor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR_VALUE
	 * @generated
	 * @ordered
	 */
	BACHELOR(6, "Bachelor", "Bachelor"),

	/**
	 * The '<em><b>Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER(4, "Master", "Master"),

	/**
	 * The '<em><b>Integrated Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATED_MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATED_MASTER(10, "IntegratedMaster", "IntegratedMaster");

	/**
	 * The '<em><b>Bachelor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR
	 * @model name="Bachelor"
	 * @generated
	 * @ordered
	 */
	public static final int BACHELOR_VALUE = 6;

	/**
	 * The '<em><b>Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER
	 * @model name="Master"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_VALUE = 4;

	/**
	 * The '<em><b>Integrated Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATED_MASTER
	 * @model name="IntegratedMaster"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATED_MASTER_VALUE = 10;

	/**
	 * An array of all the '<em><b>Program Duration In Semesters</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProgramDurationInSemesters[] VALUES_ARRAY =
		new ProgramDurationInSemesters[] {
			BACHELOR,
			MASTER,
			INTEGRATED_MASTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Program Duration In Semesters</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProgramDurationInSemesters> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Program Duration In Semesters</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgramDurationInSemesters get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgramDurationInSemesters result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Program Duration In Semesters</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgramDurationInSemesters getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgramDurationInSemesters result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Program Duration In Semesters</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgramDurationInSemesters get(int value) {
		switch (value) {
			case BACHELOR_VALUE: return BACHELOR;
			case MASTER_VALUE: return MASTER;
			case INTEGRATED_MASTER_VALUE: return INTEGRATED_MASTER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProgramDurationInSemesters(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ProgramDurationInSemesters
