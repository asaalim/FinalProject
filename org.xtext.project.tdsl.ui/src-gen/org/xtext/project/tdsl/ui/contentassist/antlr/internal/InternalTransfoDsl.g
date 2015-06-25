/*
 * generated by Xtext
 */
grammar InternalTransfoDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.project.tdsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.project.tdsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.project.tdsl.services.TransfoDslGrammarAccess;

}

@parser::members {
 
 	private TransfoDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(TransfoDslGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleTransformation
entryRuleTransformation 
:
{ before(grammarAccess.getTransformationRule()); }
	 ruleTransformation
{ after(grammarAccess.getTransformationRule()); } 
	 EOF 
;

// Rule Transformation
ruleTransformation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTransformationAccess().getGroup()); }
(rule__Transformation__Group__0)
{ after(grammarAccess.getTransformationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLayer
entryRuleLayer 
:
{ before(grammarAccess.getLayerRule()); }
	 ruleLayer
{ after(grammarAccess.getLayerRule()); } 
	 EOF 
;

// Rule Layer
ruleLayer
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLayerAccess().getGroup()); }
(rule__Layer__Group__0)
{ after(grammarAccess.getLayerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Transformation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__0__Impl
	rule__Transformation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); }

	'transformation' 

{ after(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__1__Impl
	rule__Transformation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getNameAssignment_1()); }
(rule__Transformation__NameAssignment_1)
{ after(grammarAccess.getTransformationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__2__Impl
	rule__Transformation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__3__Impl
	rule__Transformation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getSourceModelKeyword_3()); }

	'sourceModel' 

{ after(grammarAccess.getTransformationAccess().getSourceModelKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__4__Impl
	rule__Transformation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getEqualsSignKeyword_4()); }

	'=' 

{ after(grammarAccess.getTransformationAccess().getEqualsSignKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__5__Impl
	rule__Transformation__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getImportURIAssignment_5()); }
(rule__Transformation__ImportURIAssignment_5)
{ after(grammarAccess.getTransformationAccess().getImportURIAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__6__Impl
	rule__Transformation__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getTransformationAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__7__Impl
	rule__Transformation__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getTargetModelKeyword_7()); }

	'targetModel' 

{ after(grammarAccess.getTransformationAccess().getTargetModelKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__8__Impl
	rule__Transformation__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getEqualsSignKeyword_8()); }

	'=' 

{ after(grammarAccess.getTransformationAccess().getEqualsSignKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__9__Impl
	rule__Transformation__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getFileNameAssignment_9()); }
(rule__Transformation__FileNameAssignment_9)
{ after(grammarAccess.getTransformationAccess().getFileNameAssignment_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__10__Impl
	rule__Transformation__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getSemicolonKeyword_10()); }

	';' 

{ after(grammarAccess.getTransformationAccess().getSemicolonKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__11__Impl
	rule__Transformation__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getLayerAssignment_11()); }
(rule__Transformation__LayerAssignment_11)
{ after(grammarAccess.getTransformationAccess().getLayerAssignment_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__12__Impl
	rule__Transformation__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getSemicolonKeyword_12()); }

	';' 

{ after(grammarAccess.getTransformationAccess().getSemicolonKeyword_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transformation__Group__13
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transformation__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__Group__13__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_13()); }

	'}' 

{ after(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_13()); }
)

;
finally {
	restoreStackSize(stackSize);
}






























rule__Layer__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Layer__Group__0__Impl
	rule__Layer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLayerAccess().getApplyKeyword_0()); }

	'apply' 

{ after(grammarAccess.getLayerAccess().getApplyKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Layer__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Layer__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLayerAccess().getNameAssignment_1()); }
(rule__Layer__NameAssignment_1)
{ after(grammarAccess.getLayerAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Transformation__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__ImportURIAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getImportURISTRINGTerminalRuleCall_5_0()); }
	RULE_STRING{ after(grammarAccess.getTransformationAccess().getImportURISTRINGTerminalRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__FileNameAssignment_9
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getFileNameSTRINGTerminalRuleCall_9_0()); }
	RULE_STRING{ after(grammarAccess.getTransformationAccess().getFileNameSTRINGTerminalRuleCall_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Transformation__LayerAssignment_11
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_11_0()); }
	ruleLayer{ after(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_11_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


