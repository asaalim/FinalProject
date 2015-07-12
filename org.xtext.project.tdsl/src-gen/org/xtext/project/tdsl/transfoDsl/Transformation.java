/**
 */
package org.xtext.project.tdsl.transfoDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.Transformation#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.Transformation#getSrcModel <em>Src Model</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.Transformation#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.Transformation#getTargetModel <em>Target Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getTransformation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.tdsl.transfoDsl.Transformation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Src Model</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.tdsl.transfoDsl.SrcModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src Model</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src Model</em>' containment reference list.
   * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getTransformation_SrcModel()
   * @model containment="true"
   * @generated
   */
  EList<SrcModel> getSrcModel();

  /**
   * Returns the value of the '<em><b>Layer</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.tdsl.transfoDsl.Layer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layer</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layer</em>' containment reference list.
   * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getTransformation_Layer()
   * @model containment="true"
   * @generated
   */
  EList<Layer> getLayer();

  /**
   * Returns the value of the '<em><b>Target Model</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.tdsl.transfoDsl.TrgModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Model</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Model</em>' containment reference list.
   * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getTransformation_TargetModel()
   * @model containment="true"
   * @generated
   */
  EList<TrgModel> getTargetModel();

} // Transformation
