/**
 */
package org.xtext.project.tdsl.transfoDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.project.tdsl.transfoDsl.Layer;
import org.xtext.project.tdsl.transfoDsl.SrcModel;
import org.xtext.project.tdsl.transfoDsl.TransfoDslPackage;
import org.xtext.project.tdsl.transfoDsl.Transformation;
import org.xtext.project.tdsl.transfoDsl.TrgModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl#getSrcModel <em>Src Model</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl#getTargetModel <em>Target Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation
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
   * The cached value of the '{@link #getSrcModel() <em>Src Model</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrcModel()
   * @generated
   * @ordered
   */
  protected EList<SrcModel> srcModel;

  /**
   * The cached value of the '{@link #getLayer() <em>Layer</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayer()
   * @generated
   * @ordered
   */
  protected EList<Layer> layer;

  /**
   * The cached value of the '{@link #getTargetModel() <em>Target Model</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetModel()
   * @generated
   * @ordered
   */
  protected EList<TrgModel> targetModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransformationImpl()
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
    return TransfoDslPackage.Literals.TRANSFORMATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TransfoDslPackage.TRANSFORMATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SrcModel> getSrcModel()
  {
    if (srcModel == null)
    {
      srcModel = new EObjectContainmentEList<SrcModel>(SrcModel.class, this, TransfoDslPackage.TRANSFORMATION__SRC_MODEL);
    }
    return srcModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Layer> getLayer()
  {
    if (layer == null)
    {
      layer = new EObjectContainmentEList<Layer>(Layer.class, this, TransfoDslPackage.TRANSFORMATION__LAYER);
    }
    return layer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TrgModel> getTargetModel()
  {
    if (targetModel == null)
    {
      targetModel = new EObjectContainmentEList<TrgModel>(TrgModel.class, this, TransfoDslPackage.TRANSFORMATION__TARGET_MODEL);
    }
    return targetModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TransfoDslPackage.TRANSFORMATION__SRC_MODEL:
        return ((InternalEList<?>)getSrcModel()).basicRemove(otherEnd, msgs);
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        return ((InternalEList<?>)getLayer()).basicRemove(otherEnd, msgs);
      case TransfoDslPackage.TRANSFORMATION__TARGET_MODEL:
        return ((InternalEList<?>)getTargetModel()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case TransfoDslPackage.TRANSFORMATION__NAME:
        return getName();
      case TransfoDslPackage.TRANSFORMATION__SRC_MODEL:
        return getSrcModel();
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        return getLayer();
      case TransfoDslPackage.TRANSFORMATION__TARGET_MODEL:
        return getTargetModel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TransfoDslPackage.TRANSFORMATION__NAME:
        setName((String)newValue);
        return;
      case TransfoDslPackage.TRANSFORMATION__SRC_MODEL:
        getSrcModel().clear();
        getSrcModel().addAll((Collection<? extends SrcModel>)newValue);
        return;
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        getLayer().clear();
        getLayer().addAll((Collection<? extends Layer>)newValue);
        return;
      case TransfoDslPackage.TRANSFORMATION__TARGET_MODEL:
        getTargetModel().clear();
        getTargetModel().addAll((Collection<? extends TrgModel>)newValue);
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
      case TransfoDslPackage.TRANSFORMATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TransfoDslPackage.TRANSFORMATION__SRC_MODEL:
        getSrcModel().clear();
        return;
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        getLayer().clear();
        return;
      case TransfoDslPackage.TRANSFORMATION__TARGET_MODEL:
        getTargetModel().clear();
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
      case TransfoDslPackage.TRANSFORMATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TransfoDslPackage.TRANSFORMATION__SRC_MODEL:
        return srcModel != null && !srcModel.isEmpty();
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        return layer != null && !layer.isEmpty();
      case TransfoDslPackage.TRANSFORMATION__TARGET_MODEL:
        return targetModel != null && !targetModel.isEmpty();
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

} //TransformationImpl
