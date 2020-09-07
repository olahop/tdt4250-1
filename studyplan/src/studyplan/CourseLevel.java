/**
 */
package studyplan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Course Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see studyplan.StudyplanPackage#getCourseLevel()
 * @model
 * @generated
 */
public enum CourseLevel implements Enumerator {
	/**
	 * The '<em><b>Level1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL1_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL1(0, "level1", "level1"), /**
	 * The '<em><b>Level2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL2_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL2(1, "level2", "level2"), /**
	 * The '<em><b>Level3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL3_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL3(2, "level3", "level3"), /**
	 * The '<em><b>Higher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHER_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHER(3, "higher", "higher");

	/**
	 * The '<em><b>Level1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL1
	 * @model name="level1"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL1_VALUE = 0;

	/**
	 * The '<em><b>Level2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL2
	 * @model name="level2"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL2_VALUE = 1;

	/**
	 * The '<em><b>Level3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL3
	 * @model name="level3"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL3_VALUE = 2;

	/**
	 * The '<em><b>Higher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHER
	 * @model name="higher"
	 * @generated
	 * @ordered
	 */
	public static final int HIGHER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Course Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CourseLevel[] VALUES_ARRAY =
		new CourseLevel[] {
			LEVEL1,
			LEVEL2,
			LEVEL3,
			HIGHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Course Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CourseLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Course Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel get(int value) {
		switch (value) {
			case LEVEL1_VALUE: return LEVEL1;
			case LEVEL2_VALUE: return LEVEL2;
			case LEVEL3_VALUE: return LEVEL3;
			case HIGHER_VALUE: return HIGHER;
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
	private CourseLevel(int value, String name, String literal) {
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
	
} //CourseLevel
