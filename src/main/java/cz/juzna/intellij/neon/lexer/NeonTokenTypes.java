package cz.juzna.intellij.neon.lexer;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

/**
 * Types of tokens returned form lexer
 *
 * @author Jan Dolecek - juzna.cz@gmail.com
 */
public interface NeonTokenTypes
{
	IElementType NEON_STRING = new NeonTokenType("string");
	IElementType NEON_SYMBOL = new NeonTokenType("symbol");
	IElementType NEON_COMMENT = new NeonTokenType("comment");
	IElementType NEON_INDENT = new NeonTokenType("indent");
	IElementType NEON_LITERAL = new NeonTokenType("literal");
	IElementType NEON_KEYWORD = new NeonTokenType("keyword");
	IElementType NEON_WHITESPACE = TokenType.WHITE_SPACE; // new NeonTokenType("whitespace");
	IElementType NEON_UNKNOWN = TokenType.BAD_CHARACTER; // new NeonTokenType("error");

	// the rest are deprecated and will be removed
	IElementType NEON_IDENTIFIER = new NeonTokenType("identifier");
	IElementType NEON_EOL = new NeonTokenType("eol");
	IElementType NEON_VARIABLE = new NeonTokenType("variable");
	IElementType NEON_NUMBER = new NeonTokenType("number");
	IElementType NEON_REFERENCE = new NeonTokenType("reference");
	IElementType NEON_BLOCK_INHERITENCE = new NeonTokenType("<");
	IElementType NEON_LPAREN = new NeonTokenType("(");
	IElementType NEON_RPAREN = new NeonTokenType(")");
	IElementType NEON_LBRACE_CURLY = new NeonTokenType("{");
	IElementType NEON_RBRACE_CURLY = new NeonTokenType("}");
	IElementType NEON_LBRACE_SQUARE = new NeonTokenType("[");
	IElementType NEON_RBRACE_SQUARE = new NeonTokenType("]");
	IElementType NEON_ITEM_DELIMITER = new NeonTokenType(",");
	IElementType NEON_ARRAY_BULLET = new NeonTokenType("-");
	IElementType NEON_ASSIGNMENT = new NeonTokenType(":");
	IElementType NEON_DOUBLE_COLON = new NeonTokenType("::");
	IElementType NEON_DOLLAR = new NeonTokenType("$");
	IElementType NEON_AT = new NeonTokenType("@");


	// special tokens (identifier in block header or as array key)
	IElementType NEON_KEY = new NeonTokenType("key");


	TokenSet WHITESPACES = TokenSet.create(NEON_WHITESPACE);
	TokenSet COMMENTS = TokenSet.create(NEON_COMMENT);
	TokenSet STRING_LITERALS = TokenSet.create(NEON_LITERAL, NEON_STRING);
}
