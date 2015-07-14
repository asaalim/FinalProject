package org.xtext.project.tdsl.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.project.tdsl.transfoDsl.SrcModel;
import org.xtext.project.tdsl.transfoDsl.Transformation;

/**
 * import org.eclipse.emf.ecore.resource.ResourceSet
 * import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
 * import org.eclipse.emf.ecore.resource.Resource
 * import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
 * import org.eclipse.emf.ecore.util.ExtendedMetaData
 * import org.eclipse.emf.ecore.util.BasicExtendedMetaData
 * import org.eclipse.emf.ecore.EPackage
 * import org.eclipse.emf.ecore.xmi.XMLResource
 * import org.eclipse.emf.ecore.EObject
 * import org.eclipse.emf.common.util.URI
 */
@SuppressWarnings("all")
public class TransformationRunner {
  /**
   * val static IN_METAMODEL = "./metamodels/Composed.ecore";
   * val static IN_METAMODEL_NAME = "Composed";
   * val static IN_MODEL = "./models/composed.xmi";
   * var inputMetamodelNsURI = "";
   * var outputMetamodelNsURI = "";
   * var rs = new ResourceSetImpl();
   */
  public String run(final Transformation t) {
    String _xblockexpression = null;
    {
      InputOutput.<String>println("My simple run function.");
      Class<? extends Transformation> _class = t.getClass();
      Package _package = _class.getPackage();
      Class<? extends Package> _class_1 = _package.getClass();
      String _typeName = _class_1.getTypeName();
      InputOutput.<String>println(_typeName);
      EList<SrcModel> _srcmodel = t.getSrcmodel();
      String _string = _srcmodel.toString();
      _xblockexpression = InputOutput.<String>println(_string);
    }
    return _xblockexpression;
  }
}
