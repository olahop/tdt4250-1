package studyplan.tests;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;

import junit.framework.TestCase;
import studyplan.StudyplanFactory;
import studyplan.StudyplanPackage;
import studyplan.impl.StudyplanFactoryImpl;
import studyplan.impl.StudyplanPackageImpl;

public class StudyplanDatatypeTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void test_courseCode_valid() {
		StudyplanFactoryImpl fac = new StudyplanFactoryImpl();		
		
		fac.createCourseCodeFromString(StudyplanPackage.eINSTANCE.getCourseCode(), "TDT4000");
		
		
		String res = "";
			
		try {
			res = fac.createCourseCodeFromString(StudyplanPackage.eINSTANCE.getCourseCode(), "TDT4000");
		} catch (Exception exception) {
			assertTrue(exception instanceof IllegalArgumentException);
		}
			assertEquals(res, "TDT4000");
	
			
	}
	
	public void test_courseCode_invalid() {
		assertTrue(false);
	}

}
