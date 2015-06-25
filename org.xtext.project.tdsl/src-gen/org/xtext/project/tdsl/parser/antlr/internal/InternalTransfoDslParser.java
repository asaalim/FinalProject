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
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:76:1: ruleTransformation returns [EObject current=null] : (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceModel' otherlv_4= '=' ( (lv_importURI_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'targetModel' otherlv_8= '=' ( (lv_fileName_9_0= RULE_STRING ) ) otherlv_10= ';' ( (lv_layer_11_0= ruleLayer ) ) otherlv_12= ';' otherlv_13= '}' ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_importURI_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_fileName_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_layer_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:79:28: ( (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceModel' otherlv_4= '=' ( (lv_importURI_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'targetModel' otherlv_8= '=' ( (lv_fileName_9_0= RULE_STRING ) ) otherlv_10= ';' ( (lv_layer_11_0= ruleLayer ) ) otherlv_12= ';' otherlv_13= '}' ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:80:1: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceModel' otherlv_4= '=' ( (lv_importURI_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'targetModel' otherlv_8= '=' ( (lv_fileName_9_0= RULE_STRING ) ) otherlv_10= ';' ( (lv_layer_11_0= ruleLayer ) ) otherlv_12= ';' otherlv_13= '}' )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:80:1: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceModel' otherlv_4= '=' ( (lv_importURI_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'targetModel' otherlv_8= '=' ( (lv_fileName_9_0= RULE_STRING ) ) otherlv_10= ';' ( (lv_layer_11_0= ruleLayer ) ) otherlv_12= ';' otherlv_13= '}' )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:80:3: otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceModel' otherlv_4= '=' ( (lv_importURI_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'targetModel' otherlv_8= '=' ( (lv_fileName_9_0= RULE_STRING ) ) otherlv_10= ';' ( (lv_layer_11_0= ruleLayer ) ) otherlv_12= ';' otherlv_13= '}'
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
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleTransformation168); 

                	newLeafNode(otherlv_3, grammarAccess.getTransformationAccess().getSourceModelKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTransformation180); 

                	newLeafNode(otherlv_4, grammarAccess.getTransformationAccess().getEqualsSignKeyword_4());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:114:1: ( (lv_importURI_5_0= RULE_STRING ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:115:1: (lv_importURI_5_0= RULE_STRING )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:115:1: (lv_importURI_5_0= RULE_STRING )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:116:3: lv_importURI_5_0= RULE_STRING
            {
            lv_importURI_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransformation197); 

            			newLeafNode(lv_importURI_5_0, grammarAccess.getTransformationAccess().getImportURISTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransformationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleTransformation214); 

                	newLeafNode(otherlv_6, grammarAccess.getTransformationAccess().getSemicolonKeyword_6());
                
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleTransformation226); 

                	newLeafNode(otherlv_7, grammarAccess.getTransformationAccess().getTargetModelKeyword_7());
                
            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleTransformation238); 

                	newLeafNode(otherlv_8, grammarAccess.getTransformationAccess().getEqualsSignKeyword_8());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:144:1: ( (lv_fileName_9_0= RULE_STRING ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:145:1: (lv_fileName_9_0= RULE_STRING )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:145:1: (lv_fileName_9_0= RULE_STRING )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:146:3: lv_fileName_9_0= RULE_STRING
            {
            lv_fileName_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransformation255); 

            			newLeafNode(lv_fileName_9_0, grammarAccess.getTransformationAccess().getFileNameSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransformationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fileName",
                    		lv_fileName_9_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleTransformation272); 

                	newLeafNode(otherlv_10, grammarAccess.getTransformationAccess().getSemicolonKeyword_10());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:166:1: ( (lv_layer_11_0= ruleLayer ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:167:1: (lv_layer_11_0= ruleLayer )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:167:1: (lv_layer_11_0= ruleLayer )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:168:3: lv_layer_11_0= ruleLayer
            {
             
            	        newCompositeNode(grammarAccess.getTransformationAccess().getLayerLayerParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleLayer_in_ruleTransformation293);
            lv_layer_11_0=ruleLayer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransformationRule());
            	        }
                   		add(
                   			current, 
                   			"layer",
                    		lv_layer_11_0, 
                    		"Layer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleTransformation305); 

                	newLeafNode(otherlv_12, grammarAccess.getTransformationAccess().getSemicolonKeyword_12());
                
            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleTransformation317); 

                	newLeafNode(otherlv_13, grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_13());
                

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


    // $ANTLR start "entryRuleLayer"
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:200:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:201:2: (iv_ruleLayer= ruleLayer EOF )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:202:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_ruleLayer_in_entryRuleLayer353);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayer363); 

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
    // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:209:1: ruleLayer returns [EObject current=null] : (otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:212:28: ( (otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:213:1: (otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:213:1: (otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:213:3: otherlv_0= 'apply' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleLayer400); 

                	newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getApplyKeyword_0());
                
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:217:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:218:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:218:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.project.tdsl/src-gen/org/xtext/project/tdsl/parser/antlr/internal/InternalTransfoDsl.g:219:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayer417); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTransformation122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransformation139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTransformation156 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTransformation168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTransformation180 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransformation197 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTransformation214 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTransformation226 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTransformation238 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransformation255 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTransformation272 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleLayer_in_ruleTransformation293 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTransformation305 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTransformation317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_entryRuleLayer353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayer363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleLayer400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayer417 = new BitSet(new long[]{0x0000000000000002L});

}