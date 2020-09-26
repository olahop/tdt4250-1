package studyplan.tests;

import junit.framework.TestCase;

import studyplan.StudyplanFactory;
import studyplan.StudyplanPackage;

public class StudyplanDatatypeTest extends TestCase {
	

	protected void setUp() throws Exception {
		super.setUp();	
	}
	
	public void test_courseCode_valid() {
		
		String valid_code = "TDT4000";
		
		Object code = StudyplanFactory.eINSTANCE.createFromString(StudyplanPackage.eINSTANCE.getCourseCode(), valid_code);
		assertEquals(code, valid_code);			
		
		
		String res = StudyplanFactory.eINSTANCE.convertToString(StudyplanPackage.eINSTANCE.getCourseCode(), valid_code);
		assertEquals(res, valid_code);			
	}
	
	public void test_courseCode_invalid() {
		
		String[] invalidCourseCodes = {"*1TDT2", "11TDT", "asd2342", "TDT*123"};
		
		for (String code: invalidCourseCodes) {
			boolean failedAttempt = false;
			
			String res = StudyplanFactory.eINSTANCE.convertToString(StudyplanPackage.eINSTANCE.getCourseCode(), code);
			assertEquals(res, code);
			
			try {				
				StudyplanFactory.eINSTANCE.createFromString(StudyplanPackage.eINSTANCE.getCourseCode(), code);				
			} catch (Exception exception) {
				assertTrue(exception instanceof IllegalArgumentException);
				failedAttempt = true;
			}
			assertTrue(failedAttempt);
		}

	}
	
}
