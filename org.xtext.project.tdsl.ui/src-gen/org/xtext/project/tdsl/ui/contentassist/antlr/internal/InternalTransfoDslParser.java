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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transformation'", "'{'", "'}'", "'OUT'", "'IN'", "'conforms'", "'apply'"
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:146:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:147:1: ( ruleLayer EOF )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:148:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_ruleLayer_in_entryRuleLayer243);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayer250); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:155:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:159:2: ( ( ( rule__Layer__Group__0 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:160:1: ( ( rule__Layer__Group__0 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:160:1: ( ( rule__Layer__Group__0 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:161:1: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:162:1: ( rule__Layer__Group__0 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:162:2: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_rule__Layer__Group__0_in_ruleLayer276);
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


    // $ANTLR start "rule__Transformation__Group__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:176:1: rule__Transformation__Group__0 : rule__Transformation__Group__0__Impl rule__Transformation__Group__1 ;
    public final void rule__Transformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:180:1: ( rule__Transformation__Group__0__Impl rule__Transformation__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:181:2: rule__Transformation__Group__0__Impl rule__Transformation__Group__1
            {
            pushFollow(FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__0310);
            rule__Transformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__0313);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:188:1: rule__Transformation__Group__0__Impl : ( 'transformation' ) ;
    public final void rule__Transformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:192:1: ( ( 'transformation' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:193:1: ( 'transformation' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:193:1: ( 'transformation' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:194:1: 'transformation'
            {
             before(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Transformation__Group__0__Impl341); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:207:1: rule__Transformation__Group__1 : rule__Transformation__Group__1__Impl rule__Transformation__Group__2 ;
    public final void rule__Transformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:211:1: ( rule__Transformation__Group__1__Impl rule__Transformation__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:212:2: rule__Transformation__Group__1__Impl rule__Transformation__Group__2
            {
            pushFollow(FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__1372);
            rule__Transformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__1375);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:219:1: rule__Transformation__Group__1__Impl : ( ( rule__Transformation__NameAssignment_1 ) ) ;
    public final void rule__Transformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:223:1: ( ( ( rule__Transformation__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:224:1: ( ( rule__Transformation__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:224:1: ( ( rule__Transformation__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:225:1: ( rule__Transformation__NameAssignment_1 )
            {
             before(grammarAccess.getTransformationAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:226:1: ( rule__Transformation__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:226:2: rule__Transformation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Transformation__NameAssignment_1_in_rule__Transformation__Group__1__Impl402);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:236:1: rule__Transformation__Group__2 : rule__Transformation__Group__2__Impl rule__Transformation__Group__3 ;
    public final void rule__Transformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:240:1: ( rule__Transformation__Group__2__Impl rule__Transformation__Group__3 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:241:2: rule__Transformation__Group__2__Impl rule__Transformation__Group__3
            {
            pushFollow(FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__2432);
            rule__Transformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__2435);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:248:1: rule__Transformation__Group__2__Impl : ( '{' ) ;
    public final void rule__Transformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:252:1: ( ( '{' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:253:1: ( '{' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:253:1: ( '{' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:254:1: '{'
            {
             before(grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Transformation__Group__2__Impl463); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:267:1: rule__Transformation__Group__3 : rule__Transformation__Group__3__Impl rule__Transformation__Group__4 ;
    public final void rule__Transformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:271:1: ( rule__Transformation__Group__3__Impl rule__Transformation__Group__4 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:272:2: rule__Transformation__Group__3__Impl rule__Transformation__Group__4
            {
            pushFollow(FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__3494);
            rule__Transformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__3497);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:279:1: rule__Transformation__Group__3__Impl : ( ( rule__Transformation__SrcmodelAssignment_3 ) ) ;
    public final void rule__Transformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:283:1: ( ( ( rule__Transformation__SrcmodelAssignment_3 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:284:1: ( ( rule__Transformation__SrcmodelAssignment_3 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:284:1: ( ( rule__Transformation__SrcmodelAssignment_3 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:285:1: ( rule__Transformation__SrcmodelAssignment_3 )
            {
             before(grammarAccess.getTransformationAccess().getSrcmodelAssignment_3()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:286:1: ( rule__Transformation__SrcmodelAssignment_3 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:286:2: rule__Transformation__SrcmodelAssignment_3
            {
            pushFollow(FOLLOW_rule__Transformation__SrcmodelAssignment_3_in_rule__Transformation__Group__3__Impl524);
            rule__Transformation__SrcmodelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getSrcmodelAssignment_3()); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:296:1: rule__Transformation__Group__4 : rule__Transformation__Group__4__Impl rule__Transformation__Group__5 ;
    public final void rule__Transformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:300:1: ( rule__Transformation__Group__4__Impl rule__Transformation__Group__5 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:301:2: rule__Transformation__Group__4__Impl rule__Transformation__Group__5
            {
            pushFollow(FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__4554);
            rule__Transformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__5_in_rule__Transformation__Group__4557);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:308:1: rule__Transformation__Group__4__Impl : ( ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* ) ) ;
    public final void rule__Transformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:312:1: ( ( ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:313:1: ( ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:313:1: ( ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:314:1: ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:314:1: ( ( rule__Transformation__LayerAssignment_4 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:315:1: ( rule__Transformation__LayerAssignment_4 )
            {
             before(grammarAccess.getTransformationAccess().getLayerAssignment_4()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:316:1: ( rule__Transformation__LayerAssignment_4 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:316:2: rule__Transformation__LayerAssignment_4
            {
            pushFollow(FOLLOW_rule__Transformation__LayerAssignment_4_in_rule__Transformation__Group__4__Impl586);
            rule__Transformation__LayerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getLayerAssignment_4()); 

            }

            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:319:1: ( ( rule__Transformation__LayerAssignment_4 )* )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:320:1: ( rule__Transformation__LayerAssignment_4 )*
            {
             before(grammarAccess.getTransformationAccess().getLayerAssignment_4()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:321:1: ( rule__Transformation__LayerAssignment_4 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:321:2: rule__Transformation__LayerAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Transformation__LayerAssignment_4_in_rule__Transformation__Group__4__Impl598);
            	    rule__Transformation__LayerAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:332:1: rule__Transformation__Group__5 : rule__Transformation__Group__5__Impl rule__Transformation__Group__6 ;
    public final void rule__Transformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:336:1: ( rule__Transformation__Group__5__Impl rule__Transformation__Group__6 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:337:2: rule__Transformation__Group__5__Impl rule__Transformation__Group__6
            {
            pushFollow(FOLLOW_rule__Transformation__Group__5__Impl_in_rule__Transformation__Group__5631);
            rule__Transformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__6_in_rule__Transformation__Group__5634);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:344:1: rule__Transformation__Group__5__Impl : ( ( rule__Transformation__TargetmodelAssignment_5 ) ) ;
    public final void rule__Transformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:348:1: ( ( ( rule__Transformation__TargetmodelAssignment_5 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:349:1: ( ( rule__Transformation__TargetmodelAssignment_5 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:349:1: ( ( rule__Transformation__TargetmodelAssignment_5 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:350:1: ( rule__Transformation__TargetmodelAssignment_5 )
            {
             before(grammarAccess.getTransformationAccess().getTargetmodelAssignment_5()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:351:1: ( rule__Transformation__TargetmodelAssignment_5 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:351:2: rule__Transformation__TargetmodelAssignment_5
            {
            pushFollow(FOLLOW_rule__Transformation__TargetmodelAssignment_5_in_rule__Transformation__Group__5__Impl661);
            rule__Transformation__TargetmodelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getTargetmodelAssignment_5()); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:361:1: rule__Transformation__Group__6 : rule__Transformation__Group__6__Impl ;
    public final void rule__Transformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:365:1: ( rule__Transformation__Group__6__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:366:2: rule__Transformation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Transformation__Group__6__Impl_in_rule__Transformation__Group__6691);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:372:1: rule__Transformation__Group__6__Impl : ( '}' ) ;
    public final void rule__Transformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:376:1: ( ( '}' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:377:1: ( '}' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:377:1: ( '}' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:378:1: '}'
            {
             before(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Transformation__Group__6__Impl719); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:405:1: rule__TrgModel__Group__0 : rule__TrgModel__Group__0__Impl rule__TrgModel__Group__1 ;
    public final void rule__TrgModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:409:1: ( rule__TrgModel__Group__0__Impl rule__TrgModel__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:410:2: rule__TrgModel__Group__0__Impl rule__TrgModel__Group__1
            {
            pushFollow(FOLLOW_rule__TrgModel__Group__0__Impl_in_rule__TrgModel__Group__0764);
            rule__TrgModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrgModel__Group__1_in_rule__TrgModel__Group__0767);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:417:1: rule__TrgModel__Group__0__Impl : ( 'OUT' ) ;
    public final void rule__TrgModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:421:1: ( ( 'OUT' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:422:1: ( 'OUT' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:422:1: ( 'OUT' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:423:1: 'OUT'
            {
             before(grammarAccess.getTrgModelAccess().getOUTKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__TrgModel__Group__0__Impl795); 
             after(grammarAccess.getTrgModelAccess().getOUTKeyword_0()); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:436:1: rule__TrgModel__Group__1 : rule__TrgModel__Group__1__Impl rule__TrgModel__Group__2 ;
    public final void rule__TrgModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:440:1: ( rule__TrgModel__Group__1__Impl rule__TrgModel__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:441:2: rule__TrgModel__Group__1__Impl rule__TrgModel__Group__2
            {
            pushFollow(FOLLOW_rule__TrgModel__Group__1__Impl_in_rule__TrgModel__Group__1826);
            rule__TrgModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrgModel__Group__2_in_rule__TrgModel__Group__1829);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:448:1: rule__TrgModel__Group__1__Impl : ( ( rule__TrgModel__NameAssignment_1 ) ) ;
    public final void rule__TrgModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:452:1: ( ( ( rule__TrgModel__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:453:1: ( ( rule__TrgModel__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:453:1: ( ( rule__TrgModel__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:454:1: ( rule__TrgModel__NameAssignment_1 )
            {
             before(grammarAccess.getTrgModelAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:455:1: ( rule__TrgModel__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:455:2: rule__TrgModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TrgModel__NameAssignment_1_in_rule__TrgModel__Group__1__Impl856);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:465:1: rule__TrgModel__Group__2 : rule__TrgModel__Group__2__Impl ;
    public final void rule__TrgModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:469:1: ( rule__TrgModel__Group__2__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:470:2: rule__TrgModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TrgModel__Group__2__Impl_in_rule__TrgModel__Group__2886);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:476:1: rule__TrgModel__Group__2__Impl : ( ( rule__TrgModel__FilepathAssignment_2 ) ) ;
    public final void rule__TrgModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:480:1: ( ( ( rule__TrgModel__FilepathAssignment_2 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:481:1: ( ( rule__TrgModel__FilepathAssignment_2 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:481:1: ( ( rule__TrgModel__FilepathAssignment_2 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:482:1: ( rule__TrgModel__FilepathAssignment_2 )
            {
             before(grammarAccess.getTrgModelAccess().getFilepathAssignment_2()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:483:1: ( rule__TrgModel__FilepathAssignment_2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:483:2: rule__TrgModel__FilepathAssignment_2
            {
            pushFollow(FOLLOW_rule__TrgModel__FilepathAssignment_2_in_rule__TrgModel__Group__2__Impl913);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:499:1: rule__SrcModel__Group__0 : rule__SrcModel__Group__0__Impl rule__SrcModel__Group__1 ;
    public final void rule__SrcModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:503:1: ( rule__SrcModel__Group__0__Impl rule__SrcModel__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:504:2: rule__SrcModel__Group__0__Impl rule__SrcModel__Group__1
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__0__Impl_in_rule__SrcModel__Group__0949);
            rule__SrcModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group__1_in_rule__SrcModel__Group__0952);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:511:1: rule__SrcModel__Group__0__Impl : ( 'IN' ) ;
    public final void rule__SrcModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:515:1: ( ( 'IN' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:516:1: ( 'IN' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:516:1: ( 'IN' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:517:1: 'IN'
            {
             before(grammarAccess.getSrcModelAccess().getINKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__SrcModel__Group__0__Impl980); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:530:1: rule__SrcModel__Group__1 : rule__SrcModel__Group__1__Impl rule__SrcModel__Group__2 ;
    public final void rule__SrcModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:534:1: ( rule__SrcModel__Group__1__Impl rule__SrcModel__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:535:2: rule__SrcModel__Group__1__Impl rule__SrcModel__Group__2
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__1__Impl_in_rule__SrcModel__Group__11011);
            rule__SrcModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group__2_in_rule__SrcModel__Group__11014);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:542:1: rule__SrcModel__Group__1__Impl : ( ( rule__SrcModel__NameAssignment_1 ) ) ;
    public final void rule__SrcModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:546:1: ( ( ( rule__SrcModel__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:547:1: ( ( rule__SrcModel__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:547:1: ( ( rule__SrcModel__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:548:1: ( rule__SrcModel__NameAssignment_1 )
            {
             before(grammarAccess.getSrcModelAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:549:1: ( rule__SrcModel__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:549:2: rule__SrcModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SrcModel__NameAssignment_1_in_rule__SrcModel__Group__1__Impl1041);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:559:1: rule__SrcModel__Group__2 : rule__SrcModel__Group__2__Impl rule__SrcModel__Group__3 ;
    public final void rule__SrcModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:563:1: ( rule__SrcModel__Group__2__Impl rule__SrcModel__Group__3 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:564:2: rule__SrcModel__Group__2__Impl rule__SrcModel__Group__3
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__2__Impl_in_rule__SrcModel__Group__21071);
            rule__SrcModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group__3_in_rule__SrcModel__Group__21074);
            rule__SrcModel__Group__3();

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:571:1: rule__SrcModel__Group__2__Impl : ( ( rule__SrcModel__ImportURIAssignment_2 ) ) ;
    public final void rule__SrcModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:575:1: ( ( ( rule__SrcModel__ImportURIAssignment_2 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:576:1: ( ( rule__SrcModel__ImportURIAssignment_2 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:576:1: ( ( rule__SrcModel__ImportURIAssignment_2 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:577:1: ( rule__SrcModel__ImportURIAssignment_2 )
            {
             before(grammarAccess.getSrcModelAccess().getImportURIAssignment_2()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:578:1: ( rule__SrcModel__ImportURIAssignment_2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:578:2: rule__SrcModel__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__SrcModel__ImportURIAssignment_2_in_rule__SrcModel__Group__2__Impl1101);
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


    // $ANTLR start "rule__SrcModel__Group__3"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:588:1: rule__SrcModel__Group__3 : rule__SrcModel__Group__3__Impl ;
    public final void rule__SrcModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:592:1: ( rule__SrcModel__Group__3__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:593:2: rule__SrcModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__3__Impl_in_rule__SrcModel__Group__31131);
            rule__SrcModel__Group__3__Impl();

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
    // $ANTLR end "rule__SrcModel__Group__3"


    // $ANTLR start "rule__SrcModel__Group__3__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:599:1: rule__SrcModel__Group__3__Impl : ( ( rule__SrcModel__Group_3__0 ) ) ;
    public final void rule__SrcModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:603:1: ( ( ( rule__SrcModel__Group_3__0 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:604:1: ( ( rule__SrcModel__Group_3__0 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:604:1: ( ( rule__SrcModel__Group_3__0 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:605:1: ( rule__SrcModel__Group_3__0 )
            {
             before(grammarAccess.getSrcModelAccess().getGroup_3()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:606:1: ( rule__SrcModel__Group_3__0 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:606:2: rule__SrcModel__Group_3__0
            {
            pushFollow(FOLLOW_rule__SrcModel__Group_3__0_in_rule__SrcModel__Group__3__Impl1158);
            rule__SrcModel__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getSrcModelAccess().getGroup_3()); 

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
    // $ANTLR end "rule__SrcModel__Group__3__Impl"


    // $ANTLR start "rule__SrcModel__Group_3__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:624:1: rule__SrcModel__Group_3__0 : rule__SrcModel__Group_3__0__Impl rule__SrcModel__Group_3__1 ;
    public final void rule__SrcModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:628:1: ( rule__SrcModel__Group_3__0__Impl rule__SrcModel__Group_3__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:629:2: rule__SrcModel__Group_3__0__Impl rule__SrcModel__Group_3__1
            {
            pushFollow(FOLLOW_rule__SrcModel__Group_3__0__Impl_in_rule__SrcModel__Group_3__01196);
            rule__SrcModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group_3__1_in_rule__SrcModel__Group_3__01199);
            rule__SrcModel__Group_3__1();

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
    // $ANTLR end "rule__SrcModel__Group_3__0"


    // $ANTLR start "rule__SrcModel__Group_3__0__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:636:1: rule__SrcModel__Group_3__0__Impl : ( 'conforms' ) ;
    public final void rule__SrcModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:640:1: ( ( 'conforms' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:641:1: ( 'conforms' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:641:1: ( 'conforms' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:642:1: 'conforms'
            {
             before(grammarAccess.getSrcModelAccess().getConformsKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__SrcModel__Group_3__0__Impl1227); 
             after(grammarAccess.getSrcModelAccess().getConformsKeyword_3_0()); 

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
    // $ANTLR end "rule__SrcModel__Group_3__0__Impl"


    // $ANTLR start "rule__SrcModel__Group_3__1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:655:1: rule__SrcModel__Group_3__1 : rule__SrcModel__Group_3__1__Impl ;
    public final void rule__SrcModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:659:1: ( rule__SrcModel__Group_3__1__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:660:2: rule__SrcModel__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SrcModel__Group_3__1__Impl_in_rule__SrcModel__Group_3__11258);
            rule__SrcModel__Group_3__1__Impl();

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
    // $ANTLR end "rule__SrcModel__Group_3__1"


    // $ANTLR start "rule__SrcModel__Group_3__1__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:666:1: rule__SrcModel__Group_3__1__Impl : ( ( rule__SrcModel__SrcmetamodelAssignment_3_1 ) ) ;
    public final void rule__SrcModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:670:1: ( ( ( rule__SrcModel__SrcmetamodelAssignment_3_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:671:1: ( ( rule__SrcModel__SrcmetamodelAssignment_3_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:671:1: ( ( rule__SrcModel__SrcmetamodelAssignment_3_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:672:1: ( rule__SrcModel__SrcmetamodelAssignment_3_1 )
            {
             before(grammarAccess.getSrcModelAccess().getSrcmetamodelAssignment_3_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:673:1: ( rule__SrcModel__SrcmetamodelAssignment_3_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:673:2: rule__SrcModel__SrcmetamodelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SrcModel__SrcmetamodelAssignment_3_1_in_rule__SrcModel__Group_3__1__Impl1285);
            rule__SrcModel__SrcmetamodelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSrcModelAccess().getSrcmetamodelAssignment_3_1()); 

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
    // $ANTLR end "rule__SrcModel__Group_3__1__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:689:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:693:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:694:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_rule__Layer__Group__0__Impl_in_rule__Layer__Group__01321);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group__1_in_rule__Layer__Group__01324);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:701:1: rule__Layer__Group__0__Impl : ( 'apply' ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:705:1: ( ( 'apply' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:706:1: ( 'apply' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:706:1: ( 'apply' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:707:1: 'apply'
            {
             before(grammarAccess.getLayerAccess().getApplyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Layer__Group__0__Impl1352); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:720:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:724:1: ( rule__Layer__Group__1__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:725:2: rule__Layer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Layer__Group__1__Impl_in_rule__Layer__Group__11383);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:731:1: rule__Layer__Group__1__Impl : ( ( rule__Layer__NameAssignment_1 ) ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:735:1: ( ( ( rule__Layer__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:736:1: ( ( rule__Layer__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:736:1: ( ( rule__Layer__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:737:1: ( rule__Layer__NameAssignment_1 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:738:1: ( rule__Layer__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:738:2: rule__Layer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Layer__NameAssignment_1_in_rule__Layer__Group__1__Impl1410);
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


    // $ANTLR start "rule__Transformation__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:753:1: rule__Transformation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:757:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:758:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:758:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:759:1: RULE_ID
            {
             before(grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transformation__NameAssignment_11449); 
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


    // $ANTLR start "rule__Transformation__SrcmodelAssignment_3"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:768:1: rule__Transformation__SrcmodelAssignment_3 : ( ruleSrcModel ) ;
    public final void rule__Transformation__SrcmodelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:772:1: ( ( ruleSrcModel ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:773:1: ( ruleSrcModel )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:773:1: ( ruleSrcModel )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:774:1: ruleSrcModel
            {
             before(grammarAccess.getTransformationAccess().getSrcmodelSrcModelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSrcModel_in_rule__Transformation__SrcmodelAssignment_31480);
            ruleSrcModel();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getSrcmodelSrcModelParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Transformation__SrcmodelAssignment_3"


    // $ANTLR start "rule__Transformation__LayerAssignment_4"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:783:1: rule__Transformation__LayerAssignment_4 : ( ruleLayer ) ;
    public final void rule__Transformation__LayerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:787:1: ( ( ruleLayer ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:788:1: ( ruleLayer )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:788:1: ( ruleLayer )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:789:1: ruleLayer
            {
             before(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleLayer_in_rule__Transformation__LayerAssignment_41511);
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


    // $ANTLR start "rule__Transformation__TargetmodelAssignment_5"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:798:1: rule__Transformation__TargetmodelAssignment_5 : ( ruleTrgModel ) ;
    public final void rule__Transformation__TargetmodelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:802:1: ( ( ruleTrgModel ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:803:1: ( ruleTrgModel )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:803:1: ( ruleTrgModel )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:804:1: ruleTrgModel
            {
             before(grammarAccess.getTransformationAccess().getTargetmodelTrgModelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTrgModel_in_rule__Transformation__TargetmodelAssignment_51542);
            ruleTrgModel();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getTargetmodelTrgModelParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Transformation__TargetmodelAssignment_5"


    // $ANTLR start "rule__TrgModel__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:813:1: rule__TrgModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TrgModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:817:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:818:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:818:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:819:1: RULE_ID
            {
             before(grammarAccess.getTrgModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TrgModel__NameAssignment_11573); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:828:1: rule__TrgModel__FilepathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TrgModel__FilepathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:832:1: ( ( RULE_STRING ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:833:1: ( RULE_STRING )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:833:1: ( RULE_STRING )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:834:1: RULE_STRING
            {
             before(grammarAccess.getTrgModelAccess().getFilepathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TrgModel__FilepathAssignment_21604); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:843:1: rule__SrcModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SrcModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:847:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:848:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:848:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:849:1: RULE_ID
            {
             before(grammarAccess.getSrcModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SrcModel__NameAssignment_11635); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:858:1: rule__SrcModel__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SrcModel__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:862:1: ( ( RULE_STRING ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:863:1: ( RULE_STRING )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:863:1: ( RULE_STRING )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:864:1: RULE_STRING
            {
             before(grammarAccess.getSrcModelAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SrcModel__ImportURIAssignment_21666); 
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


    // $ANTLR start "rule__SrcModel__SrcmetamodelAssignment_3_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:873:1: rule__SrcModel__SrcmetamodelAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__SrcModel__SrcmetamodelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:877:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:878:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:878:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:879:1: ( RULE_ID )
            {
             before(grammarAccess.getSrcModelAccess().getSrcmetamodelEPackageCrossReference_3_1_0()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:880:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:881:1: RULE_ID
            {
             before(grammarAccess.getSrcModelAccess().getSrcmetamodelEPackageIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SrcModel__SrcmetamodelAssignment_3_11701); 
             after(grammarAccess.getSrcModelAccess().getSrcmetamodelEPackageIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSrcModelAccess().getSrcmetamodelEPackageCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__SrcModel__SrcmetamodelAssignment_3_1"


    // $ANTLR start "rule__Layer__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:892:1: rule__Layer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Layer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:896:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:897:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:897:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:898:1: RULE_ID
            {
             before(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Layer__NameAssignment_11736); 
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
    public static final BitSet FOLLOW_ruleLayer_in_entryRuleLayer243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayer250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__0_in_ruleLayer276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__0310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__0313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Transformation__Group__0__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__1372 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__NameAssignment_1_in_rule__Transformation__Group__1__Impl402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__2432 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Transformation__Group__2__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__3494 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__SrcmodelAssignment_3_in_rule__Transformation__Group__3__Impl524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__4554 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__5_in_rule__Transformation__Group__4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__LayerAssignment_4_in_rule__Transformation__Group__4__Impl586 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Transformation__LayerAssignment_4_in_rule__Transformation__Group__4__Impl598 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__5__Impl_in_rule__Transformation__Group__5631 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__6_in_rule__Transformation__Group__5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__TargetmodelAssignment_5_in_rule__Transformation__Group__5__Impl661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__6__Impl_in_rule__Transformation__Group__6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Transformation__Group__6__Impl719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__0__Impl_in_rule__TrgModel__Group__0764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__1_in_rule__TrgModel__Group__0767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TrgModel__Group__0__Impl795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__1__Impl_in_rule__TrgModel__Group__1826 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__2_in_rule__TrgModel__Group__1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__NameAssignment_1_in_rule__TrgModel__Group__1__Impl856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__2__Impl_in_rule__TrgModel__Group__2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__FilepathAssignment_2_in_rule__TrgModel__Group__2__Impl913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__0__Impl_in_rule__SrcModel__Group__0949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__1_in_rule__SrcModel__Group__0952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SrcModel__Group__0__Impl980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__1__Impl_in_rule__SrcModel__Group__11011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__2_in_rule__SrcModel__Group__11014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__NameAssignment_1_in_rule__SrcModel__Group__1__Impl1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__2__Impl_in_rule__SrcModel__Group__21071 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__3_in_rule__SrcModel__Group__21074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__ImportURIAssignment_2_in_rule__SrcModel__Group__2__Impl1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__3__Impl_in_rule__SrcModel__Group__31131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group_3__0_in_rule__SrcModel__Group__3__Impl1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group_3__0__Impl_in_rule__SrcModel__Group_3__01196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SrcModel__Group_3__1_in_rule__SrcModel__Group_3__01199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SrcModel__Group_3__0__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group_3__1__Impl_in_rule__SrcModel__Group_3__11258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__SrcmetamodelAssignment_3_1_in_rule__SrcModel__Group_3__1__Impl1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__0__Impl_in_rule__Layer__Group__01321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Layer__Group__1_in_rule__Layer__Group__01324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Layer__Group__0__Impl1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__1__Impl_in_rule__Layer__Group__11383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__NameAssignment_1_in_rule__Layer__Group__1__Impl1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transformation__NameAssignment_11449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSrcModel_in_rule__Transformation__SrcmodelAssignment_31480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_rule__Transformation__LayerAssignment_41511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrgModel_in_rule__Transformation__TargetmodelAssignment_51542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TrgModel__NameAssignment_11573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TrgModel__FilepathAssignment_21604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SrcModel__NameAssignment_11635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SrcModel__ImportURIAssignment_21666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SrcModel__SrcmetamodelAssignment_3_11701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Layer__NameAssignment_11736 = new BitSet(new long[]{0x0000000000000002L});

}