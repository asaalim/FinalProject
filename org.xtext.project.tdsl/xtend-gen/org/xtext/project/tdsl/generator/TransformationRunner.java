package org.xtext.project.tdsl.generator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.project.tdsl.transfoDsl.SrcMetamodel;
import org.xtext.project.tdsl.transfoDsl.Transformation;

@SuppressWarnings("all")
public class TransformationRunner {
  public Object run(final Transformation t) {
    return null;
  }
  
  public void loadModel(final SrcMetamodel smm) {
    try {
      ResourceSet set = new ResourceSetImpl();
      String _importURI = smm.getImportURI();
      URI _createURI = URI.createURI(_importURI);
      Resource packageResource = set.createResource(_createURI);
      packageResource.load(null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
