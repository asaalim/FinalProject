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
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.Transformation#getSrcmetamodel <em>Srcmetamodel</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.Transformation#getSrcmodel <em>Srcmodel</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.Transformation#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.Transformation#getTargetmodel <em>Targetmodel</em>}</li>
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
   * Returns the value of the '<em><b>Srcmetamodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Srcmetamodel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Srcmetamodel</em>' containment reference.
   * @see #setSrcmetamodel(SrcMetamodel)
   * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getTransformation_Srcmetamodel()
   * @model containment="true"
   * @generated
   */
  SrcMetamodel getSrcmetamodel();

  /**
   * Sets the value of the '{@link org.xtext.project.tdsl.transfoDsl.Transformation#getSrcmetamodel <em>Srcmetamodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Srcmetamodel</em>' containment reference.
   * @see #getSrcmetamodel()
   * @generated
   */
  void setSrcmetamodel(SrcMetamodel value);

  /**
   * Returns the value of the '<em><b>Srcmodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Srcmodel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Srcmodel</em>' containment reference.
   * @see #setSrcmodel(SrcModel)
   * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getTransformation_Srcmodel()
   * @model containment="true"
   * @generated
   */
  SrcModel getSrcmodel();

  /**
   * Sets the value of the '{@link org.xtext.project.tdsl.transfoDsl.Transformation#getSrcmodel <em>Srcmodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Srcmodel</em>' containment reference.
   * @see #getSrcmodel()
   * @generated
   */
  void setSrcmodel(SrcModel value);

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
   * Returns the value of the '<em><b>Targetmodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Targetmodel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Targetmodel</em>' containment reference.
   * @see #setTargetmodel(TrgModel)
   * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getTransformation_Targetmodel()
   * @model containment="true"
   * @generated
   */
  TrgModel getTargetmodel();

  /**
   * Sets the value of the '{@link org.xtext.project.tdsl.transfoDsl.Transformation#getTargetmodel <em>Targetmodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Targetmodel</em>' containment reference.
   * @see #getTargetmodel()
   * @generated
   */
  void setTargetmodel(TrgModel value);

} // Transformation
