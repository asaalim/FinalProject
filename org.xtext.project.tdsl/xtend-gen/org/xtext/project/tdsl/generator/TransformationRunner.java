package org.xtext.project.tdsl.generator;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
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
      Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("ecore", _xMIResourceFactoryImpl);
      String _importURI = smm.getImportURI();
      String _plus = ("file://Users/adeelasaalim/Documents/FinalProject" + _importURI);
      URI _createURI = URI.createURI(_plus);
      Resource packageResource = resourceSet.createResource(_createURI);
      packageResource.load(null);
      boolean _isLoaded = packageResource.isLoaded();
      if (_isLoaded) {
        InputOutput.<String>println("Resource has been loaded.");
      } else {
        InputOutput.<String>println("Resource has been failed to load.");
      }
      EList<EObject> _contents = packageResource.getContents();
      EObject _get = _contents.get(0);
      EPackage metapackage = ((EPackage) _get);
      EList<EObject> _eContents = metapackage.eContents();
      boolean _isEmpty = _eContents.isEmpty();
      if (_isEmpty) {
        InputOutput.<String>println("List is empty");
      } else {
        InputOutput.<String>println("List is NOT empty.");
      }
      this.copyMetamodel(metapackage);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void copyMetamodel(final EPackage eCopyPackage) {
    InputOutput.<String>println("Inside Copy Metamodel Function");
    EcoreUtil.Copier copier = new EcoreUtil.Copier();
    copier.copy(eCopyPackage);
    this.deriveLayer(eCopyPackage);
  }
  
  public void deriveLayer(final EPackage ePkg) {
    EClass eClass = null;
    InputOutput.<String>println("Inside Derive Layer Function");
    for (int i = 0; (i < IteratorExtensions.size(ePkg.eAllContents())); i++) {
      {
        EList<EClassifier> _eClassifiers = ePkg.getEClassifiers();
        EClassifier _get = _eClassifiers.get(i);
        eClass = ((EClass) _get);
        EList<EReference> _eReferences = eClass.getEReferences();
        EReference _get_1 = _eReferences.get(i);
        InputOutput.<EReference>println(_get_1);
      }
    }
  }
}
