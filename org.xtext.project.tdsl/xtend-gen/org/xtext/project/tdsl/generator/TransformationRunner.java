package org.xtext.project.tdsl.generator;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.project.tdsl.transfoDsl.Transformation;

@SuppressWarnings("all")
public class TransformationRunner {
  public String run(final Transformation t) {
    String _xblockexpression = null;
    {
      InputOutput.<String>println("My simple run function.");
      Class<? extends Transformation> _class = t.getClass();
      Package _package = _class.getPackage();
      Class<? extends Package> _class_1 = _package.getClass();
      String _typeName = _class_1.getTypeName();
      _xblockexpression = InputOutput.<String>println(_typeName);
    }
    return _xblockexpression;
  }
}
