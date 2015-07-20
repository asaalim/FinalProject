package org.xtext.project.tdsl.generator


import org.xtext.project.tdsl.transfoDsl.SrcMetamodel
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import org.eclipse.emf.ecore.EClass

import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import org.eclipse.emf.ecore.EPackage


class TransformationRunner {

	// /////////////////////Class Variables////////////////////////////
	def run() {
		// 1// Load Model
		// 2// Run Model
		// 3// Derive Layer
		// 4// Execute Layer
	}

	def loadModel(SrcMetamodel smm) {

		var ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		// var Map<String, Object> options = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		// options.put(Resource.Factory.Registry.DEFAULT_EXTENSION,new XMIResourceFactoryImpl())
		var Resource packageResource = resourceSet.createResource(
			URI.createURI("file://Users/adeelasaalim/Documents/FinalProject" + smm.importURI));
		// packageResource.load(options)
		packageResource.load(null)
		if (packageResource.loaded) {
			println("Resource has been loaded.")
		} else {
			println("Resource has been failed to load.")
		}

		var EPackage metapackage = packageResource.getContents().get(0) as EPackage;
		// iterate via "iterator loop"
		/*var Iterator<EObject> ContentsIterator = eObject.eContents.iterator()
		 * while (ContentsIterator.hasNext()) {
		 * 	println(ContentsIterator.next());
		 }*/
		var Copier copier = new Copier();
		var EPackage eCopyPackage = copier.copy(metapackage) as EPackage
		if (eCopyPackage.eContents.empty) {
			println("Copying failed.")
		} else {
			println("Copying successful.")
		}
		deriveLayer(eCopyPackage)
	}

	// ********************************Apply a Layer************************************// 
	def deriveLayer(EPackage ePkg) {
		println("Inside Derive Layer Function")

		var EClass eClass;

		// //////////For loop to iterate through the classes of package/////////////////
		for (var i = 0; i < ePkg.eContents.size; i++) {

			println(ePkg.EClassifiers.get(i)) // Prints the Names of EClasses
			eClass = ePkg.EClassifiers.get(i) as EClass
			for (var j = 0; j < eClass.EReferences.size; j++) {
				println(eClass.EReferences.get(j)) // Prints the Names of EReferences
			// println(eClass.EReferences.size)
			}

			for (var j = 0; j < eClass.EAttributes.size; j++) {
				// println(eClass.EAttributes.size)
				println(eClass.EAttributes.get(j))

			}
		}

	}

}
		
