package studyplan.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
import studyplan.Specialization;
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
		String content = "<!DOCTYPE html><html><head>\n" + 
				"  <link rel=\"stylesheet\" href=\"styles.css\">\n" + 
				"</head><body>";
		
		Program program = (Program) testInstance.getContents().get(0).eContents().get(0);
		content += "<h1>Studyplan for program: " + program.getName() + "</h1>";
		
		int semesterCount = 1;
		for (Semester semester: program.getSemesters()) {
			content += convertSemester(semester, semesterCount++);
		}
		
		for (Specialization spe: program.getSpecializations()) {
			content += "<div style='display: none' id=" + "'" + spe.getName() + "'" + "><h2>" + spe.getName() + "</h2>";
			int speSemesterCount = semesterCount;
			for(Semester semester: spe.getSemesters()) {
				content += convertSemester(semester, speSemesterCount++);
			}
			for(Specialization sub: spe.getSubSpecializations()) {
				content += "<h3>" + sub.getName() + "</h3>";
				int subSemesterCount = speSemesterCount;
				for(Semester semester: sub.getSemesters()) {
					content += convertSemester(semester, subSemesterCount++);
				}
			}
			content += "</div><button onclick=\"getElementById('" + spe.getName() +"').style.display ='block'\">"+ spe.getName() +"</button>";
		}
						
		content += "</body></html>";
		writeToHtmlFile("filename", content);
	}
	
	private String convertSemester(Semester semester, int semesterCount) {
		String semesterString = "";
		
		semesterString += "<h4>Semester " + semesterCount + ":</h4>";
		semesterString += "<div class='container'><h4>Code</h4><h4>Name</h4><h4>Credits</h4><h4>Status</h4></div>";
		for (Course course: semester.getMandatoryCourses()) {
			semesterString += "<div class='container'><p>" + course.getCode() + "</p><p>" + course.getName() + "</p><p>" + course.getCredits() + "<p>O</p></div>";
		}	
		if(semester.getOptionalCourseGroups() != null) {
			int optionalCourseGroupId = 1;
			for (SemesterOptionalCourseGroup socg: semester.getOptionalCourseGroups()) {
				for (Course course: socg.getOptionalCourses()) {
					semesterString += "<div class='container'><p>" + course.getCode() + "</p><p>" + course.getName() + "</p><p>" + course.getCredits() + "<p>V" + optionalCourseGroupId  + "</p></div>";
				}
				optionalCourseGroupId++;
			}
		}
		return semesterString;
	}
	

	public static void main(String[] args) {
		
		HtmlConversion hc = new HtmlConversion("HtmlConversionStudyplan.xmi");
		hc.resourceInstanceToHtml();

	}

}
