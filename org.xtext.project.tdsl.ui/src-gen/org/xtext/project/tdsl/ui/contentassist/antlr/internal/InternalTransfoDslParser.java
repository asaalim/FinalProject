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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transformation'", "'{'", "'}'", "'USE'", "'IN'", "'conforms'", "'apply'", "'OUT'"
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


    // $ANTLR start "entryRuleSrcMetamodel"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:88:1: entryRuleSrcMetamodel : ruleSrcMetamodel EOF ;
    public final void entryRuleSrcMetamodel() throws RecognitionException {
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:89:1: ( ruleSrcMetamodel EOF )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:90:1: ruleSrcMetamodel EOF
            {
             before(grammarAccess.getSrcMetamodelRule()); 
            pushFollow(FOLLOW_ruleSrcMetamodel_in_entryRuleSrcMetamodel121);
            ruleSrcMetamodel();

            state._fsp--;

             after(grammarAccess.getSrcMetamodelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSrcMetamodel128); 

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
    // $ANTLR end "entryRuleSrcMetamodel"


    // $ANTLR start "ruleSrcMetamodel"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:97:1: ruleSrcMetamodel : ( ( rule__SrcMetamodel__Group__0 ) ) ;
    public final void ruleSrcMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:101:2: ( ( ( rule__SrcMetamodel__Group__0 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:102:1: ( ( rule__SrcMetamodel__Group__0 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:102:1: ( ( rule__SrcMetamodel__Group__0 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:103:1: ( rule__SrcMetamodel__Group__0 )
            {
             before(grammarAccess.getSrcMetamodelAccess().getGroup()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:104:1: ( rule__SrcMetamodel__Group__0 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:104:2: rule__SrcMetamodel__Group__0
            {
            pushFollow(FOLLOW_rule__SrcMetamodel__Group__0_in_ruleSrcMetamodel154);
            rule__SrcMetamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSrcMetamodelAccess().getGroup()); 

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
    // $ANTLR end "ruleSrcMetamodel"


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


    // $ANTLR start "entryRuleTrgMetaModel"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:172:1: entryRuleTrgMetaModel : ruleTrgMetaModel EOF ;
    public final void entryRuleTrgMetaModel() throws RecognitionException {
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:173:1: ( ruleTrgMetaModel EOF )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:174:1: ruleTrgMetaModel EOF
            {
             before(grammarAccess.getTrgMetaModelRule()); 
            pushFollow(FOLLOW_ruleTrgMetaModel_in_entryRuleTrgMetaModel301);
            ruleTrgMetaModel();

            state._fsp--;

             after(grammarAccess.getTrgMetaModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrgMetaModel308); 

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
    // $ANTLR end "entryRuleTrgMetaModel"


    // $ANTLR start "ruleTrgMetaModel"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:181:1: ruleTrgMetaModel : ( ( rule__TrgMetaModel__Group__0 ) ) ;
    public final void ruleTrgMetaModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:185:2: ( ( ( rule__TrgMetaModel__Group__0 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:186:1: ( ( rule__TrgMetaModel__Group__0 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:186:1: ( ( rule__TrgMetaModel__Group__0 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:187:1: ( rule__TrgMetaModel__Group__0 )
            {
             before(grammarAccess.getTrgMetaModelAccess().getGroup()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:188:1: ( rule__TrgMetaModel__Group__0 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:188:2: rule__TrgMetaModel__Group__0
            {
            pushFollow(FOLLOW_rule__TrgMetaModel__Group__0_in_ruleTrgMetaModel334);
            rule__TrgMetaModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrgMetaModelAccess().getGroup()); 

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
    // $ANTLR end "ruleTrgMetaModel"


    // $ANTLR start "rule__Transformation__Group__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:204:1: rule__Transformation__Group__0 : rule__Transformation__Group__0__Impl rule__Transformation__Group__1 ;
    public final void rule__Transformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:208:1: ( rule__Transformation__Group__0__Impl rule__Transformation__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:209:2: rule__Transformation__Group__0__Impl rule__Transformation__Group__1
            {
            pushFollow(FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__0370);
            rule__Transformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__0373);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:216:1: rule__Transformation__Group__0__Impl : ( 'transformation' ) ;
    public final void rule__Transformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:220:1: ( ( 'transformation' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:221:1: ( 'transformation' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:221:1: ( 'transformation' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:222:1: 'transformation'
            {
             before(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Transformation__Group__0__Impl401); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:235:1: rule__Transformation__Group__1 : rule__Transformation__Group__1__Impl rule__Transformation__Group__2 ;
    public final void rule__Transformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:239:1: ( rule__Transformation__Group__1__Impl rule__Transformation__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:240:2: rule__Transformation__Group__1__Impl rule__Transformation__Group__2
            {
            pushFollow(FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__1432);
            rule__Transformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__1435);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:247:1: rule__Transformation__Group__1__Impl : ( ( rule__Transformation__NameAssignment_1 ) ) ;
    public final void rule__Transformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:251:1: ( ( ( rule__Transformation__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:252:1: ( ( rule__Transformation__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:252:1: ( ( rule__Transformation__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:253:1: ( rule__Transformation__NameAssignment_1 )
            {
             before(grammarAccess.getTransformationAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:254:1: ( rule__Transformation__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:254:2: rule__Transformation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Transformation__NameAssignment_1_in_rule__Transformation__Group__1__Impl462);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:264:1: rule__Transformation__Group__2 : rule__Transformation__Group__2__Impl rule__Transformation__Group__3 ;
    public final void rule__Transformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:268:1: ( rule__Transformation__Group__2__Impl rule__Transformation__Group__3 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:269:2: rule__Transformation__Group__2__Impl rule__Transformation__Group__3
            {
            pushFollow(FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__2492);
            rule__Transformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__2495);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:276:1: rule__Transformation__Group__2__Impl : ( '{' ) ;
    public final void rule__Transformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:280:1: ( ( '{' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:281:1: ( '{' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:281:1: ( '{' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:282:1: '{'
            {
             before(grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Transformation__Group__2__Impl523); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:295:1: rule__Transformation__Group__3 : rule__Transformation__Group__3__Impl rule__Transformation__Group__4 ;
    public final void rule__Transformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:299:1: ( rule__Transformation__Group__3__Impl rule__Transformation__Group__4 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:300:2: rule__Transformation__Group__3__Impl rule__Transformation__Group__4
            {
            pushFollow(FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__3554);
            rule__Transformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__3557);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:307:1: rule__Transformation__Group__3__Impl : ( ( rule__Transformation__SrcmetamodelAssignment_3 ) ) ;
    public final void rule__Transformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:311:1: ( ( ( rule__Transformation__SrcmetamodelAssignment_3 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:312:1: ( ( rule__Transformation__SrcmetamodelAssignment_3 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:312:1: ( ( rule__Transformation__SrcmetamodelAssignment_3 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:313:1: ( rule__Transformation__SrcmetamodelAssignment_3 )
            {
             before(grammarAccess.getTransformationAccess().getSrcmetamodelAssignment_3()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:314:1: ( rule__Transformation__SrcmetamodelAssignment_3 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:314:2: rule__Transformation__SrcmetamodelAssignment_3
            {
            pushFollow(FOLLOW_rule__Transformation__SrcmetamodelAssignment_3_in_rule__Transformation__Group__3__Impl584);
            rule__Transformation__SrcmetamodelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getSrcmetamodelAssignment_3()); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:324:1: rule__Transformation__Group__4 : rule__Transformation__Group__4__Impl rule__Transformation__Group__5 ;
    public final void rule__Transformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:328:1: ( rule__Transformation__Group__4__Impl rule__Transformation__Group__5 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:329:2: rule__Transformation__Group__4__Impl rule__Transformation__Group__5
            {
            pushFollow(FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__4614);
            rule__Transformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__5_in_rule__Transformation__Group__4617);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:336:1: rule__Transformation__Group__4__Impl : ( ( rule__Transformation__SrcmodelAssignment_4 ) ) ;
    public final void rule__Transformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:340:1: ( ( ( rule__Transformation__SrcmodelAssignment_4 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:341:1: ( ( rule__Transformation__SrcmodelAssignment_4 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:341:1: ( ( rule__Transformation__SrcmodelAssignment_4 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:342:1: ( rule__Transformation__SrcmodelAssignment_4 )
            {
             before(grammarAccess.getTransformationAccess().getSrcmodelAssignment_4()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:343:1: ( rule__Transformation__SrcmodelAssignment_4 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:343:2: rule__Transformation__SrcmodelAssignment_4
            {
            pushFollow(FOLLOW_rule__Transformation__SrcmodelAssignment_4_in_rule__Transformation__Group__4__Impl644);
            rule__Transformation__SrcmodelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getSrcmodelAssignment_4()); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:353:1: rule__Transformation__Group__5 : rule__Transformation__Group__5__Impl rule__Transformation__Group__6 ;
    public final void rule__Transformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:357:1: ( rule__Transformation__Group__5__Impl rule__Transformation__Group__6 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:358:2: rule__Transformation__Group__5__Impl rule__Transformation__Group__6
            {
            pushFollow(FOLLOW_rule__Transformation__Group__5__Impl_in_rule__Transformation__Group__5674);
            rule__Transformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__6_in_rule__Transformation__Group__5677);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:365:1: rule__Transformation__Group__5__Impl : ( ( ( rule__Transformation__LayerAssignment_5 ) ) ( ( rule__Transformation__LayerAssignment_5 )* ) ) ;
    public final void rule__Transformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:369:1: ( ( ( ( rule__Transformation__LayerAssignment_5 ) ) ( ( rule__Transformation__LayerAssignment_5 )* ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:370:1: ( ( ( rule__Transformation__LayerAssignment_5 ) ) ( ( rule__Transformation__LayerAssignment_5 )* ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:370:1: ( ( ( rule__Transformation__LayerAssignment_5 ) ) ( ( rule__Transformation__LayerAssignment_5 )* ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:371:1: ( ( rule__Transformation__LayerAssignment_5 ) ) ( ( rule__Transformation__LayerAssignment_5 )* )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:371:1: ( ( rule__Transformation__LayerAssignment_5 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:372:1: ( rule__Transformation__LayerAssignment_5 )
            {
             before(grammarAccess.getTransformationAccess().getLayerAssignment_5()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:373:1: ( rule__Transformation__LayerAssignment_5 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:373:2: rule__Transformation__LayerAssignment_5
            {
            pushFollow(FOLLOW_rule__Transformation__LayerAssignment_5_in_rule__Transformation__Group__5__Impl706);
            rule__Transformation__LayerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getLayerAssignment_5()); 

            }

            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:376:1: ( ( rule__Transformation__LayerAssignment_5 )* )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:377:1: ( rule__Transformation__LayerAssignment_5 )*
            {
             before(grammarAccess.getTransformationAccess().getLayerAssignment_5()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:378:1: ( rule__Transformation__LayerAssignment_5 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:378:2: rule__Transformation__LayerAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Transformation__LayerAssignment_5_in_rule__Transformation__Group__5__Impl718);
            	    rule__Transformation__LayerAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTransformationAccess().getLayerAssignment_5()); 

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
    // $ANTLR end "rule__Transformation__Group__5__Impl"


    // $ANTLR start "rule__Transformation__Group__6"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:389:1: rule__Transformation__Group__6 : rule__Transformation__Group__6__Impl rule__Transformation__Group__7 ;
    public final void rule__Transformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:393:1: ( rule__Transformation__Group__6__Impl rule__Transformation__Group__7 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:394:2: rule__Transformation__Group__6__Impl rule__Transformation__Group__7
            {
            pushFollow(FOLLOW_rule__Transformation__Group__6__Impl_in_rule__Transformation__Group__6751);
            rule__Transformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__7_in_rule__Transformation__Group__6754);
            rule__Transformation__Group__7();

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:401:1: rule__Transformation__Group__6__Impl : ( ( rule__Transformation__TargetmetamodelAssignment_6 ) ) ;
    public final void rule__Transformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:405:1: ( ( ( rule__Transformation__TargetmetamodelAssignment_6 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:406:1: ( ( rule__Transformation__TargetmetamodelAssignment_6 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:406:1: ( ( rule__Transformation__TargetmetamodelAssignment_6 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:407:1: ( rule__Transformation__TargetmetamodelAssignment_6 )
            {
             before(grammarAccess.getTransformationAccess().getTargetmetamodelAssignment_6()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:408:1: ( rule__Transformation__TargetmetamodelAssignment_6 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:408:2: rule__Transformation__TargetmetamodelAssignment_6
            {
            pushFollow(FOLLOW_rule__Transformation__TargetmetamodelAssignment_6_in_rule__Transformation__Group__6__Impl781);
            rule__Transformation__TargetmetamodelAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getTargetmetamodelAssignment_6()); 

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


    // $ANTLR start "rule__Transformation__Group__7"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:418:1: rule__Transformation__Group__7 : rule__Transformation__Group__7__Impl ;
    public final void rule__Transformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:422:1: ( rule__Transformation__Group__7__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:423:2: rule__Transformation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Transformation__Group__7__Impl_in_rule__Transformation__Group__7811);
            rule__Transformation__Group__7__Impl();

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
    // $ANTLR end "rule__Transformation__Group__7"


    // $ANTLR start "rule__Transformation__Group__7__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:429:1: rule__Transformation__Group__7__Impl : ( '}' ) ;
    public final void rule__Transformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:433:1: ( ( '}' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:434:1: ( '}' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:434:1: ( '}' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:435:1: '}'
            {
             before(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__Transformation__Group__7__Impl839); 
             after(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Transformation__Group__7__Impl"


    // $ANTLR start "rule__SrcMetamodel__Group__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:464:1: rule__SrcMetamodel__Group__0 : rule__SrcMetamodel__Group__0__Impl rule__SrcMetamodel__Group__1 ;
    public final void rule__SrcMetamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:468:1: ( rule__SrcMetamodel__Group__0__Impl rule__SrcMetamodel__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:469:2: rule__SrcMetamodel__Group__0__Impl rule__SrcMetamodel__Group__1
            {
            pushFollow(FOLLOW_rule__SrcMetamodel__Group__0__Impl_in_rule__SrcMetamodel__Group__0886);
            rule__SrcMetamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcMetamodel__Group__1_in_rule__SrcMetamodel__Group__0889);
            rule__SrcMetamodel__Group__1();

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
    // $ANTLR end "rule__SrcMetamodel__Group__0"


    // $ANTLR start "rule__SrcMetamodel__Group__0__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:476:1: rule__SrcMetamodel__Group__0__Impl : ( 'USE' ) ;
    public final void rule__SrcMetamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:480:1: ( ( 'USE' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:481:1: ( 'USE' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:481:1: ( 'USE' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:482:1: 'USE'
            {
             before(grammarAccess.getSrcMetamodelAccess().getUSEKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__SrcMetamodel__Group__0__Impl917); 
             after(grammarAccess.getSrcMetamodelAccess().getUSEKeyword_0()); 

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
    // $ANTLR end "rule__SrcMetamodel__Group__0__Impl"


    // $ANTLR start "rule__SrcMetamodel__Group__1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:495:1: rule__SrcMetamodel__Group__1 : rule__SrcMetamodel__Group__1__Impl rule__SrcMetamodel__Group__2 ;
    public final void rule__SrcMetamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:499:1: ( rule__SrcMetamodel__Group__1__Impl rule__SrcMetamodel__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:500:2: rule__SrcMetamodel__Group__1__Impl rule__SrcMetamodel__Group__2
            {
            pushFollow(FOLLOW_rule__SrcMetamodel__Group__1__Impl_in_rule__SrcMetamodel__Group__1948);
            rule__SrcMetamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcMetamodel__Group__2_in_rule__SrcMetamodel__Group__1951);
            rule__SrcMetamodel__Group__2();

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
    // $ANTLR end "rule__SrcMetamodel__Group__1"


    // $ANTLR start "rule__SrcMetamodel__Group__1__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:507:1: rule__SrcMetamodel__Group__1__Impl : ( ( rule__SrcMetamodel__NameAssignment_1 ) ) ;
    public final void rule__SrcMetamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:511:1: ( ( ( rule__SrcMetamodel__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:512:1: ( ( rule__SrcMetamodel__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:512:1: ( ( rule__SrcMetamodel__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:513:1: ( rule__SrcMetamodel__NameAssignment_1 )
            {
             before(grammarAccess.getSrcMetamodelAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:514:1: ( rule__SrcMetamodel__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:514:2: rule__SrcMetamodel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SrcMetamodel__NameAssignment_1_in_rule__SrcMetamodel__Group__1__Impl978);
            rule__SrcMetamodel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSrcMetamodelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SrcMetamodel__Group__1__Impl"


    // $ANTLR start "rule__SrcMetamodel__Group__2"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:524:1: rule__SrcMetamodel__Group__2 : rule__SrcMetamodel__Group__2__Impl ;
    public final void rule__SrcMetamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:528:1: ( rule__SrcMetamodel__Group__2__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:529:2: rule__SrcMetamodel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SrcMetamodel__Group__2__Impl_in_rule__SrcMetamodel__Group__21008);
            rule__SrcMetamodel__Group__2__Impl();

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
    // $ANTLR end "rule__SrcMetamodel__Group__2"


    // $ANTLR start "rule__SrcMetamodel__Group__2__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:535:1: rule__SrcMetamodel__Group__2__Impl : ( ( rule__SrcMetamodel__ImportURIAssignment_2 ) ) ;
    public final void rule__SrcMetamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:539:1: ( ( ( rule__SrcMetamodel__ImportURIAssignment_2 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:540:1: ( ( rule__SrcMetamodel__ImportURIAssignment_2 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:540:1: ( ( rule__SrcMetamodel__ImportURIAssignment_2 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:541:1: ( rule__SrcMetamodel__ImportURIAssignment_2 )
            {
             before(grammarAccess.getSrcMetamodelAccess().getImportURIAssignment_2()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:542:1: ( rule__SrcMetamodel__ImportURIAssignment_2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:542:2: rule__SrcMetamodel__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__SrcMetamodel__ImportURIAssignment_2_in_rule__SrcMetamodel__Group__2__Impl1035);
            rule__SrcMetamodel__ImportURIAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSrcMetamodelAccess().getImportURIAssignment_2()); 

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
    // $ANTLR end "rule__SrcMetamodel__Group__2__Impl"


    // $ANTLR start "rule__SrcModel__Group__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:558:1: rule__SrcModel__Group__0 : rule__SrcModel__Group__0__Impl rule__SrcModel__Group__1 ;
    public final void rule__SrcModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:562:1: ( rule__SrcModel__Group__0__Impl rule__SrcModel__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:563:2: rule__SrcModel__Group__0__Impl rule__SrcModel__Group__1
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__0__Impl_in_rule__SrcModel__Group__01071);
            rule__SrcModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group__1_in_rule__SrcModel__Group__01074);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:570:1: rule__SrcModel__Group__0__Impl : ( 'IN' ) ;
    public final void rule__SrcModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:574:1: ( ( 'IN' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:575:1: ( 'IN' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:575:1: ( 'IN' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:576:1: 'IN'
            {
             before(grammarAccess.getSrcModelAccess().getINKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__SrcModel__Group__0__Impl1102); 
             after(grammarAccess.getSrcModelAccess().getINKeyword_0()); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:589:1: rule__SrcModel__Group__1 : rule__SrcModel__Group__1__Impl rule__SrcModel__Group__2 ;
    public final void rule__SrcModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:593:1: ( rule__SrcModel__Group__1__Impl rule__SrcModel__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:594:2: rule__SrcModel__Group__1__Impl rule__SrcModel__Group__2
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__1__Impl_in_rule__SrcModel__Group__11133);
            rule__SrcModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group__2_in_rule__SrcModel__Group__11136);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:601:1: rule__SrcModel__Group__1__Impl : ( ( rule__SrcModel__NameAssignment_1 ) ) ;
    public final void rule__SrcModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:605:1: ( ( ( rule__SrcModel__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:606:1: ( ( rule__SrcModel__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:606:1: ( ( rule__SrcModel__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:607:1: ( rule__SrcModel__NameAssignment_1 )
            {
             before(grammarAccess.getSrcModelAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:608:1: ( rule__SrcModel__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:608:2: rule__SrcModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SrcModel__NameAssignment_1_in_rule__SrcModel__Group__1__Impl1163);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:618:1: rule__SrcModel__Group__2 : rule__SrcModel__Group__2__Impl ;
    public final void rule__SrcModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:622:1: ( rule__SrcModel__Group__2__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:623:2: rule__SrcModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__2__Impl_in_rule__SrcModel__Group__21193);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:629:1: rule__SrcModel__Group__2__Impl : ( ( rule__SrcModel__Group_2__0 ) ) ;
    public final void rule__SrcModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:633:1: ( ( ( rule__SrcModel__Group_2__0 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:634:1: ( ( rule__SrcModel__Group_2__0 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:634:1: ( ( rule__SrcModel__Group_2__0 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:635:1: ( rule__SrcModel__Group_2__0 )
            {
             before(grammarAccess.getSrcModelAccess().getGroup_2()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:636:1: ( rule__SrcModel__Group_2__0 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:636:2: rule__SrcModel__Group_2__0
            {
            pushFollow(FOLLOW_rule__SrcModel__Group_2__0_in_rule__SrcModel__Group__2__Impl1220);
            rule__SrcModel__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getSrcModelAccess().getGroup_2()); 

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


    // $ANTLR start "rule__SrcModel__Group_2__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:652:1: rule__SrcModel__Group_2__0 : rule__SrcModel__Group_2__0__Impl rule__SrcModel__Group_2__1 ;
    public final void rule__SrcModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:656:1: ( rule__SrcModel__Group_2__0__Impl rule__SrcModel__Group_2__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:657:2: rule__SrcModel__Group_2__0__Impl rule__SrcModel__Group_2__1
            {
            pushFollow(FOLLOW_rule__SrcModel__Group_2__0__Impl_in_rule__SrcModel__Group_2__01256);
            rule__SrcModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group_2__1_in_rule__SrcModel__Group_2__01259);
            rule__SrcModel__Group_2__1();

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
    // $ANTLR end "rule__SrcModel__Group_2__0"


    // $ANTLR start "rule__SrcModel__Group_2__0__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:664:1: rule__SrcModel__Group_2__0__Impl : ( 'conforms' ) ;
    public final void rule__SrcModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:668:1: ( ( 'conforms' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:669:1: ( 'conforms' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:669:1: ( 'conforms' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:670:1: 'conforms'
            {
             before(grammarAccess.getSrcModelAccess().getConformsKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__SrcModel__Group_2__0__Impl1287); 
             after(grammarAccess.getSrcModelAccess().getConformsKeyword_2_0()); 

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
    // $ANTLR end "rule__SrcModel__Group_2__0__Impl"


    // $ANTLR start "rule__SrcModel__Group_2__1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:683:1: rule__SrcModel__Group_2__1 : rule__SrcModel__Group_2__1__Impl ;
    public final void rule__SrcModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:687:1: ( rule__SrcModel__Group_2__1__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:688:2: rule__SrcModel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SrcModel__Group_2__1__Impl_in_rule__SrcModel__Group_2__11318);
            rule__SrcModel__Group_2__1__Impl();

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
    // $ANTLR end "rule__SrcModel__Group_2__1"


    // $ANTLR start "rule__SrcModel__Group_2__1__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:694:1: rule__SrcModel__Group_2__1__Impl : ( ( rule__SrcModel__SourcemetamodelAssignment_2_1 ) ) ;
    public final void rule__SrcModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:698:1: ( ( ( rule__SrcModel__SourcemetamodelAssignment_2_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:699:1: ( ( rule__SrcModel__SourcemetamodelAssignment_2_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:699:1: ( ( rule__SrcModel__SourcemetamodelAssignment_2_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:700:1: ( rule__SrcModel__SourcemetamodelAssignment_2_1 )
            {
             before(grammarAccess.getSrcModelAccess().getSourcemetamodelAssignment_2_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:701:1: ( rule__SrcModel__SourcemetamodelAssignment_2_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:701:2: rule__SrcModel__SourcemetamodelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SrcModel__SourcemetamodelAssignment_2_1_in_rule__SrcModel__Group_2__1__Impl1345);
            rule__SrcModel__SourcemetamodelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSrcModelAccess().getSourcemetamodelAssignment_2_1()); 

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
    // $ANTLR end "rule__SrcModel__Group_2__1__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:715:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:719:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:720:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_rule__Layer__Group__0__Impl_in_rule__Layer__Group__01379);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group__1_in_rule__Layer__Group__01382);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:727:1: rule__Layer__Group__0__Impl : ( 'apply' ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:731:1: ( ( 'apply' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:732:1: ( 'apply' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:732:1: ( 'apply' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:733:1: 'apply'
            {
             before(grammarAccess.getLayerAccess().getApplyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Layer__Group__0__Impl1410); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:746:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:750:1: ( rule__Layer__Group__1__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:751:2: rule__Layer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Layer__Group__1__Impl_in_rule__Layer__Group__11441);
            rule__Layer__Group__1__Impl();

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:757:1: rule__Layer__Group__1__Impl : ( ( rule__Layer__NameAssignment_1 ) ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:761:1: ( ( ( rule__Layer__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:762:1: ( ( rule__Layer__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:762:1: ( ( rule__Layer__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:763:1: ( rule__Layer__NameAssignment_1 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:764:1: ( rule__Layer__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:764:2: rule__Layer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Layer__NameAssignment_1_in_rule__Layer__Group__1__Impl1468);
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


    // $ANTLR start "rule__TrgMetaModel__Group__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:778:1: rule__TrgMetaModel__Group__0 : rule__TrgMetaModel__Group__0__Impl rule__TrgMetaModel__Group__1 ;
    public final void rule__TrgMetaModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:782:1: ( rule__TrgMetaModel__Group__0__Impl rule__TrgMetaModel__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:783:2: rule__TrgMetaModel__Group__0__Impl rule__TrgMetaModel__Group__1
            {
            pushFollow(FOLLOW_rule__TrgMetaModel__Group__0__Impl_in_rule__TrgMetaModel__Group__01502);
            rule__TrgMetaModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrgMetaModel__Group__1_in_rule__TrgMetaModel__Group__01505);
            rule__TrgMetaModel__Group__1();

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
    // $ANTLR end "rule__TrgMetaModel__Group__0"


    // $ANTLR start "rule__TrgMetaModel__Group__0__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:790:1: rule__TrgMetaModel__Group__0__Impl : ( 'OUT' ) ;
    public final void rule__TrgMetaModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:794:1: ( ( 'OUT' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:795:1: ( 'OUT' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:795:1: ( 'OUT' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:796:1: 'OUT'
            {
             before(grammarAccess.getTrgMetaModelAccess().getOUTKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__TrgMetaModel__Group__0__Impl1533); 
             after(grammarAccess.getTrgMetaModelAccess().getOUTKeyword_0()); 

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
    // $ANTLR end "rule__TrgMetaModel__Group__0__Impl"


    // $ANTLR start "rule__TrgMetaModel__Group__1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:809:1: rule__TrgMetaModel__Group__1 : rule__TrgMetaModel__Group__1__Impl rule__TrgMetaModel__Group__2 ;
    public final void rule__TrgMetaModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:813:1: ( rule__TrgMetaModel__Group__1__Impl rule__TrgMetaModel__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:814:2: rule__TrgMetaModel__Group__1__Impl rule__TrgMetaModel__Group__2
            {
            pushFollow(FOLLOW_rule__TrgMetaModel__Group__1__Impl_in_rule__TrgMetaModel__Group__11564);
            rule__TrgMetaModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrgMetaModel__Group__2_in_rule__TrgMetaModel__Group__11567);
            rule__TrgMetaModel__Group__2();

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
    // $ANTLR end "rule__TrgMetaModel__Group__1"


    // $ANTLR start "rule__TrgMetaModel__Group__1__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:821:1: rule__TrgMetaModel__Group__1__Impl : ( ( rule__TrgMetaModel__NameAssignment_1 ) ) ;
    public final void rule__TrgMetaModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:825:1: ( ( ( rule__TrgMetaModel__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:826:1: ( ( rule__TrgMetaModel__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:826:1: ( ( rule__TrgMetaModel__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:827:1: ( rule__TrgMetaModel__NameAssignment_1 )
            {
             before(grammarAccess.getTrgMetaModelAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:828:1: ( rule__TrgMetaModel__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:828:2: rule__TrgMetaModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TrgMetaModel__NameAssignment_1_in_rule__TrgMetaModel__Group__1__Impl1594);
            rule__TrgMetaModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrgMetaModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TrgMetaModel__Group__1__Impl"


    // $ANTLR start "rule__TrgMetaModel__Group__2"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:838:1: rule__TrgMetaModel__Group__2 : rule__TrgMetaModel__Group__2__Impl ;
    public final void rule__TrgMetaModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:842:1: ( rule__TrgMetaModel__Group__2__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:843:2: rule__TrgMetaModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TrgMetaModel__Group__2__Impl_in_rule__TrgMetaModel__Group__21624);
            rule__TrgMetaModel__Group__2__Impl();

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
    // $ANTLR end "rule__TrgMetaModel__Group__2"


    // $ANTLR start "rule__TrgMetaModel__Group__2__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:849:1: rule__TrgMetaModel__Group__2__Impl : ( ( rule__TrgMetaModel__FilepathAssignment_2 ) ) ;
    public final void rule__TrgMetaModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:853:1: ( ( ( rule__TrgMetaModel__FilepathAssignment_2 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:854:1: ( ( rule__TrgMetaModel__FilepathAssignment_2 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:854:1: ( ( rule__TrgMetaModel__FilepathAssignment_2 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:855:1: ( rule__TrgMetaModel__FilepathAssignment_2 )
            {
             before(grammarAccess.getTrgMetaModelAccess().getFilepathAssignment_2()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:856:1: ( rule__TrgMetaModel__FilepathAssignment_2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:856:2: rule__TrgMetaModel__FilepathAssignment_2
            {
            pushFollow(FOLLOW_rule__TrgMetaModel__FilepathAssignment_2_in_rule__TrgMetaModel__Group__2__Impl1651);
            rule__TrgMetaModel__FilepathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrgMetaModelAccess().getFilepathAssignment_2()); 

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
    // $ANTLR end "rule__TrgMetaModel__Group__2__Impl"


    // $ANTLR start "rule__Transformation__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:875:1: rule__Transformation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:879:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:880:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:880:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:881:1: RULE_ID
            {
             before(grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transformation__NameAssignment_11694); 
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


    // $ANTLR start "rule__Transformation__SrcmetamodelAssignment_3"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:890:1: rule__Transformation__SrcmetamodelAssignment_3 : ( ruleSrcMetamodel ) ;
    public final void rule__Transformation__SrcmetamodelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:894:1: ( ( ruleSrcMetamodel ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:895:1: ( ruleSrcMetamodel )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:895:1: ( ruleSrcMetamodel )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:896:1: ruleSrcMetamodel
            {
             before(grammarAccess.getTransformationAccess().getSrcmetamodelSrcMetamodelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSrcMetamodel_in_rule__Transformation__SrcmetamodelAssignment_31725);
            ruleSrcMetamodel();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getSrcmetamodelSrcMetamodelParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Transformation__SrcmetamodelAssignment_3"


    // $ANTLR start "rule__Transformation__SrcmodelAssignment_4"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:905:1: rule__Transformation__SrcmodelAssignment_4 : ( ruleSrcModel ) ;
    public final void rule__Transformation__SrcmodelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:909:1: ( ( ruleSrcModel ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:910:1: ( ruleSrcModel )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:910:1: ( ruleSrcModel )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:911:1: ruleSrcModel
            {
             before(grammarAccess.getTransformationAccess().getSrcmodelSrcModelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSrcModel_in_rule__Transformation__SrcmodelAssignment_41756);
            ruleSrcModel();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getSrcmodelSrcModelParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Transformation__SrcmodelAssignment_4"


    // $ANTLR start "rule__Transformation__LayerAssignment_5"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:920:1: rule__Transformation__LayerAssignment_5 : ( ruleLayer ) ;
    public final void rule__Transformation__LayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:924:1: ( ( ruleLayer ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:925:1: ( ruleLayer )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:925:1: ( ruleLayer )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:926:1: ruleLayer
            {
             before(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleLayer_in_rule__Transformation__LayerAssignment_51787);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Transformation__LayerAssignment_5"


    // $ANTLR start "rule__Transformation__TargetmetamodelAssignment_6"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:935:1: rule__Transformation__TargetmetamodelAssignment_6 : ( ruleTrgMetaModel ) ;
    public final void rule__Transformation__TargetmetamodelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:939:1: ( ( ruleTrgMetaModel ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:940:1: ( ruleTrgMetaModel )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:940:1: ( ruleTrgMetaModel )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:941:1: ruleTrgMetaModel
            {
             before(grammarAccess.getTransformationAccess().getTargetmetamodelTrgMetaModelParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleTrgMetaModel_in_rule__Transformation__TargetmetamodelAssignment_61818);
            ruleTrgMetaModel();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getTargetmetamodelTrgMetaModelParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Transformation__TargetmetamodelAssignment_6"


    // $ANTLR start "rule__SrcMetamodel__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:950:1: rule__SrcMetamodel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SrcMetamodel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:954:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:955:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:955:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:956:1: RULE_ID
            {
             before(grammarAccess.getSrcMetamodelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SrcMetamodel__NameAssignment_11849); 
             after(grammarAccess.getSrcMetamodelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SrcMetamodel__NameAssignment_1"


    // $ANTLR start "rule__SrcMetamodel__ImportURIAssignment_2"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:965:1: rule__SrcMetamodel__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SrcMetamodel__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:969:1: ( ( RULE_STRING ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:970:1: ( RULE_STRING )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:970:1: ( RULE_STRING )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:971:1: RULE_STRING
            {
             before(grammarAccess.getSrcMetamodelAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SrcMetamodel__ImportURIAssignment_21880); 
             after(grammarAccess.getSrcMetamodelAccess().getImportURISTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SrcMetamodel__ImportURIAssignment_2"


    // $ANTLR start "rule__SrcModel__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:980:1: rule__SrcModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SrcModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:984:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:985:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:985:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:986:1: RULE_ID
            {
             before(grammarAccess.getSrcModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SrcModel__NameAssignment_11911); 
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


    // $ANTLR start "rule__SrcModel__SourcemetamodelAssignment_2_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:995:1: rule__SrcModel__SourcemetamodelAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SrcModel__SourcemetamodelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:999:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1000:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1000:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1001:1: ( RULE_ID )
            {
             before(grammarAccess.getSrcModelAccess().getSourcemetamodelSrcMetamodelCrossReference_2_1_0()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1002:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1003:1: RULE_ID
            {
             before(grammarAccess.getSrcModelAccess().getSourcemetamodelSrcMetamodelIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SrcModel__SourcemetamodelAssignment_2_11946); 
             after(grammarAccess.getSrcModelAccess().getSourcemetamodelSrcMetamodelIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSrcModelAccess().getSourcemetamodelSrcMetamodelCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__SrcModel__SourcemetamodelAssignment_2_1"


    // $ANTLR start "rule__Layer__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1014:1: rule__Layer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Layer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1018:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1019:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1019:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1020:1: RULE_ID
            {
             before(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Layer__NameAssignment_11981); 
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


    // $ANTLR start "rule__TrgMetaModel__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1029:1: rule__TrgMetaModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TrgMetaModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1033:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1034:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1034:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1035:1: RULE_ID
            {
             before(grammarAccess.getTrgMetaModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TrgMetaModel__NameAssignment_12012); 
             after(grammarAccess.getTrgMetaModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TrgMetaModel__NameAssignment_1"


    // $ANTLR start "rule__TrgMetaModel__FilepathAssignment_2"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1044:1: rule__TrgMetaModel__FilepathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TrgMetaModel__FilepathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1048:1: ( ( RULE_STRING ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1049:1: ( RULE_STRING )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1049:1: ( RULE_STRING )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:1050:1: RULE_STRING
            {
             before(grammarAccess.getTrgMetaModelAccess().getFilepathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TrgMetaModel__FilepathAssignment_22043); 
             after(grammarAccess.getTrgMetaModelAccess().getFilepathSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TrgMetaModel__FilepathAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__0_in_ruleTransformation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSrcMetamodel_in_entryRuleSrcMetamodel121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSrcMetamodel128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcMetamodel__Group__0_in_ruleSrcMetamodel154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSrcModel_in_entryRuleSrcModel181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSrcModel188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__0_in_ruleSrcModel214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_entryRuleLayer241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayer248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__0_in_ruleLayer274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrgMetaModel_in_entryRuleTrgMetaModel301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrgMetaModel308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgMetaModel__Group__0_in_ruleTrgMetaModel334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__0370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__0373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Transformation__Group__0__Impl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__1432 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__NameAssignment_1_in_rule__Transformation__Group__1__Impl462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__2492 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Transformation__Group__2__Impl523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__3554 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__SrcmetamodelAssignment_3_in_rule__Transformation__Group__3__Impl584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__4614 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__5_in_rule__Transformation__Group__4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__SrcmodelAssignment_4_in_rule__Transformation__Group__4__Impl644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__5__Impl_in_rule__Transformation__Group__5674 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__6_in_rule__Transformation__Group__5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__LayerAssignment_5_in_rule__Transformation__Group__5__Impl706 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Transformation__LayerAssignment_5_in_rule__Transformation__Group__5__Impl718 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__6__Impl_in_rule__Transformation__Group__6751 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__7_in_rule__Transformation__Group__6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__TargetmetamodelAssignment_6_in_rule__Transformation__Group__6__Impl781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__7__Impl_in_rule__Transformation__Group__7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Transformation__Group__7__Impl839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcMetamodel__Group__0__Impl_in_rule__SrcMetamodel__Group__0886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SrcMetamodel__Group__1_in_rule__SrcMetamodel__Group__0889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SrcMetamodel__Group__0__Impl917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcMetamodel__Group__1__Impl_in_rule__SrcMetamodel__Group__1948 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SrcMetamodel__Group__2_in_rule__SrcMetamodel__Group__1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcMetamodel__NameAssignment_1_in_rule__SrcMetamodel__Group__1__Impl978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcMetamodel__Group__2__Impl_in_rule__SrcMetamodel__Group__21008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcMetamodel__ImportURIAssignment_2_in_rule__SrcMetamodel__Group__2__Impl1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__0__Impl_in_rule__SrcModel__Group__01071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__1_in_rule__SrcModel__Group__01074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SrcModel__Group__0__Impl1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__1__Impl_in_rule__SrcModel__Group__11133 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__2_in_rule__SrcModel__Group__11136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__NameAssignment_1_in_rule__SrcModel__Group__1__Impl1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__2__Impl_in_rule__SrcModel__Group__21193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group_2__0_in_rule__SrcModel__Group__2__Impl1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group_2__0__Impl_in_rule__SrcModel__Group_2__01256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SrcModel__Group_2__1_in_rule__SrcModel__Group_2__01259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SrcModel__Group_2__0__Impl1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group_2__1__Impl_in_rule__SrcModel__Group_2__11318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__SourcemetamodelAssignment_2_1_in_rule__SrcModel__Group_2__1__Impl1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__0__Impl_in_rule__Layer__Group__01379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Layer__Group__1_in_rule__Layer__Group__01382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Layer__Group__0__Impl1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__1__Impl_in_rule__Layer__Group__11441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__NameAssignment_1_in_rule__Layer__Group__1__Impl1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgMetaModel__Group__0__Impl_in_rule__TrgMetaModel__Group__01502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TrgMetaModel__Group__1_in_rule__TrgMetaModel__Group__01505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TrgMetaModel__Group__0__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgMetaModel__Group__1__Impl_in_rule__TrgMetaModel__Group__11564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TrgMetaModel__Group__2_in_rule__TrgMetaModel__Group__11567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgMetaModel__NameAssignment_1_in_rule__TrgMetaModel__Group__1__Impl1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgMetaModel__Group__2__Impl_in_rule__TrgMetaModel__Group__21624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgMetaModel__FilepathAssignment_2_in_rule__TrgMetaModel__Group__2__Impl1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transformation__NameAssignment_11694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSrcMetamodel_in_rule__Transformation__SrcmetamodelAssignment_31725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSrcModel_in_rule__Transformation__SrcmodelAssignment_41756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_rule__Transformation__LayerAssignment_51787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrgMetaModel_in_rule__Transformation__TargetmetamodelAssignment_61818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SrcMetamodel__NameAssignment_11849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SrcMetamodel__ImportURIAssignment_21880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SrcModel__NameAssignment_11911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SrcModel__SourcemetamodelAssignment_2_11946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Layer__NameAssignment_11981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TrgMetaModel__NameAssignment_12012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TrgMetaModel__FilepathAssignment_22043 = new BitSet(new long[]{0x0000000000000002L});

}