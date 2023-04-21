//Definition of tokens in CLUB-to-Java compiler

public enum TokenType{

    Whitespace("[\\s\\t\\n\\r]"),
    Operator("(\\+{1,2}|\\-{1,2}|\\>|\\<|\\={1,2}|\\!|\\.|\\|{2}|\\&{2}|\\*|\\/)"),
    Keyword("(Setup|Round|Turn|while|for|if|bool|int|string)"),
    GroupDivider("(\\[|\\]|\\(|\\)|\\{|\\}|\\,|\\;)"),
    Logic("true|false"),
    Numeric("[1-9]+[0-9]*"),
    Text("\"([^\"]*)\""),
    VariableId("[a-z]+[a-zA-Z0-9_]*"),
    FunctionId("[A-Z]+[a-zA-Z0-9_]*"),
    ClassId("(Player|Deck|Card|Table)"),
    ObjectId("(((H|D|C|S)+([2-9]|1+[0-3]?))|J+[1-3]|player+[1-9]+[0-9]*|deck|table)"),
    MethodId("create|getHand|getHandPoints|handSize|printHand|getTable|getTablePoints|printTable|getDiscardPile|draw|discard|takeCard|layDown|addJokers|assignPoints|shuffle|getCard|getCards|print|size|returnCards|returnDiscardPile|flip|getPoints|setPoints");
    

    private final String regex;

}