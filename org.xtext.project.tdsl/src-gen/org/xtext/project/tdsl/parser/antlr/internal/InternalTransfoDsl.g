/*
 * generated by Xtext
 */
grammar InternalTransfoDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.project.tdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.project.tdsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.project.tdsl.services.TransfoDslGrammarAccess;

}

@parser::members {

 	private TransfoDslGrammarAccess grammarAccess;
 	
    public InternalTransfoDslParser(TokenStream input, TransfoDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Transformation";	
   	}
   	
   	@Override
   	protected TransfoDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleTransformation
entryRuleTransformation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransformationRule()); }
	 iv_ruleTransformation=ruleTransformation 
	 { $current=$iv_ruleTransformation.current; } 
	 EOF 
;

// Rule Transformation
ruleTransformation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='transformation' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTransformationAccess().getTransformationKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransformationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTransformationAccess().getSrcModelSrcModelParserRuleCall_3_0()); 
	    }
		lv_srcModel_3_0=ruleSrcModel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransformationRule());
	        }
       		add(
       			$current, 
       			"srcModel",
        		lv_srcModel_3_0, 
        		"SrcModel");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_4_0()); 
	    }
		lv_layer_4_0=ruleLayer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransformationRule());
	        }
       		add(
       			$current, 
       			"layer",
        		lv_layer_4_0, 
        		"Layer");
	        afterParserOrEnumRuleCall();
	    }

)
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getTransformationAccess().getTargetModelTrgModelParserRuleCall_5_0()); 
	    }
		lv_targetModel_5_0=ruleTrgModel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransformationRule());
	        }
       		add(
       			$current, 
       			"targetModel",
        		lv_targetModel_5_0, 
        		"TrgModel");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleTrgModel
entryRuleTrgModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTrgModelRule()); }
	 iv_ruleTrgModel=ruleTrgModel 
	 { $current=$iv_ruleTrgModel.current; } 
	 EOF 
;

// Rule TrgModel
ruleTrgModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='OUT' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTrgModelAccess().getOUTKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTrgModelAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTrgModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_filepath_2_0=RULE_STRING
		{
			newLeafNode(lv_filepath_2_0, grammarAccess.getTrgModelAccess().getFilepathSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTrgModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"filepath",
        		lv_filepath_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleSrcModel
entryRuleSrcModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSrcModelRule()); }
	 iv_ruleSrcModel=ruleSrcModel 
	 { $current=$iv_ruleSrcModel.current; } 
	 EOF 
;

// Rule SrcModel
ruleSrcModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='IN' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSrcModelAccess().getINKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSrcModelAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSrcModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_importURI_2_0=RULE_STRING
		{
			newLeafNode(lv_importURI_2_0, grammarAccess.getSrcModelAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSrcModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"importURI",
        		lv_importURI_2_0, 
        		"STRING");
	    }

)
)(	otherlv_3='import' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSrcModelAccess().getImportKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSrcModelRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getSrcModelAccess().getSorcemetamodelSrcMetamodelCrossReference_3_1_0()); 
	}

)
)))
;









// Entry rule entryRuleLayer
entryRuleLayer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLayerRule()); }
	 iv_ruleLayer=ruleLayer 
	 { $current=$iv_ruleLayer.current; } 
	 EOF 
;

// Rule Layer
ruleLayer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='apply' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getApplyKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLayerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


