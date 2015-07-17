/**
 */
package org.xtext.project.tdsl.transfoDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.project.tdsl.transfoDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransfoDslFactoryImpl extends EFactoryImpl implements TransfoDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TransfoDslFactory init()
  {
    try
    {
      TransfoDslFactory theTransfoDslFactory = (TransfoDslFactory)EPackage.Registry.INSTANCE.getEFactory(TransfoDslPackage.eNS_URI);
      if (theTransfoDslFactory != null)
      {
        return theTransfoDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TransfoDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransfoDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TransfoDslPackage.TRANSFORMATION: return createTransformation();
      case TransfoDslPackage.SRC_METAMODEL: return createSrcMetamodel();
      case TransfoDslPackage.SRC_MODEL: return createSrcModel();
      case TransfoDslPackage.LAYER: return createLayer();
      case TransfoDslPackage.TRG_MODEL: return createTrgModel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transformation createTransformation()
  {
    TransformationImpl transformation = new TransformationImpl();
    return transformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SrcMetamodel createSrcMetamodel()
  {
    SrcMetamodelImpl srcMetamodel = new SrcMetamodelImpl();
    return srcMetamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SrcModel createSrcModel()
  {
    SrcModelImpl srcModel = new SrcModelImpl();
    return srcModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layer createLayer()
  {
    LayerImpl layer = new LayerImpl();
    return layer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrgModel createTrgModel()
  {
    TrgModelImpl trgModel = new TrgModelImpl();
    return trgModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransfoDslPackage getTransfoDslPackage()
  {
    return (TransfoDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TransfoDslPackage getPackage()
  {
    return TransfoDslPackage.eINSTANCE;
  }

} //TransfoDslFactoryImpl
