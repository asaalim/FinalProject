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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transformation'", "'{'", "'sourceModel'", "'='", "';'", "'targetModel'", "'}'", "'apply'"
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


    // $ANTLR start "entryRuleLayer"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:88:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:89:1: ( ruleLayer EOF )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:90:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_ruleLayer_in_entryRuleLayer121);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayer128); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:97:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:101:2: ( ( ( rule__Layer__Group__0 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:102:1: ( ( rule__Layer__Group__0 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:102:1: ( ( rule__Layer__Group__0 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:103:1: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:104:1: ( rule__Layer__Group__0 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:104:2: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_rule__Layer__Group__0_in_ruleLayer154);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:118:1: rule__Transformation__Group__0 : rule__Transformation__Group__0__Impl rule__Transformation__Group__1 ;
    public final void rule__Transformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:122:1: ( rule__Transformation__Group__0__Impl rule__Transformation__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:123:2: rule__Transformation__Group__0__Impl rule__Transformation__Group__1
            {
            pushFollow(FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__0188);
            rule__Transformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__0191);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:130:1: rule__Transformation__Group__0__Impl : ( 'transformation' ) ;
    public final void rule__Transformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:134:1: ( ( 'transformation' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:135:1: ( 'transformation' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:135:1: ( 'transformation' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:136:1: 'transformation'
            {
             before(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Transformation__Group__0__Impl219); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:149:1: rule__Transformation__Group__1 : rule__Transformation__Group__1__Impl rule__Transformation__Group__2 ;
    public final void rule__Transformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:153:1: ( rule__Transformation__Group__1__Impl rule__Transformation__Group__2 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:154:2: rule__Transformation__Group__1__Impl rule__Transformation__Group__2
            {
            pushFollow(FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__1250);
            rule__Transformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__1253);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:161:1: rule__Transformation__Group__1__Impl : ( ( rule__Transformation__NameAssignment_1 ) ) ;
    public final void rule__Transformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:165:1: ( ( ( rule__Transformation__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:166:1: ( ( rule__Transformation__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:166:1: ( ( rule__Transformation__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:167:1: ( rule__Transformation__NameAssignment_1 )
            {
             before(grammarAccess.getTransformationAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:168:1: ( rule__Transformation__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:168:2: rule__Transformation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Transformation__NameAssignment_1_in_rule__Transformation__Group__1__Impl280);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:178:1: rule__Transformation__Group__2 : rule__Transformation__Group__2__Impl rule__Transformation__Group__3 ;
    public final void rule__Transformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:182:1: ( rule__Transformation__Group__2__Impl rule__Transformation__Group__3 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:183:2: rule__Transformation__Group__2__Impl rule__Transformation__Group__3
            {
            pushFollow(FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__2310);
            rule__Transformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__2313);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:190:1: rule__Transformation__Group__2__Impl : ( '{' ) ;
    public final void rule__Transformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:194:1: ( ( '{' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:195:1: ( '{' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:195:1: ( '{' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:196:1: '{'
            {
             before(grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Transformation__Group__2__Impl341); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:209:1: rule__Transformation__Group__3 : rule__Transformation__Group__3__Impl rule__Transformation__Group__4 ;
    public final void rule__Transformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:213:1: ( rule__Transformation__Group__3__Impl rule__Transformation__Group__4 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:214:2: rule__Transformation__Group__3__Impl rule__Transformation__Group__4
            {
            pushFollow(FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__3372);
            rule__Transformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__3375);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:221:1: rule__Transformation__Group__3__Impl : ( 'sourceModel' ) ;
    public final void rule__Transformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:225:1: ( ( 'sourceModel' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:226:1: ( 'sourceModel' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:226:1: ( 'sourceModel' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:227:1: 'sourceModel'
            {
             before(grammarAccess.getTransformationAccess().getSourceModelKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Transformation__Group__3__Impl403); 
             after(grammarAccess.getTransformationAccess().getSourceModelKeyword_3()); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:240:1: rule__Transformation__Group__4 : rule__Transformation__Group__4__Impl rule__Transformation__Group__5 ;
    public final void rule__Transformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:244:1: ( rule__Transformation__Group__4__Impl rule__Transformation__Group__5 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:245:2: rule__Transformation__Group__4__Impl rule__Transformation__Group__5
            {
            pushFollow(FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__4434);
            rule__Transformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__5_in_rule__Transformation__Group__4437);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:252:1: rule__Transformation__Group__4__Impl : ( '=' ) ;
    public final void rule__Transformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:256:1: ( ( '=' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:257:1: ( '=' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:257:1: ( '=' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:258:1: '='
            {
             before(grammarAccess.getTransformationAccess().getEqualsSignKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Transformation__Group__4__Impl465); 
             after(grammarAccess.getTransformationAccess().getEqualsSignKeyword_4()); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:271:1: rule__Transformation__Group__5 : rule__Transformation__Group__5__Impl rule__Transformation__Group__6 ;
    public final void rule__Transformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:275:1: ( rule__Transformation__Group__5__Impl rule__Transformation__Group__6 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:276:2: rule__Transformation__Group__5__Impl rule__Transformation__Group__6
            {
            pushFollow(FOLLOW_rule__Transformation__Group__5__Impl_in_rule__Transformation__Group__5496);
            rule__Transformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__6_in_rule__Transformation__Group__5499);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:283:1: rule__Transformation__Group__5__Impl : ( ( rule__Transformation__ImportURIAssignment_5 ) ) ;
    public final void rule__Transformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:287:1: ( ( ( rule__Transformation__ImportURIAssignment_5 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:288:1: ( ( rule__Transformation__ImportURIAssignment_5 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:288:1: ( ( rule__Transformation__ImportURIAssignment_5 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:289:1: ( rule__Transformation__ImportURIAssignment_5 )
            {
             before(grammarAccess.getTransformationAccess().getImportURIAssignment_5()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:290:1: ( rule__Transformation__ImportURIAssignment_5 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:290:2: rule__Transformation__ImportURIAssignment_5
            {
            pushFollow(FOLLOW_rule__Transformation__ImportURIAssignment_5_in_rule__Transformation__Group__5__Impl526);
            rule__Transformation__ImportURIAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getImportURIAssignment_5()); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:300:1: rule__Transformation__Group__6 : rule__Transformation__Group__6__Impl rule__Transformation__Group__7 ;
    public final void rule__Transformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:304:1: ( rule__Transformation__Group__6__Impl rule__Transformation__Group__7 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:305:2: rule__Transformation__Group__6__Impl rule__Transformation__Group__7
            {
            pushFollow(FOLLOW_rule__Transformation__Group__6__Impl_in_rule__Transformation__Group__6556);
            rule__Transformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__7_in_rule__Transformation__Group__6559);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:312:1: rule__Transformation__Group__6__Impl : ( ';' ) ;
    public final void rule__Transformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:316:1: ( ( ';' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:317:1: ( ';' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:317:1: ( ';' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:318:1: ';'
            {
             before(grammarAccess.getTransformationAccess().getSemicolonKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Transformation__Group__6__Impl587); 
             after(grammarAccess.getTransformationAccess().getSemicolonKeyword_6()); 

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:331:1: rule__Transformation__Group__7 : rule__Transformation__Group__7__Impl rule__Transformation__Group__8 ;
    public final void rule__Transformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:335:1: ( rule__Transformation__Group__7__Impl rule__Transformation__Group__8 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:336:2: rule__Transformation__Group__7__Impl rule__Transformation__Group__8
            {
            pushFollow(FOLLOW_rule__Transformation__Group__7__Impl_in_rule__Transformation__Group__7618);
            rule__Transformation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__8_in_rule__Transformation__Group__7621);
            rule__Transformation__Group__8();

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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:343:1: rule__Transformation__Group__7__Impl : ( 'targetModel' ) ;
    public final void rule__Transformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:347:1: ( ( 'targetModel' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:348:1: ( 'targetModel' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:348:1: ( 'targetModel' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:349:1: 'targetModel'
            {
             before(grammarAccess.getTransformationAccess().getTargetModelKeyword_7()); 
            match(input,16,FOLLOW_16_in_rule__Transformation__Group__7__Impl649); 
             after(grammarAccess.getTransformationAccess().getTargetModelKeyword_7()); 

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


    // $ANTLR start "rule__Transformation__Group__8"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:362:1: rule__Transformation__Group__8 : rule__Transformation__Group__8__Impl rule__Transformation__Group__9 ;
    public final void rule__Transformation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:366:1: ( rule__Transformation__Group__8__Impl rule__Transformation__Group__9 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:367:2: rule__Transformation__Group__8__Impl rule__Transformation__Group__9
            {
            pushFollow(FOLLOW_rule__Transformation__Group__8__Impl_in_rule__Transformation__Group__8680);
            rule__Transformation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__9_in_rule__Transformation__Group__8683);
            rule__Transformation__Group__9();

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
    // $ANTLR end "rule__Transformation__Group__8"


    // $ANTLR start "rule__Transformation__Group__8__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:374:1: rule__Transformation__Group__8__Impl : ( '=' ) ;
    public final void rule__Transformation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:378:1: ( ( '=' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:379:1: ( '=' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:379:1: ( '=' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:380:1: '='
            {
             before(grammarAccess.getTransformationAccess().getEqualsSignKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__Transformation__Group__8__Impl711); 
             after(grammarAccess.getTransformationAccess().getEqualsSignKeyword_8()); 

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
    // $ANTLR end "rule__Transformation__Group__8__Impl"


    // $ANTLR start "rule__Transformation__Group__9"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:393:1: rule__Transformation__Group__9 : rule__Transformation__Group__9__Impl rule__Transformation__Group__10 ;
    public final void rule__Transformation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:397:1: ( rule__Transformation__Group__9__Impl rule__Transformation__Group__10 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:398:2: rule__Transformation__Group__9__Impl rule__Transformation__Group__10
            {
            pushFollow(FOLLOW_rule__Transformation__Group__9__Impl_in_rule__Transformation__Group__9742);
            rule__Transformation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__10_in_rule__Transformation__Group__9745);
            rule__Transformation__Group__10();

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
    // $ANTLR end "rule__Transformation__Group__9"


    // $ANTLR start "rule__Transformation__Group__9__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:405:1: rule__Transformation__Group__9__Impl : ( ( rule__Transformation__FileNameAssignment_9 ) ) ;
    public final void rule__Transformation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:409:1: ( ( ( rule__Transformation__FileNameAssignment_9 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:410:1: ( ( rule__Transformation__FileNameAssignment_9 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:410:1: ( ( rule__Transformation__FileNameAssignment_9 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:411:1: ( rule__Transformation__FileNameAssignment_9 )
            {
             before(grammarAccess.getTransformationAccess().getFileNameAssignment_9()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:412:1: ( rule__Transformation__FileNameAssignment_9 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:412:2: rule__Transformation__FileNameAssignment_9
            {
            pushFollow(FOLLOW_rule__Transformation__FileNameAssignment_9_in_rule__Transformation__Group__9__Impl772);
            rule__Transformation__FileNameAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getFileNameAssignment_9()); 

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
    // $ANTLR end "rule__Transformation__Group__9__Impl"


    // $ANTLR start "rule__Transformation__Group__10"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:422:1: rule__Transformation__Group__10 : rule__Transformation__Group__10__Impl rule__Transformation__Group__11 ;
    public final void rule__Transformation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:426:1: ( rule__Transformation__Group__10__Impl rule__Transformation__Group__11 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:427:2: rule__Transformation__Group__10__Impl rule__Transformation__Group__11
            {
            pushFollow(FOLLOW_rule__Transformation__Group__10__Impl_in_rule__Transformation__Group__10802);
            rule__Transformation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__11_in_rule__Transformation__Group__10805);
            rule__Transformation__Group__11();

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
    // $ANTLR end "rule__Transformation__Group__10"


    // $ANTLR start "rule__Transformation__Group__10__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:434:1: rule__Transformation__Group__10__Impl : ( ';' ) ;
    public final void rule__Transformation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:438:1: ( ( ';' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:439:1: ( ';' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:439:1: ( ';' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:440:1: ';'
            {
             before(grammarAccess.getTransformationAccess().getSemicolonKeyword_10()); 
            match(input,15,FOLLOW_15_in_rule__Transformation__Group__10__Impl833); 
             after(grammarAccess.getTransformationAccess().getSemicolonKeyword_10()); 

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
    // $ANTLR end "rule__Transformation__Group__10__Impl"


    // $ANTLR start "rule__Transformation__Group__11"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:453:1: rule__Transformation__Group__11 : rule__Transformation__Group__11__Impl rule__Transformation__Group__12 ;
    public final void rule__Transformation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:457:1: ( rule__Transformation__Group__11__Impl rule__Transformation__Group__12 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:458:2: rule__Transformation__Group__11__Impl rule__Transformation__Group__12
            {
            pushFollow(FOLLOW_rule__Transformation__Group__11__Impl_in_rule__Transformation__Group__11864);
            rule__Transformation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__12_in_rule__Transformation__Group__11867);
            rule__Transformation__Group__12();

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
    // $ANTLR end "rule__Transformation__Group__11"


    // $ANTLR start "rule__Transformation__Group__11__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:465:1: rule__Transformation__Group__11__Impl : ( ( rule__Transformation__LayerAssignment_11 ) ) ;
    public final void rule__Transformation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:469:1: ( ( ( rule__Transformation__LayerAssignment_11 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:470:1: ( ( rule__Transformation__LayerAssignment_11 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:470:1: ( ( rule__Transformation__LayerAssignment_11 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:471:1: ( rule__Transformation__LayerAssignment_11 )
            {
             before(grammarAccess.getTransformationAccess().getLayerAssignment_11()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:472:1: ( rule__Transformation__LayerAssignment_11 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:472:2: rule__Transformation__LayerAssignment_11
            {
            pushFollow(FOLLOW_rule__Transformation__LayerAssignment_11_in_rule__Transformation__Group__11__Impl894);
            rule__Transformation__LayerAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getLayerAssignment_11()); 

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
    // $ANTLR end "rule__Transformation__Group__11__Impl"


    // $ANTLR start "rule__Transformation__Group__12"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:482:1: rule__Transformation__Group__12 : rule__Transformation__Group__12__Impl rule__Transformation__Group__13 ;
    public final void rule__Transformation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:486:1: ( rule__Transformation__Group__12__Impl rule__Transformation__Group__13 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:487:2: rule__Transformation__Group__12__Impl rule__Transformation__Group__13
            {
            pushFollow(FOLLOW_rule__Transformation__Group__12__Impl_in_rule__Transformation__Group__12924);
            rule__Transformation__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__13_in_rule__Transformation__Group__12927);
            rule__Transformation__Group__13();

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
    // $ANTLR end "rule__Transformation__Group__12"


    // $ANTLR start "rule__Transformation__Group__12__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:494:1: rule__Transformation__Group__12__Impl : ( ';' ) ;
    public final void rule__Transformation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:498:1: ( ( ';' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:499:1: ( ';' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:499:1: ( ';' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:500:1: ';'
            {
             before(grammarAccess.getTransformationAccess().getSemicolonKeyword_12()); 
            match(input,15,FOLLOW_15_in_rule__Transformation__Group__12__Impl955); 
             after(grammarAccess.getTransformationAccess().getSemicolonKeyword_12()); 

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
    // $ANTLR end "rule__Transformation__Group__12__Impl"


    // $ANTLR start "rule__Transformation__Group__13"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:513:1: rule__Transformation__Group__13 : rule__Transformation__Group__13__Impl ;
    public final void rule__Transformation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:517:1: ( rule__Transformation__Group__13__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:518:2: rule__Transformation__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__Transformation__Group__13__Impl_in_rule__Transformation__Group__13986);
            rule__Transformation__Group__13__Impl();

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
    // $ANTLR end "rule__Transformation__Group__13"


    // $ANTLR start "rule__Transformation__Group__13__Impl"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:524:1: rule__Transformation__Group__13__Impl : ( '}' ) ;
    public final void rule__Transformation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:528:1: ( ( '}' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:529:1: ( '}' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:529:1: ( '}' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:530:1: '}'
            {
             before(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_13()); 
            match(input,17,FOLLOW_17_in_rule__Transformation__Group__13__Impl1014); 
             after(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Transformation__Group__13__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:571:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:575:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:576:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_rule__Layer__Group__0__Impl_in_rule__Layer__Group__01073);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group__1_in_rule__Layer__Group__01076);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:583:1: rule__Layer__Group__0__Impl : ( 'apply' ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:587:1: ( ( 'apply' ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:588:1: ( 'apply' )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:588:1: ( 'apply' )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:589:1: 'apply'
            {
             before(grammarAccess.getLayerAccess().getApplyKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Layer__Group__0__Impl1104); 
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:602:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:606:1: ( rule__Layer__Group__1__Impl )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:607:2: rule__Layer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Layer__Group__1__Impl_in_rule__Layer__Group__11135);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:613:1: rule__Layer__Group__1__Impl : ( ( rule__Layer__NameAssignment_1 ) ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:617:1: ( ( ( rule__Layer__NameAssignment_1 ) ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:618:1: ( ( rule__Layer__NameAssignment_1 ) )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:618:1: ( ( rule__Layer__NameAssignment_1 ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:619:1: ( rule__Layer__NameAssignment_1 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_1()); 
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:620:1: ( rule__Layer__NameAssignment_1 )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:620:2: rule__Layer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Layer__NameAssignment_1_in_rule__Layer__Group__1__Impl1162);
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
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:635:1: rule__Transformation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:639:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:640:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:640:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:641:1: RULE_ID
            {
             before(grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transformation__NameAssignment_11201); 
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


    // $ANTLR start "rule__Transformation__ImportURIAssignment_5"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:650:1: rule__Transformation__ImportURIAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Transformation__ImportURIAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:654:1: ( ( RULE_STRING ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:655:1: ( RULE_STRING )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:655:1: ( RULE_STRING )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:656:1: RULE_STRING
            {
             before(grammarAccess.getTransformationAccess().getImportURISTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Transformation__ImportURIAssignment_51232); 
             after(grammarAccess.getTransformationAccess().getImportURISTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Transformation__ImportURIAssignment_5"


    // $ANTLR start "rule__Transformation__FileNameAssignment_9"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:665:1: rule__Transformation__FileNameAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Transformation__FileNameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:669:1: ( ( RULE_STRING ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:670:1: ( RULE_STRING )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:670:1: ( RULE_STRING )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:671:1: RULE_STRING
            {
             before(grammarAccess.getTransformationAccess().getFileNameSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Transformation__FileNameAssignment_91263); 
             after(grammarAccess.getTransformationAccess().getFileNameSTRINGTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Transformation__FileNameAssignment_9"


    // $ANTLR start "rule__Transformation__LayerAssignment_11"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:680:1: rule__Transformation__LayerAssignment_11 : ( ruleLayer ) ;
    public final void rule__Transformation__LayerAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:684:1: ( ( ruleLayer ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:685:1: ( ruleLayer )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:685:1: ( ruleLayer )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:686:1: ruleLayer
            {
             before(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleLayer_in_rule__Transformation__LayerAssignment_111294);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Transformation__LayerAssignment_11"


    // $ANTLR start "rule__Layer__NameAssignment_1"
    // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:695:1: rule__Layer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Layer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:699:1: ( ( RULE_ID ) )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:700:1: ( RULE_ID )
            {
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:700:1: ( RULE_ID )
            // ../org.xtext.project.tdsl.ui/src-gen/org/xtext/project/tdsl/ui/contentassist/antlr/internal/InternalTransfoDsl.g:701:1: RULE_ID
            {
             before(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Layer__NameAssignment_11325); 
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
    public static final BitSet FOLLOW_ruleLayer_in_entryRuleLayer121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayer128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__0_in_ruleLayer154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__0188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__0191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Transformation__Group__0__Impl219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__1250 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__NameAssignment_1_in_rule__Transformation__Group__1__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__2310 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Transformation__Group__2__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__3372 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Transformation__Group__3__Impl403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__4434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transformation__Group__5_in_rule__Transformation__Group__4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Transformation__Group__4__Impl465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__5__Impl_in_rule__Transformation__Group__5496 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__6_in_rule__Transformation__Group__5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__ImportURIAssignment_5_in_rule__Transformation__Group__5__Impl526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__6__Impl_in_rule__Transformation__Group__6556 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__7_in_rule__Transformation__Group__6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Transformation__Group__6__Impl587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__7__Impl_in_rule__Transformation__Group__7618 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__8_in_rule__Transformation__Group__7621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Transformation__Group__7__Impl649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__8__Impl_in_rule__Transformation__Group__8680 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transformation__Group__9_in_rule__Transformation__Group__8683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Transformation__Group__8__Impl711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__9__Impl_in_rule__Transformation__Group__9742 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__10_in_rule__Transformation__Group__9745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__FileNameAssignment_9_in_rule__Transformation__Group__9__Impl772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__10__Impl_in_rule__Transformation__Group__10802 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__11_in_rule__Transformation__Group__10805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Transformation__Group__10__Impl833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__11__Impl_in_rule__Transformation__Group__11864 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__12_in_rule__Transformation__Group__11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__LayerAssignment_11_in_rule__Transformation__Group__11__Impl894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__12__Impl_in_rule__Transformation__Group__12924 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__13_in_rule__Transformation__Group__12927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Transformation__Group__12__Impl955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__13__Impl_in_rule__Transformation__Group__13986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Transformation__Group__13__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__0__Impl_in_rule__Layer__Group__01073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Layer__Group__1_in_rule__Layer__Group__01076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Layer__Group__0__Impl1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__1__Impl_in_rule__Layer__Group__11135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__NameAssignment_1_in_rule__Layer__Group__1__Impl1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transformation__NameAssignment_11201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Transformation__ImportURIAssignment_51232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Transformation__FileNameAssignment_91263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_rule__Transformation__LayerAssignment_111294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Layer__NameAssignment_11325 = new BitSet(new long[]{0x0000000000000002L});

}