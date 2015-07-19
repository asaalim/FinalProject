package org.xtext.project.tdsl.generator

import org.xtext.project.tdsl.transfoDsl.Transformation
import org.xtext.project.tdsl.transfoDsl.SrcMetamodel
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource

class TransformationRunner {
	
	///////////////////////Class Variables////////////////////////////
	
	
	def run(Transformation t){
		//1// Load Model
		//2// Run Model
		//3// Derive Layer
		//4// Execute Layer
		//println("My simple run function.")
		//println(t.class.package.class.typeName)
		//println(t.srcmodel.toString)
	}
	
	def loadModel(SrcMetamodel smm){
		//register the package
		
	/*EcorePackage.eINSTANCE.eClass();
	EPackage.Registry.INSTANCE.put(EcoreFactory.eINSTANCE.getEPackage().getNsURI(), EcoreFactory.eINSTANCE.getEPackage());
	//get the uri
	 URI ecoreUri = URI.createURI(EcoreFactory.eINSTANCE.getEPackage().getNsURI(), true);
	//get the resource
	Resource ecoreResource = xtextResourceSet.getResource(ecoreUri, true);
	try {
	//load it
	ecoreResource.load(null);
	} catch (IOException e) {
	e.printStackTrace();
		}*/
	var ResourceSet set = new ResourceSetImpl();
	//var Resource packageResource = set.createResource(URI.createURI("file://Users/adeelasaalim/Documents/FinalProject/org.xtext.project.tdsl/model/Composed.ecore "));
	
		var Resource packageResource = set.createResource(URI.createURI(smm.importURI));
		packageResource.load(null);
		
	}
	
	
}