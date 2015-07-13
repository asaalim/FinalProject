/*
 * generated by Xtext
 */
package org.xtext.project.tdsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.project.tdsl.services.TransfoDslGrammarAccess;

public class TransfoDslParser extends AbstractContentAssistParser {
	
	@Inject
	private TransfoDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.project.tdsl.ui.contentassist.antlr.internal.InternalTransfoDslParser createParser() {
		org.xtext.project.tdsl.ui.contentassist.antlr.internal.InternalTransfoDslParser result = new org.xtext.project.tdsl.ui.contentassist.antlr.internal.InternalTransfoDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTransformationAccess().getGroup(), "rule__Transformation__Group__0");
					put(grammarAccess.getTrgModelAccess().getGroup(), "rule__TrgModel__Group__0");
					put(grammarAccess.getSrcModelAccess().getGroup(), "rule__SrcModel__Group__0");
					put(grammarAccess.getSrcModelAccess().getGroup_3(), "rule__SrcModel__Group_3__0");
					put(grammarAccess.getSrcMetamodelAccess().getGroup(), "rule__SrcMetamodel__Group__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getLayerAccess().getGroup(), "rule__Layer__Group__0");
					put(grammarAccess.getTransformationAccess().getNameAssignment_1(), "rule__Transformation__NameAssignment_1");
					put(grammarAccess.getTransformationAccess().getSrcModelAssignment_3(), "rule__Transformation__SrcModelAssignment_3");
					put(grammarAccess.getTransformationAccess().getLayerAssignment_4(), "rule__Transformation__LayerAssignment_4");
					put(grammarAccess.getTransformationAccess().getTargetModelAssignment_5(), "rule__Transformation__TargetModelAssignment_5");
					put(grammarAccess.getTrgModelAccess().getNameAssignment_1(), "rule__TrgModel__NameAssignment_1");
					put(grammarAccess.getTrgModelAccess().getFilepathAssignment_2(), "rule__TrgModel__FilepathAssignment_2");
					put(grammarAccess.getSrcModelAccess().getNameAssignment_1(), "rule__SrcModel__NameAssignment_1");
					put(grammarAccess.getSrcModelAccess().getImportURIAssignment_2(), "rule__SrcModel__ImportURIAssignment_2");
					put(grammarAccess.getSrcModelAccess().getSorcemetamodelAssignment_3_1(), "rule__SrcModel__SorcemetamodelAssignment_3_1");
					put(grammarAccess.getSrcMetamodelAccess().getPackageAssignment_1(), "rule__SrcMetamodel__PackageAssignment_1");
					put(grammarAccess.getPackageAccess().getNameAssignment_0(), "rule__Package__NameAssignment_0");
					put(grammarAccess.getPackageAccess().getImportURIAssignment_1(), "rule__Package__ImportURIAssignment_1");
					put(grammarAccess.getLayerAccess().getNameAssignment_1(), "rule__Layer__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.project.tdsl.ui.contentassist.antlr.internal.InternalTransfoDslParser typedParser = (org.xtext.project.tdsl.ui.contentassist.antlr.internal.InternalTransfoDslParser) parser;
			typedParser.entryRuleTransformation();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public TransfoDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TransfoDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
