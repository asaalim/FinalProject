/*
 * generated by Xtext
 */
package org.xtext.project.tdsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.project.tdsl.services.TransfoDslGrammarAccess;
import org.xtext.project.tdsl.transfoDsl.Layer;
import org.xtext.project.tdsl.transfoDsl.SrcMetamodel;
import org.xtext.project.tdsl.transfoDsl.SrcModel;
import org.xtext.project.tdsl.transfoDsl.TransfoDslPackage;
import org.xtext.project.tdsl.transfoDsl.Transformation;
import org.xtext.project.tdsl.transfoDsl.TrgMetamodel;

@SuppressWarnings("all")
public class TransfoDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TransfoDslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TransfoDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TransfoDslPackage.LAYER:
				sequence_Layer(context, (Layer) semanticObject); 
				return; 
			case TransfoDslPackage.SRC_METAMODEL:
				sequence_SrcMetamodel(context, (SrcMetamodel) semanticObject); 
				return; 
			case TransfoDslPackage.SRC_MODEL:
				sequence_SrcModel(context, (SrcModel) semanticObject); 
				return; 
			case TransfoDslPackage.TRANSFORMATION:
				sequence_Transformation(context, (Transformation) semanticObject); 
				return; 
			case TransfoDslPackage.TRG_METAMODEL:
				sequence_TrgMetamodel(context, (TrgMetamodel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Layer(EObject context, Layer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransfoDslPackage.Literals.LAYER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransfoDslPackage.Literals.LAYER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID importURI=STRING)
	 */
	protected void sequence_SrcMetamodel(EObject context, SrcMetamodel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransfoDslPackage.Literals.SRC_METAMODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransfoDslPackage.Literals.SRC_METAMODEL__NAME));
			if(transientValues.isValueTransient(semanticObject, TransfoDslPackage.Literals.SRC_METAMODEL__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransfoDslPackage.Literals.SRC_METAMODEL__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSrcMetamodelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSrcMetamodelAccess().getImportURISTRINGTerminalRuleCall_2_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID sourcemetamodel=[SrcMetamodel|ID])
	 */
	protected void sequence_SrcModel(EObject context, SrcModel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransfoDslPackage.Literals.SRC_MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransfoDslPackage.Literals.SRC_MODEL__NAME));
			if(transientValues.isValueTransient(semanticObject, TransfoDslPackage.Literals.SRC_MODEL__SOURCEMETAMODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransfoDslPackage.Literals.SRC_MODEL__SOURCEMETAMODEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSrcModelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSrcModelAccess().getSourcemetamodelSrcMetamodelIDTerminalRuleCall_2_1_0_1(), semanticObject.getSourcemetamodel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID srcmetamodel=SrcMetamodel srcmodel=SrcModel layer+=Layer+ targetmetamodel=TrgMetamodel)
	 */
	protected void sequence_Transformation(EObject context, Transformation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID nsuri=STRING)
	 */
	protected void sequence_TrgMetamodel(EObject context, TrgMetamodel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransfoDslPackage.Literals.TRG_METAMODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransfoDslPackage.Literals.TRG_METAMODEL__NAME));
			if(transientValues.isValueTransient(semanticObject, TransfoDslPackage.Literals.TRG_METAMODEL__NSURI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransfoDslPackage.Literals.TRG_METAMODEL__NSURI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTrgMetamodelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTrgMetamodelAccess().getNsuriSTRINGTerminalRuleCall_2_0(), semanticObject.getNsuri());
		feeder.finish();
	}
}
