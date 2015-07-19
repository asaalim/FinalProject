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
import org.xtext.project.tdsl.transfoDsl.SrcMetamodel;
import org.xtext.project.tdsl.transfoDsl.SrcModel;
import org.xtext.project.tdsl.transfoDsl.TransfoDslPackage;
import org.xtext.project.tdsl.transfoDsl.Transformation;
import org.xtext.project.tdsl.transfoDsl.TrgMetaModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl#getSrcmetamodel <em>Srcmetamodel</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl#getSrcmodel <em>Srcmodel</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl#getTargetmetamodel <em>Targetmetamodel</em>}</li>
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
   * The cached value of the '{@link #getSrcmetamodel() <em>Srcmetamodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrcmetamodel()
   * @generated
   * @ordered
   */
  protected SrcMetamodel srcmetamodel;

  /**
   * The cached value of the '{@link #getSrcmodel() <em>Srcmodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrcmodel()
   * @generated
   * @ordered
   */
  protected SrcModel srcmodel;

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
   * The cached value of the '{@link #getTargetmetamodel() <em>Targetmetamodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetmetamodel()
   * @generated
   * @ordered
   */
  protected TrgMetaModel targetmetamodel;

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
  public SrcMetamodel getSrcmetamodel()
  {
    return srcmetamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrcmetamodel(SrcMetamodel newSrcmetamodel, NotificationChain msgs)
  {
    SrcMetamodel oldSrcmetamodel = srcmetamodel;
    srcmetamodel = newSrcmetamodel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransfoDslPackage.TRANSFORMATION__SRCMETAMODEL, oldSrcmetamodel, newSrcmetamodel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrcmetamodel(SrcMetamodel newSrcmetamodel)
  {
    if (newSrcmetamodel != srcmetamodel)
    {
      NotificationChain msgs = null;
      if (srcmetamodel != null)
        msgs = ((InternalEObject)srcmetamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransfoDslPackage.TRANSFORMATION__SRCMETAMODEL, null, msgs);
      if (newSrcmetamodel != null)
        msgs = ((InternalEObject)newSrcmetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransfoDslPackage.TRANSFORMATION__SRCMETAMODEL, null, msgs);
      msgs = basicSetSrcmetamodel(newSrcmetamodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransfoDslPackage.TRANSFORMATION__SRCMETAMODEL, newSrcmetamodel, newSrcmetamodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SrcModel getSrcmodel()
  {
    return srcmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrcmodel(SrcModel newSrcmodel, NotificationChain msgs)
  {
    SrcModel oldSrcmodel = srcmodel;
    srcmodel = newSrcmodel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransfoDslPackage.TRANSFORMATION__SRCMODEL, oldSrcmodel, newSrcmodel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrcmodel(SrcModel newSrcmodel)
  {
    if (newSrcmodel != srcmodel)
    {
      NotificationChain msgs = null;
      if (srcmodel != null)
        msgs = ((InternalEObject)srcmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransfoDslPackage.TRANSFORMATION__SRCMODEL, null, msgs);
      if (newSrcmodel != null)
        msgs = ((InternalEObject)newSrcmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransfoDslPackage.TRANSFORMATION__SRCMODEL, null, msgs);
      msgs = basicSetSrcmodel(newSrcmodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransfoDslPackage.TRANSFORMATION__SRCMODEL, newSrcmodel, newSrcmodel));
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
  public TrgMetaModel getTargetmetamodel()
  {
    return targetmetamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetmetamodel(TrgMetaModel newTargetmetamodel, NotificationChain msgs)
  {
    TrgMetaModel oldTargetmetamodel = targetmetamodel;
    targetmetamodel = newTargetmetamodel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransfoDslPackage.TRANSFORMATION__TARGETMETAMODEL, oldTargetmetamodel, newTargetmetamodel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetmetamodel(TrgMetaModel newTargetmetamodel)
  {
    if (newTargetmetamodel != targetmetamodel)
    {
      NotificationChain msgs = null;
      if (targetmetamodel != null)
        msgs = ((InternalEObject)targetmetamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransfoDslPackage.TRANSFORMATION__TARGETMETAMODEL, null, msgs);
      if (newTargetmetamodel != null)
        msgs = ((InternalEObject)newTargetmetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransfoDslPackage.TRANSFORMATION__TARGETMETAMODEL, null, msgs);
      msgs = basicSetTargetmetamodel(newTargetmetamodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransfoDslPackage.TRANSFORMATION__TARGETMETAMODEL, newTargetmetamodel, newTargetmetamodel));
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
      case TransfoDslPackage.TRANSFORMATION__SRCMETAMODEL:
        return basicSetSrcmetamodel(null, msgs);
      case TransfoDslPackage.TRANSFORMATION__SRCMODEL:
        return basicSetSrcmodel(null, msgs);
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        return ((InternalEList<?>)getLayer()).basicRemove(otherEnd, msgs);
      case TransfoDslPackage.TRANSFORMATION__TARGETMETAMODEL:
        return basicSetTargetmetamodel(null, msgs);
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
      case TransfoDslPackage.TRANSFORMATION__SRCMETAMODEL:
        return getSrcmetamodel();
      case TransfoDslPackage.TRANSFORMATION__SRCMODEL:
        return getSrcmodel();
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        return getLayer();
      case TransfoDslPackage.TRANSFORMATION__TARGETMETAMODEL:
        return getTargetmetamodel();
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
      case TransfoDslPackage.TRANSFORMATION__SRCMETAMODEL:
        setSrcmetamodel((SrcMetamodel)newValue);
        return;
      case TransfoDslPackage.TRANSFORMATION__SRCMODEL:
        setSrcmodel((SrcModel)newValue);
        return;
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        getLayer().clear();
        getLayer().addAll((Collection<? extends Layer>)newValue);
        return;
      case TransfoDslPackage.TRANSFORMATION__TARGETMETAMODEL:
        setTargetmetamodel((TrgMetaModel)newValue);
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
      case TransfoDslPackage.TRANSFORMATION__SRCMETAMODEL:
        setSrcmetamodel((SrcMetamodel)null);
        return;
      case TransfoDslPackage.TRANSFORMATION__SRCMODEL:
        setSrcmodel((SrcModel)null);
        return;
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        getLayer().clear();
        return;
      case TransfoDslPackage.TRANSFORMATION__TARGETMETAMODEL:
        setTargetmetamodel((TrgMetaModel)null);
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
      case TransfoDslPackage.TRANSFORMATION__SRCMETAMODEL:
        return srcmetamodel != null;
      case TransfoDslPackage.TRANSFORMATION__SRCMODEL:
        return srcmodel != null;
      case TransfoDslPackage.TRANSFORMATION__LAYER:
        return layer != null && !layer.isEmpty();
      case TransfoDslPackage.TRANSFORMATION__TARGETMETAMODEL:
        return targetmetamodel != null;
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
