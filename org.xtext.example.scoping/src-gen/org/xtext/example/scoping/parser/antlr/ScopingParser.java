/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.scoping.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.scoping.parser.antlr.internal.InternalScopingParser;
import org.xtext.example.scoping.services.ScopingGrammarAccess;

public class ScopingParser extends AbstractAntlrParser {

	@Inject
	private ScopingGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalScopingParser createParser(XtextTokenStream stream) {
		return new InternalScopingParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Book";
	}

	public ScopingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ScopingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
