package org.xtext.project.tdsl.generator;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
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
      EcoreUtil.Copier copier = new EcoreUtil.Copier();
      EObject _copy = copier.copy(metapackage);
      EPackage eCopyPackage = ((EPackage) _copy);
      EList<EObject> _eContents = eCopyPackage.eContents();
      boolean _isEmpty = _eContents.isEmpty();
      if (_isEmpty) {
        InputOutput.<String>println("Copying failed.");
      } else {
        InputOutput.<String>println("Copying successful.");
      }
      this.deriveLayer(eCopyPackage);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void deriveLayer(final EPackage ePkg) {
    InputOutput.<String>println("Inside Derive Layer Function");
    EClass eClass = null;
    for (int i = 0; (i < ePkg.eContents().size()); i++) {
      {
        EList<EClassifier> _eClassifiers = ePkg.getEClassifiers();
        EClassifier _get = _eClassifiers.get(i);
        InputOutput.<EClassifier>println(_get);
        EList<EClassifier> _eClassifiers_1 = ePkg.getEClassifiers();
        EClassifier _get_1 = _eClassifiers_1.get(i);
        eClass = ((EClass) _get_1);
        for (int j = 0; (j < eClass.getEReferences().size()); j++) {
          EList<EReference> _eReferences = eClass.getEReferences();
          EReference _get_2 = _eReferences.get(j);
          InputOutput.<EReference>println(_get_2);
        }
        for (int j = 0; (j < eClass.getEAttributes().size()); j++) {
          EList<EAttribute> _eAttributes = eClass.getEAttributes();
          EAttribute _get_2 = _eAttributes.get(j);
          InputOutput.<EAttribute>println(_get_2);
        }
      }
    }
  }
}
