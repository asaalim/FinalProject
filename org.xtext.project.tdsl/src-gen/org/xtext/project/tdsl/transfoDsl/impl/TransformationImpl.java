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
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl#getSrcmodel <em>Srcmodel</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl#getTargetmodel <em>Targetmodel</em>}</li>
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
   * The cached value of the '{@link #getSrcmodel() <em>Srcmodel</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrcmodel()
   * @generated
   * @ordered
   */
  protected EList<SrcModel> srcmodel;

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
   * The cached value of the '{@link #getTargetmodel() <em>Targetmodel</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetmodel()
   * @generated
   * @ordered
   */
  protected EList<TrgModel> targetmodel;

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
  public EList<SrcModel> getSrcmodel()
  {
    if (srcmodel == null)
    {
      srcmodel = new EObjectContainmentEList<SrcModel>(SrcModel.class, this, TransfoDslPackage.TRANSFORMATION__SRCMODEL);
    }
    return srcmodel;
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
  public EList<TrgModel> getTargetmodel()
  {
    if (targetmodel == null)
    {
      targetmodel = new EObjectContainmentEList<TrgModel>(TrgModel.class, this, TransfoDslPackage.TRANSFORMATION__TARGETMODEL);
    }
    return targetmodel;
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
      case TransfoDslPackage.TRANSFORMATION__SRCMODEL:
        return ((InternalEList<?>)getSrcmodel()).basicRemove(otherEnd, msgs);
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        return ((InternalEList<?>)getLayer()).basicRemove(otherEnd, msgs);
      case TransfoDslPackage.TRANSFORMATION__TARGETMODEL:
        return ((InternalEList<?>)getTargetmodel()).basicRemove(otherEnd, msgs);
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
      case TransfoDslPackage.TRANSFORMATION__SRCMODEL:
        return getSrcmodel();
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        return getLayer();
      case TransfoDslPackage.TRANSFORMATION__TARGETMODEL:
        return getTargetmodel();
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
      case TransfoDslPackage.TRANSFORMATION__SRCMODEL:
        getSrcmodel().clear();
        getSrcmodel().addAll((Collection<? extends SrcModel>)newValue);
        return;
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        getLayer().clear();
        getLayer().addAll((Collection<? extends Layer>)newValue);
        return;
      case TransfoDslPackage.TRANSFORMATION__TARGETMODEL:
        getTargetmodel().clear();
        getTargetmodel().addAll((Collection<? extends TrgModel>)newValue);
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
      case TransfoDslPackage.TRANSFORMATION__SRCMODEL:
        getSrcmodel().clear();
        return;
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        getLayer().clear();
        return;
      case TransfoDslPackage.TRANSFORMATION__TARGETMODEL:
        getTargetmodel().clear();
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
      case TransfoDslPackage.TRANSFORMATION__SRCMODEL:
        return srcmodel != null && !srcmodel.isEmpty();
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        return layer != null && !layer.isEmpty();
      case TransfoDslPackage.TRANSFORMATION__TARGETMODEL:
        return targetmodel != null && !targetmodel.isEmpty();
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
