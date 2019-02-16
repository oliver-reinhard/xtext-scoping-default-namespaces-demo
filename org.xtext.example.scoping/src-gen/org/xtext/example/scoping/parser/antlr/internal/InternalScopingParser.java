package org.xtext.example.scoping.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.scoping.services.ScopingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScopingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'book'", "'import'", "'.*'", "'.'", "'chapter'", "'{'", "'}'", "'cref'", "'qnref'", "'pref'", "';'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalScopingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScopingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScopingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalScoping.g"; }



     	private ScopingGrammarAccess grammarAccess;

        public InternalScopingParser(TokenStream input, ScopingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Book";
       	}

       	@Override
       	protected ScopingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBook"
    // InternalScoping.g:64:1: entryRuleBook returns [EObject current=null] : iv_ruleBook= ruleBook EOF ;
    public final EObject entryRuleBook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBook = null;


        try {
            // InternalScoping.g:64:45: (iv_ruleBook= ruleBook EOF )
            // InternalScoping.g:65:2: iv_ruleBook= ruleBook EOF
            {
             newCompositeNode(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBook=ruleBook();

            state._fsp--;

             current =iv_ruleBook; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // InternalScoping.g:71:1: ruleBook returns [EObject current=null] : (otherlv_0= 'book' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_chapters_3_0= ruleChapter ) )* ) ;
    public final EObject ruleBook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_chapters_3_0 = null;



        	enterRule();

        try {
            // InternalScoping.g:77:2: ( (otherlv_0= 'book' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_chapters_3_0= ruleChapter ) )* ) )
            // InternalScoping.g:78:2: (otherlv_0= 'book' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_chapters_3_0= ruleChapter ) )* )
            {
            // InternalScoping.g:78:2: (otherlv_0= 'book' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_chapters_3_0= ruleChapter ) )* )
            // InternalScoping.g:79:3: otherlv_0= 'book' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_chapters_3_0= ruleChapter ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBookAccess().getBookKeyword_0());
            		
            // InternalScoping.g:83:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalScoping.g:84:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalScoping.g:84:4: (lv_name_1_0= ruleQualifiedName )
            // InternalScoping.g:85:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getBookAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBookRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.scoping.Scoping.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScoping.g:102:3: ( (lv_imports_2_0= ruleDImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalScoping.g:103:4: (lv_imports_2_0= ruleDImport )
            	    {
            	    // InternalScoping.g:103:4: (lv_imports_2_0= ruleDImport )
            	    // InternalScoping.g:104:5: lv_imports_2_0= ruleDImport
            	    {

            	    					newCompositeNode(grammarAccess.getBookAccess().getImportsDImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleDImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBookRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"org.xtext.example.scoping.Scoping.DImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalScoping.g:121:3: ( (lv_chapters_3_0= ruleChapter ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalScoping.g:122:4: (lv_chapters_3_0= ruleChapter )
            	    {
            	    // InternalScoping.g:122:4: (lv_chapters_3_0= ruleChapter )
            	    // InternalScoping.g:123:5: lv_chapters_3_0= ruleChapter
            	    {

            	    					newCompositeNode(grammarAccess.getBookAccess().getChaptersChapterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_chapters_3_0=ruleChapter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBookRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chapters",
            	    						lv_chapters_3_0,
            	    						"org.xtext.example.scoping.Scoping.Chapter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleDImport"
    // InternalScoping.g:144:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalScoping.g:144:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalScoping.g:145:2: iv_ruleDImport= ruleDImport EOF
            {
             newCompositeNode(grammarAccess.getDImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDImport=ruleDImport();

            state._fsp--;

             current =iv_ruleDImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDImport"


    // $ANTLR start "ruleDImport"
    // InternalScoping.g:151:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalScoping.g:157:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalScoping.g:158:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalScoping.g:158:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalScoping.g:159:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
            		
            // InternalScoping.g:163:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalScoping.g:164:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalScoping.g:164:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalScoping.g:165:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getDImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.example.scoping.Scoping.QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleDImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalScoping.g:186:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalScoping.g:186:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalScoping.g:187:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalScoping.g:193:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalScoping.g:199:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalScoping.g:200:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalScoping.g:200:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalScoping.g:201:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalScoping.g:211:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalScoping.g:212:4: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalScoping.g:222:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalScoping.g:222:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalScoping.g:223:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalScoping.g:229:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalScoping.g:235:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalScoping.g:236:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalScoping.g:236:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalScoping.g:237:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalScoping.g:244:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalScoping.g:245:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleChapter"
    // InternalScoping.g:262:1: entryRuleChapter returns [EObject current=null] : iv_ruleChapter= ruleChapter EOF ;
    public final EObject entryRuleChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapter = null;


        try {
            // InternalScoping.g:262:48: (iv_ruleChapter= ruleChapter EOF )
            // InternalScoping.g:263:2: iv_ruleChapter= ruleChapter EOF
            {
             newCompositeNode(grammarAccess.getChapterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChapter=ruleChapter();

            state._fsp--;

             current =iv_ruleChapter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChapter"


    // $ANTLR start "ruleChapter"
    // InternalScoping.g:269:1: ruleChapter returns [EObject current=null] : (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_chapter_3_0= ruleChapter ) ) | ( (lv_paragraphs_4_0= ruleParagraph ) ) | ( (lv_references_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleChapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_chapter_3_0 = null;

        EObject lv_paragraphs_4_0 = null;

        EObject lv_references_5_0 = null;



        	enterRule();

        try {
            // InternalScoping.g:275:2: ( (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_chapter_3_0= ruleChapter ) ) | ( (lv_paragraphs_4_0= ruleParagraph ) ) | ( (lv_references_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalScoping.g:276:2: (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_chapter_3_0= ruleChapter ) ) | ( (lv_paragraphs_4_0= ruleParagraph ) ) | ( (lv_references_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalScoping.g:276:2: (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_chapter_3_0= ruleChapter ) ) | ( (lv_paragraphs_4_0= ruleParagraph ) ) | ( (lv_references_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalScoping.g:277:3: otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_chapter_3_0= ruleChapter ) ) | ( (lv_paragraphs_4_0= ruleParagraph ) ) | ( (lv_references_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChapterAccess().getChapterKeyword_0());
            		
            // InternalScoping.g:281:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalScoping.g:282:4: (lv_name_1_0= RULE_ID )
            {
            // InternalScoping.g:282:4: (lv_name_1_0= RULE_ID )
            // InternalScoping.g:283:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChapterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalScoping.g:303:3: ( ( (lv_chapter_3_0= ruleChapter ) ) | ( (lv_paragraphs_4_0= ruleParagraph ) ) | ( (lv_references_5_0= ruleReference ) ) )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt5=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt5=2;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalScoping.g:304:4: ( (lv_chapter_3_0= ruleChapter ) )
            	    {
            	    // InternalScoping.g:304:4: ( (lv_chapter_3_0= ruleChapter ) )
            	    // InternalScoping.g:305:5: (lv_chapter_3_0= ruleChapter )
            	    {
            	    // InternalScoping.g:305:5: (lv_chapter_3_0= ruleChapter )
            	    // InternalScoping.g:306:6: lv_chapter_3_0= ruleChapter
            	    {

            	    						newCompositeNode(grammarAccess.getChapterAccess().getChapterChapterParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_chapter_3_0=ruleChapter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChapterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"chapter",
            	    							lv_chapter_3_0,
            	    							"org.xtext.example.scoping.Scoping.Chapter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalScoping.g:324:4: ( (lv_paragraphs_4_0= ruleParagraph ) )
            	    {
            	    // InternalScoping.g:324:4: ( (lv_paragraphs_4_0= ruleParagraph ) )
            	    // InternalScoping.g:325:5: (lv_paragraphs_4_0= ruleParagraph )
            	    {
            	    // InternalScoping.g:325:5: (lv_paragraphs_4_0= ruleParagraph )
            	    // InternalScoping.g:326:6: lv_paragraphs_4_0= ruleParagraph
            	    {

            	    						newCompositeNode(grammarAccess.getChapterAccess().getParagraphsParagraphParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_paragraphs_4_0=ruleParagraph();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChapterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"paragraphs",
            	    							lv_paragraphs_4_0,
            	    							"org.xtext.example.scoping.Scoping.Paragraph");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalScoping.g:344:4: ( (lv_references_5_0= ruleReference ) )
            	    {
            	    // InternalScoping.g:344:4: ( (lv_references_5_0= ruleReference ) )
            	    // InternalScoping.g:345:5: (lv_references_5_0= ruleReference )
            	    {
            	    // InternalScoping.g:345:5: (lv_references_5_0= ruleReference )
            	    // InternalScoping.g:346:6: lv_references_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getChapterAccess().getReferencesReferenceParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_references_5_0=ruleReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChapterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"references",
            	    							lv_references_5_0,
            	    							"org.xtext.example.scoping.Scoping.Reference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleChapter"


    // $ANTLR start "entryRuleParagraph"
    // InternalScoping.g:372:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // InternalScoping.g:372:50: (iv_ruleParagraph= ruleParagraph EOF )
            // InternalScoping.g:373:2: iv_ruleParagraph= ruleParagraph EOF
            {
             newCompositeNode(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;

             current =iv_ruleParagraph; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalScoping.g:379:1: ruleParagraph returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalScoping.g:385:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalScoping.g:386:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalScoping.g:386:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalScoping.g:387:3: (lv_name_0_0= RULE_ID )
            {
            // InternalScoping.g:387:3: (lv_name_0_0= RULE_ID )
            // InternalScoping.g:388:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getParagraphAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParagraphRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleReference"
    // InternalScoping.g:407:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalScoping.g:407:50: (iv_ruleReference= ruleReference EOF )
            // InternalScoping.g:408:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalScoping.g:414:1: ruleReference returns [EObject current=null] : ( ( (otherlv_0= 'cref' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'qnref' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'pref' ( (otherlv_5= RULE_ID ) ) ) ) otherlv_6= ';' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalScoping.g:420:2: ( ( ( (otherlv_0= 'cref' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'qnref' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'pref' ( (otherlv_5= RULE_ID ) ) ) ) otherlv_6= ';' ) )
            // InternalScoping.g:421:2: ( ( (otherlv_0= 'cref' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'qnref' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'pref' ( (otherlv_5= RULE_ID ) ) ) ) otherlv_6= ';' )
            {
            // InternalScoping.g:421:2: ( ( (otherlv_0= 'cref' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'qnref' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'pref' ( (otherlv_5= RULE_ID ) ) ) ) otherlv_6= ';' )
            // InternalScoping.g:422:3: ( (otherlv_0= 'cref' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'qnref' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'pref' ( (otherlv_5= RULE_ID ) ) ) ) otherlv_6= ';'
            {
            // InternalScoping.g:422:3: ( (otherlv_0= 'cref' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'qnref' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'pref' ( (otherlv_5= RULE_ID ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalScoping.g:423:4: (otherlv_0= 'cref' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalScoping.g:423:4: (otherlv_0= 'cref' ( (otherlv_1= RULE_ID ) ) )
                    // InternalScoping.g:424:5: otherlv_0= 'cref' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getCrefKeyword_0_0_0());
                    				
                    // InternalScoping.g:428:5: ( (otherlv_1= RULE_ID ) )
                    // InternalScoping.g:429:6: (otherlv_1= RULE_ID )
                    {
                    // InternalScoping.g:429:6: (otherlv_1= RULE_ID )
                    // InternalScoping.g:430:7: otherlv_1= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getReferenceRule());
                    							}
                    						
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

                    							newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getCrefChapterCrossReference_0_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalScoping.g:443:4: (otherlv_2= 'qnref' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalScoping.g:443:4: (otherlv_2= 'qnref' ( ( ruleQualifiedName ) ) )
                    // InternalScoping.g:444:5: otherlv_2= 'qnref' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getQnrefKeyword_0_1_0());
                    				
                    // InternalScoping.g:448:5: ( ( ruleQualifiedName ) )
                    // InternalScoping.g:449:6: ( ruleQualifiedName )
                    {
                    // InternalScoping.g:449:6: ( ruleQualifiedName )
                    // InternalScoping.g:450:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getReferenceRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getReferenceAccess().getQnrefChapterCrossReference_0_1_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalScoping.g:466:4: (otherlv_4= 'pref' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // InternalScoping.g:466:4: (otherlv_4= 'pref' ( (otherlv_5= RULE_ID ) ) )
                    // InternalScoping.g:467:5: otherlv_4= 'pref' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getPrefKeyword_0_2_0());
                    				
                    // InternalScoping.g:471:5: ( (otherlv_5= RULE_ID ) )
                    // InternalScoping.g:472:6: (otherlv_5= RULE_ID )
                    {
                    // InternalScoping.g:472:6: (otherlv_5= RULE_ID )
                    // InternalScoping.g:473:7: otherlv_5= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getReferenceRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

                    							newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getPrefParagraphCrossReference_0_2_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getReferenceAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001E8010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});

}