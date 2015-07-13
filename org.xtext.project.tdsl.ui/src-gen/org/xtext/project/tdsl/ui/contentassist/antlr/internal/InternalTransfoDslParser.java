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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transformation'", "'{'", "'}'", "'OUT'", "'IN'", "'import'", "'apply'"
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:148:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:149:1: ( ruleLayer EOF )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:150:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_ruleLayer_in_entryRuleLayer245);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayer252); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:157:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:161:2: ( ( ( rule__Layer__Group__0 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:162:1: ( ( rule__Layer__Group__0 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:162:1: ( ( rule__Layer__Group__0 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:163:1: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:164:1: ( rule__Layer__Group__0 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:164:2: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_rule__Layer__Group__0_in_ruleLayer278);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:178:1: rule__Transformation__Group__0 : rule__Transformation__Group__0__Impl rule__Transformation__Group__1 ;
    public final void rule__Transformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:182:1: ( rule__Transformation__Group__0__Impl rule__Transformation__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:183:2: rule__Transformation__Group__0__Impl rule__Transformation__Group__1
            {
            pushFollow(FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__0312);
            rule__Transformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__0315);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:190:1: rule__Transformation__Group__0__Impl : ( 'transformation' ) ;
    public final void rule__Transformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:194:1: ( ( 'transformation' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:195:1: ( 'transformation' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:195:1: ( 'transformation' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:196:1: 'transformation'
            {
             before(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Transformation__Group__0__Impl343); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:209:1: rule__Transformation__Group__1 : rule__Transformation__Group__1__Impl rule__Transformation__Group__2 ;
    public final void rule__Transformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:213:1: ( rule__Transformation__Group__1__Impl rule__Transformation__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:214:2: rule__Transformation__Group__1__Impl rule__Transformation__Group__2
            {
            pushFollow(FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__1374);
            rule__Transformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__1377);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:221:1: rule__Transformation__Group__1__Impl : ( ( rule__Transformation__NameAssignment_1 ) ) ;
    public final void rule__Transformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:225:1: ( ( ( rule__Transformation__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:226:1: ( ( rule__Transformation__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:226:1: ( ( rule__Transformation__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:227:1: ( rule__Transformation__NameAssignment_1 )
            {
             before(grammarAccess.getTransformationAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:228:1: ( rule__Transformation__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:228:2: rule__Transformation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Transformation__NameAssignment_1_in_rule__Transformation__Group__1__Impl404);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:238:1: rule__Transformation__Group__2 : rule__Transformation__Group__2__Impl rule__Transformation__Group__3 ;
    public final void rule__Transformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:242:1: ( rule__Transformation__Group__2__Impl rule__Transformation__Group__3 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:243:2: rule__Transformation__Group__2__Impl rule__Transformation__Group__3
            {
            pushFollow(FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__2434);
            rule__Transformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__2437);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:250:1: rule__Transformation__Group__2__Impl : ( '{' ) ;
    public final void rule__Transformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:254:1: ( ( '{' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:255:1: ( '{' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:255:1: ( '{' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:256:1: '{'
            {
             before(grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Transformation__Group__2__Impl465); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:269:1: rule__Transformation__Group__3 : rule__Transformation__Group__3__Impl rule__Transformation__Group__4 ;
    public final void rule__Transformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:273:1: ( rule__Transformation__Group__3__Impl rule__Transformation__Group__4 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:274:2: rule__Transformation__Group__3__Impl rule__Transformation__Group__4
            {
            pushFollow(FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__3496);
            rule__Transformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__3499);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:281:1: rule__Transformation__Group__3__Impl : ( ( rule__Transformation__SrcModelAssignment_3 ) ) ;
    public final void rule__Transformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:285:1: ( ( ( rule__Transformation__SrcModelAssignment_3 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:286:1: ( ( rule__Transformation__SrcModelAssignment_3 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:286:1: ( ( rule__Transformation__SrcModelAssignment_3 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:287:1: ( rule__Transformation__SrcModelAssignment_3 )
            {
             before(grammarAccess.getTransformationAccess().getSrcModelAssignment_3()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:288:1: ( rule__Transformation__SrcModelAssignment_3 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:288:2: rule__Transformation__SrcModelAssignment_3
            {
            pushFollow(FOLLOW_rule__Transformation__SrcModelAssignment_3_in_rule__Transformation__Group__3__Impl526);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:298:1: rule__Transformation__Group__4 : rule__Transformation__Group__4__Impl rule__Transformation__Group__5 ;
    public final void rule__Transformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:302:1: ( rule__Transformation__Group__4__Impl rule__Transformation__Group__5 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:303:2: rule__Transformation__Group__4__Impl rule__Transformation__Group__5
            {
            pushFollow(FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__4556);
            rule__Transformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__5_in_rule__Transformation__Group__4559);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:310:1: rule__Transformation__Group__4__Impl : ( ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* ) ) ;
    public final void rule__Transformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:314:1: ( ( ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:315:1: ( ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:315:1: ( ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:316:1: ( ( rule__Transformation__LayerAssignment_4 ) ) ( ( rule__Transformation__LayerAssignment_4 )* )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:316:1: ( ( rule__Transformation__LayerAssignment_4 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:317:1: ( rule__Transformation__LayerAssignment_4 )
            {
             before(grammarAccess.getTransformationAccess().getLayerAssignment_4()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:318:1: ( rule__Transformation__LayerAssignment_4 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:318:2: rule__Transformation__LayerAssignment_4
            {
            pushFollow(FOLLOW_rule__Transformation__LayerAssignment_4_in_rule__Transformation__Group__4__Impl588);
            rule__Transformation__LayerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getLayerAssignment_4()); 

            }

            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:321:1: ( ( rule__Transformation__LayerAssignment_4 )* )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:322:1: ( rule__Transformation__LayerAssignment_4 )*
            {
             before(grammarAccess.getTransformationAccess().getLayerAssignment_4()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:323:1: ( rule__Transformation__LayerAssignment_4 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:323:2: rule__Transformation__LayerAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Transformation__LayerAssignment_4_in_rule__Transformation__Group__4__Impl600);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:334:1: rule__Transformation__Group__5 : rule__Transformation__Group__5__Impl rule__Transformation__Group__6 ;
    public final void rule__Transformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:338:1: ( rule__Transformation__Group__5__Impl rule__Transformation__Group__6 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:339:2: rule__Transformation__Group__5__Impl rule__Transformation__Group__6
            {
            pushFollow(FOLLOW_rule__Transformation__Group__5__Impl_in_rule__Transformation__Group__5633);
            rule__Transformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__6_in_rule__Transformation__Group__5636);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:346:1: rule__Transformation__Group__5__Impl : ( ( rule__Transformation__TargetModelAssignment_5 ) ) ;
    public final void rule__Transformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:350:1: ( ( ( rule__Transformation__TargetModelAssignment_5 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:351:1: ( ( rule__Transformation__TargetModelAssignment_5 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:351:1: ( ( rule__Transformation__TargetModelAssignment_5 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:352:1: ( rule__Transformation__TargetModelAssignment_5 )
            {
             before(grammarAccess.getTransformationAccess().getTargetModelAssignment_5()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:353:1: ( rule__Transformation__TargetModelAssignment_5 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:353:2: rule__Transformation__TargetModelAssignment_5
            {
            pushFollow(FOLLOW_rule__Transformation__TargetModelAssignment_5_in_rule__Transformation__Group__5__Impl663);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:363:1: rule__Transformation__Group__6 : rule__Transformation__Group__6__Impl ;
    public final void rule__Transformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:367:1: ( rule__Transformation__Group__6__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:368:2: rule__Transformation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Transformation__Group__6__Impl_in_rule__Transformation__Group__6693);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:374:1: rule__Transformation__Group__6__Impl : ( '}' ) ;
    public final void rule__Transformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:378:1: ( ( '}' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:379:1: ( '}' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:379:1: ( '}' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:380:1: '}'
            {
             before(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Transformation__Group__6__Impl721); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:407:1: rule__TrgModel__Group__0 : rule__TrgModel__Group__0__Impl rule__TrgModel__Group__1 ;
    public final void rule__TrgModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:411:1: ( rule__TrgModel__Group__0__Impl rule__TrgModel__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:412:2: rule__TrgModel__Group__0__Impl rule__TrgModel__Group__1
            {
            pushFollow(FOLLOW_rule__TrgModel__Group__0__Impl_in_rule__TrgModel__Group__0766);
            rule__TrgModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrgModel__Group__1_in_rule__TrgModel__Group__0769);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:419:1: rule__TrgModel__Group__0__Impl : ( 'OUT' ) ;
    public final void rule__TrgModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:423:1: ( ( 'OUT' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:424:1: ( 'OUT' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:424:1: ( 'OUT' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:425:1: 'OUT'
            {
             before(grammarAccess.getTrgModelAccess().getOUTKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__TrgModel__Group__0__Impl797); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:438:1: rule__TrgModel__Group__1 : rule__TrgModel__Group__1__Impl rule__TrgModel__Group__2 ;
    public final void rule__TrgModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:442:1: ( rule__TrgModel__Group__1__Impl rule__TrgModel__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:443:2: rule__TrgModel__Group__1__Impl rule__TrgModel__Group__2
            {
            pushFollow(FOLLOW_rule__TrgModel__Group__1__Impl_in_rule__TrgModel__Group__1828);
            rule__TrgModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrgModel__Group__2_in_rule__TrgModel__Group__1831);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:450:1: rule__TrgModel__Group__1__Impl : ( ( rule__TrgModel__NameAssignment_1 ) ) ;
    public final void rule__TrgModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:454:1: ( ( ( rule__TrgModel__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:455:1: ( ( rule__TrgModel__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:455:1: ( ( rule__TrgModel__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:456:1: ( rule__TrgModel__NameAssignment_1 )
            {
             before(grammarAccess.getTrgModelAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:457:1: ( rule__TrgModel__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:457:2: rule__TrgModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TrgModel__NameAssignment_1_in_rule__TrgModel__Group__1__Impl858);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:467:1: rule__TrgModel__Group__2 : rule__TrgModel__Group__2__Impl ;
    public final void rule__TrgModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:471:1: ( rule__TrgModel__Group__2__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:472:2: rule__TrgModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TrgModel__Group__2__Impl_in_rule__TrgModel__Group__2888);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:478:1: rule__TrgModel__Group__2__Impl : ( ( rule__TrgModel__FilepathAssignment_2 ) ) ;
    public final void rule__TrgModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:482:1: ( ( ( rule__TrgModel__FilepathAssignment_2 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:483:1: ( ( rule__TrgModel__FilepathAssignment_2 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:483:1: ( ( rule__TrgModel__FilepathAssignment_2 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:484:1: ( rule__TrgModel__FilepathAssignment_2 )
            {
             before(grammarAccess.getTrgModelAccess().getFilepathAssignment_2()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:485:1: ( rule__TrgModel__FilepathAssignment_2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:485:2: rule__TrgModel__FilepathAssignment_2
            {
            pushFollow(FOLLOW_rule__TrgModel__FilepathAssignment_2_in_rule__TrgModel__Group__2__Impl915);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:501:1: rule__SrcModel__Group__0 : rule__SrcModel__Group__0__Impl rule__SrcModel__Group__1 ;
    public final void rule__SrcModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:505:1: ( rule__SrcModel__Group__0__Impl rule__SrcModel__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:506:2: rule__SrcModel__Group__0__Impl rule__SrcModel__Group__1
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__0__Impl_in_rule__SrcModel__Group__0951);
            rule__SrcModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group__1_in_rule__SrcModel__Group__0954);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:513:1: rule__SrcModel__Group__0__Impl : ( 'IN' ) ;
    public final void rule__SrcModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:517:1: ( ( 'IN' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:518:1: ( 'IN' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:518:1: ( 'IN' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:519:1: 'IN'
            {
             before(grammarAccess.getSrcModelAccess().getINKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__SrcModel__Group__0__Impl982); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:532:1: rule__SrcModel__Group__1 : rule__SrcModel__Group__1__Impl rule__SrcModel__Group__2 ;
    public final void rule__SrcModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:536:1: ( rule__SrcModel__Group__1__Impl rule__SrcModel__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:537:2: rule__SrcModel__Group__1__Impl rule__SrcModel__Group__2
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__1__Impl_in_rule__SrcModel__Group__11013);
            rule__SrcModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group__2_in_rule__SrcModel__Group__11016);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:544:1: rule__SrcModel__Group__1__Impl : ( ( rule__SrcModel__NameAssignment_1 ) ) ;
    public final void rule__SrcModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:548:1: ( ( ( rule__SrcModel__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:549:1: ( ( rule__SrcModel__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:549:1: ( ( rule__SrcModel__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:550:1: ( rule__SrcModel__NameAssignment_1 )
            {
             before(grammarAccess.getSrcModelAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:551:1: ( rule__SrcModel__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:551:2: rule__SrcModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SrcModel__NameAssignment_1_in_rule__SrcModel__Group__1__Impl1043);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:561:1: rule__SrcModel__Group__2 : rule__SrcModel__Group__2__Impl rule__SrcModel__Group__3 ;
    public final void rule__SrcModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:565:1: ( rule__SrcModel__Group__2__Impl rule__SrcModel__Group__3 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:566:2: rule__SrcModel__Group__2__Impl rule__SrcModel__Group__3
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__2__Impl_in_rule__SrcModel__Group__21073);
            rule__SrcModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group__3_in_rule__SrcModel__Group__21076);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:573:1: rule__SrcModel__Group__2__Impl : ( ( rule__SrcModel__ImportURIAssignment_2 ) ) ;
    public final void rule__SrcModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:577:1: ( ( ( rule__SrcModel__ImportURIAssignment_2 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:578:1: ( ( rule__SrcModel__ImportURIAssignment_2 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:578:1: ( ( rule__SrcModel__ImportURIAssignment_2 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:579:1: ( rule__SrcModel__ImportURIAssignment_2 )
            {
             before(grammarAccess.getSrcModelAccess().getImportURIAssignment_2()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:580:1: ( rule__SrcModel__ImportURIAssignment_2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:580:2: rule__SrcModel__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__SrcModel__ImportURIAssignment_2_in_rule__SrcModel__Group__2__Impl1103);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:590:1: rule__SrcModel__Group__3 : rule__SrcModel__Group__3__Impl ;
    public final void rule__SrcModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:594:1: ( rule__SrcModel__Group__3__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:595:2: rule__SrcModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SrcModel__Group__3__Impl_in_rule__SrcModel__Group__31133);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:601:1: rule__SrcModel__Group__3__Impl : ( ( rule__SrcModel__Group_3__0 ) ) ;
    public final void rule__SrcModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:605:1: ( ( ( rule__SrcModel__Group_3__0 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:606:1: ( ( rule__SrcModel__Group_3__0 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:606:1: ( ( rule__SrcModel__Group_3__0 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:607:1: ( rule__SrcModel__Group_3__0 )
            {
             before(grammarAccess.getSrcModelAccess().getGroup_3()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:608:1: ( rule__SrcModel__Group_3__0 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:608:2: rule__SrcModel__Group_3__0
            {
            pushFollow(FOLLOW_rule__SrcModel__Group_3__0_in_rule__SrcModel__Group__3__Impl1160);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:626:1: rule__SrcModel__Group_3__0 : rule__SrcModel__Group_3__0__Impl rule__SrcModel__Group_3__1 ;
    public final void rule__SrcModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:630:1: ( rule__SrcModel__Group_3__0__Impl rule__SrcModel__Group_3__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:631:2: rule__SrcModel__Group_3__0__Impl rule__SrcModel__Group_3__1
            {
            pushFollow(FOLLOW_rule__SrcModel__Group_3__0__Impl_in_rule__SrcModel__Group_3__01198);
            rule__SrcModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SrcModel__Group_3__1_in_rule__SrcModel__Group_3__01201);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:638:1: rule__SrcModel__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__SrcModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:642:1: ( ( 'import' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:643:1: ( 'import' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:643:1: ( 'import' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:644:1: 'import'
            {
             before(grammarAccess.getSrcModelAccess().getImportKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__SrcModel__Group_3__0__Impl1229); 
             after(grammarAccess.getSrcModelAccess().getImportKeyword_3_0()); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:657:1: rule__SrcModel__Group_3__1 : rule__SrcModel__Group_3__1__Impl ;
    public final void rule__SrcModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:661:1: ( rule__SrcModel__Group_3__1__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:662:2: rule__SrcModel__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SrcModel__Group_3__1__Impl_in_rule__SrcModel__Group_3__11260);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:668:1: rule__SrcModel__Group_3__1__Impl : ( ( rule__SrcModel__SorcemetamodelAssignment_3_1 ) ) ;
    public final void rule__SrcModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:672:1: ( ( ( rule__SrcModel__SorcemetamodelAssignment_3_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:673:1: ( ( rule__SrcModel__SorcemetamodelAssignment_3_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:673:1: ( ( rule__SrcModel__SorcemetamodelAssignment_3_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:674:1: ( rule__SrcModel__SorcemetamodelAssignment_3_1 )
            {
             before(grammarAccess.getSrcModelAccess().getSorcemetamodelAssignment_3_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:675:1: ( rule__SrcModel__SorcemetamodelAssignment_3_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:675:2: rule__SrcModel__SorcemetamodelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SrcModel__SorcemetamodelAssignment_3_1_in_rule__SrcModel__Group_3__1__Impl1287);
            rule__SrcModel__SorcemetamodelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSrcModelAccess().getSorcemetamodelAssignment_3_1()); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:691:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:695:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:696:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_rule__Layer__Group__0__Impl_in_rule__Layer__Group__01323);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group__1_in_rule__Layer__Group__01326);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:703:1: rule__Layer__Group__0__Impl : ( 'apply' ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:707:1: ( ( 'apply' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:708:1: ( 'apply' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:708:1: ( 'apply' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:709:1: 'apply'
            {
             before(grammarAccess.getLayerAccess().getApplyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Layer__Group__0__Impl1354); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:722:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:726:1: ( rule__Layer__Group__1__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:727:2: rule__Layer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Layer__Group__1__Impl_in_rule__Layer__Group__11385);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:733:1: rule__Layer__Group__1__Impl : ( ( rule__Layer__NameAssignment_1 ) ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:737:1: ( ( ( rule__Layer__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:738:1: ( ( rule__Layer__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:738:1: ( ( rule__Layer__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:739:1: ( rule__Layer__NameAssignment_1 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:740:1: ( rule__Layer__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:740:2: rule__Layer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Layer__NameAssignment_1_in_rule__Layer__Group__1__Impl1412);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:755:1: rule__Transformation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:759:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:760:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:760:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:761:1: RULE_ID
            {
             before(grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transformation__NameAssignment_11451); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:770:1: rule__Transformation__SrcModelAssignment_3 : ( ruleSrcModel ) ;
    public final void rule__Transformation__SrcModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:774:1: ( ( ruleSrcModel ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:775:1: ( ruleSrcModel )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:775:1: ( ruleSrcModel )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:776:1: ruleSrcModel
            {
             before(grammarAccess.getTransformationAccess().getSrcModelSrcModelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSrcModel_in_rule__Transformation__SrcModelAssignment_31482);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:785:1: rule__Transformation__LayerAssignment_4 : ( ruleLayer ) ;
    public final void rule__Transformation__LayerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:789:1: ( ( ruleLayer ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:790:1: ( ruleLayer )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:790:1: ( ruleLayer )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:791:1: ruleLayer
            {
             before(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleLayer_in_rule__Transformation__LayerAssignment_41513);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:800:1: rule__Transformation__TargetModelAssignment_5 : ( ruleTrgModel ) ;
    public final void rule__Transformation__TargetModelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:804:1: ( ( ruleTrgModel ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:805:1: ( ruleTrgModel )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:805:1: ( ruleTrgModel )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:806:1: ruleTrgModel
            {
             before(grammarAccess.getTransformationAccess().getTargetModelTrgModelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTrgModel_in_rule__Transformation__TargetModelAssignment_51544);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:815:1: rule__TrgModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TrgModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:819:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:820:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:820:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:821:1: RULE_ID
            {
             before(grammarAccess.getTrgModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TrgModel__NameAssignment_11575); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:830:1: rule__TrgModel__FilepathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TrgModel__FilepathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:834:1: ( ( RULE_STRING ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:835:1: ( RULE_STRING )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:835:1: ( RULE_STRING )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:836:1: RULE_STRING
            {
             before(grammarAccess.getTrgModelAccess().getFilepathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TrgModel__FilepathAssignment_21606); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:845:1: rule__SrcModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SrcModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:849:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:850:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:850:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:851:1: RULE_ID
            {
             before(grammarAccess.getSrcModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SrcModel__NameAssignment_11637); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:860:1: rule__SrcModel__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SrcModel__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:864:1: ( ( RULE_STRING ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:865:1: ( RULE_STRING )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:865:1: ( RULE_STRING )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:866:1: RULE_STRING
            {
             before(grammarAccess.getSrcModelAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SrcModel__ImportURIAssignment_21668); 
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


    // $ANTLR start "rule__SrcModel__SorcemetamodelAssignment_3_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:875:1: rule__SrcModel__SorcemetamodelAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__SrcModel__SorcemetamodelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:879:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:880:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:880:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:881:1: ( RULE_ID )
            {
             before(grammarAccess.getSrcModelAccess().getSorcemetamodelSrcMetamodelCrossReference_3_1_0()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:882:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:883:1: RULE_ID
            {
             before(grammarAccess.getSrcModelAccess().getSorcemetamodelSrcMetamodelIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SrcModel__SorcemetamodelAssignment_3_11703); 
             after(grammarAccess.getSrcModelAccess().getSorcemetamodelSrcMetamodelIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSrcModelAccess().getSorcemetamodelSrcMetamodelCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__SrcModel__SorcemetamodelAssignment_3_1"


    // $ANTLR start "rule__Layer__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:897:1: rule__Layer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Layer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:901:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:902:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:902:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:903:1: RULE_ID
            {
             before(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Layer__NameAssignment_11741); 
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
    public static final BitSet FOLLOW_ruleLayer_in_entryRuleLayer245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayer252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__0_in_ruleLayer278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__0312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__0315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Transformation__Group__0__Impl343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__1374 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__NameAssignment_1_in_rule__Transformation__Group__1__Impl404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__2434 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Transformation__Group__2__Impl465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__3496 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__SrcModelAssignment_3_in_rule__Transformation__Group__3__Impl526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__4556 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__5_in_rule__Transformation__Group__4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__LayerAssignment_4_in_rule__Transformation__Group__4__Impl588 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Transformation__LayerAssignment_4_in_rule__Transformation__Group__4__Impl600 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__5__Impl_in_rule__Transformation__Group__5633 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__6_in_rule__Transformation__Group__5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__TargetModelAssignment_5_in_rule__Transformation__Group__5__Impl663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__6__Impl_in_rule__Transformation__Group__6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Transformation__Group__6__Impl721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__0__Impl_in_rule__TrgModel__Group__0766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__1_in_rule__TrgModel__Group__0769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TrgModel__Group__0__Impl797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__1__Impl_in_rule__TrgModel__Group__1828 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__2_in_rule__TrgModel__Group__1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__NameAssignment_1_in_rule__TrgModel__Group__1__Impl858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__Group__2__Impl_in_rule__TrgModel__Group__2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrgModel__FilepathAssignment_2_in_rule__TrgModel__Group__2__Impl915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__0__Impl_in_rule__SrcModel__Group__0951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__1_in_rule__SrcModel__Group__0954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SrcModel__Group__0__Impl982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__1__Impl_in_rule__SrcModel__Group__11013 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__2_in_rule__SrcModel__Group__11016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__NameAssignment_1_in_rule__SrcModel__Group__1__Impl1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__2__Impl_in_rule__SrcModel__Group__21073 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__3_in_rule__SrcModel__Group__21076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__ImportURIAssignment_2_in_rule__SrcModel__Group__2__Impl1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group__3__Impl_in_rule__SrcModel__Group__31133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group_3__0_in_rule__SrcModel__Group__3__Impl1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group_3__0__Impl_in_rule__SrcModel__Group_3__01198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SrcModel__Group_3__1_in_rule__SrcModel__Group_3__01201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SrcModel__Group_3__0__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__Group_3__1__Impl_in_rule__SrcModel__Group_3__11260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SrcModel__SorcemetamodelAssignment_3_1_in_rule__SrcModel__Group_3__1__Impl1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__0__Impl_in_rule__Layer__Group__01323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Layer__Group__1_in_rule__Layer__Group__01326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Layer__Group__0__Impl1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__1__Impl_in_rule__Layer__Group__11385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__NameAssignment_1_in_rule__Layer__Group__1__Impl1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transformation__NameAssignment_11451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSrcModel_in_rule__Transformation__SrcModelAssignment_31482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_rule__Transformation__LayerAssignment_41513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrgModel_in_rule__Transformation__TargetModelAssignment_51544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TrgModel__NameAssignment_11575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TrgModel__FilepathAssignment_21606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SrcModel__NameAssignment_11637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SrcModel__ImportURIAssignment_21668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SrcModel__SorcemetamodelAssignment_3_11703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Layer__NameAssignment_11741 = new BitSet(new long[]{0x0000000000000002L});

}