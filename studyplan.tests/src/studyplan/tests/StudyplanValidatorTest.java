package studyplan.tests;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import junit.framework.TestCase;
import studyplan.StudyplanPackage;

public class StudyplanValidatorTest extends TestCase {
	
	private Resource testInstance;
	private Diagnostic diagnostics;

	protected void setUp() throws Exception {
		super.setUp();
		ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/acceleo/query/1.0", new AQLValidationDelegate());
		
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyplanPackage.eNS_URI, StudyplanPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		testInstance = resSet.getResource(URI.createURI(StudyplanTest.class.getResource("StudyplanValidatorTest.xmi").toString()), true);		
	}

	
	public void test_hasValidCreditsValue_valid() {
		List<EObject> testCourses = testInstance.getContents().get(0).eContents().stream()
				.filter(elem -> elem instanceof studyplan.impl.CourseImpl).collect(Collectors.toList());		
		
		diagnostics = Diagnostician.INSTANCE.validate(testCourses.get(2));
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		diagnostics = Diagnostician.INSTANCE.validate(testCourses.get(3));
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
	}
	
	public void test_hasValidCreditsValue_invalid() {
		List<EObject> testCourses = testInstance.getContents().get(0).eContents().stream()
				.filter(elem -> elem instanceof studyplan.impl.CourseImpl).collect(Collectors.toList());		
		
		diagnostics = Diagnostician.INSTANCE.validate(testCourses.get(0));
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
		
		diagnostics = Diagnostician.INSTANCE.validate(testCourses.get(1));
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}

	public void test_coursesTaughtCurrentSemester_valid() {
		List<EObject> testSemesters = testInstance.getContents().get(0).eContents().get(0).eContents().stream()
				.filter(elem -> elem instanceof studyplan.impl.SemesterImpl).collect(Collectors.toList());
				
		//EObject semester_valid = testInstance.getContents().get(0).eContents().get(0).eContents().get(0);
		//System.out.println(testSemesters);
		
		
		diagnostics = Diagnostician.INSTANCE.validate(testSemesters.get(0));
		System.out.print(diagnostics);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		//diagnostics = Diagnostician.INSTANCE.validate(testSemesters.get(3));
		//assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		//semester_valid = testInstance.getContents().get(0).eContents().get(0).eContents().get(1);
		//diagnostics = Diagnostician.INSTANCE.validate(semester_valid);
		//System.out.print(diagnostics);
		//assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
	}
	
	public void test_coursesTaughtCurrentSemester_invalid() {
		
		List<EObject> testSemesters = testInstance.getContents().get(0).eContents().get(0).eContents().stream()
				.filter(elem -> elem instanceof studyplan.impl.SemesterImpl).collect(Collectors.toList());
		
		
		//EObject semester_invalid = testInstance.getContents().get(0).eContents().get(0).eContents().get(2);
		//diagnostics = Diagnostician.INSTANCE.validate(semester_invalid);
		diagnostics = Diagnostician.INSTANCE.validate(testSemesters.get(1));
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
		
		//semester_invalid = testInstance.getContents().get(0).eContents().get(0).eContents().get(3);
		//diagnostics = Diagnostician.INSTANCE.validate(semester_invalid);
		diagnostics = Diagnostician.INSTANCE.validate(testSemesters.get(2));
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
}
