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
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.SrcModelImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.SrcModelImpl#getSorcemetamodel <em>Sorcemetamodel</em>}</li>
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
   * The default value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected static final String IMPORT_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected String importURI = IMPORT_URI_EDEFAULT;

  /**
   * The cached value of the '{@link #getSorcemetamodel() <em>Sorcemetamodel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSorcemetamodel()
   * @generated
   * @ordered
   */
  protected SrcMetamodel sorcemetamodel;

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
  public String getImportURI()
  {
    return importURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportURI(String newImportURI)
  {
    String oldImportURI = importURI;
    importURI = newImportURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransfoDslPackage.SRC_MODEL__IMPORT_URI, oldImportURI, importURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SrcMetamodel getSorcemetamodel()
  {
    if (sorcemetamodel != null && sorcemetamodel.eIsProxy())
    {
      InternalEObject oldSorcemetamodel = (InternalEObject)sorcemetamodel;
      sorcemetamodel = (SrcMetamodel)eResolveProxy(oldSorcemetamodel);
      if (sorcemetamodel != oldSorcemetamodel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransfoDslPackage.SRC_MODEL__SORCEMETAMODEL, oldSorcemetamodel, sorcemetamodel));
      }
    }
    return sorcemetamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SrcMetamodel basicGetSorcemetamodel()
  {
    return sorcemetamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSorcemetamodel(SrcMetamodel newSorcemetamodel)
  {
    SrcMetamodel oldSorcemetamodel = sorcemetamodel;
    sorcemetamodel = newSorcemetamodel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransfoDslPackage.SRC_MODEL__SORCEMETAMODEL, oldSorcemetamodel, sorcemetamodel));
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
      case TransfoDslPackage.SRC_MODEL__IMPORT_URI:
        return getImportURI();
      case TransfoDslPackage.SRC_MODEL__SORCEMETAMODEL:
        if (resolve) return getSorcemetamodel();
        return basicGetSorcemetamodel();
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
      case TransfoDslPackage.SRC_MODEL__IMPORT_URI:
        setImportURI((String)newValue);
        return;
      case TransfoDslPackage.SRC_MODEL__SORCEMETAMODEL:
        setSorcemetamodel((SrcMetamodel)newValue);
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
      case TransfoDslPackage.SRC_MODEL__IMPORT_URI:
        setImportURI(IMPORT_URI_EDEFAULT);
        return;
      case TransfoDslPackage.SRC_MODEL__SORCEMETAMODEL:
        setSorcemetamodel((SrcMetamodel)null);
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
      case TransfoDslPackage.SRC_MODEL__IMPORT_URI:
        return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
      case TransfoDslPackage.SRC_MODEL__SORCEMETAMODEL:
        return sorcemetamodel != null;
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
    result.append(", importURI: ");
    result.append(importURI);
    result.append(')');
    return result.toString();
  }

} //SrcModelImpl
