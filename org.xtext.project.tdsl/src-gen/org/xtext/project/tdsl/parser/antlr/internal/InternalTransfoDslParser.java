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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTransfoDslParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g"; }



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



    // $ANTLR start "entryRuleTransformation"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:67:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:68:2: (iv_ruleTransformation= ruleTransformation EOF )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:69:2: iv_ruleTransformation= ruleTransformation EOF
            {
             newCompositeNode(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_ruleTransformation_in_entryRuleTransformation75);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;

             current =iv_ruleTransformation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransformation85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:76:1: ruleTransformation returns [EObject current=null] : (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcmetamodel_3_0= ruleSrcMetamodel ) ) ( (lv_srcmodel_4_0= ruleSrcModel ) ) ( (lv_layer_5_0= ruleLayer ) )+ ( (lv_targetmetamodel_6_0= ruleTrgMetamodel ) ) otherlv_7= '}' ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_srcmetamodel_3_0 = null;

        EObject lv_srcmodel_4_0 = null;

        EObject lv_layer_5_0 = null;

        EObject lv_targetmetamodel_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:79:28: ( (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcmetamodel_3_0= ruleSrcMetamodel ) ) ( (lv_srcmodel_4_0= ruleSrcModel ) ) ( (lv_layer_5_0= ruleLayer ) )+ ( (lv_targetmetamodel_6_0= ruleTrgMetamodel ) ) otherlv_7= '}' ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:80:1: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcmetamodel_3_0= ruleSrcMetamodel ) ) ( (lv_srcmodel_4_0= ruleSrcModel ) ) ( (lv_layer_5_0= ruleLayer ) )+ ( (lv_targetmetamodel_6_0= ruleTrgMetamodel ) ) otherlv_7= '}' )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:80:1: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcmetamodel_3_0= ruleSrcMetamodel ) ) ( (lv_srcmodel_4_0= ruleSrcModel ) ) ( (lv_layer_5_0= ruleLayer ) )+ ( (lv_targetmetamodel_6_0= ruleTrgMetamodel ) ) otherlv_7= '}' )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:80:3: otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcmetamodel_3_0= ruleSrcMetamodel ) ) ( (lv_srcmodel_4_0= ruleSrcModel ) ) ( (lv_layer_5_0= ruleLayer ) )+ ( (lv_targetmetamodel_6_0= ruleTrgMetamodel ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleTransformation122); 

                	newLeafNode(otherlv_0, grammarAccess.getTransformationAccess().getTransformationKeyword_0());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransformation139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransformationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTransformation156); 

                	newLeafNode(otherlv_2, grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:106:1: ( (lv_srcmetamodel_3_0= ruleSrcMetamodel ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:107:1: (lv_srcmetamodel_3_0= ruleSrcMetamodel )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:107:1: (lv_srcmetamodel_3_0= ruleSrcMetamodel )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:108:3: lv_srcmetamodel_3_0= ruleSrcMetamodel
            {
             
            	        newCompositeNode(grammarAccess.getTransformationAccess().getSrcmetamodelSrcMetamodelParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSrcMetamodel_in_ruleTransformation177);
            lv_srcmetamodel_3_0=ruleSrcMetamodel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransformationRule());
            	        }
                   		set(
                   			current, 
                   			"srcmetamodel",
                    		lv_srcmetamodel_3_0, 
                    		"SrcMetamodel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:124:2: ( (lv_srcmodel_4_0= ruleSrcModel ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:125:1: (lv_srcmodel_4_0= ruleSrcModel )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:125:1: (lv_srcmodel_4_0= ruleSrcModel )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:126:3: lv_srcmodel_4_0= ruleSrcModel
            {
             
            	        newCompositeNode(grammarAccess.getTransformationAccess().getSrcmodelSrcModelParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSrcModel_in_ruleTransformation198);
            lv_srcmodel_4_0=ruleSrcModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransformationRule());
            	        }
                   		set(
                   			current, 
                   			"srcmodel",
                    		lv_srcmodel_4_0, 
                    		"SrcModel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:142:2: ( (lv_layer_5_0= ruleLayer ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:143:1: (lv_layer_5_0= ruleLayer )
            	    {
            	    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:143:1: (lv_layer_5_0= ruleLayer )
            	    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:144:3: lv_layer_5_0= ruleLayer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLayer_in_ruleTransformation219);
            	    lv_layer_5_0=ruleLayer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"layer",
            	            		lv_layer_5_0, 
            	            		"Layer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:160:3: ( (lv_targetmetamodel_6_0= ruleTrgMetamodel ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:161:1: (lv_targetmetamodel_6_0= ruleTrgMetamodel )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:161:1: (lv_targetmetamodel_6_0= ruleTrgMetamodel )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:162:3: lv_targetmetamodel_6_0= ruleTrgMetamodel
            {
             
            	        newCompositeNode(grammarAccess.getTransformationAccess().getTargetmetamodelTrgMetamodelParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTrgMetamodel_in_ruleTransformation241);
            lv_targetmetamodel_6_0=ruleTrgMetamodel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransformationRule());
            	        }
                   		set(
                   			current, 
                   			"targetmetamodel",
                    		lv_targetmetamodel_6_0, 
                    		"TrgMetamodel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleTransformation253); 

                	newLeafNode(otherlv_7, grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleSrcMetamodel"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:190:1: entryRuleSrcMetamodel returns [EObject current=null] : iv_ruleSrcMetamodel= ruleSrcMetamodel EOF ;
    public final EObject entryRuleSrcMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSrcMetamodel = null;


        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:191:2: (iv_ruleSrcMetamodel= ruleSrcMetamodel EOF )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:192:2: iv_ruleSrcMetamodel= ruleSrcMetamodel EOF
            {
             newCompositeNode(grammarAccess.getSrcMetamodelRule()); 
            pushFollow(FOLLOW_ruleSrcMetamodel_in_entryRuleSrcMetamodel289);
            iv_ruleSrcMetamodel=ruleSrcMetamodel();

            state._fsp--;

             current =iv_ruleSrcMetamodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSrcMetamodel299); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSrcMetamodel"


    // $ANTLR start "ruleSrcMetamodel"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:199:1: ruleSrcMetamodel returns [EObject current=null] : (otherlv_0= 'USE' ( (lv_name_1_0= RULE_ID ) ) ( (lv_importURI_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSrcMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_importURI_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:202:28: ( (otherlv_0= 'USE' ( (lv_name_1_0= RULE_ID ) ) ( (lv_importURI_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:203:1: (otherlv_0= 'USE' ( (lv_name_1_0= RULE_ID ) ) ( (lv_importURI_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:203:1: (otherlv_0= 'USE' ( (lv_name_1_0= RULE_ID ) ) ( (lv_importURI_2_0= RULE_STRING ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:203:3: otherlv_0= 'USE' ( (lv_name_1_0= RULE_ID ) ) ( (lv_importURI_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSrcMetamodel336); 

                	newLeafNode(otherlv_0, grammarAccess.getSrcMetamodelAccess().getUSEKeyword_0());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:207:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:208:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:208:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:209:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSrcMetamodel353); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSrcMetamodelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSrcMetamodelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:225:2: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:226:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:226:1: (lv_importURI_2_0= RULE_STRING )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:227:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSrcMetamodel375); 

            			newLeafNode(lv_importURI_2_0, grammarAccess.getSrcMetamodelAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSrcMetamodelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSrcMetamodel"


    // $ANTLR start "entryRuleSrcModel"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:251:1: entryRuleSrcModel returns [EObject current=null] : iv_ruleSrcModel= ruleSrcModel EOF ;
    public final EObject entryRuleSrcModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSrcModel = null;


        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:252:2: (iv_ruleSrcModel= ruleSrcModel EOF )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:253:2: iv_ruleSrcModel= ruleSrcModel EOF
            {
             newCompositeNode(grammarAccess.getSrcModelRule()); 
            pushFollow(FOLLOW_ruleSrcModel_in_entryRuleSrcModel416);
            iv_ruleSrcModel=ruleSrcModel();

            state._fsp--;

             current =iv_ruleSrcModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSrcModel426); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSrcModel"


    // $ANTLR start "ruleSrcModel"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:260:1: ruleSrcModel returns [EObject current=null] : (otherlv_0= 'IN' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'conforms' ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleSrcModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:263:28: ( (otherlv_0= 'IN' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'conforms' ( (otherlv_3= RULE_ID ) ) ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:264:1: (otherlv_0= 'IN' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'conforms' ( (otherlv_3= RULE_ID ) ) ) )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:264:1: (otherlv_0= 'IN' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'conforms' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:264:3: otherlv_0= 'IN' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'conforms' ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSrcModel463); 

                	newLeafNode(otherlv_0, grammarAccess.getSrcModelAccess().getINKeyword_0());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:268:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:269:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:269:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:270:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSrcModel480); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSrcModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSrcModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:286:2: (otherlv_2= 'conforms' ( (otherlv_3= RULE_ID ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:286:4: otherlv_2= 'conforms' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSrcModel498); 

                	newLeafNode(otherlv_2, grammarAccess.getSrcModelAccess().getConformsKeyword_2_0());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:290:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:291:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:291:1: (otherlv_3= RULE_ID )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:292:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSrcModelRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSrcModel518); 

            		newLeafNode(otherlv_3, grammarAccess.getSrcModelAccess().getSourcemetamodelSrcMetamodelCrossReference_2_1_0()); 
            	

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSrcModel"


    // $ANTLR start "entryRuleLayer"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:311:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:312:2: (iv_ruleLayer= ruleLayer EOF )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:313:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_ruleLayer_in_entryRuleLayer555);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayer565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:320:1: ruleLayer returns [EObject current=null] : (otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:323:28: ( (otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:324:1: (otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:324:1: (otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:324:3: otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleLayer602); 

                	newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getApplyKeyword_0());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:328:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:329:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:329:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:330:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayer619); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleTrgMetamodel"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:354:1: entryRuleTrgMetamodel returns [EObject current=null] : iv_ruleTrgMetamodel= ruleTrgMetamodel EOF ;
    public final EObject entryRuleTrgMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrgMetamodel = null;


        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:355:2: (iv_ruleTrgMetamodel= ruleTrgMetamodel EOF )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:356:2: iv_ruleTrgMetamodel= ruleTrgMetamodel EOF
            {
             newCompositeNode(grammarAccess.getTrgMetamodelRule()); 
            pushFollow(FOLLOW_ruleTrgMetamodel_in_entryRuleTrgMetamodel660);
            iv_ruleTrgMetamodel=ruleTrgMetamodel();

            state._fsp--;

             current =iv_ruleTrgMetamodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrgMetamodel670); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrgMetamodel"


    // $ANTLR start "ruleTrgMetamodel"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:363:1: ruleTrgMetamodel returns [EObject current=null] : (otherlv_0= 'OUT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nsuri_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTrgMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nsuri_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:366:28: ( (otherlv_0= 'OUT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nsuri_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:367:1: (otherlv_0= 'OUT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nsuri_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:367:1: (otherlv_0= 'OUT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nsuri_2_0= RULE_STRING ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:367:3: otherlv_0= 'OUT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nsuri_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTrgMetamodel707); 

                	newLeafNode(otherlv_0, grammarAccess.getTrgMetamodelAccess().getOUTKeyword_0());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:371:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:372:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:372:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:373:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrgMetamodel724); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTrgMetamodelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrgMetamodelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:389:2: ( (lv_nsuri_2_0= RULE_STRING ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:390:1: (lv_nsuri_2_0= RULE_STRING )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:390:1: (lv_nsuri_2_0= RULE_STRING )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:391:3: lv_nsuri_2_0= RULE_STRING
            {
            lv_nsuri_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTrgMetamodel746); 

            			newLeafNode(lv_nsuri_2_0, grammarAccess.getTrgMetamodelAccess().getNsuriSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrgMetamodelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nsuri",
                    		lv_nsuri_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrgMetamodel"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTransformation122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransformation139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTransformation156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleSrcMetamodel_in_ruleTransformation177 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSrcModel_in_ruleTransformation198 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleLayer_in_ruleTransformation219 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleTrgMetamodel_in_ruleTransformation241 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTransformation253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSrcMetamodel_in_entryRuleSrcMetamodel289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSrcMetamodel299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSrcMetamodel336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSrcMetamodel353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSrcMetamodel375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSrcModel_in_entryRuleSrcModel416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSrcModel426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSrcModel463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSrcModel480 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSrcModel498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSrcModel518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_entryRuleLayer555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayer565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLayer602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayer619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrgMetamodel_in_entryRuleTrgMetamodel660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrgMetamodel670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTrgMetamodel707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrgMetamodel724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTrgMetamodel746 = new BitSet(new long[]{0x0000000000000002L});

}