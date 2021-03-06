/*
 * generated by Xtext
 */
package org.xtext.project.tdsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.project.tdsl.services.TransfoDslGrammarAccess;

public class TransfoDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private TransfoDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.project.tdsl.parser.antlr.internal.InternalTransfoDslParser createParser(XtextTokenStream stream) {
		return new org.xtext.project.tdsl.parser.antlr.internal.InternalTransfoDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Transformation";
	}
	
	public TransfoDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TransfoDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
