package tdt4250.studyplan.example;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import studyplan.StudyplanPackage;

public class Example {
	
	public static void main(String[] args) {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyplanPackage.eNS_URI, StudyplanPackage.eINSTANCE);
		//resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(Example.class.getResource("Program.xmi").toString()), true);
		// TODO
		for (EObject eobject: resource) {
			System.out.print(eobject.toString());
		}
        System.out.println("Hello World!");
    } 

}
