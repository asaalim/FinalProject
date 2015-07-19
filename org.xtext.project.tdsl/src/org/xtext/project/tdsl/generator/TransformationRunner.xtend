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
import java.util.Map
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

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
	}
	
	}
		
