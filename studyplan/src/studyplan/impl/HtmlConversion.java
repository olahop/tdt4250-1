package studyplan.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import studyplan.Course;
import studyplan.Program;
import studyplan.Semester;
import studyplan.SemesterOptionalCourseGroup;
import studyplan.StudyplanPackage;

public class HtmlConversion {
	
	
	private Resource testInstance;
	
	public HtmlConversion(String resource) {
		loadResource(resource);
	}
	
	private void loadResource(String resource) {
		ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/acceleo/query/1.0", new AQLValidationDelegate());
		
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyplanPackage.eNS_URI, StudyplanPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		testInstance = resSet.getResource(URI.createURI(HtmlConversion.class.getResource(resource).toString()), true);		
	}
	
	private void createHtmlFile(String filename) {
	    try {
	      File myObj = new File(filename + ".html");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }  
	}
	
	private void writeToHtmlFile(String filename, String newContent) {
	    try {
	      FileWriter myWriter = new FileWriter(filename + ".html");
	      myWriter.write(newContent);
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
	
	public void resourceInstanceToHtml() {
		createHtmlFile("filename");
		String content = "<!DOCTYPE html><html><body>";
		
		Program program = (Program) testInstance.getContents().get(0).eContents().get(0);
		content += "<h1>Studyplan for program: " + program.getName() + "</h1>";
		
		List<Semester> semesters = program.getSemesters();
		int semesterCount = 1;
		for (Semester semester: semesters) {
			content += "<h2>Semester " + semesterCount++ + ":</h2>";
			content += "<p> Code Name Credits Status</p>";
			for (Course course: semester.getMandatoryCourses()) {
				content += "<p>" + course.getCode() + " " + course.getName() + "&emsp;" + course.getCredits() + " O </p>";
			}	
			if(semester.getOptionalCourseGroups() != null) {
				int optionalCourseGroupId = 1;
				for (SemesterOptionalCourseGroup socg: semester.getOptionalCourseGroups()) {
					for (Course course: socg.getOptionalCourses()) {
						content += "<p>" + course.getCode() + " " + course.getName() + "&emsp;" + course.getCredits() + " V" + optionalCourseGroupId  + "</p>";
					}
					optionalCourseGroupId++;
				}
			}		
		}
						
		content += "</body></html>";
		writeToHtmlFile("filename", content);
	}
	

	public static void main(String[] args) {
		
		HtmlConversion hc = new HtmlConversion("HtmlConversionStudyplan.xmi");
		hc.resourceInstanceToHtml();

	}

}
