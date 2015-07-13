/**
 */
package org.xtext.project.tdsl.transfoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.SrcMetamodel#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getSrcMetamodel()
 * @model
 * @generated
 */
public interface SrcMetamodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' reference.
   * @see #setPackage(org.xtext.project.tdsl.transfoDsl.Package)
   * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getSrcMetamodel_Package()
   * @model
   * @generated
   */
  org.xtext.project.tdsl.transfoDsl.Package getPackage();

  /**
   * Sets the value of the '{@link org.xtext.project.tdsl.transfoDsl.SrcMetamodel#getPackage <em>Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(org.xtext.project.tdsl.transfoDsl.Package value);

} // SrcMetamodel
