package org.xtext.project.tdsl.generator

import org.xtext.project.tdsl.transfoDsl.Transformation
/*import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.util.ExtendedMetaData
import org.eclipse.emf.ecore.util.BasicExtendedMetaData
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.URI*/

class TransformationRunner {
	
	/*val static IN_METAMODEL = "./metamodels/Composed.ecore";
	val static IN_METAMODEL_NAME = "Composed";
	val static IN_MODEL = "./models/composed.xmi";
	var inputMetamodelNsURI = "";
	var outputMetamodelNsURI = "";
	var rs = new ResourceSetImpl();*/
	
	def run(Transformation t){
		//1// Load Model
		//2// Run Model
		//3// Derive Layer
		//4// Execute Layer
		println("My simple run function.")
		println(t.class.package.class.typeName)
		println(t.srcmodel.toString)
	}
	
	/*def lazyMetamodelRegistration(String metamodelPath){
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
   	
	   // ResourceSet rs = new ResourceSetImpl();
	    // Enables extended meta-data, weird we have to do this but well...
	    val extendedMetaData = new BasicExtendedMetaData(EPackage.Registry.INSTANCE);
	    rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
	
	    var  r = rs.getResource(URI.createFileURI(metamodelPath), true);
	    var  eObject = r.getContents().get(0);
	    // A meta-model might have multiple packages we assume the main package is the first one listed
	    if (eObject instanceof EPackage) {
	        var  p = eObject;
	        System.out.println(p.getNsURI());
	        EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
	        return p.getNsURI();
	    }
	    return null;
	}
	
	def registerInputMetamodel(String inputMetamodelPath){	
		inputMetamodelNsURI = lazyMetamodelRegistration(inputMetamodelPath);
		System.out.println("Input " + inputMetamodelNsURI);
	}
	
	def static void main(String[] args){
		println("Main Method")
		var tr = new TransformationRunner()
		tr.registerInputMetamodel(IN_METAMODEL);
	}*/
}