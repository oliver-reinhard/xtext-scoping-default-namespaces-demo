package org.xtext.example.scoping.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.scoping.services.ScopingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScopingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'book'", "'import'", "'.*'", "'.'", "'chapter'", "'{'", "'}'", "';'", "'cref'", "'qnref'", "'pref'"
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

    	public void setGrammarAccess(ScopingGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleBook"
    // InternalScoping.g:53:1: entryRuleBook : ruleBook EOF ;
    public final void entryRuleBook() throws RecognitionException {
        try {
            // InternalScoping.g:54:1: ( ruleBook EOF )
            // InternalScoping.g:55:1: ruleBook EOF
            {
             before(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_1);
            ruleBook();

            state._fsp--;

             after(grammarAccess.getBookRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // InternalScoping.g:62:1: ruleBook : ( ( rule__Book__Group__0 ) ) ;
    public final void ruleBook() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:66:2: ( ( ( rule__Book__Group__0 ) ) )
            // InternalScoping.g:67:2: ( ( rule__Book__Group__0 ) )
            {
            // InternalScoping.g:67:2: ( ( rule__Book__Group__0 ) )
            // InternalScoping.g:68:3: ( rule__Book__Group__0 )
            {
             before(grammarAccess.getBookAccess().getGroup()); 
            // InternalScoping.g:69:3: ( rule__Book__Group__0 )
            // InternalScoping.g:69:4: rule__Book__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getGroup()); 

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
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleDImport"
    // InternalScoping.g:78:1: entryRuleDImport : ruleDImport EOF ;
    public final void entryRuleDImport() throws RecognitionException {
        try {
            // InternalScoping.g:79:1: ( ruleDImport EOF )
            // InternalScoping.g:80:1: ruleDImport EOF
            {
             before(grammarAccess.getDImportRule()); 
            pushFollow(FOLLOW_1);
            ruleDImport();

            state._fsp--;

             after(grammarAccess.getDImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDImport"


    // $ANTLR start "ruleDImport"
    // InternalScoping.g:87:1: ruleDImport : ( ( rule__DImport__Group__0 ) ) ;
    public final void ruleDImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:91:2: ( ( ( rule__DImport__Group__0 ) ) )
            // InternalScoping.g:92:2: ( ( rule__DImport__Group__0 ) )
            {
            // InternalScoping.g:92:2: ( ( rule__DImport__Group__0 ) )
            // InternalScoping.g:93:3: ( rule__DImport__Group__0 )
            {
             before(grammarAccess.getDImportAccess().getGroup()); 
            // InternalScoping.g:94:3: ( rule__DImport__Group__0 )
            // InternalScoping.g:94:4: rule__DImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDImportAccess().getGroup()); 

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
    // $ANTLR end "ruleDImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalScoping.g:103:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalScoping.g:104:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalScoping.g:105:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalScoping.g:112:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:116:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalScoping.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalScoping.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalScoping.g:118:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalScoping.g:119:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalScoping.g:119:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalScoping.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalScoping.g:129:1: ( ruleQualifiedName EOF )
            // InternalScoping.g:130:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalScoping.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalScoping.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalScoping.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalScoping.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalScoping.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalScoping.g:144:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleChapter"
    // InternalScoping.g:153:1: entryRuleChapter : ruleChapter EOF ;
    public final void entryRuleChapter() throws RecognitionException {
        try {
            // InternalScoping.g:154:1: ( ruleChapter EOF )
            // InternalScoping.g:155:1: ruleChapter EOF
            {
             before(grammarAccess.getChapterRule()); 
            pushFollow(FOLLOW_1);
            ruleChapter();

            state._fsp--;

             after(grammarAccess.getChapterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChapter"


    // $ANTLR start "ruleChapter"
    // InternalScoping.g:162:1: ruleChapter : ( ( rule__Chapter__Group__0 ) ) ;
    public final void ruleChapter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:166:2: ( ( ( rule__Chapter__Group__0 ) ) )
            // InternalScoping.g:167:2: ( ( rule__Chapter__Group__0 ) )
            {
            // InternalScoping.g:167:2: ( ( rule__Chapter__Group__0 ) )
            // InternalScoping.g:168:3: ( rule__Chapter__Group__0 )
            {
             before(grammarAccess.getChapterAccess().getGroup()); 
            // InternalScoping.g:169:3: ( rule__Chapter__Group__0 )
            // InternalScoping.g:169:4: rule__Chapter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChapterAccess().getGroup()); 

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
    // $ANTLR end "ruleChapter"


    // $ANTLR start "entryRuleParagraph"
    // InternalScoping.g:178:1: entryRuleParagraph : ruleParagraph EOF ;
    public final void entryRuleParagraph() throws RecognitionException {
        try {
            // InternalScoping.g:179:1: ( ruleParagraph EOF )
            // InternalScoping.g:180:1: ruleParagraph EOF
            {
             before(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_1);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getParagraphRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalScoping.g:187:1: ruleParagraph : ( ( rule__Paragraph__NameAssignment ) ) ;
    public final void ruleParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:191:2: ( ( ( rule__Paragraph__NameAssignment ) ) )
            // InternalScoping.g:192:2: ( ( rule__Paragraph__NameAssignment ) )
            {
            // InternalScoping.g:192:2: ( ( rule__Paragraph__NameAssignment ) )
            // InternalScoping.g:193:3: ( rule__Paragraph__NameAssignment )
            {
             before(grammarAccess.getParagraphAccess().getNameAssignment()); 
            // InternalScoping.g:194:3: ( rule__Paragraph__NameAssignment )
            // InternalScoping.g:194:4: rule__Paragraph__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleReference"
    // InternalScoping.g:203:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalScoping.g:204:1: ( ruleReference EOF )
            // InternalScoping.g:205:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalScoping.g:212:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:216:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalScoping.g:217:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalScoping.g:217:2: ( ( rule__Reference__Group__0 ) )
            // InternalScoping.g:218:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalScoping.g:219:3: ( rule__Reference__Group__0 )
            // InternalScoping.g:219:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "rule__Chapter__Alternatives_3"
    // InternalScoping.g:227:1: rule__Chapter__Alternatives_3 : ( ( ( rule__Chapter__ChapterAssignment_3_0 ) ) | ( ( rule__Chapter__ParagraphsAssignment_3_1 ) ) | ( ( rule__Chapter__ReferencesAssignment_3_2 ) ) );
    public final void rule__Chapter__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:231:1: ( ( ( rule__Chapter__ChapterAssignment_3_0 ) ) | ( ( rule__Chapter__ParagraphsAssignment_3_1 ) ) | ( ( rule__Chapter__ReferencesAssignment_3_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                alt1=2;
                }
                break;
            case 19:
            case 20:
            case 21:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalScoping.g:232:2: ( ( rule__Chapter__ChapterAssignment_3_0 ) )
                    {
                    // InternalScoping.g:232:2: ( ( rule__Chapter__ChapterAssignment_3_0 ) )
                    // InternalScoping.g:233:3: ( rule__Chapter__ChapterAssignment_3_0 )
                    {
                     before(grammarAccess.getChapterAccess().getChapterAssignment_3_0()); 
                    // InternalScoping.g:234:3: ( rule__Chapter__ChapterAssignment_3_0 )
                    // InternalScoping.g:234:4: rule__Chapter__ChapterAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chapter__ChapterAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChapterAccess().getChapterAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScoping.g:238:2: ( ( rule__Chapter__ParagraphsAssignment_3_1 ) )
                    {
                    // InternalScoping.g:238:2: ( ( rule__Chapter__ParagraphsAssignment_3_1 ) )
                    // InternalScoping.g:239:3: ( rule__Chapter__ParagraphsAssignment_3_1 )
                    {
                     before(grammarAccess.getChapterAccess().getParagraphsAssignment_3_1()); 
                    // InternalScoping.g:240:3: ( rule__Chapter__ParagraphsAssignment_3_1 )
                    // InternalScoping.g:240:4: rule__Chapter__ParagraphsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chapter__ParagraphsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getChapterAccess().getParagraphsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScoping.g:244:2: ( ( rule__Chapter__ReferencesAssignment_3_2 ) )
                    {
                    // InternalScoping.g:244:2: ( ( rule__Chapter__ReferencesAssignment_3_2 ) )
                    // InternalScoping.g:245:3: ( rule__Chapter__ReferencesAssignment_3_2 )
                    {
                     before(grammarAccess.getChapterAccess().getReferencesAssignment_3_2()); 
                    // InternalScoping.g:246:3: ( rule__Chapter__ReferencesAssignment_3_2 )
                    // InternalScoping.g:246:4: rule__Chapter__ReferencesAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chapter__ReferencesAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getChapterAccess().getReferencesAssignment_3_2()); 

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
    // $ANTLR end "rule__Chapter__Alternatives_3"


    // $ANTLR start "rule__Reference__Alternatives_0"
    // InternalScoping.g:254:1: rule__Reference__Alternatives_0 : ( ( ( rule__Reference__Group_0_0__0 ) ) | ( ( rule__Reference__Group_0_1__0 ) ) | ( ( rule__Reference__Group_0_2__0 ) ) );
    public final void rule__Reference__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:258:1: ( ( ( rule__Reference__Group_0_0__0 ) ) | ( ( rule__Reference__Group_0_1__0 ) ) | ( ( rule__Reference__Group_0_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalScoping.g:259:2: ( ( rule__Reference__Group_0_0__0 ) )
                    {
                    // InternalScoping.g:259:2: ( ( rule__Reference__Group_0_0__0 ) )
                    // InternalScoping.g:260:3: ( rule__Reference__Group_0_0__0 )
                    {
                     before(grammarAccess.getReferenceAccess().getGroup_0_0()); 
                    // InternalScoping.g:261:3: ( rule__Reference__Group_0_0__0 )
                    // InternalScoping.g:261:4: rule__Reference__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScoping.g:265:2: ( ( rule__Reference__Group_0_1__0 ) )
                    {
                    // InternalScoping.g:265:2: ( ( rule__Reference__Group_0_1__0 ) )
                    // InternalScoping.g:266:3: ( rule__Reference__Group_0_1__0 )
                    {
                     before(grammarAccess.getReferenceAccess().getGroup_0_1()); 
                    // InternalScoping.g:267:3: ( rule__Reference__Group_0_1__0 )
                    // InternalScoping.g:267:4: rule__Reference__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScoping.g:271:2: ( ( rule__Reference__Group_0_2__0 ) )
                    {
                    // InternalScoping.g:271:2: ( ( rule__Reference__Group_0_2__0 ) )
                    // InternalScoping.g:272:3: ( rule__Reference__Group_0_2__0 )
                    {
                     before(grammarAccess.getReferenceAccess().getGroup_0_2()); 
                    // InternalScoping.g:273:3: ( rule__Reference__Group_0_2__0 )
                    // InternalScoping.g:273:4: rule__Reference__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getGroup_0_2()); 

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
    // $ANTLR end "rule__Reference__Alternatives_0"


    // $ANTLR start "rule__Book__Group__0"
    // InternalScoping.g:281:1: rule__Book__Group__0 : rule__Book__Group__0__Impl rule__Book__Group__1 ;
    public final void rule__Book__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:285:1: ( rule__Book__Group__0__Impl rule__Book__Group__1 )
            // InternalScoping.g:286:2: rule__Book__Group__0__Impl rule__Book__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Book__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__1();

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
    // $ANTLR end "rule__Book__Group__0"


    // $ANTLR start "rule__Book__Group__0__Impl"
    // InternalScoping.g:293:1: rule__Book__Group__0__Impl : ( 'book' ) ;
    public final void rule__Book__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:297:1: ( ( 'book' ) )
            // InternalScoping.g:298:1: ( 'book' )
            {
            // InternalScoping.g:298:1: ( 'book' )
            // InternalScoping.g:299:2: 'book'
            {
             before(grammarAccess.getBookAccess().getBookKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getBookKeyword_0()); 

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
    // $ANTLR end "rule__Book__Group__0__Impl"


    // $ANTLR start "rule__Book__Group__1"
    // InternalScoping.g:308:1: rule__Book__Group__1 : rule__Book__Group__1__Impl rule__Book__Group__2 ;
    public final void rule__Book__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:312:1: ( rule__Book__Group__1__Impl rule__Book__Group__2 )
            // InternalScoping.g:313:2: rule__Book__Group__1__Impl rule__Book__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Book__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__2();

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
    // $ANTLR end "rule__Book__Group__1"


    // $ANTLR start "rule__Book__Group__1__Impl"
    // InternalScoping.g:320:1: rule__Book__Group__1__Impl : ( ( rule__Book__NameAssignment_1 ) ) ;
    public final void rule__Book__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:324:1: ( ( ( rule__Book__NameAssignment_1 ) ) )
            // InternalScoping.g:325:1: ( ( rule__Book__NameAssignment_1 ) )
            {
            // InternalScoping.g:325:1: ( ( rule__Book__NameAssignment_1 ) )
            // InternalScoping.g:326:2: ( rule__Book__NameAssignment_1 )
            {
             before(grammarAccess.getBookAccess().getNameAssignment_1()); 
            // InternalScoping.g:327:2: ( rule__Book__NameAssignment_1 )
            // InternalScoping.g:327:3: rule__Book__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Book__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Book__Group__1__Impl"


    // $ANTLR start "rule__Book__Group__2"
    // InternalScoping.g:335:1: rule__Book__Group__2 : rule__Book__Group__2__Impl rule__Book__Group__3 ;
    public final void rule__Book__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:339:1: ( rule__Book__Group__2__Impl rule__Book__Group__3 )
            // InternalScoping.g:340:2: rule__Book__Group__2__Impl rule__Book__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Book__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__3();

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
    // $ANTLR end "rule__Book__Group__2"


    // $ANTLR start "rule__Book__Group__2__Impl"
    // InternalScoping.g:347:1: rule__Book__Group__2__Impl : ( ( rule__Book__ImportsAssignment_2 )* ) ;
    public final void rule__Book__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:351:1: ( ( ( rule__Book__ImportsAssignment_2 )* ) )
            // InternalScoping.g:352:1: ( ( rule__Book__ImportsAssignment_2 )* )
            {
            // InternalScoping.g:352:1: ( ( rule__Book__ImportsAssignment_2 )* )
            // InternalScoping.g:353:2: ( rule__Book__ImportsAssignment_2 )*
            {
             before(grammarAccess.getBookAccess().getImportsAssignment_2()); 
            // InternalScoping.g:354:2: ( rule__Book__ImportsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalScoping.g:354:3: rule__Book__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Book__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getBookAccess().getImportsAssignment_2()); 

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
    // $ANTLR end "rule__Book__Group__2__Impl"


    // $ANTLR start "rule__Book__Group__3"
    // InternalScoping.g:362:1: rule__Book__Group__3 : rule__Book__Group__3__Impl ;
    public final void rule__Book__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:366:1: ( rule__Book__Group__3__Impl )
            // InternalScoping.g:367:2: rule__Book__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group__3__Impl();

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
    // $ANTLR end "rule__Book__Group__3"


    // $ANTLR start "rule__Book__Group__3__Impl"
    // InternalScoping.g:373:1: rule__Book__Group__3__Impl : ( ( rule__Book__ChaptersAssignment_3 )* ) ;
    public final void rule__Book__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:377:1: ( ( ( rule__Book__ChaptersAssignment_3 )* ) )
            // InternalScoping.g:378:1: ( ( rule__Book__ChaptersAssignment_3 )* )
            {
            // InternalScoping.g:378:1: ( ( rule__Book__ChaptersAssignment_3 )* )
            // InternalScoping.g:379:2: ( rule__Book__ChaptersAssignment_3 )*
            {
             before(grammarAccess.getBookAccess().getChaptersAssignment_3()); 
            // InternalScoping.g:380:2: ( rule__Book__ChaptersAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalScoping.g:380:3: rule__Book__ChaptersAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Book__ChaptersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getBookAccess().getChaptersAssignment_3()); 

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
    // $ANTLR end "rule__Book__Group__3__Impl"


    // $ANTLR start "rule__DImport__Group__0"
    // InternalScoping.g:389:1: rule__DImport__Group__0 : rule__DImport__Group__0__Impl rule__DImport__Group__1 ;
    public final void rule__DImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:393:1: ( rule__DImport__Group__0__Impl rule__DImport__Group__1 )
            // InternalScoping.g:394:2: rule__DImport__Group__0__Impl rule__DImport__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DImport__Group__1();

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
    // $ANTLR end "rule__DImport__Group__0"


    // $ANTLR start "rule__DImport__Group__0__Impl"
    // InternalScoping.g:401:1: rule__DImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__DImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:405:1: ( ( 'import' ) )
            // InternalScoping.g:406:1: ( 'import' )
            {
            // InternalScoping.g:406:1: ( 'import' )
            // InternalScoping.g:407:2: 'import'
            {
             before(grammarAccess.getDImportAccess().getImportKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__DImport__Group__0__Impl"


    // $ANTLR start "rule__DImport__Group__1"
    // InternalScoping.g:416:1: rule__DImport__Group__1 : rule__DImport__Group__1__Impl ;
    public final void rule__DImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:420:1: ( rule__DImport__Group__1__Impl )
            // InternalScoping.g:421:2: rule__DImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DImport__Group__1__Impl();

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
    // $ANTLR end "rule__DImport__Group__1"


    // $ANTLR start "rule__DImport__Group__1__Impl"
    // InternalScoping.g:427:1: rule__DImport__Group__1__Impl : ( ( rule__DImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__DImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:431:1: ( ( ( rule__DImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalScoping.g:432:1: ( ( rule__DImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalScoping.g:432:1: ( ( rule__DImport__ImportedNamespaceAssignment_1 ) )
            // InternalScoping.g:433:2: ( rule__DImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getDImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalScoping.g:434:2: ( rule__DImport__ImportedNamespaceAssignment_1 )
            // InternalScoping.g:434:3: rule__DImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DImport__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__DImport__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalScoping.g:443:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:447:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalScoping.g:448:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalScoping.g:455:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:459:1: ( ( ruleQualifiedName ) )
            // InternalScoping.g:460:1: ( ruleQualifiedName )
            {
            // InternalScoping.g:460:1: ( ruleQualifiedName )
            // InternalScoping.g:461:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalScoping.g:470:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:474:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalScoping.g:475:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalScoping.g:481:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:485:1: ( ( ( '.*' )? ) )
            // InternalScoping.g:486:1: ( ( '.*' )? )
            {
            // InternalScoping.g:486:1: ( ( '.*' )? )
            // InternalScoping.g:487:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalScoping.g:488:2: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalScoping.g:488:3: '.*'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalScoping.g:497:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:501:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalScoping.g:502:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalScoping.g:509:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:513:1: ( ( RULE_ID ) )
            // InternalScoping.g:514:1: ( RULE_ID )
            {
            // InternalScoping.g:514:1: ( RULE_ID )
            // InternalScoping.g:515:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalScoping.g:524:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:528:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalScoping.g:529:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalScoping.g:535:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:539:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalScoping.g:540:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalScoping.g:540:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalScoping.g:541:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalScoping.g:542:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalScoping.g:542:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalScoping.g:551:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:555:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalScoping.g:556:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalScoping.g:563:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:567:1: ( ( '.' ) )
            // InternalScoping.g:568:1: ( '.' )
            {
            // InternalScoping.g:568:1: ( '.' )
            // InternalScoping.g:569:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalScoping.g:578:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:582:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalScoping.g:583:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalScoping.g:589:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:593:1: ( ( RULE_ID ) )
            // InternalScoping.g:594:1: ( RULE_ID )
            {
            // InternalScoping.g:594:1: ( RULE_ID )
            // InternalScoping.g:595:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Chapter__Group__0"
    // InternalScoping.g:605:1: rule__Chapter__Group__0 : rule__Chapter__Group__0__Impl rule__Chapter__Group__1 ;
    public final void rule__Chapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:609:1: ( rule__Chapter__Group__0__Impl rule__Chapter__Group__1 )
            // InternalScoping.g:610:2: rule__Chapter__Group__0__Impl rule__Chapter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Chapter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__1();

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
    // $ANTLR end "rule__Chapter__Group__0"


    // $ANTLR start "rule__Chapter__Group__0__Impl"
    // InternalScoping.g:617:1: rule__Chapter__Group__0__Impl : ( 'chapter' ) ;
    public final void rule__Chapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:621:1: ( ( 'chapter' ) )
            // InternalScoping.g:622:1: ( 'chapter' )
            {
            // InternalScoping.g:622:1: ( 'chapter' )
            // InternalScoping.g:623:2: 'chapter'
            {
             before(grammarAccess.getChapterAccess().getChapterKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getChapterKeyword_0()); 

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
    // $ANTLR end "rule__Chapter__Group__0__Impl"


    // $ANTLR start "rule__Chapter__Group__1"
    // InternalScoping.g:632:1: rule__Chapter__Group__1 : rule__Chapter__Group__1__Impl rule__Chapter__Group__2 ;
    public final void rule__Chapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:636:1: ( rule__Chapter__Group__1__Impl rule__Chapter__Group__2 )
            // InternalScoping.g:637:2: rule__Chapter__Group__1__Impl rule__Chapter__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Chapter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__2();

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
    // $ANTLR end "rule__Chapter__Group__1"


    // $ANTLR start "rule__Chapter__Group__1__Impl"
    // InternalScoping.g:644:1: rule__Chapter__Group__1__Impl : ( ( rule__Chapter__NameAssignment_1 ) ) ;
    public final void rule__Chapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:648:1: ( ( ( rule__Chapter__NameAssignment_1 ) ) )
            // InternalScoping.g:649:1: ( ( rule__Chapter__NameAssignment_1 ) )
            {
            // InternalScoping.g:649:1: ( ( rule__Chapter__NameAssignment_1 ) )
            // InternalScoping.g:650:2: ( rule__Chapter__NameAssignment_1 )
            {
             before(grammarAccess.getChapterAccess().getNameAssignment_1()); 
            // InternalScoping.g:651:2: ( rule__Chapter__NameAssignment_1 )
            // InternalScoping.g:651:3: rule__Chapter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChapterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Chapter__Group__1__Impl"


    // $ANTLR start "rule__Chapter__Group__2"
    // InternalScoping.g:659:1: rule__Chapter__Group__2 : rule__Chapter__Group__2__Impl rule__Chapter__Group__3 ;
    public final void rule__Chapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:663:1: ( rule__Chapter__Group__2__Impl rule__Chapter__Group__3 )
            // InternalScoping.g:664:2: rule__Chapter__Group__2__Impl rule__Chapter__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Chapter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__3();

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
    // $ANTLR end "rule__Chapter__Group__2"


    // $ANTLR start "rule__Chapter__Group__2__Impl"
    // InternalScoping.g:671:1: rule__Chapter__Group__2__Impl : ( '{' ) ;
    public final void rule__Chapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:675:1: ( ( '{' ) )
            // InternalScoping.g:676:1: ( '{' )
            {
            // InternalScoping.g:676:1: ( '{' )
            // InternalScoping.g:677:2: '{'
            {
             before(grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Chapter__Group__2__Impl"


    // $ANTLR start "rule__Chapter__Group__3"
    // InternalScoping.g:686:1: rule__Chapter__Group__3 : rule__Chapter__Group__3__Impl rule__Chapter__Group__4 ;
    public final void rule__Chapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:690:1: ( rule__Chapter__Group__3__Impl rule__Chapter__Group__4 )
            // InternalScoping.g:691:2: rule__Chapter__Group__3__Impl rule__Chapter__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Chapter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__4();

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
    // $ANTLR end "rule__Chapter__Group__3"


    // $ANTLR start "rule__Chapter__Group__3__Impl"
    // InternalScoping.g:698:1: rule__Chapter__Group__3__Impl : ( ( rule__Chapter__Alternatives_3 )* ) ;
    public final void rule__Chapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:702:1: ( ( ( rule__Chapter__Alternatives_3 )* ) )
            // InternalScoping.g:703:1: ( ( rule__Chapter__Alternatives_3 )* )
            {
            // InternalScoping.g:703:1: ( ( rule__Chapter__Alternatives_3 )* )
            // InternalScoping.g:704:2: ( rule__Chapter__Alternatives_3 )*
            {
             before(grammarAccess.getChapterAccess().getAlternatives_3()); 
            // InternalScoping.g:705:2: ( rule__Chapter__Alternatives_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==15||(LA7_0>=19 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalScoping.g:705:3: rule__Chapter__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Chapter__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Chapter__Group__3__Impl"


    // $ANTLR start "rule__Chapter__Group__4"
    // InternalScoping.g:713:1: rule__Chapter__Group__4 : rule__Chapter__Group__4__Impl ;
    public final void rule__Chapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:717:1: ( rule__Chapter__Group__4__Impl )
            // InternalScoping.g:718:2: rule__Chapter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__Group__4__Impl();

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
    // $ANTLR end "rule__Chapter__Group__4"


    // $ANTLR start "rule__Chapter__Group__4__Impl"
    // InternalScoping.g:724:1: rule__Chapter__Group__4__Impl : ( '}' ) ;
    public final void rule__Chapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:728:1: ( ( '}' ) )
            // InternalScoping.g:729:1: ( '}' )
            {
            // InternalScoping.g:729:1: ( '}' )
            // InternalScoping.g:730:2: '}'
            {
             before(grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Chapter__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalScoping.g:740:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:744:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalScoping.g:745:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalScoping.g:752:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__Alternatives_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:756:1: ( ( ( rule__Reference__Alternatives_0 ) ) )
            // InternalScoping.g:757:1: ( ( rule__Reference__Alternatives_0 ) )
            {
            // InternalScoping.g:757:1: ( ( rule__Reference__Alternatives_0 ) )
            // InternalScoping.g:758:2: ( rule__Reference__Alternatives_0 )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives_0()); 
            // InternalScoping.g:759:2: ( rule__Reference__Alternatives_0 )
            // InternalScoping.g:759:3: rule__Reference__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalScoping.g:767:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:771:1: ( rule__Reference__Group__1__Impl )
            // InternalScoping.g:772:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__1__Impl();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalScoping.g:778:1: rule__Reference__Group__1__Impl : ( ';' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:782:1: ( ( ';' ) )
            // InternalScoping.g:783:1: ( ';' )
            {
            // InternalScoping.g:783:1: ( ';' )
            // InternalScoping.g:784:2: ';'
            {
             before(grammarAccess.getReferenceAccess().getSemicolonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group_0_0__0"
    // InternalScoping.g:794:1: rule__Reference__Group_0_0__0 : rule__Reference__Group_0_0__0__Impl rule__Reference__Group_0_0__1 ;
    public final void rule__Reference__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:798:1: ( rule__Reference__Group_0_0__0__Impl rule__Reference__Group_0_0__1 )
            // InternalScoping.g:799:2: rule__Reference__Group_0_0__0__Impl rule__Reference__Group_0_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_0_0__1();

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
    // $ANTLR end "rule__Reference__Group_0_0__0"


    // $ANTLR start "rule__Reference__Group_0_0__0__Impl"
    // InternalScoping.g:806:1: rule__Reference__Group_0_0__0__Impl : ( 'cref' ) ;
    public final void rule__Reference__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:810:1: ( ( 'cref' ) )
            // InternalScoping.g:811:1: ( 'cref' )
            {
            // InternalScoping.g:811:1: ( 'cref' )
            // InternalScoping.g:812:2: 'cref'
            {
             before(grammarAccess.getReferenceAccess().getCrefKeyword_0_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getCrefKeyword_0_0_0()); 

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
    // $ANTLR end "rule__Reference__Group_0_0__0__Impl"


    // $ANTLR start "rule__Reference__Group_0_0__1"
    // InternalScoping.g:821:1: rule__Reference__Group_0_0__1 : rule__Reference__Group_0_0__1__Impl ;
    public final void rule__Reference__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:825:1: ( rule__Reference__Group_0_0__1__Impl )
            // InternalScoping.g:826:2: rule__Reference__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_0_0__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_0_0__1"


    // $ANTLR start "rule__Reference__Group_0_0__1__Impl"
    // InternalScoping.g:832:1: rule__Reference__Group_0_0__1__Impl : ( ( rule__Reference__CrefAssignment_0_0_1 ) ) ;
    public final void rule__Reference__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:836:1: ( ( ( rule__Reference__CrefAssignment_0_0_1 ) ) )
            // InternalScoping.g:837:1: ( ( rule__Reference__CrefAssignment_0_0_1 ) )
            {
            // InternalScoping.g:837:1: ( ( rule__Reference__CrefAssignment_0_0_1 ) )
            // InternalScoping.g:838:2: ( rule__Reference__CrefAssignment_0_0_1 )
            {
             before(grammarAccess.getReferenceAccess().getCrefAssignment_0_0_1()); 
            // InternalScoping.g:839:2: ( rule__Reference__CrefAssignment_0_0_1 )
            // InternalScoping.g:839:3: rule__Reference__CrefAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__CrefAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getCrefAssignment_0_0_1()); 

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
    // $ANTLR end "rule__Reference__Group_0_0__1__Impl"


    // $ANTLR start "rule__Reference__Group_0_1__0"
    // InternalScoping.g:848:1: rule__Reference__Group_0_1__0 : rule__Reference__Group_0_1__0__Impl rule__Reference__Group_0_1__1 ;
    public final void rule__Reference__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:852:1: ( rule__Reference__Group_0_1__0__Impl rule__Reference__Group_0_1__1 )
            // InternalScoping.g:853:2: rule__Reference__Group_0_1__0__Impl rule__Reference__Group_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_0_1__1();

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
    // $ANTLR end "rule__Reference__Group_0_1__0"


    // $ANTLR start "rule__Reference__Group_0_1__0__Impl"
    // InternalScoping.g:860:1: rule__Reference__Group_0_1__0__Impl : ( 'qnref' ) ;
    public final void rule__Reference__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:864:1: ( ( 'qnref' ) )
            // InternalScoping.g:865:1: ( 'qnref' )
            {
            // InternalScoping.g:865:1: ( 'qnref' )
            // InternalScoping.g:866:2: 'qnref'
            {
             before(grammarAccess.getReferenceAccess().getQnrefKeyword_0_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getQnrefKeyword_0_1_0()); 

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
    // $ANTLR end "rule__Reference__Group_0_1__0__Impl"


    // $ANTLR start "rule__Reference__Group_0_1__1"
    // InternalScoping.g:875:1: rule__Reference__Group_0_1__1 : rule__Reference__Group_0_1__1__Impl ;
    public final void rule__Reference__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:879:1: ( rule__Reference__Group_0_1__1__Impl )
            // InternalScoping.g:880:2: rule__Reference__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_0_1__1"


    // $ANTLR start "rule__Reference__Group_0_1__1__Impl"
    // InternalScoping.g:886:1: rule__Reference__Group_0_1__1__Impl : ( ( rule__Reference__QnrefAssignment_0_1_1 ) ) ;
    public final void rule__Reference__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:890:1: ( ( ( rule__Reference__QnrefAssignment_0_1_1 ) ) )
            // InternalScoping.g:891:1: ( ( rule__Reference__QnrefAssignment_0_1_1 ) )
            {
            // InternalScoping.g:891:1: ( ( rule__Reference__QnrefAssignment_0_1_1 ) )
            // InternalScoping.g:892:2: ( rule__Reference__QnrefAssignment_0_1_1 )
            {
             before(grammarAccess.getReferenceAccess().getQnrefAssignment_0_1_1()); 
            // InternalScoping.g:893:2: ( rule__Reference__QnrefAssignment_0_1_1 )
            // InternalScoping.g:893:3: rule__Reference__QnrefAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__QnrefAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getQnrefAssignment_0_1_1()); 

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
    // $ANTLR end "rule__Reference__Group_0_1__1__Impl"


    // $ANTLR start "rule__Reference__Group_0_2__0"
    // InternalScoping.g:902:1: rule__Reference__Group_0_2__0 : rule__Reference__Group_0_2__0__Impl rule__Reference__Group_0_2__1 ;
    public final void rule__Reference__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:906:1: ( rule__Reference__Group_0_2__0__Impl rule__Reference__Group_0_2__1 )
            // InternalScoping.g:907:2: rule__Reference__Group_0_2__0__Impl rule__Reference__Group_0_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_0_2__1();

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
    // $ANTLR end "rule__Reference__Group_0_2__0"


    // $ANTLR start "rule__Reference__Group_0_2__0__Impl"
    // InternalScoping.g:914:1: rule__Reference__Group_0_2__0__Impl : ( 'pref' ) ;
    public final void rule__Reference__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:918:1: ( ( 'pref' ) )
            // InternalScoping.g:919:1: ( 'pref' )
            {
            // InternalScoping.g:919:1: ( 'pref' )
            // InternalScoping.g:920:2: 'pref'
            {
             before(grammarAccess.getReferenceAccess().getPrefKeyword_0_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getPrefKeyword_0_2_0()); 

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
    // $ANTLR end "rule__Reference__Group_0_2__0__Impl"


    // $ANTLR start "rule__Reference__Group_0_2__1"
    // InternalScoping.g:929:1: rule__Reference__Group_0_2__1 : rule__Reference__Group_0_2__1__Impl ;
    public final void rule__Reference__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:933:1: ( rule__Reference__Group_0_2__1__Impl )
            // InternalScoping.g:934:2: rule__Reference__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_0_2__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_0_2__1"


    // $ANTLR start "rule__Reference__Group_0_2__1__Impl"
    // InternalScoping.g:940:1: rule__Reference__Group_0_2__1__Impl : ( ( rule__Reference__PrefAssignment_0_2_1 ) ) ;
    public final void rule__Reference__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:944:1: ( ( ( rule__Reference__PrefAssignment_0_2_1 ) ) )
            // InternalScoping.g:945:1: ( ( rule__Reference__PrefAssignment_0_2_1 ) )
            {
            // InternalScoping.g:945:1: ( ( rule__Reference__PrefAssignment_0_2_1 ) )
            // InternalScoping.g:946:2: ( rule__Reference__PrefAssignment_0_2_1 )
            {
             before(grammarAccess.getReferenceAccess().getPrefAssignment_0_2_1()); 
            // InternalScoping.g:947:2: ( rule__Reference__PrefAssignment_0_2_1 )
            // InternalScoping.g:947:3: rule__Reference__PrefAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__PrefAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getPrefAssignment_0_2_1()); 

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
    // $ANTLR end "rule__Reference__Group_0_2__1__Impl"


    // $ANTLR start "rule__Book__NameAssignment_1"
    // InternalScoping.g:956:1: rule__Book__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Book__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:960:1: ( ( ruleQualifiedName ) )
            // InternalScoping.g:961:2: ( ruleQualifiedName )
            {
            // InternalScoping.g:961:2: ( ruleQualifiedName )
            // InternalScoping.g:962:3: ruleQualifiedName
            {
             before(grammarAccess.getBookAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBookAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Book__NameAssignment_1"


    // $ANTLR start "rule__Book__ImportsAssignment_2"
    // InternalScoping.g:971:1: rule__Book__ImportsAssignment_2 : ( ruleDImport ) ;
    public final void rule__Book__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:975:1: ( ( ruleDImport ) )
            // InternalScoping.g:976:2: ( ruleDImport )
            {
            // InternalScoping.g:976:2: ( ruleDImport )
            // InternalScoping.g:977:3: ruleDImport
            {
             before(grammarAccess.getBookAccess().getImportsDImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDImport();

            state._fsp--;

             after(grammarAccess.getBookAccess().getImportsDImportParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Book__ImportsAssignment_2"


    // $ANTLR start "rule__Book__ChaptersAssignment_3"
    // InternalScoping.g:986:1: rule__Book__ChaptersAssignment_3 : ( ruleChapter ) ;
    public final void rule__Book__ChaptersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:990:1: ( ( ruleChapter ) )
            // InternalScoping.g:991:2: ( ruleChapter )
            {
            // InternalScoping.g:991:2: ( ruleChapter )
            // InternalScoping.g:992:3: ruleChapter
            {
             before(grammarAccess.getBookAccess().getChaptersChapterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleChapter();

            state._fsp--;

             after(grammarAccess.getBookAccess().getChaptersChapterParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Book__ChaptersAssignment_3"


    // $ANTLR start "rule__DImport__ImportedNamespaceAssignment_1"
    // InternalScoping.g:1001:1: rule__DImport__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__DImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:1005:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalScoping.g:1006:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalScoping.g:1006:2: ( ruleQualifiedNameWithWildcard )
            // InternalScoping.g:1007:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getDImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getDImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Chapter__NameAssignment_1"
    // InternalScoping.g:1016:1: rule__Chapter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chapter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:1020:1: ( ( RULE_ID ) )
            // InternalScoping.g:1021:2: ( RULE_ID )
            {
            // InternalScoping.g:1021:2: ( RULE_ID )
            // InternalScoping.g:1022:3: RULE_ID
            {
             before(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Chapter__NameAssignment_1"


    // $ANTLR start "rule__Chapter__ChapterAssignment_3_0"
    // InternalScoping.g:1031:1: rule__Chapter__ChapterAssignment_3_0 : ( ruleChapter ) ;
    public final void rule__Chapter__ChapterAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:1035:1: ( ( ruleChapter ) )
            // InternalScoping.g:1036:2: ( ruleChapter )
            {
            // InternalScoping.g:1036:2: ( ruleChapter )
            // InternalScoping.g:1037:3: ruleChapter
            {
             before(grammarAccess.getChapterAccess().getChapterChapterParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleChapter();

            state._fsp--;

             after(grammarAccess.getChapterAccess().getChapterChapterParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Chapter__ChapterAssignment_3_0"


    // $ANTLR start "rule__Chapter__ParagraphsAssignment_3_1"
    // InternalScoping.g:1046:1: rule__Chapter__ParagraphsAssignment_3_1 : ( ruleParagraph ) ;
    public final void rule__Chapter__ParagraphsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:1050:1: ( ( ruleParagraph ) )
            // InternalScoping.g:1051:2: ( ruleParagraph )
            {
            // InternalScoping.g:1051:2: ( ruleParagraph )
            // InternalScoping.g:1052:3: ruleParagraph
            {
             before(grammarAccess.getChapterAccess().getParagraphsParagraphParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getChapterAccess().getParagraphsParagraphParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Chapter__ParagraphsAssignment_3_1"


    // $ANTLR start "rule__Chapter__ReferencesAssignment_3_2"
    // InternalScoping.g:1061:1: rule__Chapter__ReferencesAssignment_3_2 : ( ruleReference ) ;
    public final void rule__Chapter__ReferencesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:1065:1: ( ( ruleReference ) )
            // InternalScoping.g:1066:2: ( ruleReference )
            {
            // InternalScoping.g:1066:2: ( ruleReference )
            // InternalScoping.g:1067:3: ruleReference
            {
             before(grammarAccess.getChapterAccess().getReferencesReferenceParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getChapterAccess().getReferencesReferenceParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Chapter__ReferencesAssignment_3_2"


    // $ANTLR start "rule__Paragraph__NameAssignment"
    // InternalScoping.g:1076:1: rule__Paragraph__NameAssignment : ( RULE_ID ) ;
    public final void rule__Paragraph__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:1080:1: ( ( RULE_ID ) )
            // InternalScoping.g:1081:2: ( RULE_ID )
            {
            // InternalScoping.g:1081:2: ( RULE_ID )
            // InternalScoping.g:1082:3: RULE_ID
            {
             before(grammarAccess.getParagraphAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParagraphAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Paragraph__NameAssignment"


    // $ANTLR start "rule__Reference__CrefAssignment_0_0_1"
    // InternalScoping.g:1091:1: rule__Reference__CrefAssignment_0_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__CrefAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:1095:1: ( ( ( RULE_ID ) ) )
            // InternalScoping.g:1096:2: ( ( RULE_ID ) )
            {
            // InternalScoping.g:1096:2: ( ( RULE_ID ) )
            // InternalScoping.g:1097:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getCrefChapterCrossReference_0_0_1_0()); 
            // InternalScoping.g:1098:3: ( RULE_ID )
            // InternalScoping.g:1099:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getCrefChapterIDTerminalRuleCall_0_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getCrefChapterIDTerminalRuleCall_0_0_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getCrefChapterCrossReference_0_0_1_0()); 

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
    // $ANTLR end "rule__Reference__CrefAssignment_0_0_1"


    // $ANTLR start "rule__Reference__QnrefAssignment_0_1_1"
    // InternalScoping.g:1110:1: rule__Reference__QnrefAssignment_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__QnrefAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:1114:1: ( ( ( ruleQualifiedName ) ) )
            // InternalScoping.g:1115:2: ( ( ruleQualifiedName ) )
            {
            // InternalScoping.g:1115:2: ( ( ruleQualifiedName ) )
            // InternalScoping.g:1116:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getQnrefChapterCrossReference_0_1_1_0()); 
            // InternalScoping.g:1117:3: ( ruleQualifiedName )
            // InternalScoping.g:1118:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().getQnrefChapterQualifiedNameParserRuleCall_0_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getQnrefChapterQualifiedNameParserRuleCall_0_1_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getQnrefChapterCrossReference_0_1_1_0()); 

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
    // $ANTLR end "rule__Reference__QnrefAssignment_0_1_1"


    // $ANTLR start "rule__Reference__PrefAssignment_0_2_1"
    // InternalScoping.g:1129:1: rule__Reference__PrefAssignment_0_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__PrefAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping.g:1133:1: ( ( ( RULE_ID ) ) )
            // InternalScoping.g:1134:2: ( ( RULE_ID ) )
            {
            // InternalScoping.g:1134:2: ( ( RULE_ID ) )
            // InternalScoping.g:1135:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getPrefParagraphCrossReference_0_2_1_0()); 
            // InternalScoping.g:1136:3: ( RULE_ID )
            // InternalScoping.g:1137:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getPrefParagraphIDTerminalRuleCall_0_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getPrefParagraphIDTerminalRuleCall_0_2_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getPrefParagraphCrossReference_0_2_1_0()); 

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
    // $ANTLR end "rule__Reference__PrefAssignment_0_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003A8010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000388012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});

}