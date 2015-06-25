/*
 * generated by Xtext
 */
package org.xtext.project.tdsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class TransfoDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class TransformationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Transformation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransformationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cSourceModelKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cImportURIAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cImportURISTRINGTerminalRuleCall_5_0 = (RuleCall)cImportURIAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cTargetModelKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cEqualsSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cFileNameAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cFileNameSTRINGTerminalRuleCall_9_0 = (RuleCall)cFileNameAssignment_9.eContents().get(0);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cLayerAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cLayerLayerParserRuleCall_11_0 = (RuleCall)cLayerAssignment_11.eContents().get(0);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//Transformation:
		//	"transformation" name=ID "{" "sourceModel" "=" importURI=STRING ";" "targetModel" "=" fileName=STRING ";" layer+=Layer
		//	";" "}";
		@Override public ParserRule getRule() { return rule; }

		//"transformation" name=ID "{" "sourceModel" "=" importURI=STRING ";" "targetModel" "=" fileName=STRING ";" layer+=Layer
		//";" "}"
		public Group getGroup() { return cGroup; }

		//"transformation"
		public Keyword getTransformationKeyword_0() { return cTransformationKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"sourceModel"
		public Keyword getSourceModelKeyword_3() { return cSourceModelKeyword_3; }

		//"="
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }

		//importURI=STRING
		public Assignment getImportURIAssignment_5() { return cImportURIAssignment_5; }

		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_5_0() { return cImportURISTRINGTerminalRuleCall_5_0; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }

		//"targetModel"
		public Keyword getTargetModelKeyword_7() { return cTargetModelKeyword_7; }

		//"="
		public Keyword getEqualsSignKeyword_8() { return cEqualsSignKeyword_8; }

		//fileName=STRING
		public Assignment getFileNameAssignment_9() { return cFileNameAssignment_9; }

		//STRING
		public RuleCall getFileNameSTRINGTerminalRuleCall_9_0() { return cFileNameSTRINGTerminalRuleCall_9_0; }

		//";"
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }

		//layer+=Layer
		public Assignment getLayerAssignment_11() { return cLayerAssignment_11; }

		//Layer
		public RuleCall getLayerLayerParserRuleCall_11_0() { return cLayerLayerParserRuleCall_11_0; }

		//";"
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
	}

	public class LayerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Layer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cApplyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		/// *Type:
		//  DataType | Entity;
		//DataType:
		//  "datatype" name=ID;
		//  
		//  Transformation:
		//  "transformation" name=ID "{"
		//    (layers+=Layer);  
		//    //source = sourcemodelref;
		//       
		//  "}";* / Layer:
		//	"apply" name=ID;
		@Override public ParserRule getRule() { return rule; }

		//"apply" name=ID
		public Group getGroup() { return cGroup; }

		//"apply"
		public Keyword getApplyKeyword_0() { return cApplyKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final TransformationElements pTransformation;
	private final LayerElements pLayer;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TransfoDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTransformation = new TransformationElements();
		this.pLayer = new LayerElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.project.tdsl.TransfoDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Transformation:
	//	"transformation" name=ID "{" "sourceModel" "=" importURI=STRING ";" "targetModel" "=" fileName=STRING ";" layer+=Layer
	//	";" "}";
	public TransformationElements getTransformationAccess() {
		return pTransformation;
	}
	
	public ParserRule getTransformationRule() {
		return getTransformationAccess().getRule();
	}

	/// *Type:
	//  DataType | Entity;
	//DataType:
	//  "datatype" name=ID;
	//  
	//  Transformation:
	//  "transformation" name=ID "{"
	//    (layers+=Layer);  
	//    //source = sourcemodelref;
	//       
	//  "}";* / Layer:
	//	"apply" name=ID;
	public LayerElements getLayerAccess() {
		return pLayer;
	}
	
	public ParserRule getLayerRule() {
		return getLayerAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
