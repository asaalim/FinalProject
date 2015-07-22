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
import java.io.File
import java.io.FileInputStream
import java.util.HashMap
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.xtext.project.tdsl.transfoDsl.TrgMetamodel
import java.util.Iterator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EFactory
import org.eclipse.emf.ecore.EcoreFactory

class TransformationRunner {
		var ResourceSet resourceSet = new ResourceSetImpl();
		var Resource packageResource;
		var EPackage metapackage;
	// /////////////////////Class Variables////////////////////////////
	def run() {
		// 1// Load Model
		// 2// Run Model
		// 3// Derive Layer
		// 4// Execute Layer
	}

	def loadModel(SrcMetamodel smm) {

	
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(".ecore", new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(".xmi", new XMIResourceFactoryImpl());
		// var Map<String, Object> options = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		// options.put(Resource.Factory.Registry.DEFAULT_EXTENSION,new XMIResourceFactoryImpl())
	 packageResource = resourceSet.createResource(URI.createURI("file://Users/adeelasaalim/Documents/FinalProject" + smm.importURI));
		//packageResource.load(options)
		
		
		
		
		packageResource.load(null)
		if (packageResource.loaded) {
			println("Resource has been loaded.")
		} else {
			println("Resource has been failed to load.")
		}

	metapackage = packageResource.getContents().get(0) as EPackage;
	println(metapackage.name)
		//resourceSet.getPackageRegistry().put("http://org.xtext.project.tdsl/model/student", metapackage);
	
		//var Copier copier = new Copier();
		//var EPackage eCopyPackage = copier.copy(metapackage) as EPackage
		

		//	deriveLayer(metapackage)
		//saveAndCreateModel()
		
	}
	
	// ********************************Create and Save Copied model************************************// 
	
	def saveAndCreateModel(TrgMetamodel tmm){
		var EcoreFactory theCoreFactory = EcoreFactory.eINSTANCE;
		var EPackage eCopyPackage= theCoreFactory.createEPackage();
		eCopyPackage.name = tmm.name
		eCopyPackage.nsURI = tmm.nsuri
	   println(eCopyPackage.nsURI)
	    
	     /*var File file = new File("/Users/adeelasaalim/Documents/FinalProject"+ tmm.filepath)
		 if (file.createNewFile()){
	       println("File is created!");
	      }else{
	       println("File already exists.");
	      }
	var Iterator<EObject> PackageIterator = packageResource.allContents
		while (PackageIterator.hasNext()) {
			System.out.println(PackageIterator.next());
		}*/
		//var XMIResourceImpl resource = new XMIResourceImpl();
 		/*var File source = new File("//Users/adeelasaalim/Documents/FinalProject/org.xtext.project.tdsl/model/ModifiedComposed.ecore");
 		source.createNewFile()
 		if(source.createNewFile)
 		{
 			println("File created")
 		}
 		//resource.load( new FileInputStream(source), new HashMap<Object,Object>());
 		//var Data data = (Data)resource.getContents().get(0);*/
		
	}

	// *********************************Apply a Layer*************************************************// 
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
		
