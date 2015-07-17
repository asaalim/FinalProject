package org.xtext.project.tdsl.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.project.tdsl.transfoDsl.SrcMetamodel;
import org.xtext.project.tdsl.transfoDsl.Transformation;

@SuppressWarnings("all")
public class TransformationRunner {
  private ResourceSet set = new ResourceSetImpl();
  
  private Resource packageResource = this.set.createResource(URI.createURI("file://Users/adeelasaalim/Documents/FinalProject/org.xtext.project.tdsl/model/Composed.ecore "));
  
  public Object run(final Transformation t) {
    return null;
  }
  
  public void loadModel(final SrcMetamodel smm) {
    try {
      EList<EObject> _contents = this.packageResource.getContents();
      _contents.add(smm);
      this.packageResource.save(null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
