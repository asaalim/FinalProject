package org.xtext.project.tdsl.generator;

import java.io.FileOutputStream;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.project.tdsl.transfoDsl.SrcMetamodel;
import org.xtext.project.tdsl.transfoDsl.TrgMetamodel;

@SuppressWarnings("all")
public class TransformationRunner {
  private ResourceSet resourceSet = new ResourceSetImpl();
  
  private Resource packageResource;
  
  private EPackage metapackage;
  
  public Object run() {
    return null;
  }
  
  public void loadModel(final SrcMetamodel smm) {
    try {
      Resource.Factory.Registry _resourceFactoryRegistry = this.resourceSet.getResourceFactoryRegistry();
      Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      EcoreResourceFactoryImpl _ecoreResourceFactoryImpl = new EcoreResourceFactoryImpl();
      _extensionToFactoryMap.put(".ecore", _ecoreResourceFactoryImpl);
      Resource.Factory.Registry _resourceFactoryRegistry_1 = this.resourceSet.getResourceFactoryRegistry();
      Map<String, Object> _extensionToFactoryMap_1 = _resourceFactoryRegistry_1.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap_1.put(".xmi", _xMIResourceFactoryImpl);
      String _importURI = smm.getImportURI();
      String _plus = ("file://Users/adeelasaalim/Documents/FinalProject" + _importURI);
      URI _createURI = URI.createURI(_plus);
      Resource _createResource = this.resourceSet.createResource(_createURI);
      this.packageResource = _createResource;
      this.packageResource.load(null);
      boolean _isLoaded = this.packageResource.isLoaded();
      if (_isLoaded) {
        InputOutput.<String>println("Resource has been loaded.");
      } else {
        InputOutput.<String>println("Resource has been failed to load.");
      }
      FileOutputStream fs = new FileOutputStream("/Users/adeelasaalim/Documents/FinalProject/org.xtext.project.tdsl/models/changedcomposed.ecore");
      EList<EObject> _contents = this.packageResource.getContents();
      EObject _get = _contents.get(0);
      EPackage testPackage = ((EPackage) _get);
      EList<EClassifier> eClass = testPackage.getEClassifiers();
      EClassifier elem = eClass.remove(0);
      this.packageResource.save(fs, null);
      EList<EObject> _contents_1 = this.packageResource.getContents();
      EObject _get_1 = _contents_1.get(0);
      this.metapackage = ((EPackage) _get_1);
      String _name = this.metapackage.getName();
      InputOutput.<String>println(_name);
      this.deriveLayer(this.metapackage);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void saveAndCreateModel(final TrgMetamodel tmm) {
    EcoreFactory theCoreFactory = EcoreFactory.eINSTANCE;
    EPackage eCopyPackage = theCoreFactory.createEPackage();
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
