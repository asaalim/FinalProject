package org.xtext.project.tdsl.generator;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.project.tdsl.transfoDsl.Transformation;

@SuppressWarnings("all")
public class TransformationRunner {
  public String run(final Transformation t) {
    return InputOutput.<String>println("My simple run function.");
  }
}
