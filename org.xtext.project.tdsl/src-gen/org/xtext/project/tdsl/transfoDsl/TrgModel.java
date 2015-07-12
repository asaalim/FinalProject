/**
 */
package org.xtext.project.tdsl.transfoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.TrgModel#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.TrgModel#getFilepath <em>Filepath</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getTrgModel()
 * @model
 * @generated
 */
public interface TrgModel extends EObject
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
   * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getTrgModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.tdsl.transfoDsl.TrgModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Filepath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filepath</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filepath</em>' attribute.
   * @see #setFilepath(String)
   * @see org.xtext.project.tdsl.transfoDsl.TransfoDslPackage#getTrgModel_Filepath()
   * @model
   * @generated
   */
  String getFilepath();

  /**
   * Sets the value of the '{@link org.xtext.project.tdsl.transfoDsl.TrgModel#getFilepath <em>Filepath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filepath</em>' attribute.
   * @see #getFilepath()
   * @generated
   */
  void setFilepath(String value);

} // TrgModel
