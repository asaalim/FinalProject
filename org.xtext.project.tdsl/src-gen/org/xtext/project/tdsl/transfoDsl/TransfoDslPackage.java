/**
 */
package org.xtext.project.tdsl.transfoDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.project.tdsl.transfoDsl.TransfoDslFactory
 * @model kind="package"
 * @generated
 */
public interface TransfoDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "transfoDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/project/tdsl/TransfoDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "transfoDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TransfoDslPackage eINSTANCE = org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl <em>Transformation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl
   * @see org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl#getTransformation()
   * @generated
   */
  int TRANSFORMATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Srcmetamodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__SRCMETAMODEL = 1;

  /**
   * The feature id for the '<em><b>Srcmodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__SRCMODEL = 2;

  /**
   * The feature id for the '<em><b>Layer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__LAYER = 3;

  /**
   * The feature id for the '<em><b>Targetmetamodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__TARGETMETAMODEL = 4;

  /**
   * The number of structural features of the '<em>Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.project.tdsl.transfoDsl.impl.SrcMetamodelImpl <em>Src Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.project.tdsl.transfoDsl.impl.SrcMetamodelImpl
   * @see org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl#getSrcMetamodel()
   * @generated
   */
  int SRC_METAMODEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SRC_METAMODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SRC_METAMODEL__IMPORT_URI = 1;

  /**
   * The number of structural features of the '<em>Src Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SRC_METAMODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.project.tdsl.transfoDsl.impl.SrcModelImpl <em>Src Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.project.tdsl.transfoDsl.impl.SrcModelImpl
   * @see org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl#getSrcModel()
   * @generated
   */
  int SRC_MODEL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SRC_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Sourcemetamodel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SRC_MODEL__SOURCEMETAMODEL = 1;

  /**
   * The number of structural features of the '<em>Src Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SRC_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.project.tdsl.transfoDsl.impl.LayerImpl <em>Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.project.tdsl.transfoDsl.impl.LayerImpl
   * @see org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl#getLayer()
   * @generated
   */
  int LAYER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__NAME = 0;

  /**
   * The number of structural features of the '<em>Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.project.tdsl.transfoDsl.impl.TrgMetaModelImpl <em>Trg Meta Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.project.tdsl.transfoDsl.impl.TrgMetaModelImpl
   * @see org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl#getTrgMetaModel()
   * @generated
   */
  int TRG_META_MODEL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRG_META_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Filepath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRG_META_MODEL__FILEPATH = 1;

  /**
   * The number of structural features of the '<em>Trg Meta Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRG_META_MODEL_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.project.tdsl.transfoDsl.Transformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transformation</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.Transformation
   * @generated
   */
  EClass getTransformation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.project.tdsl.transfoDsl.Transformation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.Transformation#getName()
   * @see #getTransformation()
   * @generated
   */
  EAttribute getTransformation_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.project.tdsl.transfoDsl.Transformation#getSrcmetamodel <em>Srcmetamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Srcmetamodel</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.Transformation#getSrcmetamodel()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Srcmetamodel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.project.tdsl.transfoDsl.Transformation#getSrcmodel <em>Srcmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Srcmodel</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.Transformation#getSrcmodel()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Srcmodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.project.tdsl.transfoDsl.Transformation#getLayer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layer</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.Transformation#getLayer()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Layer();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.project.tdsl.transfoDsl.Transformation#getTargetmetamodel <em>Targetmetamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Targetmetamodel</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.Transformation#getTargetmetamodel()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Targetmetamodel();

  /**
   * Returns the meta object for class '{@link org.xtext.project.tdsl.transfoDsl.SrcMetamodel <em>Src Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Src Metamodel</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.SrcMetamodel
   * @generated
   */
  EClass getSrcMetamodel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.project.tdsl.transfoDsl.SrcMetamodel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.SrcMetamodel#getName()
   * @see #getSrcMetamodel()
   * @generated
   */
  EAttribute getSrcMetamodel_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.project.tdsl.transfoDsl.SrcMetamodel#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.SrcMetamodel#getImportURI()
   * @see #getSrcMetamodel()
   * @generated
   */
  EAttribute getSrcMetamodel_ImportURI();

  /**
   * Returns the meta object for class '{@link org.xtext.project.tdsl.transfoDsl.SrcModel <em>Src Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Src Model</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.SrcModel
   * @generated
   */
  EClass getSrcModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.project.tdsl.transfoDsl.SrcModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.SrcModel#getName()
   * @see #getSrcModel()
   * @generated
   */
  EAttribute getSrcModel_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.project.tdsl.transfoDsl.SrcModel#getSourcemetamodel <em>Sourcemetamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sourcemetamodel</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.SrcModel#getSourcemetamodel()
   * @see #getSrcModel()
   * @generated
   */
  EReference getSrcModel_Sourcemetamodel();

  /**
   * Returns the meta object for class '{@link org.xtext.project.tdsl.transfoDsl.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layer</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.Layer
   * @generated
   */
  EClass getLayer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.project.tdsl.transfoDsl.Layer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.Layer#getName()
   * @see #getLayer()
   * @generated
   */
  EAttribute getLayer_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.project.tdsl.transfoDsl.TrgMetaModel <em>Trg Meta Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trg Meta Model</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.TrgMetaModel
   * @generated
   */
  EClass getTrgMetaModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.project.tdsl.transfoDsl.TrgMetaModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.TrgMetaModel#getName()
   * @see #getTrgMetaModel()
   * @generated
   */
  EAttribute getTrgMetaModel_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.project.tdsl.transfoDsl.TrgMetaModel#getFilepath <em>Filepath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filepath</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.TrgMetaModel#getFilepath()
   * @see #getTrgMetaModel()
   * @generated
   */
  EAttribute getTrgMetaModel_Filepath();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TransfoDslFactory getTransfoDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl <em>Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.project.tdsl.transfoDsl.impl.TransformationImpl
     * @see org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl#getTransformation()
     * @generated
     */
    EClass TRANSFORMATION = eINSTANCE.getTransformation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSFORMATION__NAME = eINSTANCE.getTransformation_Name();

    /**
     * The meta object literal for the '<em><b>Srcmetamodel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__SRCMETAMODEL = eINSTANCE.getTransformation_Srcmetamodel();

    /**
     * The meta object literal for the '<em><b>Srcmodel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__SRCMODEL = eINSTANCE.getTransformation_Srcmodel();

    /**
     * The meta object literal for the '<em><b>Layer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__LAYER = eINSTANCE.getTransformation_Layer();

    /**
     * The meta object literal for the '<em><b>Targetmetamodel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__TARGETMETAMODEL = eINSTANCE.getTransformation_Targetmetamodel();

    /**
     * The meta object literal for the '{@link org.xtext.project.tdsl.transfoDsl.impl.SrcMetamodelImpl <em>Src Metamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.project.tdsl.transfoDsl.impl.SrcMetamodelImpl
     * @see org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl#getSrcMetamodel()
     * @generated
     */
    EClass SRC_METAMODEL = eINSTANCE.getSrcMetamodel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SRC_METAMODEL__NAME = eINSTANCE.getSrcMetamodel_Name();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SRC_METAMODEL__IMPORT_URI = eINSTANCE.getSrcMetamodel_ImportURI();

    /**
     * The meta object literal for the '{@link org.xtext.project.tdsl.transfoDsl.impl.SrcModelImpl <em>Src Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.project.tdsl.transfoDsl.impl.SrcModelImpl
     * @see org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl#getSrcModel()
     * @generated
     */
    EClass SRC_MODEL = eINSTANCE.getSrcModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SRC_MODEL__NAME = eINSTANCE.getSrcModel_Name();

    /**
     * The meta object literal for the '<em><b>Sourcemetamodel</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SRC_MODEL__SOURCEMETAMODEL = eINSTANCE.getSrcModel_Sourcemetamodel();

    /**
     * The meta object literal for the '{@link org.xtext.project.tdsl.transfoDsl.impl.LayerImpl <em>Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.project.tdsl.transfoDsl.impl.LayerImpl
     * @see org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl#getLayer()
     * @generated
     */
    EClass LAYER = eINSTANCE.getLayer();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYER__NAME = eINSTANCE.getLayer_Name();

    /**
     * The meta object literal for the '{@link org.xtext.project.tdsl.transfoDsl.impl.TrgMetaModelImpl <em>Trg Meta Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.project.tdsl.transfoDsl.impl.TrgMetaModelImpl
     * @see org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl#getTrgMetaModel()
     * @generated
     */
    EClass TRG_META_MODEL = eINSTANCE.getTrgMetaModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRG_META_MODEL__NAME = eINSTANCE.getTrgMetaModel_Name();

    /**
     * The meta object literal for the '<em><b>Filepath</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRG_META_MODEL__FILEPATH = eINSTANCE.getTrgMetaModel_Filepath();

  }

} //TransfoDslPackage
