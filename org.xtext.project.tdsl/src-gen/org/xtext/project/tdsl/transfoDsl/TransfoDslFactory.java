/**
 */
package org.xtext.project.tdsl.transfoDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage
 * @generated
 */
public interface TransfoDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TransfoDslFactory eINSTANCE = org.xtext.project.tdsl.transfoDsl.impl.TransfoDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transformation</em>'.
   * @generated
   */
  Transformation createTransformation();

  /**
   * Returns a new object of class '<em>Trg Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trg Model</em>'.
   * @generated
   */
  TrgModel createTrgModel();

  /**
   * Returns a new object of class '<em>Src Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Src Model</em>'.
   * @generated
   */
  SrcModel createSrcModel();

  /**
   * Returns a new object of class '<em>Src Metamodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Src Metamodel</em>'.
   * @generated
   */
  SrcMetamodel createSrcMetamodel();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Layer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Layer</em>'.
   * @generated
   */
  Layer createLayer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TransfoDslPackage getTransfoDslPackage();

} //TransfoDslFactory
