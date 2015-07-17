/**
 */
package org.xtext.project.tdsl.transfoDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.project.tdsl.transfoDsl.SrcMetamodel;
import org.xtext.project.tdsl.transfoDsl.SrcModel;
import org.xtext.project.tdsl.transfoDsl.TransfoDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.SrcModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.SrcModelImpl#getSourcemetamodel <em>Sourcemetamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SrcModelImpl extends MinimalEObjectImpl.Container implements SrcModel
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
   * The cached value of the '{@link #getSourcemetamodel() <em>Sourcemetamodel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcemetamodel()
   * @generated
   * @ordered
   */
  protected SrcMetamodel sourcemetamodel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SrcModelImpl()
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
    return TransfoDslPackage.Literals.SRC_MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TransfoDslPackage.SRC_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SrcMetamodel getSourcemetamodel()
  {
    if (sourcemetamodel != null && sourcemetamodel.eIsProxy())
    {
      InternalEObject oldSourcemetamodel = (InternalEObject)sourcemetamodel;
      sourcemetamodel = (SrcMetamodel)eResolveProxy(oldSourcemetamodel);
      if (sourcemetamodel != oldSourcemetamodel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransfoDslPackage.SRC_MODEL__SOURCEMETAMODEL, oldSourcemetamodel, sourcemetamodel));
      }
    }
    return sourcemetamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SrcMetamodel basicGetSourcemetamodel()
  {
    return sourcemetamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourcemetamodel(SrcMetamodel newSourcemetamodel)
  {
    SrcMetamodel oldSourcemetamodel = sourcemetamodel;
    sourcemetamodel = newSourcemetamodel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransfoDslPackage.SRC_MODEL__SOURCEMETAMODEL, oldSourcemetamodel, sourcemetamodel));
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
      case TransfoDslPackage.SRC_MODEL__NAME:
        return getName();
      case TransfoDslPackage.SRC_MODEL__SOURCEMETAMODEL:
        if (resolve) return getSourcemetamodel();
        return basicGetSourcemetamodel();
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
      case TransfoDslPackage.SRC_MODEL__NAME:
        setName((String)newValue);
        return;
      case TransfoDslPackage.SRC_MODEL__SOURCEMETAMODEL:
        setSourcemetamodel((SrcMetamodel)newValue);
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
      case TransfoDslPackage.SRC_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TransfoDslPackage.SRC_MODEL__SOURCEMETAMODEL:
        setSourcemetamodel((SrcMetamodel)null);
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
      case TransfoDslPackage.SRC_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TransfoDslPackage.SRC_MODEL__SOURCEMETAMODEL:
        return sourcemetamodel != null;
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
    result.append(')');
    return result.toString();
  }

} //SrcModelImpl
