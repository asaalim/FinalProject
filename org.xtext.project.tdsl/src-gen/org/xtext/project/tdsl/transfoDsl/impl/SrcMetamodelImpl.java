/**
 */
package org.xtext.project.tdsl.transfoDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.project.tdsl.transfoDsl.SrcMetamodel;
import org.xtext.project.tdsl.transfoDsl.TransfoDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.SrcMetamodelImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SrcMetamodelImpl extends MinimalEObjectImpl.Container implements SrcMetamodel
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected org.xtext.project.tdsl.transfoDsl.Package package_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SrcMetamodelImpl()
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
    return TransfoDslPackage.Literals.SRC_METAMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.project.tdsl.transfoDsl.Package getPackage()
  {
    if (package_ != null && package_.eIsProxy())
    {
      InternalEObject oldPackage = (InternalEObject)package_;
      package_ = (org.xtext.project.tdsl.transfoDsl.Package)eResolveProxy(oldPackage);
      if (package_ != oldPackage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransfoDslPackage.SRC_METAMODEL__PACKAGE, oldPackage, package_));
      }
    }
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.project.tdsl.transfoDsl.Package basicGetPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(org.xtext.project.tdsl.transfoDsl.Package newPackage)
  {
    org.xtext.project.tdsl.transfoDsl.Package oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransfoDslPackage.SRC_METAMODEL__PACKAGE, oldPackage, package_));
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
      case TransfoDslPackage.SRC_METAMODEL__PACKAGE:
        if (resolve) return getPackage();
        return basicGetPackage();
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
      case TransfoDslPackage.SRC_METAMODEL__PACKAGE:
        setPackage((org.xtext.project.tdsl.transfoDsl.Package)newValue);
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
      case TransfoDslPackage.SRC_METAMODEL__PACKAGE:
        setPackage((org.xtext.project.tdsl.transfoDsl.Package)null);
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
      case TransfoDslPackage.SRC_METAMODEL__PACKAGE:
        return package_ != null;
    }
    return super.eIsSet(featureID);
  }

} //SrcMetamodelImpl
