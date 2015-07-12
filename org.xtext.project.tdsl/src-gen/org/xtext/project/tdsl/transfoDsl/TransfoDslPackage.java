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
   * The feature id for the '<em><b>Src Model</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__SRC_MODEL = 1;

  /**
   * The feature id for the '<em><b>Layer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__LAYER = 2;

  /**
   * The feature id for the '<em><b>Target Model</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__TARGET_MODEL = 3;

  /**
   * The number of structural features of the '<em>Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.project.tdsl.transfoDsl.impl.TrgModelImpl <em>Trg Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.project.tdsl.transfoDsl.impl.TrgModelImpl
   * @see org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl#getTrgModel()
   * @generated
   */
  int TRG_MODEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRG_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Filepath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRG_MODEL__FILEPATH = 1;

  /**
   * The number of structural features of the '<em>Trg Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRG_MODEL_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SRC_MODEL__IMPORT_URI = 1;

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
   * The feature id for the '<em><b>Type</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_FEATURE_COUNT = 2;


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
   * Returns the meta object for the containment reference list '{@link org.xtext.project.tdsl.transfoDsl.Transformation#getSrcModel <em>Src Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Src Model</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.Transformation#getSrcModel()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_SrcModel();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.project.tdsl.transfoDsl.Transformation#getTargetModel <em>Target Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Target Model</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.Transformation#getTargetModel()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_TargetModel();

  /**
   * Returns the meta object for class '{@link org.xtext.project.tdsl.transfoDsl.TrgModel <em>Trg Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trg Model</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.TrgModel
   * @generated
   */
  EClass getTrgModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.project.tdsl.transfoDsl.TrgModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.TrgModel#getName()
   * @see #getTrgModel()
   * @generated
   */
  EAttribute getTrgModel_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.project.tdsl.transfoDsl.TrgModel#getFilepath <em>Filepath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filepath</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.TrgModel#getFilepath()
   * @see #getTrgModel()
   * @generated
   */
  EAttribute getTrgModel_Filepath();

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
   * Returns the meta object for the attribute '{@link org.xtext.project.tdsl.transfoDsl.SrcModel#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.SrcModel#getImportURI()
   * @see #getSrcModel()
   * @generated
   */
  EAttribute getSrcModel_ImportURI();

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
   * Returns the meta object for the attribute list '{@link org.xtext.project.tdsl.transfoDsl.Layer#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type</em>'.
   * @see org.xtext.project.tdsl.transfoDsl.Layer#getType()
   * @see #getLayer()
   * @generated
   */
  EAttribute getLayer_Type();

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
     * The meta object literal for the '<em><b>Src Model</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__SRC_MODEL = eINSTANCE.getTransformation_SrcModel();

    /**
     * The meta object literal for the '<em><b>Layer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__LAYER = eINSTANCE.getTransformation_Layer();

    /**
     * The meta object literal for the '<em><b>Target Model</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__TARGET_MODEL = eINSTANCE.getTransformation_TargetModel();

    /**
     * The meta object literal for the '{@link org.xtext.project.tdsl.transfoDsl.impl.TrgModelImpl <em>Trg Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.project.tdsl.transfoDsl.impl.TrgModelImpl
     * @see org.xtext.project.tdsl.transfoDsl.impl.TransfoDslPackageImpl#getTrgModel()
     * @generated
     */
    EClass TRG_MODEL = eINSTANCE.getTrgModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRG_MODEL__NAME = eINSTANCE.getTrgModel_Name();

    /**
     * The meta object literal for the '<em><b>Filepath</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRG_MODEL__FILEPATH = eINSTANCE.getTrgModel_Filepath();

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
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SRC_MODEL__IMPORT_URI = eINSTANCE.getSrcModel_ImportURI();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYER__TYPE = eINSTANCE.getLayer_Type();

  }

} //TransfoDslPackage
