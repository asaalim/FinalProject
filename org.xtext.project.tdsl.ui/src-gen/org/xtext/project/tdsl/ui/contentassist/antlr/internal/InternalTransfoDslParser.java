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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTransfoDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Rename class'", "'Delete class'", "'transformation'", "'{'", "'}'", "'Generate'", "'Import'", "'apply'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTransfoDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTransfoDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTransfoDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g"; }


     
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




    // $ANTLR start "entryRuleTransformation"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:60:1: entryRuleTransformation : ruleTransformation EOF ;
    public final void entryRuleTransformation() throws RecognitionException {
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:61:1: ( ruleTransformation EOF )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:62:1: ruleTransformation EOF
            {
             before(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_ruleTransformation_in_entryRuleTransformation61);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransformation68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:69:1: ruleTransformation : ( ( rule__Transformation__Group__0 ) ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:73:2: ( ( ( rule__Transformation__Group__0 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:74:1: ( ( rule__Transformation__Group__0 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:74:1: ( ( rule__Transformation__Group__0 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:75:1: ( rule__Transformation__Group__0 )
            {
             before(grammarAccess.getTransformationAccess().getGroup()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:76:1: ( rule__Transformation__Group__0 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:76:2: rule__Transformation__Group__0
            {
            pushFollow(FOLLOW_rule__Transformation__Group__0_in_ruleTransformation94);
            rule__Transformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleTrgModel"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:88:1: entryRuleTrgModel : ruleTrgModel EOF ;
    public final void entryRuleTrgModel() throws RecognitionException {
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:89:1: ( ruleTrgModel EOF )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:90:1: ruleTrgModel EOF
            {
             before(grammarAccess.getTrgModelRule()); 
            pushFollow(FOLLOW_ruleTrgModel_in_entryRuleTrgModel121);
            ruleTrgModel();

            state._fsp--;

             after(grammarAccess.getTrgModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrgModel128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrgModel"


    // $ANTLR start "ruleTrgModel"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:97:1: ruleTrgModel : ( ( rule__TrgModel__Group__0 ) ) ;
    public final void ruleTrgModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:101:2: ( ( ( rule__TrgModel__Group__0 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:102:1: ( ( rule__TrgModel__Group__0 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:102:1: ( ( rule__TrgModel__Group__0 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:103:1: ( rule__TrgModel__Group__0 )
            {
             before(grammarAccess.getTrgModelAccess().getGroup()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:104:1: ( rule__TrgModel__Group__0 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:104:2: rule__TrgModel__Group__0
            {
            pushFollow(FOLLOW_rule__TrgModel__Group__0_in_ruleTrgModel154);
            rule__TrgModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrgModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrgModel"


    // $ANTLR start "entryRuleSrcModel"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:116:1: entryRuleSrcModel : ruleSrcModel EOF ;
    public final void entryRuleSrcModel() throws RecognitionException {
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:117:1: ( ruleSrcModel EOF )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:118:1: ruleSrcModel EOF
            {
             before(grammarAccess.getSrcModelRule()); 
            pushFollow(FOLLOW_ruleSrcModel_in_entryRuleSrcModel181);
            ruleSrcModel();

            state._fsp--;

             after(grammarAccess.getSrcModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSrcModel188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSrcModel"


    // $ANTLR start "ruleSrcModel"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:125:1: ruleSrcModel : ( ( rule__SrcModel__Group__0 ) ) ;
    public final void ruleSrcModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:129:2: ( ( ( rule__SrcModel__Group__0 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:130:1: ( ( rule__SrcModel__Group__0 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:130:1: ( ( rule__SrcModel__Group__0 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:131:1: ( rule__SrcModel__Group__0 )
            {
             before(grammarAccess.getSrcModelAccess().getGroup()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:132:1: ( rule__SrcModel__Group__0 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:132:2: rule__SrcModel__Group__0
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__0_in_ruleSrcModel214);
            rule__SrcModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSrcModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSrcModel"


    // $ANTLR start "entryRuleLayer"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:144:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:145:1: ( ruleLayer EOF )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:146:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_ruleLayer_in_entryRuleLayer241);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayer248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:153:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:157:2: ( ( ( rule__Layer__Group__0 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:158:1: ( ( rule__Layer__Group__0 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:158:1: ( ( rule__Layer__Group__0 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:159:1: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:160:1: ( rule__Layer__Group__0 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:160:2: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_rule__Layer__Group__0_in_ruleLayer274);
            rule__Layer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:172:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:173:1: ( ruleType EOF )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:174:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType301);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:181:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:185:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:186:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:186:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:187:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:188:1: ( rule__Type__Alternatives )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:188:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType334);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:200:1: rule__Type__Alternatives : ( ( 'Rename class' ) | ( 'Delete class' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:204:1: ( ( 'Rename class' ) | ( 'Delete class' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:205:1: ( 'Rename class' )
                    {
                    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:205:1: ( 'Rename class' )
                    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:206:1: 'Rename class'
                    {
                     before(grammarAccess.getTypeAccess().getRenameClassKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives371); 
                     after(grammarAccess.getTypeAccess().getRenameClassKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:213:6: ( 'Delete class' )
                    {
                    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:213:6: ( 'Delete class' )
                    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:214:1: 'Delete class'
                    {
                     before(grammarAccess.getTypeAccess().getDeleteClassKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives391); 
                     after(grammarAccess.getTypeAccess().getDeleteClassKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Transformation__Group__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:228:1: rule__Transformation__Group__0 : rule__Transformation__Group__0__Impl rule__Transformation__Group__1 ;
    public final void rule__Transformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:232:1: ( rule__Transformation__Group__0__Impl rule__Transformation__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:233:2: rule__Transformation__Group__0__Impl rule__Transformation__Group__1
            {
            pushFollow(FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__0423);
            rule__Transformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__0426);
            rule__Transformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__0"


    // $ANTLR start "rule__Transformation__Group__0__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:240:1: rule__Transformation__Group__0__Impl : ( 'transformation' ) ;
    public final void rule__Transformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:244:1: ( ( 'transformation' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:245:1: ( 'transformation' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:245:1: ( 'transformation' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:246:1: 'transformation'
            {
             before(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Transformation__Group__0__Impl454); 
             after(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__0__Impl"


    // $ANTLR start "rule__Transformation__Group__1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:259:1: rule__Transformation__Group__1 : rule__Transformation__Group__1__Impl rule__Transformation__Group__2 ;
    public final void rule__Transformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:263:1: ( rule__Transformation__Group__1__Impl rule__Transformation__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:264:2: rule__Transformation__Group__1__Impl rule__Transformation__Group__2
            {
            pushFollow(FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__1485);
            rule__Transformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__1488);
            rule__Transformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__1"


    // $ANTLR start "rule__Transformation__Group__1__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:271:1: rule__Transformation__Group__1__Impl : ( ( rule__Transformation__NameAssignment_1 ) ) ;
    public final void rule__Transformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:275:1: ( ( ( rule__Transformation__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:276:1: ( ( rule__Transformation__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:276:1: ( ( rule__Transformation__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:277:1: ( rule__Transformation__NameAssignment_1 )
            {
             before(grammarAccess.getTransformationAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:278:1: ( rule__Transformation__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:278:2: rule__Transformation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Transformation__NameAssignment_1_in_rule__Transformation__Group__1__Impl515);
            rule__Transformation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__1__Impl"


    // $ANTLR start "rule__Transformation__Group__2"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:288:1: rule__Transformation__Group__2 : rule__Transformation__Group__2__Impl rule__Transformation__Group__3 ;
    public final void rule__Transformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:292:1: ( rule__Transformation__Group__2__Impl rule__Transformation__Group__3 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:293:2: rule__Transformation__Group__2__Impl rule__Transformation__Group__3
            {
            pushFollow(FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__2545);
            rule__Transformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__2548);
            rule__Transformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__2"


    // $ANTLR start "rule__Transformation__Group__2__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:300:1: rule__Transformation__Group__2__Impl : ( '{' ) ;
    public final void rule__Transformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:304:1: ( ( '{' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:305:1: ( '{' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:305:1: ( '{' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:306:1: '{'
            {
             before(grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Transformation__Group__2__Impl576); 
             after(grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__2__Impl"


    // $ANTLR start "rule__Transformation__Group__3"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:319:1: rule__Transformation__Group__3 : rule__Transformation__Group__3__Impl rule__Transformation__Group__4 ;
    public final void rule__Transformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:323:1: ( rule__Transformation__Group__3__Impl rule__Transformation__Group__4 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:324:2: rule__Transformation__Group__3__Impl rule__Transformation__Group__4
            {
            pushFollow(FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__3607);
            rule__Transformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__3610);
            rule__Transformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__3"


    // $ANTLR start "rule__Transformation__Group__3__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:331:1: rule__Transformation__Group__3__Impl : ( ( rule__Transformation__SrcModelAssignment_3 ) ) ;
    public final void rule__Transformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:335:1: ( ( ( rule__Transformation__SrcModelAssignment_3 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:336:1: ( ( rule__Transformation__SrcModelAssignment_3 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:336:1: ( ( rule__Transformation__SrcModelAssignment_3 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:337:1: ( rule__Transformation__SrcModelAssignment_3 )
            {
             before(grammarAccess.getTransformationAccess().getSrcModelAssignment_3()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:338:1: ( rule__Transformation__SrcModelAssignment_3 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:338:2: rule__Transformation__SrcModelAssignment_3
            {
            pushFollow(FOLLOW_rule__Transformation__SrcModelAssignment_3_in_rule__Transformation__Group__3__Impl637);
            rule__Transformation__SrcModelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getSrcModelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__3__Impl"


    // $ANTLR start "rule__Transformation__Group__4"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:348:1: rule__Transformation__Group__4 : rule__Transformation__Group__4__Impl rule__Transformation__Group__5 ;
    public final void rule__Transformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:352:1: ( rule__Transformation__Group__4__Impl rule__Transformation__Group__5 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:353:2: rule__Transformation__Group__4__Impl rule__Transformation__Group__5
            {
            pushFollow(FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__4667);
            rule__Transformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__5_in_rule__Transformation__Group__4670);
            rule__Transformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__4"


    // $ANTLR start "rule__Transformation__Group__4__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:360:1: rule__Transformation__Group__4__Impl : ( ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* ) ) ;
    public final void rule__Transformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:364:1: ( ( ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:365:1: ( ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:365:1: ( ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:366:1: ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:366:1: ( ( rule__Transformation__LayerAssignment_4 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:367:1: ( rule__Transformation__LayerAssignment_4 )
            {
             before(grammarAccess.getTransformationAccess().getLayerAssignment_4()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:368:1: ( rule__Transformation__LayerAssignment_4 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:368:2: rule__Transformation__LayerAssignment_4
            {
            pushFollow(FOLLOW_rule__Transformation__LayerAssignment_4_in_rule__Transformation__Group__4__Impl699);
            rule__Transformation__LayerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getLayerAssignment_4()); 

            }

            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:371:1: ( ( rule__Transformation__LayerAssignment_4 )* )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:372:1: ( rule__Transformation__LayerAssignment_4 )*
            {
             before(grammarAccess.getTransformationAccess().getLayerAssignment_4()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:373:1: ( rule__Transformation__LayerAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:373:2: rule__Transformation__LayerAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Transformation__LayerAssignment_4_in_rule__Transformation__Group__4__Impl711);
            	    rule__Transformation__LayerAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTransformationAccess().getLayerAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__4__Impl"


    // $ANTLR start "rule__Transformation__Group__5"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:384:1: rule__Transformation__Group__5 : rule__Transformation__Group__5__Impl rule__Transformation__Group__6 ;
    public final void rule__Transformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:388:1: ( rule__Transformation__Group__5__Impl rule__Transformation__Group__6 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:389:2: rule__Transformation__Group__5__Impl rule__Transformation__Group__6
            {
            pushFollow(FOLLOW_rule__Transformation__Group__5__Impl_in_rule__Transformation__Group__5744);
            rule__Transformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__6_in_rule__Transformation__Group__5747);
            rule__Transformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__5"


    // $ANTLR start "rule__Transformation__Group__5__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:396:1: rule__Transformation__Group__5__Impl : ( ( rule__Transformation__TargetModelAssignment_5 ) ) ;
    public final void rule__Transformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:400:1: ( ( ( rule__Transformation__TargetModelAssignment_5 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:401:1: ( ( rule__Transformation__TargetModelAssignment_5 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:401:1: ( ( rule__Transformation__TargetModelAssignment_5 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:402:1: ( rule__Transformation__TargetModelAssignment_5 )
            {
             before(grammarAccess.getTransformationAccess().getTargetModelAssignment_5()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:403:1: ( rule__Transformation__TargetModelAssignment_5 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:403:2: rule__Transformation__TargetModelAssignment_5
            {
            pushFollow(FOLLOW_rule__Transformation__TargetModelAssignment_5_in_rule__Transformation__Group__5__Impl774);
            rule__Transformation__TargetModelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getTargetModelAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__5__Impl"


    // $ANTLR start "rule__Transformation__Group__6"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:413:1: rule__Transformation__Group__6 : rule__Transformation__Group__6__Impl ;
    public final void rule__Transformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:417:1: ( rule__Transformation__Group__6__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:418:2: rule__Transformation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Transformation__Group__6__Impl_in_rule__Transformation__Group__6804);
            rule__Transformation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__6"


    // $ANTLR start "rule__Transformation__Group__6__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:424:1: rule__Transformation__Group__6__Impl : ( '}' ) ;
    public final void rule__Transformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:428:1: ( ( '}' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:429:1: ( '}' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:429:1: ( '}' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:430:1: '}'
            {
             before(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Transformation__Group__6__Impl832); 
             after(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__6__Impl"


    // $ANTLR start "rule__TrgModel__Group__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:457:1: rule__TrgModel__Group__0 : rule__TrgModel__Group__0__Impl rule__TrgModel__Group__1 ;
    public final void rule__TrgModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:461:1: ( rule__TrgModel__Group__0__Impl rule__TrgModel__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:462:2: rule__TrgModel__Group__0__Impl rule__TrgModel__Group__1
            {
            pushFollow(FOLLOW_rule__TrgModel__Group__0__Impl_in_rule__TrgModel__Group__0877);
            rule__TrgModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrgModel__Group__1_in_rule__TrgModel__Group__0880);
            rule__TrgModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrgModel__Group__0"


    // $ANTLR start "rule__TrgModel__Group__0__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:469:1: rule__TrgModel__Group__0__Impl : ( 'Generate' ) ;
    public final void rule__TrgModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:473:1: ( ( 'Generate' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:474:1: ( 'Generate' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:474:1: ( 'Generate' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:475:1: 'Generate'
            {
             before(grammarAccess.getTrgModelAccess().getGenerateKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__TrgModel__Group__0__Impl908); 
             after(grammarAccess.getTrgModelAccess().getGenerateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrgModel__Group__0__Impl"


    // $ANTLR start "rule__TrgModel__Group__1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:488:1: rule__TrgModel__Group__1 : rule__TrgModel__Group__1__Impl rule__TrgModel__Group__2 ;
    public final void rule__TrgModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:492:1: ( rule__TrgModel__Group__1__Impl rule__TrgModel__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:493:2: rule__TrgModel__Group__1__Impl rule__TrgModel__Group__2
            {
            pushFollow(FOLLOW_rule__TrgModel__Group__1__Impl_in_rule__TrgModel__Group__1939);
            rule__TrgModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrgModel__Group__2_in_rule__TrgModel__Group__1942);
            rule__TrgModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrgModel__Group__1"


    // $ANTLR start "rule__TrgModel__Group__1__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:500:1: rule__TrgModel__Group__1__Impl : ( ( rule__TrgModel__NameAssignment_1 ) ) ;
    public final void rule__TrgModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:504:1: ( ( ( rule__TrgModel__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:505:1: ( ( rule__TrgModel__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:505:1: ( ( rule__TrgModel__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:506:1: ( rule__TrgModel__NameAssignment_1 )
            {
             before(grammarAccess.getTrgModelAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:507:1: ( rule__TrgModel__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:507:2: rule__TrgModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TrgModel__NameAssignment_1_in_rule__TrgModel__Group__1__Impl969);
            rule__TrgModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrgModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrgModel__Group__1__Impl"


    // $ANTLR start "rule__TrgModel__Group__2"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:517:1: rule__TrgModel__Group__2 : rule__TrgModel__Group__2__Impl ;
    public final void rule__TrgModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:521:1: ( rule__TrgModel__Group__2__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:522:2: rule__TrgModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TrgModel__Group__2__Impl_in_rule__TrgModel__Group__2999);
            rule__TrgModel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrgModel__Group__2"


    // $ANTLR start "rule__TrgModel__Group__2__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:528:1: rule__TrgModel__Group__2__Impl : ( ( rule__TrgModel__FilepathAssignment_2 ) ) ;
    public final void rule__TrgModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:532:1: ( ( ( rule__TrgModel__FilepathAssignment_2 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:533:1: ( ( rule__TrgModel__FilepathAssignment_2 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:533:1: ( ( rule__TrgModel__FilepathAssignment_2 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:534:1: ( rule__TrgModel__FilepathAssignment_2 )
            {
             before(grammarAccess.getTrgModelAccess().getFilepathAssignment_2()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:535:1: ( rule__TrgModel__FilepathAssignment_2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:535:2: rule__TrgModel__FilepathAssignment_2
            {
            pushFollow(FOLLOW_rule__TrgModel__FilepathAssignment_2_in_rule__TrgModel__Group__2__Impl1026);
            rule__TrgModel__FilepathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrgModelAccess().getFilepathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrgModel__Group__2__Impl"


    // $ANTLR start "rule__SrcModel__Group__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:551:1: rule__SrcModel__Group__0 : rule__SrcModel__Group__0__Impl rule__SrcModel__Group__1 ;
    public final void rule__SrcModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:555:1: ( rule__SrcModel__Group__0__Impl rule__SrcModel__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:556:2: rule__SrcModel__Group__0__Impl rule__SrcModel__Group__1
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__0__Impl_in_rule__SrcModel__Group__01062);
            rule__SrcModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group__1_in_rule__SrcModel__Group__01065);
            rule__SrcModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SrcModel__Group__0"


    // $ANTLR start "rule__SrcModel__Group__0__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:563:1: rule__SrcModel__Group__0__Impl : ( 'Import' ) ;
    public final void rule__SrcModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:567:1: ( ( 'Import' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:568:1: ( 'Import' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:568:1: ( 'Import' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:569:1: 'Import'
            {
             before(grammarAccess.getSrcModelAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__SrcModel__Group__0__Impl1093); 
             after(grammarAccess.getSrcModelAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SrcModel__Group__0__Impl"


    // $ANTLR start "rule__SrcModel__Group__1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:582:1: rule__SrcModel__Group__1 : rule__SrcModel__Group__1__Impl rule__SrcModel__Group__2 ;
    public final void rule__SrcModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:586:1: ( rule__SrcModel__Group__1__Impl rule__SrcModel__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:587:2: rule__SrcModel__Group__1__Impl rule__SrcModel__Group__2
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__1__Impl_in_rule__SrcModel__Group__11124);
            rule__SrcModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group__2_in_rule__SrcModel__Group__11127);
            rule__SrcModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SrcModel__Group__1"


    // $ANTLR start "rule__SrcModel__Group__1__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:594:1: rule__SrcModel__Group__1__Impl : ( ( rule__SrcModel__NameAssignment_1 ) ) ;
    public final void rule__SrcModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:598:1: ( ( ( rule__SrcModel__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:599:1: ( ( rule__SrcModel__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:599:1: ( ( rule__SrcModel__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:600:1: ( rule__SrcModel__NameAssignment_1 )
            {
             before(grammarAccess.getSrcModelAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:601:1: ( rule__SrcModel__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:601:2: rule__SrcModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SrcModel__NameAssignment_1_in_rule__SrcModel__Group__1__Impl1154);
            rule__SrcModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSrcModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SrcModel__Group__1__Impl"


    // $ANTLR start "rule__SrcModel__Group__2"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:611:1: rule__SrcModel__Group__2 : rule__SrcModel__Group__2__Impl ;
    public final void rule__SrcModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:615:1: ( rule__SrcModel__Group__2__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:616:2: rule__SrcModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__2__Impl_in_rule__SrcModel__Group__21184);
            rule__SrcModel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SrcModel__Group__2"


    // $ANTLR start "rule__SrcModel__Group__2__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:622:1: rule__SrcModel__Group__2__Impl : ( ( rule__SrcModel__ImportURIAssignment_2 ) ) ;
    public final void rule__SrcModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:626:1: ( ( ( rule__SrcModel__ImportURIAssignment_2 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:627:1: ( ( rule__SrcModel__ImportURIAssignment_2 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:627:1: ( ( rule__SrcModel__ImportURIAssignment_2 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:628:1: ( rule__SrcModel__ImportURIAssignment_2 )
            {
             before(grammarAccess.getSrcModelAccess().getImportURIAssignment_2()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:629:1: ( rule__SrcModel__ImportURIAssignment_2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:629:2: rule__SrcModel__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__SrcModel__ImportURIAssignment_2_in_rule__SrcModel__Group__2__Impl1211);
            rule__SrcModel__ImportURIAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSrcModelAccess().getImportURIAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SrcModel__Group__2__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:645:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:649:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:650:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_rule__Layer__Group__0__Impl_in_rule__Layer__Group__01247);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group__1_in_rule__Layer__Group__01250);
            rule__Layer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0"


    // $ANTLR start "rule__Layer__Group__0__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:657:1: rule__Layer__Group__0__Impl : ( 'apply' ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:661:1: ( ( 'apply' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:662:1: ( 'apply' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:662:1: ( 'apply' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:663:1: 'apply'
            {
             before(grammarAccess.getLayerAccess().getApplyKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Layer__Group__0__Impl1278); 
             after(grammarAccess.getLayerAccess().getApplyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0__Impl"


    // $ANTLR start "rule__Layer__Group__1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:676:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:680:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:681:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
            {
            pushFollow(FOLLOW_rule__Layer__Group__1__Impl_in_rule__Layer__Group__11309);
            rule__Layer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group__2_in_rule__Layer__Group__11312);
            rule__Layer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1"


    // $ANTLR start "rule__Layer__Group__1__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:688:1: rule__Layer__Group__1__Impl : ( ( rule__Layer__NameAssignment_1 ) ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:692:1: ( ( ( rule__Layer__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:693:1: ( ( rule__Layer__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:693:1: ( ( rule__Layer__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:694:1: ( rule__Layer__NameAssignment_1 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:695:1: ( rule__Layer__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:695:2: rule__Layer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Layer__NameAssignment_1_in_rule__Layer__Group__1__Impl1339);
            rule__Layer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1__Impl"


    // $ANTLR start "rule__Layer__Group__2"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:705:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:709:1: ( rule__Layer__Group__2__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:710:2: rule__Layer__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Layer__Group__2__Impl_in_rule__Layer__Group__21369);
            rule__Layer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2"


    // $ANTLR start "rule__Layer__Group__2__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:716:1: rule__Layer__Group__2__Impl : ( ( rule__Layer__TypeAssignment_2 ) ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:720:1: ( ( ( rule__Layer__TypeAssignment_2 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:721:1: ( ( rule__Layer__TypeAssignment_2 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:721:1: ( ( rule__Layer__TypeAssignment_2 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:722:1: ( rule__Layer__TypeAssignment_2 )
            {
             before(grammarAccess.getLayerAccess().getTypeAssignment_2()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:723:1: ( rule__Layer__TypeAssignment_2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:723:2: rule__Layer__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Layer__TypeAssignment_2_in_rule__Layer__Group__2__Impl1396);
            rule__Layer__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2__Impl"


    // $ANTLR start "rule__Transformation__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:740:1: rule__Transformation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:744:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:745:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:745:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:746:1: RULE_ID
            {
             before(grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transformation__NameAssignment_11437); 
             after(grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__NameAssignment_1"


    // $ANTLR start "rule__Transformation__SrcModelAssignment_3"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:755:1: rule__Transformation__SrcModelAssignment_3 : ( ruleSrcModel ) ;
    public final void rule__Transformation__SrcModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:759:1: ( ( ruleSrcModel ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:760:1: ( ruleSrcModel )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:760:1: ( ruleSrcModel )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:761:1: ruleSrcModel
            {
             before(grammarAccess.getTransformationAccess().getSrcModelSrcModelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSrcModel_in_rule__Transformation__SrcModelAssignment_31468);
            ruleSrcModel();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getSrcModelSrcModelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__SrcModelAssignment_3"


    // $ANTLR start "rule__Transformation__LayerAssignment_4"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:770:1: rule__Transformation__LayerAssignment_4 : ( ruleLayer ) ;
    public final void rule__Transformation__LayerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:774:1: ( ( ruleLayer ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:775:1: ( ruleLayer )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:775:1: ( ruleLayer )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:776:1: ruleLayer
            {
             before(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleLayer_in_rule__Transformation__LayerAssignment_41499);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__LayerAssignment_4"


    // $ANTLR start "rule__Transformation__TargetModelAssignment_5"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:785:1: rule__Transformation__TargetModelAssignment_5 : ( ruleTrgModel ) ;
    public final void rule__Transformation__TargetModelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:789:1: ( ( ruleTrgModel ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:790:1: ( ruleTrgModel )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:790:1: ( ruleTrgModel )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:791:1: ruleTrgModel
            {
             before(grammarAccess.getTransformationAccess().getTargetModelTrgModelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTrgModel_in_rule__Transformation__TargetModelAssignment_51530);
            ruleTrgModel();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getTargetModelTrgModelParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__TargetModelAssignment_5"


    // $ANTLR start "rule__TrgModel__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:800:1: rule__TrgModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TrgModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:804:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:805:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:805:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:806:1: RULE_ID
            {
             before(grammarAccess.getTrgModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TrgModel__NameAssignment_11561); 
             after(grammarAccess.getTrgModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrgModel__NameAssignment_1"


    // $ANTLR start "rule__TrgModel__FilepathAssignment_2"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:815:1: rule__TrgModel__FilepathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TrgModel__FilepathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:819:1: ( ( RULE_STRING ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:820:1: ( RULE_STRING )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:820:1: ( RULE_STRING )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:821:1: RULE_STRING
            {
             before(grammarAccess.getTrgModelAccess().getFilepathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TrgModel__FilepathAssignment_21592); 
             after(grammarAccess.getTrgModelAccess().getFilepathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrgModel__FilepathAssignment_2"


    // $ANTLR start "rule__SrcModel__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:830:1: rule__SrcModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SrcModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:834:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:835:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:835:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:836:1: RULE_ID
            {
             before(grammarAccess.getSrcModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SrcModel__NameAssignment_11623); 
             after(grammarAccess.getSrcModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SrcModel__NameAssignment_1"


    // $ANTLR start "rule__SrcModel__ImportURIAssignment_2"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:845:1: rule__SrcModel__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SrcModel__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:849:1: ( ( RULE_STRING ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:850:1: ( RULE_STRING )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:850:1: ( RULE_STRING )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:851:1: RULE_STRING
            {
             before(grammarAccess.getSrcModelAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SrcModel__ImportURIAssignment_21654); 
             after(grammarAccess.getSrcModelAccess().getImportURISTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SrcModel__ImportURIAssignment_2"


    // $ANTLR start "rule__Layer__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:860:1: rule__Layer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Layer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:864:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:865:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:865:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:866:1: RULE_ID
            {
             before(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Layer__NameAssignment_11685); 
             after(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__NameAssignment_1"


    // $ANTLR start "rule__Layer__TypeAssignment_2"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:875:1: rule__Layer__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Layer__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:879:1: ( ( ruleType ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:880:1: ( ruleType )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:880:1: ( ruleType )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:881:1: ruleType
            {
             before(grammarAccess.getLayerAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Layer__TypeAssignment_21716);
            ruleType();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__0_in_ruleTransformation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrgModel_in_entryRuleTrgModel121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrgModel128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__0_in_ruleTrgModel154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSrcModel_in_entryRuleSrcModel181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSrcModel188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__0_in_ruleSrcModel214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_entryRuleLayer241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayer248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__0_in_ruleLayer274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__0423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__0426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Transformation__Group__0__Impl454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__1485 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__NameAssignment_1_in_rule__Transformation__Group__1__Impl515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__2545 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Transformation__Group__2__Impl576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__3607 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__SrcModelAssignment_3_in_rule__Transformation__Group__3__Impl637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__4667 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__5_in_rule__Transformation__Group__4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__LayerAssignment_4_in_rule__Transformation__Group__4__Impl699 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Transformation__LayerAssignment_4_in_rule__Transformation__Group__4__Impl711 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__5__Impl_in_rule__Transformation__Group__5744 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__6_in_rule__Transformation__Group__5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__TargetModelAssignment_5_in_rule__Transformation__Group__5__Impl774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__6__Impl_in_rule__Transformation__Group__6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Transformation__Group__6__Impl832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__0__Impl_in_rule__TrgModel__Group__0877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__1_in_rule__TrgModel__Group__0880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TrgModel__Group__0__Impl908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__1__Impl_in_rule__TrgModel__Group__1939 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__2_in_rule__TrgModel__Group__1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__NameAssignment_1_in_rule__TrgModel__Group__1__Impl969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__2__Impl_in_rule__TrgModel__Group__2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__FilepathAssignment_2_in_rule__TrgModel__Group__2__Impl1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__0__Impl_in_rule__SrcModel__Group__01062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__1_in_rule__SrcModel__Group__01065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SrcModel__Group__0__Impl1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__1__Impl_in_rule__SrcModel__Group__11124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__2_in_rule__SrcModel__Group__11127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__NameAssignment_1_in_rule__SrcModel__Group__1__Impl1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__2__Impl_in_rule__SrcModel__Group__21184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__ImportURIAssignment_2_in_rule__SrcModel__Group__2__Impl1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__0__Impl_in_rule__Layer__Group__01247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Layer__Group__1_in_rule__Layer__Group__01250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Layer__Group__0__Impl1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__1__Impl_in_rule__Layer__Group__11309 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Layer__Group__2_in_rule__Layer__Group__11312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__NameAssignment_1_in_rule__Layer__Group__1__Impl1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__2__Impl_in_rule__Layer__Group__21369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__TypeAssignment_2_in_rule__Layer__Group__2__Impl1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transformation__NameAssignment_11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSrcModel_in_rule__Transformation__SrcModelAssignment_31468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_rule__Transformation__LayerAssignment_41499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrgModel_in_rule__Transformation__TargetModelAssignment_51530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TrgModel__NameAssignment_11561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TrgModel__FilepathAssignment_21592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SrcModel__NameAssignment_11623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SrcModel__ImportURIAssignment_21654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Layer__NameAssignment_11685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Layer__TypeAssignment_21716 = new BitSet(new long[]{0x0000000000000002L});

}