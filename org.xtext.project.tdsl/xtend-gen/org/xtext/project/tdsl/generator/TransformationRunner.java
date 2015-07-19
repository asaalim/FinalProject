package org.xtext.project.tdsl.generator;

import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.project.tdsl.transfoDsl.SrcMetamodel;
import org.xtext.project.tdsl.transfoDsl.Transformation;

@SuppressWarnings("all")
public class TransformationRunner {
  public Object run(final Transformation t) {
    return null;
  }
  
  public String loadModel(final SrcMetamodel smm) {
    try {
      String _xblockexpression = null;
      {
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
        String _xifexpression = null;
        boolean _isLoaded = packageResource.isLoaded();
        if (_isLoaded) {
          _xifexpression = InputOutput.<String>println("Resource has been loaded.");
        } else {
          _xifexpression = InputOutput.<String>println("Resource has been failed to load.");
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
