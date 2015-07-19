package org.xtext.project.tdsl.generator

import org.xtext.project.tdsl.transfoDsl.Transformation
import org.xtext.project.tdsl.transfoDsl.SrcMetamodel
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import java.util.Map
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import java.util.Iterator

class TransformationRunner {
	
	///////////////////////Class Variables////////////////////////////
	var EObject eObject;
	
	def run(Transformation t){
		//1// Load Model
		//2// Run Model
		//3// Derive Layer
		//4// Execute Layer
		
	}
	
	def loadModel(SrcMetamodel smm){
		
		var ResourceSet resourceSet = new ResourceSetImpl();
		var Map<String, Object> options = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		options.put(Resource.Factory.Registry.DEFAULT_EXTENSION,new XMIResourceFactoryImpl())
		var Resource packageResource = resourceSet.createResource(URI.createURI("file://Users/adeelasaalim/Documents/FinalProject"+smm.importURI)); 
		packageResource.load(options)
		if(packageResource.loaded)
		{
			println("Resource has been loaded.")
		}
		else
		{
			println("Resource has been failed to load.")
		}
		// Iterate through the Contents of Package
    	eObject = packageResource.getContents.get(0) //Get the root element
    	// iterate via "iterator loop"
		/*var Iterator<EObject> ContentsIterator = eObject.eContents.iterator()
		while (ContentsIterator.hasNext()) {
			println(ContentsIterator.next());
		}*/
    	
    	if(eObject.eContents.empty)
    	{
    		println("List is empty")
    	}
    	else
    	{
    		println("List is NOT empty.")
    	}
    	var Iterator<EObject> ReferenceIterator = eObject.eAllContents
    	while (ReferenceIterator.hasNext()){
    		println(ReferenceIterator.next())
    	}
    	
    }
    
    def deriveLayer(EObject eObject){
    	println("Remove class")
    	
    }
	
}
		
