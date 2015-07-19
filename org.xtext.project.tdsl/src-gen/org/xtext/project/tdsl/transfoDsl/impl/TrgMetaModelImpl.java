/**
 */
package org.xtext.project.tdsl.transfoDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.project.tdsl.transfoDsl.TransfoDslPackage;
import org.xtext.project.tdsl.transfoDsl.TrgMetaModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Meta Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TrgMetaModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TrgMetaModelImpl#getFilepath <em>Filepath</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrgMetaModelImpl extends MinimalEObjectImpl.Container implements TrgMetaModel
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFilepath() <em>Filepath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilepath()
   * @generated
   * @ordered
   */
  protected static final String FILEPATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilepath() <em>Filepath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilepath()
   * @generated
   * @ordered
   */
  protected String filepath = FILEPATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrgMetaModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TransfoDslPackage.Literals.TRG_META_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransfoDslPackage.TRG_META_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilepath()
  {
    return filepath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilepath(String newFilepath)
  {
    String oldFilepath = filepath;
    filepath = newFilepath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransfoDslPackage.TRG_META_MODEL__FILEPATH, oldFilepath, filepath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TransfoDslPackage.TRG_META_MODEL__NAME:
        return getName();
      case TransfoDslPackage.TRG_META_MODEL__FILEPATH:
        return getFilepath();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TransfoDslPackage.TRG_META_MODEL__NAME:
        setName((String)newValue);
        return;
      case TransfoDslPackage.TRG_META_MODEL__FILEPATH:
        setFilepath((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TransfoDslPackage.TRG_META_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TransfoDslPackage.TRG_META_MODEL__FILEPATH:
        setFilepath(FILEPATH_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TransfoDslPackage.TRG_META_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TransfoDslPackage.TRG_META_MODEL__FILEPATH:
        return FILEPATH_EDEFAULT == null ? filepath != null : !FILEPATH_EDEFAULT.equals(filepath);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", filepath: ");
    result.append(filepath);
    result.append(')');
    return result.toString();
  }

} //TrgMetaModelImpl
