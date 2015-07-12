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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transformation'", "'{'", "'}'", "'Generate'", "'Import'", "'apply'", "'Rename class'", "'Delete class'"
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
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:76:1: ruleTransformation returns [EObject current=null] : (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcModel_3_0= ruleSrcModel ) ) ( (lv_layer_4_0= ruleLayer ) )+ ( (lv_targetModel_5_0= ruleTrgModel ) ) otherlv_6= '}' ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_srcModel_3_0 = null;

        EObject lv_layer_4_0 = null;

        EObject lv_targetModel_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:79:28: ( (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcModel_3_0= ruleSrcModel ) ) ( (lv_layer_4_0= ruleLayer ) )+ ( (lv_targetModel_5_0= ruleTrgModel ) ) otherlv_6= '}' ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:80:1: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcModel_3_0= ruleSrcModel ) ) ( (lv_layer_4_0= ruleLayer ) )+ ( (lv_targetModel_5_0= ruleTrgModel ) ) otherlv_6= '}' )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:80:1: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcModel_3_0= ruleSrcModel ) ) ( (lv_layer_4_0= ruleLayer ) )+ ( (lv_targetModel_5_0= ruleTrgModel ) ) otherlv_6= '}' )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:80:3: otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcModel_3_0= ruleSrcModel ) ) ( (lv_layer_4_0= ruleLayer ) )+ ( (lv_targetModel_5_0= ruleTrgModel ) ) otherlv_6= '}'
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
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:106:1: ( (lv_srcModel_3_0= ruleSrcModel ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:107:1: (lv_srcModel_3_0= ruleSrcModel )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:107:1: (lv_srcModel_3_0= ruleSrcModel )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:108:3: lv_srcModel_3_0= ruleSrcModel
            {
             
            	        newCompositeNode(grammarAccess.getTransformationAccess().getSrcModelSrcModelParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSrcModel_in_ruleTransformation177);
            lv_srcModel_3_0=ruleSrcModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransformationRule());
            	        }
                   		add(
                   			current, 
                   			"srcModel",
                    		lv_srcModel_3_0, 
                    		"SrcModel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:124:2: ( (lv_layer_4_0= ruleLayer ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:125:1: (lv_layer_4_0= ruleLayer )
            	    {
            	    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:125:1: (lv_layer_4_0= ruleLayer )
            	    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:126:3: lv_layer_4_0= ruleLayer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLayer_in_ruleTransformation198);
            	    lv_layer_4_0=ruleLayer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"layer",
            	            		lv_layer_4_0, 
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

            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:142:3: ( (lv_targetModel_5_0= ruleTrgModel ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:143:1: (lv_targetModel_5_0= ruleTrgModel )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:143:1: (lv_targetModel_5_0= ruleTrgModel )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:144:3: lv_targetModel_5_0= ruleTrgModel
            {
             
            	        newCompositeNode(grammarAccess.getTransformationAccess().getTargetModelTrgModelParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTrgModel_in_ruleTransformation220);
            lv_targetModel_5_0=ruleTrgModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransformationRule());
            	        }
                   		add(
                   			current, 
                   			"targetModel",
                    		lv_targetModel_5_0, 
                    		"TrgModel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleTransformation232); 

                	newLeafNode(otherlv_6, grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleTrgModel"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:172:1: entryRuleTrgModel returns [EObject current=null] : iv_ruleTrgModel= ruleTrgModel EOF ;
    public final EObject entryRuleTrgModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrgModel = null;


        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:173:2: (iv_ruleTrgModel= ruleTrgModel EOF )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:174:2: iv_ruleTrgModel= ruleTrgModel EOF
            {
             newCompositeNode(grammarAccess.getTrgModelRule()); 
            pushFollow(FOLLOW_ruleTrgModel_in_entryRuleTrgModel268);
            iv_ruleTrgModel=ruleTrgModel();

            state._fsp--;

             current =iv_ruleTrgModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrgModel278); 

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
    // $ANTLR end "entryRuleTrgModel"


    // $ANTLR start "ruleTrgModel"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:181:1: ruleTrgModel returns [EObject current=null] : (otherlv_0= 'Generate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_filepath_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTrgModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_filepath_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:184:28: ( (otherlv_0= 'Generate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_filepath_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:185:1: (otherlv_0= 'Generate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_filepath_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:185:1: (otherlv_0= 'Generate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_filepath_2_0= RULE_STRING ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:185:3: otherlv_0= 'Generate' ( (lv_name_1_0= RULE_ID ) ) ( (lv_filepath_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTrgModel315); 

                	newLeafNode(otherlv_0, grammarAccess.getTrgModelAccess().getGenerateKeyword_0());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:189:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:190:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:190:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:191:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrgModel332); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTrgModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrgModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:207:2: ( (lv_filepath_2_0= RULE_STRING ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:208:1: (lv_filepath_2_0= RULE_STRING )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:208:1: (lv_filepath_2_0= RULE_STRING )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:209:3: lv_filepath_2_0= RULE_STRING
            {
            lv_filepath_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTrgModel354); 

            			newLeafNode(lv_filepath_2_0, grammarAccess.getTrgModelAccess().getFilepathSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrgModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filepath",
                    		lv_filepath_2_0, 
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
    // $ANTLR end "ruleTrgModel"


    // $ANTLR start "entryRuleSrcModel"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:233:1: entryRuleSrcModel returns [EObject current=null] : iv_ruleSrcModel= ruleSrcModel EOF ;
    public final EObject entryRuleSrcModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSrcModel = null;


        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:234:2: (iv_ruleSrcModel= ruleSrcModel EOF )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:235:2: iv_ruleSrcModel= ruleSrcModel EOF
            {
             newCompositeNode(grammarAccess.getSrcModelRule()); 
            pushFollow(FOLLOW_ruleSrcModel_in_entryRuleSrcModel395);
            iv_ruleSrcModel=ruleSrcModel();

            state._fsp--;

             current =iv_ruleSrcModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSrcModel405); 

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
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:242:1: ruleSrcModel returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_name_1_0= RULE_ID ) ) ( (lv_importURI_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSrcModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_importURI_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:245:28: ( (otherlv_0= 'Import' ( (lv_name_1_0= RULE_ID ) ) ( (lv_importURI_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:246:1: (otherlv_0= 'Import' ( (lv_name_1_0= RULE_ID ) ) ( (lv_importURI_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:246:1: (otherlv_0= 'Import' ( (lv_name_1_0= RULE_ID ) ) ( (lv_importURI_2_0= RULE_STRING ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:246:3: otherlv_0= 'Import' ( (lv_name_1_0= RULE_ID ) ) ( (lv_importURI_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSrcModel442); 

                	newLeafNode(otherlv_0, grammarAccess.getSrcModelAccess().getImportKeyword_0());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:250:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:251:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:251:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:252:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSrcModel459); 

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

            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:268:2: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:269:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:269:1: (lv_importURI_2_0= RULE_STRING )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:270:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSrcModel481); 

            			newLeafNode(lv_importURI_2_0, grammarAccess.getSrcModelAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSrcModelRule());
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
    // $ANTLR end "ruleSrcModel"


    // $ANTLR start "entryRuleLayer"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:294:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:295:2: (iv_ruleLayer= ruleLayer EOF )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:296:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_ruleLayer_in_entryRuleLayer522);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayer532); 

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
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:303:1: ruleLayer returns [EObject current=null] : (otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:306:28: ( (otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:307:1: (otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:307:1: (otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:307:3: otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleLayer569); 

                	newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getApplyKeyword_0());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:311:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:312:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:312:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:313:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayer586); 

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

            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:329:2: ( (lv_type_2_0= ruleType ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:330:1: (lv_type_2_0= ruleType )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:330:1: (lv_type_2_0= ruleType )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:331:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getLayerAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleLayer612);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLayerRule());
            	        }
                   		add(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "entryRuleType"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:355:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:356:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:357:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType649);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType660); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:364:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Rename class' | kw= 'Delete class' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:367:28: ( (kw= 'Rename class' | kw= 'Delete class' ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:368:1: (kw= 'Rename class' | kw= 'Delete class' )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:368:1: (kw= 'Rename class' | kw= 'Delete class' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:369:2: kw= 'Rename class'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleType698); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getRenameClassKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:376:2: kw= 'Delete class'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleType717); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getDeleteClassKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTransformation122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransformation139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTransformation156 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSrcModel_in_ruleTransformation177 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleLayer_in_ruleTransformation198 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleTrgModel_in_ruleTransformation220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTransformation232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrgModel_in_entryRuleTrgModel268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrgModel278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTrgModel315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrgModel332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTrgModel354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSrcModel_in_entryRuleSrcModel395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSrcModel405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSrcModel442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSrcModel459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSrcModel481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_entryRuleLayer522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayer532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleLayer569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayer586 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleType_in_ruleLayer612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleType698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleType717 = new BitSet(new long[]{0x0000000000000002L});

}