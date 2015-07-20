package org.xtext.project.tdsl.generator;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.project.tdsl.transfoDsl.SrcMetamodel;

@SuppressWarnings("all")
public class TransformationRunner {
  public Object run() {
    return null;
  }
  
  public void loadModel(final SrcMetamodel smm) {
    try {
      ResourceSet resourceSet = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
      Map<String, Object> options = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      options.put(Resource.Factory.Registry.DEFAULT_EXTENSION, _xMIResourceFactoryImpl);
      String _importURI = smm.getImportURI();
      String _plus = ("file://Users/adeelasaalim/Documents/FinalProject" + _importURI);
      URI _createURI = URI.createURI(_plus);
      Resource packageResource = resourceSet.createResource(_createURI);
      packageResource.load(options);
      boolean _isLoaded = packageResource.isLoaded();
      if (_isLoaded) {
        InputOutput.<String>println("Resource has been loaded.");
      } else {
        InputOutput.<String>println("Resource has been failed to load.");
      }
      EList<EObject> _contents = packageResource.getContents();
      EObject eObject = _contents.get(0);
      EList<EObject> _eContents = eObject.eContents();
      boolean _isEmpty = _eContents.isEmpty();
      if (_isEmpty) {
        InputOutput.<String>println("List is empty");
      } else {
        InputOutput.<String>println("List is NOT empty.");
      }
      this.copyMetamodel(eObject);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void copyMetamodel(final EObject eCopyObj) {
    InputOutput.<String>println("Inside Copy Metamodel Function");
    EcoreUtil.Copier copier = new EcoreUtil.Copier();
    copier.copy(eCopyObj);
    this.deriveLayer(eCopyObj);
  }
  
  public void deriveLayer(final EObject eObj) {
    InputOutput.<String>println("Inside Derive Layer Function");
    for (int i = 0; (i < eObj.eContents().size()); i++) {
      EList<EObject> _eContents = eObj.eContents();
      EObject _get = _eContents.get(i);
      InputOutput.<EObject>println(_get);
    }
  }
}
