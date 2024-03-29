import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public abstract class TypeCheck {

    static Map<String, ArrayList<String>> SETM = new HashMap<>();
    static Map<String, ArrayList<String>> VM = new HashMap<>();
    static Map<String, ArrayList<String>> IM = new HashMap<>();
    static Map<String, ArrayList<String>> SM = new HashMap<>();
    static Map<String, ArrayList<String>> PM = new HashMap<>();
    static Map<String, ArrayList<String>> ATTI = new HashMap<>();
    static Map<String, ArrayList<String>> ATTB = new HashMap<>();
    static Map<String, ArrayList<String>> ATTS = new HashMap<>();


    static Map<String, String> VarType = new HashMap<>();
    static Map<String, String> VarInt = new HashMap<>();
    static Map<String, String> VarBool = new HashMap<>();
    static Map<String, String> VarString = new HashMap<>();

    static ArrayList<String> FuncIDs;

    public static void TypeMapSetup(){

        VarType.put("player","OBJECT");
        VarType.put("table","OBJECT");
        VarType.put("deck","OBJECT");
        VarType.put("bool","KEYWORD");
        VarType.put("int","KEYWORD");
        VarType.put("string","KEYWORD");
        VarType.put("if","KEYWORD");
        VarType.put("while","KEYWORD");
        VarType.put("for","KEYWORD");

        FuncIDs = new ArrayList<>();

        ArrayList<String> V = new ArrayList<>(); Collections.addAll(V,"VOID");
        ArrayList<String> I = new ArrayList<>(); Collections.addAll(I,"INT");
        ArrayList<String> II = new ArrayList<>(); Collections.addAll(II,"INT", "INT");
        ArrayList<String> III = new ArrayList<>(); Collections.addAll(III,"INT", "INT", "INT");
        ArrayList<String> IIIB = new ArrayList<>(); Collections.addAll(IIIB,"INT", "INT", "INT", "BOOL");
        ArrayList<String> IIII = new ArrayList<>(); Collections.addAll(IIII,"INT", "INT", "INT", "INT");
        ArrayList<String> IIIII = new ArrayList<>(); Collections.addAll(IIIII,"INT", "INT", "INT", "INT", "INT");
        ArrayList<String> IIIIII = new ArrayList<>(); Collections.addAll(IIIIII,"INT", "INT", "INT", "INT", "INT", "INT");
        ArrayList<String> IB = new ArrayList<>(); Collections.addAll(IB,"INT", "BOOL");
        ArrayList<String> IIB = new ArrayList<>(); Collections.addAll(IIB,"INT", "INT", "BOOL");
        ArrayList<String> IIIIB = new ArrayList<>(); Collections.addAll(IIIIB,"INT", "INT", "INT", "INT", "BOOL");
        ArrayList<String> IS = new ArrayList<>(); Collections.addAll(IS,"INT", "STRING");
        ArrayList<String> ISI = new ArrayList<>(); Collections.addAll(ISI,"INT", "STRING", "INT");
        ArrayList<String> ISII = new ArrayList<>(); Collections.addAll(ISII,"INT", "STRING", "INT", "INT");
        ArrayList<String> ISIII = new ArrayList<>(); Collections.addAll(ISIII,"INT", "STRING", "INT", "INT", "INT");
        ArrayList<String> ISB = new ArrayList<>(); Collections.addAll(ISB,"INT", "STRING", "BOOL");
        ArrayList<String> ISIB = new ArrayList<>(); Collections.addAll(ISIB,"INT", "STRING", "INT", "BOOL");
        ArrayList<String> ISL = new ArrayList<>(); Collections.addAll(ISL,"INT", "SLIST");
        ArrayList<String> S = new ArrayList<>(); Collections.addAll(S,"STRING");
        ArrayList<String> SI = new ArrayList<>(); Collections.addAll(SI,"STRING", "INT");
        ArrayList<String> SII = new ArrayList<>(); Collections.addAll(SII,"STRING", "INT", "INT");
        ArrayList<String> SIII = new ArrayList<>(); Collections.addAll(SIII,"STRING", "INT", "INT", "INT");
        ArrayList<String> SIB = new ArrayList<>(); Collections.addAll(SIB,"STRING", "INT", "BOOL");
        ArrayList<String> SB = new ArrayList<>(); Collections.addAll(SB, "STRING", "BOOL");


        PM.put("Player.getPlayer(INT)", I);
        
        SETM.put("Player.create(INT)", I); //
        SETM.put("deck.addJokers(INT)", I); //
        SETM.put("deck.deal(INT)", I); // måske ikke setup method??
        SETM.put("deck.assignPoints(INT,SLIST)", ISL); //

        
        VM.put("Game.exit()", V); //

        VM.put("Game.exit(Player.getPlayer(INT))", I); //
        VM.put("Game.exit(player)", V); //-----
        
        VM.put("Game.print(STRING)", S); 
        
        VM.put("table.discard(STRING,Game.discardPile)", S);

        VM.put("table.discard(STRING,Player.getPlayer(INT).getDiscardPile())", SI);
        VM.put("table.discard(STRING,player.getDiscardPile())", S); //-----

        VM.put("table.discard(table.getCardIndex(INT).id,Game.discardPile)", I);  //

        VM.put("table.discard(table.getCardIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", II); //
        VM.put("table.discard(table.getCardIndex(INT).id,player.getDiscardPile())", I); //------

        VM.put("table.discardAll(Game.discardPile)", V); //

        VM.put("table.discardAll(Player.getPlayer(INT).getDiscardPile())", I); //
        VM.put("table.discardAll(player.getDiscardPile())", V); //-----

        VM.put("table.draw(INT,deck)", I); //
        
        VM.put("table.getCardIndex(INT).flip()", I);//
        
        VM.put("Player.getPlayer(INT).discard(STRING,Game.discardPile)", IS);//
        VM.put("player.discard(STRING,Game.discardPile)", S); //-----

        VM.put("Player.getPlayer(INT).discard(STRING,Player.getPlayer(INT).getDiscardPile())", ISI);//
        VM.put("Player.getPlayer(INT).discard(Player.getPlayer(INT).getCardIndex(INT).id,Game.discardPile)", III);//
        VM.put("Player.getPlayer(INT).discard(Player.getPlayer(INT).getCardIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", IIII);//
        VM.put("player.discard(STRING,Player.getPlayer(INT).getDiscardPile())", SI);//------
        VM.put("player.discard(Player.getPlayer(INT).getCardIndex(INT).id,Game.discardPile)", II);//------
        VM.put("Player.getPlayer(INT).discard(STRING,player.getDiscardPile())", IS);//------
        VM.put("Player.getPlayer(INT).discard(player.getCardIndex(INT).id,Game.discardPile)", II);//------
        VM.put("player.discard(STRING,player.getDiscardPile())", S);//------
        VM.put("player.discard(player.getCardIndex(INT).id,Game.discardPile)", I);//------
        VM.put("player.discard(Player.getPlayer(INT).getCardIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", III);//------
        VM.put("player.discard(player.getCardIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", II);//------
        VM.put("player.discard(Player.getPlayer(INT).getCardIndex(INT).id,player.getDiscardPile())", II);//------
        VM.put("player.discard(player.getCardIndex(INT).id,player.getDiscardPile())", I);//------
        VM.put("Player.getPlayer(INT).discard(player.getCardIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", III);//------
        VM.put("Player.getPlayer(INT).discard(player.getCardIndex(INT).id,player.getDiscardPile())", II);//------
        VM.put("Player.getPlayer(INT).discard(Player.getPlayer(INT).getCardIndex(INT).id,player.getDiscardPile())", III);//------

        
        VM.put("Player.getPlayer(INT).discardAll(discardPile)", I);             //
        VM.put("player.discardAll(discardPile)", V); //-----

        VM.put("Player.getPlayer(INT).discardAll(Player.getPlayer(INT).getDiscardPile())", II);//
        VM.put("Player.getPlayer(INT).discardAll(player.getDiscardPile())", I); //------
        VM.put("player.discardAll(Player.getPlayer(INT).getDiscardPile())", I); //------
        VM.put("player.discardAll(player.getDiscardPile())", V); //------
        
        VM.put("Player.getPlayer(INT).draw(INT,deck)", II);                     //
        VM.put("player.draw(INT,deck)", I); //------

        VM.put("Player.getPlayer(INT).getCardIndex(INT).flip()", II);           //
        VM.put("player.getCardIndex(INT).flip()", I); //-----

        VM.put("Player.getPlayer(INT).getDiscardPileIndex(INT).flip()", II);//
        VM.put("player.getDiscardPileIndex(INT).flip()", I); //------

        VM.put("Player.getPlayer(INT).getTable().discard(STRING,Game.discardPile)", IS);//
        VM.put("player.getTable().discard(STRING,Game.discardPile)", S); //------

        VM.put("Player.getPlayer(INT).getTable().discard(STRING,Player.getPlayer(INT).getDiscardPile())", ISI);//
        VM.put("Player.getPlayer(INT).getTable().discard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,Game.discardPile)", III);//
        VM.put("player.getTable().discard(STRING,Player.getPlayer(INT).getDiscardPile())", SI);//-----
        VM.put("player.getTable().discard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,Game.discardPile)", II);//-----
        VM.put("Player.getPlayer(INT).getTable().discard(STRING,player.getDiscardPile())", IS);//-----
        VM.put("Player.getPlayer(INT).getTable().discard(player.getTable().getCardIndex(INT).id,Game.discardPile)", II);//-----
        VM.put("player.getTable().discard(STRING,player.getDiscardPile())", S);//-----
        VM.put("player.getTable().discard(player.getTable().getCardIndex(INT).id,Game.discardPile)", I);//-----

        VM.put("Player.getPlayer(INT).getTable().discard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", IIII);//
        VM.put("player.getTable().discard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", III);//-----
        VM.put("Player.getPlayer(INT).getTable().discard(player.getTable().getCardIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", III);//-----
        VM.put("Player.getPlayer(INT).getTable().discard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,player.getDiscardPile())", III);//-----
        VM.put("player.getTable().discard(player.getTable().getCardIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", II);//-----
        VM.put("Player.getPlayer(INT).getTable().discard(player.getTable().getCardIndex(INT).id,player.getDiscardPile())", II);//-----
        VM.put("player.getTable().discard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,player.getDiscardPile())", II);//-----
        VM.put("player.getTable().discard(player.getTable().getCardIndex(INT).id,player.getDiscardPile())", I);//-----

        VM.put("Player.getPlayer(INT).getTable().discardAll(discardPile)", I);          //
        VM.put("player.getTable().discardAll(discardPile)", V); //------

        VM.put("Player.getPlayer(INT).getTable().discardAll(Player.getPlayer(INT).getDiscardPile())", II);//
        VM.put("player.getTable().discardAll(Player.getPlayer(INT).getDiscardPile())", I);//-----
        VM.put("Player.getPlayer(INT).getTable().discardAll(player.getDiscardPile())", I);//-----
        VM.put("player.getTable().discardAll(player.getDiscardPile())", V);//-----
        
        VM.put("Player.getPlayer(INT).getTable().draw(INT,deck)", II);          //
        VM.put("player.getTable().draw(INT,deck)", I); //------

        VM.put("Player.getPlayer(INT).getTable().getCardIndex(INT).flip()", II);//
        VM.put("player.getTable().getCardIndex(INT).flip()", I); //------
        
        VM.put("Player.getPlayer(INT).getTable().print()", I);                      //
        VM.put("player.getTable().print()", V); //-----
        
        VM.put("Player.getPlayer(INT).layDown(STRING,Player.getPlayer(INT).getTable(),BOOL)", ISIB);//
        VM.put("player.layDown(STRING,Player.getPlayer(INT).getTable(),BOOL)", SIB);//-----
        VM.put("Player.getPlayer(INT).layDown(STRING,player.getTable(),BOOL)", ISB);//-----
        VM.put("player.layDown(STRING,player.getTable(),BOOL)", SB);//-----

        VM.put("Player.getPlayer(INT).layDown(STRING,table,BOOL)", ISB);            //
        VM.put("player.layDown(STRING,table,BOOL)", SB);//-----

        VM.put("Player.getPlayer(INT).layDown(Player.getPlayer(INT).getCardIndex(INT),Player.getPlayer(INT).getTable(),BOOL)", IIIIB);//
        VM.put("player.layDown(Player.getPlayer(INT).getCardIndex(INT),Player.getPlayer(INT).getTable(),BOOL)", IIIB);//-----
        VM.put("Player.getPlayer(INT).layDown(player.getCardIndex(INT),Player.getPlayer(INT).getTable(),BOOL)", IIIB);//-----
        VM.put("Player.getPlayer(INT).layDown(Player.getPlayer(INT).getCardIndex(INT),player.getTable(),BOOL)", IIIB);//-----
        VM.put("player.layDown(player.getCardIndex(INT),Player.getPlayer(INT).getTable(),BOOL)", IIB);//-----
        VM.put("Player.getPlayer(INT).layDown(player.getCardIndex(INT),player.getTable(),BOOL)", IIB);//-----
        VM.put("player.layDown(Player.getPlayer(INT).getCardIndex(INT),player.getTable(),BOOL)", IIB);//-----
        VM.put("player.layDown(player.getCardIndex(INT),player.getTable(),BOOL)", IB);//-----

        VM.put("Player.getPlayer(INT).layDown(Player.getPlayer(INT).getCardIndex(INT),table,BOOL)", IIIB);//
        VM.put("player.layDown(Player.getPlayer(INT).getCardIndex(INT),table,BOOL)", IIB);//-----
        VM.put("Player.getPlayer(INT).layDown(player.getCardIndex(INT),table,BOOL)", IIB);//-----
        VM.put("player.layDown(player.getCardIndex(INT),table,BOOL)", IB);//-----

        VM.put("Player.getPlayer(INT).layDown(STRING,Player.getPlayer(INT).getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", ISIII);
        VM.put("player.layDown(STRING,Player.getPlayer(INT).getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", SIII);//------
        VM.put("Player.getPlayer(INT).layDown(STRING,player.getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", ISII);//------
        VM.put("Player.getPlayer(INT).layDown(STRING,Player.getPlayer(INT).getTable(),player.getCardIndex(INT).isFaceUp)", ISII);//------
        VM.put("player.layDown(STRING,player.getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", SII);//------
        VM.put("Player.getPlayer(INT).layDown(STRING,player.getTable(),player.getCardIndex(INT).isFaceUp)", ISI);//------
        VM.put("player.layDown(STRING,Player.getPlayer(INT).getTable(),player.getCardIndex(INT).isFaceUp)", SII);//------
        VM.put("player.layDown(STRING,player.getTable(),player.getCardIndex(INT).isFaceUp)", SI);//------

        VM.put("Player.getPlayer(INT).layDown(STRING,table,Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", ISII);//
        VM.put("player.layDown(STRING,table,Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", SII);//-----
        VM.put("Player.getPlayer(INT).layDown(STRING,table,player.getCardIndex(INT).isFaceUp)", ISI);//-----
        VM.put("player.layDown(STRING,table,player.getCardIndex(INT).isFaceUp)", SI);//-----

        VM.put("Player.getPlayer(INT).layDown(Player.getPlayer(INT).getCardIndex(INT),Player.getPlayer(INT).getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", IIIIII);//
        VM.put("player.layDown(Player.getPlayer(INT).getCardIndex(INT),Player.getPlayer(INT).getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", IIIII);//-----
        VM.put("Player.getPlayer(INT).layDown(player.getCardIndex(INT),Player.getPlayer(INT).getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", IIIII);//-----
        VM.put("Player.getPlayer(INT).layDown(Player.getPlayer(INT).getCardIndex(INT),player.getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", IIIII);//-----
        VM.put("Player.getPlayer(INT).layDown(Player.getPlayer(INT).getCardIndex(INT),Player.getPlayer(INT).getTable(),player.getCardIndex(INT).isFaceUp)", IIIII);//-----
        VM.put("player.layDown(player.getCardIndex(INT),Player.getPlayer(INT).getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", IIII);//-----
        VM.put("Player.getPlayer(INT).layDown(player.getCardIndex(INT),player.getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", IIII);//-----
        VM.put("Player.getPlayer(INT).layDown(Player.getPlayer(INT).getCardIndex(INT),player.getTable(),player.getCardIndex(INT).isFaceUp)", IIII);//-----
        VM.put("player.layDown(Player.getPlayer(INT).getCardIndex(INT),Player.getPlayer(INT).getTable(),player.getCardIndex(INT).isFaceUp)", IIII);//-----
        VM.put("player.layDown(Player.getPlayer(INT).getCardIndex(INT),player.getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", IIII);//-----
        VM.put("Player.getPlayer(INT).layDown(player.getCardIndex(INT),Player.getPlayer(INT).getTable(),player.getCardIndex(INT).isFaceUp)", IIII);//-----
        VM.put("player.layDown(player.getCardIndex(INT),player.getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", III);//------
        VM.put("player.layDown(player.getCardIndex(INT),Player.getPlayer(INT).getTable(),player.getCardIndex(INT).isFaceUp)", III);//-----
        VM.put("player.layDown(Player.getPlayer(INT).getCardIndex(INT),player.getTable(),player.getCardIndex(INT).isFaceUp)", III);//-----
        VM.put("Player.getPlayer(INT).layDown(player.getCardIndex(INT),player.getTable(),player.getCardIndex(INT).isFaceUp)", III);//-----
        VM.put("player.layDown(player.getCardIndex(INT),table,player.getCardIndex(INT).isFaceUp)", II);//-----
        
        VM.put("Player.getPlayer(INT).takeCard(STRING,Player.getPlayer(INT).getDiscardPile())", ISI);//
        VM.put("player.takeCard(STRING,Player.getPlayer(INT).getDiscardPile())", SI);//-----
        VM.put("Player.getPlayer(INT).takeCard(STRING,player.getDiscardPile())", IS);//-----
        VM.put("player.takeCard(STRING,player.getDiscardPile())", S);//-----

        VM.put("Player.getPlayer(INT).takeCard(STRING,Game.discardPile)", IS);          //
        VM.put("player.takeCard(STRING,Game.discardPile)", S); //-----

        VM.put("Player.getPlayer(INT).takeCard(Player.getPlayer(INT).getDiscardPileIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", IIII);//
        VM.put("player.takeCard(Player.getPlayer(INT).getDiscardPileIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", III);//-----
        VM.put("Player.getPlayer(INT).takeCard(player.getDiscardPileIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", III);//-----
        VM.put("Player.getPlayer(INT).takeCard(Player.getPlayer(INT).getDiscardPileIndex(INT).id,player.getDiscardPile())", III);//-----
        VM.put("player.takeCard(player.getDiscardPileIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", II);//-----
        VM.put("Player.getPlayer(INT).takeCard(player.getDiscardPileIndex(INT).id,player.getDiscardPile())", II);//-----
        VM.put("player.takeCard(Player.getPlayer(INT).getDiscardPileIndex(INT).id,player.getDiscardPile())", II);//-----
        VM.put("player.takeCard(player.getDiscardPileIndex(INT).id,player.getDiscardPile())", I);//-----

        VM.put("Player.getPlayer(INT).takeCard(Game.getDiscardPileIndex(INT).id,Game.discardPile)", II);//
        VM.put("player.takeCard(Game.getDiscardPileIndex(INT).id,Game.discardPile)", II);//-----
        
        VM.put("Player.getPlayer(INT).takeCard(STRING,Player.getPlayer(INT).getTable())", ISI);//
        VM.put("player.takeCard(STRING,Player.getPlayer(INT).getTable())", SI);//-----
        VM.put("Player.getPlayer(INT).takeCard(STRING,player.getTable())", IS);//-----
        VM.put("player.takeCard(STRING,player.getTable())", S);//-----

        VM.put("Player.getPlayer(INT).takeCard(STRING,table)", IS);                     //
        VM.put("player.takeCard(STRING,table)", S); //-----

        VM.put("Player.getPlayer(INT).takeCard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,Player.getPlayer(INT).getTable())", IIII);//
        VM.put("player.takeCard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,Player.getPlayer(INT).getTable())", III);//-----
        VM.put("Player.getPlayer(INT).takeCard(player.getTable().getCardIndex(INT).id,Player.getPlayer(INT).getTable())", III);//-----
        VM.put("Player.getPlayer(INT).takeCard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,player.getTable())", III);//-----
        VM.put("player.takeCard(player.getTable().getCardIndex(INT).id,Player.getPlayer(INT).getTable())", III);//-----
        VM.put("Player.getPlayer(INT).takeCard(player.getTable().getCardIndex(INT).id,player.getTable())", II);//-----
        VM.put("player.takeCard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,player.getTable())", II);//-----
        VM.put("player.takeCard(player.getTable().getCardIndex(INT).id,player.getTable())", I);//-----

        VM.put("Player.getPlayer(INT).takeCard(table.getCardIndex(INT).id,table)", II);//
        VM.put("player.takeCard(table.getCardIndex(INT).id,table)", I);//-----
       
        VM.put("Player.getPlayer(INT).takeCard(STRING,Player.getPlayer(INT))", ISI);//
        VM.put("player.takeCard(STRING,Player.getPlayer(INT))", SI);//-----
        VM.put("Player.getPlayer(INT).takeCard(STRING,player)", IS);//-----
        VM.put("player.takeCard(STRING,player)", S);//-----

        VM.put("Player.getPlayer(INT).takeCard(Player.getPlayer(INT).getCardIndex(INT).id,Player.getPlayer(INT))", IIII);//
        VM.put("player.takeCard(Player.getPlayer(INT).getCardIndex(INT).id,Player.getPlayer(INT))", III);//-----
        VM.put("Player.getPlayer(INT).takeCard(player.getCardIndex(INT).id,Player.getPlayer(INT))", III);//-----
        VM.put("Player.getPlayer(INT).takeCard(Player.getPlayer(INT).getCardIndex(INT).id,player)", III);//-----
        VM.put("player.takeCard(player.getCardIndex(INT).id,Player.getPlayer(INT))", II);//-----
        VM.put("Player.getPlayer(INT).takeCard(player.getCardIndex(INT).id,player)", II);//-----
        VM.put("player.takeCard(Player.getPlayer(INT).getCardIndex(INT).id,player)", II);//-----
        VM.put("player.takeCard(player.getCardIndex(INT).id,player)", I);//-----
        
        VM.put("Player.getPlayer(INT).printHand()", I);                             //
        VM.put("player.printHand()", V); //-----
        VM.put("deck.shuffle()", V);                                                //
        
        VM.put("deck.getCard(INT).flip()", I);                                   //
        
        VM.put("deck.print()", V);                                              //
        
        VM.put("deck.returnDiscardPile()", V);                                   //

        VM.put("deck.returnDiscardPile(Player.getPlayer(INT))", I);             //
        VM.put("deck.returnDiscardPile(player)", V); //-----



        IM.put("table.getCardIndex(INT).getPoints()", I);                   //
        IM.put("table.size()", V);                                          //

        IM.put("Player.getPlayer(INT).getCardIndex(INT).getPoints()", II);//
        IM.put("Player.getPlayer(INT).getDiscardPileIndex(INT).getPoints()", II);//
        IM.put("Player.getPlayer(INT).getHandPoints()", I);                 //
        IM.put("Player.getPlayer(INT).handSize()", I);                      //
        IM.put("Player.getPlayer(INT).getTable().getCardIndex(INT).getPoints()", II);//
        IM.put("Player.getPlayer(INT).getTable().size()", I);                   //
        IM.put("Player.getPlayer(INT).getTablePoints()", I);                //
        IM.put("player.getCardIndex(INT).getPoints()", I);//-----
        IM.put("player.getDiscardPileIndex(INT).getPoints()", I);//-----
        IM.put("player.getHandPoints()", V);    //-----
        IM.put("player.handSize()", V);       //-----
        IM.put("player.getTable().getCardIndex(INT).getPoints()", I);//-----
        IM.put("player.getTable().size()", V);        //-----
        IM.put("player.getTablePoints()", V);     //-----

        IM.put("Player.getPlayersAmount()", V);                          //
        IM.put("deck.getCard(INT).getPoints()", I);                      //
        IM.put("deck.size()", V);                                               //
    

        SM.put("Game.input()", V);                                      //
        SM.put("Game.input(STRING)", S); 
        


        ATTI.put("Player.getPlayer(INT).score", I);                         //
        ATTI.put("player.score", V);    //-----

        ATTS.put("Game.getDiscardPileIndex(INT).id", I);                    //
        ATTS.put("Game.getDiscardPileIndex(INT).rank", I);                  //
        ATTS.put("Game.getDiscardPileIndex(INT).suit", I);                  //
        ATTS.put("table.getCardIndex(INT).id", I);                          //
        ATTS.put("table.getCardIndex(INT).rank", I);                        //
        ATTS.put("table.getCardIndex(INT).suit", I);                        //

        ATTS.put("Player.getPlayer(INT).name", I);                          //
        ATTS.put("Player.getPlayer(INT).getCardIndex(INT).id", II);         //
        ATTS.put("Player.getPlayer(INT).getCardIndex(INT).rank", II);       //
        ATTS.put("Player.getPlayer(INT).getCardIndex(INT).suit", II);       //
        ATTS.put("Player.getPlayer(INT).getDiscardPileIndex(INT).id", II);  //
        ATTS.put("Player.getPlayer(INT).getDiscardPileIndex(INT).rank", II);//
        ATTS.put("Player.getPlayer(INT).getDiscardPileIndex(INT).suit", II);//
        ATTS.put("Player.getPlayer(INT).getTable().getCardIndex(INT).id", II); //
        ATTS.put("Player.getPlayer(INT).getTable().getCardIndex(INT).rank", II); //
        ATTS.put("Player.getPlayer(INT).getTable().getCardIndex(INT).suit", II); //
        ATTS.put("player.name", V);                          //-----
        ATTS.put("player.getCardIndex(INT).id", I);         //-----
        ATTS.put("player.getCardIndex(INT).rank", I);       //-----
        ATTS.put("player.getCardIndex(INT).suit", I);       //-----
        ATTS.put("player.getDiscardPileIndex(INT).id", I);  //-----
        ATTS.put("player.getDiscardPileIndex(INT).rank", I);//-----
        ATTS.put("player.getDiscardPileIndex(INT).suit", I);//-----
        ATTS.put("player.getTable().getCardIndex(INT).id", I); //-----
        ATTS.put("player.getTable().getCardIndex(INT).rank", I); //-----
        ATTS.put("player.getTable().getCardIndex(INT).suit", I); //-----

        ATTS.put("deck.getCard(INT).id", I);                                //
        ATTS.put("deck.getCard(INT).rank", I);                              //
        ATTS.put("deck.getCard(INT).suit", I);                                  //

        ATTB.put("table.getCardIndex(INT).isFaceUp", I);                        //

        ATTB.put("Player.getPlayer(INT).getCardIndex(INT).isFaceUp", II);       //
        ATTB.put("Player.getPlayer(INT).getDiscardPileIndex(INT).isFaceUp", II);//
        ATTB.put("Player.getPlayer(INT).getTable().getCardIndex(INT).isFaceUp", II);//
        ATTB.put("player.getCardIndex(INT).isFaceUp", I);       //-----
        ATTB.put("player.getDiscardPileIndex(INT).isFaceUp", I);//-----
        ATTB.put("player.getTable().getCardIndex(INT).isFaceUp", I);//-----

        ATTB.put("deck.getCard(INT).isFaceUp", I);                              //

    }


    public static boolean processInput(String input, String context){
        
        boolean result = false; // is input valid
        boolean FparamTypeCheck;
        String method = ""; // method call to check against method hashtables
        ArrayList<String> Fparams = new ArrayList<>(); // INT, BOOL, STRING
        ArrayList<String> Aparams = new ArrayList<>(); // Actual parameters
        String temp1;
        String temp2;
        
        //decls
        if (input.contains("=") && !input.substring(input.indexOf("=")+1).startsWith("=")) {
            
            while((input.contains(" ") && !input.contains("\"")) || (input.contains(" ") && input.contains("\"") && input.indexOf(" ") < input.indexOf("\""))){
                input = input.substring(0, input.indexOf(" "))+input.substring(input.indexOf(" ")+1);
            }
            if (input.startsWith("int") || input.startsWith("bool") || input.startsWith("string")) {
                if (input.startsWith("int")) {
                    temp1 = input.substring(3,input.indexOf("="));
                    temp2 = input.substring(input.indexOf("=")+1);
                    if (declVar(temp1, "INT", temp2)) {
                        result = true;
                        System.out.println("declared variable!");
                        System.out.println("type: "+VarType.get(temp1));
                        System.out.println("varID: "+temp1);
                        System.out.println("value: "+temp2);
                    }
                }
                else if (input.startsWith("bool")) {
                    temp1 = input.substring(4,input.indexOf("="));
                    temp2 = input.substring(input.indexOf("=")+1);
                    if (declVar(temp1, "BOOL", temp2)) {
                        result = true;
                        System.out.println("declared variable!");
                        System.out.println("type: "+VarType.get(temp1));
                        System.out.println("varID: "+temp1);
                        System.out.println("value: "+temp2);
                    }
                }
                else if (input.startsWith("string")) {
                    temp1 = input.substring(6,input.indexOf("="));
                    temp2 = input.substring(input.indexOf("=")+1);
                    if (declVar(temp1, "STRING", temp2)) {
                        result = true;
                        System.out.println("declared variable!");
                        System.out.println("type: "+VarType.get(temp1));
                        System.out.println("varID: "+temp1);
                        System.out.println("value: "+temp2);
                    }
                }
                
            }
            //assigns
            else {
                
                temp1 = input.substring(0,input.indexOf("="));
                temp2 = input.substring(input.indexOf("=")+1);
                if (assignVar(temp1, temp2)) {
                    result = true;
                    System.out.println("assigned variable!");
                    System.out.println("type: "+VarType.get(temp1));
                    System.out.println("varID: "+temp1);
                    System.out.println("value: "+temp2);
                    
                }
                
            }
        }
        
        
        //methodcalls
        else if((input.contains(".") && !input.contains("\"")) || (input.contains(".") && input.contains("\"") && input.indexOf(".") < input.indexOf("\""))) {

            //contains "player" as used in Turn()
            if (((input.contains("player") && !input.contains("\"")) || (input.contains("player") && input.contains("\"") && input.indexOf("player") < input.indexOf("\"")) ||  (input.contains("player") && input.contains("\"") && input.indexOf("player") > input.lastIndexOf("\"")))) {
                if (input.startsWith("table.discard(")) {
                    Fparams.add("STRING");
                    method = method.concat("table.discard(STRING");
                    input = input.substring(14);
                    Aparams.add(input.substring(0, input.lastIndexOf(",player")));
                    input = input.substring(input.lastIndexOf(",player"));
                    method = method.concat(input);
                    input = "";
                }
                else if (input.startsWith("table.discard(table.getCardIndex(")) {
                    Fparams.add("INT");
                    method = method.concat("table.discard(table.getCardIndex(INT");
                    input = input.substring(33);
                    Aparams.add(input.substring(0,input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    method = method.concat(input);
                    input = "";
                }
                else if (input.startsWith("player")) {

                    method = method.concat("player");
                    input = input.substring(6);
                    if (input.startsWith(".getTable().getCardIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(".getTable().getCardIndex(INT");
                        input = input.substring(25);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        input = input.substring(input.indexOf(")."));
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(".draw(")) {
                        Fparams.add("INT");
                        method = method.concat(".draw(INT");
                        input = input.substring(6);
                        Aparams.add(input.substring(0, input.length()-1));
                        input = input.substring(input.length()-1);
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(".getDiscardPileIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(".getDiscardPileIndex(INT");
                        input = input.substring(21);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        input = input.substring(input.indexOf(")."));
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(".getCardIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(".getCardIndex(INT");
                        input = input.substring(14);
                        if (input.contains(").")) {
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            input = input.substring(input.indexOf(")."));
                        } else {
                            Aparams.add(input.substring(0, input.length()-1));
                            input = input.substring(input.length()-1);
                        }

                        method = method.concat(input);
                        input = "";

                    }
                    else if (input.startsWith(".takeCard(Player.getPlayer(")) {
                        Fparams.add("INT");
                        method = method.concat(".takeCard(Player.getPlayer(INT");
                        input = input.substring(27);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        input = input.substring(input.indexOf(")."));
                        if (input.startsWith(").getTable().getCardIndex(")) {
                            Fparams.add("INT");
                            method = method.concat(").getTable().getCardIndex(INT");
                            input = input.substring(26);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            if (input.startsWith(").id,Player.getPlayer(")) {
                                Fparams.add("INT");
                                method = method.concat(").id,Player.getPlayer(INT");
                                input = input.substring(22);
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            }
                        }
                        else if (input.startsWith(").getDiscardPileIndex(")) {
                            Fparams.add("INT");
                            method = method.concat(").getDiscardPileIndex(INT");
                            input = input.substring(22);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            if (input.startsWith(").id,Player.getPlayer(")) {
                                Fparams.add("INT");
                                method = method.concat(").id,Player.getPlayer(INT");
                                input = input.substring(22);
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            }
                        }
                        else if (input.startsWith(").getCardIndex(")) {
                            Fparams.add("INT");
                            method = method.concat(").getCardIndex(INT");
                            input = input.substring(15);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            if (input.startsWith(").id,Player.getPlayer(")) {
                                Fparams.add("INT");
                                method = method.concat(").id,Player.getPlayer(INT");
                                input = input.substring(22);
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            }
                        }
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(".takeCard(player")) {
                        method = method.concat(".takeCard(player");
                        input = input.substring(16);
                        if (input.startsWith(").getTable().getCardIndex(")) {
                            Fparams.add("INT");
                            method = method.concat(").getTable().getCardIndex(INT");
                            input = input.substring(26);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            if (input.startsWith(").id,Player.getPlayer(")) {
                                Fparams.add("INT");
                                method = method.concat(").id,Player.getPlayer(INT");
                                input = input.substring(22);
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            }
                        }
                        else if (input.startsWith(").getDiscardPileIndex(")) {
                            Fparams.add("INT");
                            method = method.concat(").getDiscardPileIndex(INT");
                            input = input.substring(22);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            if (input.startsWith(").id,Player.getPlayer(")) {
                                Fparams.add("INT");
                                method = method.concat(").id,Player.getPlayer(INT");
                                input = input.substring(22);
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            }
                        }
                        else if (input.startsWith(").getCardIndex(")) {
                            Fparams.add("INT");
                            method = method.concat(").getCardIndex(INT");
                            input = input.substring(15);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            if (input.startsWith(").id,Player.getPlayer(")) {
                                Fparams.add("INT");
                                method = method.concat(").id,Player.getPlayer(INT");
                                input = input.substring(22);
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            }
                        }
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(".takeCard(table.getCardIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(").takeCard(table.getCardIndex(INT");
                        input = input.substring(30);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        input = input.substring(input.indexOf(")."));
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(".takeCard(Game.getDiscardPileIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(").takeCard(Game.getDiscardPileIndex(INT");
                        input = input.substring(39);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        input = input.substring(input.indexOf(")."));
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(".takeCard(")) {
                        Fparams.add("STRING");
                        method = method.concat(").takeCard(STRING");
                        input = input.substring(11);
                        Aparams.add(input.substring(0, input.lastIndexOf(",")));
                        input = input.substring(input.lastIndexOf(","));
                        if (input.startsWith(",Player.getPlayer(")) {
                            Fparams.add("INT");
                            method = method.concat(",Player.getPlayer(INT");
                            input = input.substring(18);
                            if (input.contains(").")) {
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            } else {
                                Aparams.add(input.substring(0, input.lastIndexOf("))")));
                                input = input.substring(input.lastIndexOf("))"));
                                method = method.concat(input);
                                input = "";
                            }
                        } else {
                            method = method.concat(input);
                            input = "";
                        }
                    }
                    else {
                        method = method.concat(input);
                        input = "";
                    }
                }
                else if (input.startsWith("Player.getPlayer(")) {
                    Fparams.add("INT");
                    method = method.concat("Player.getPlayer(INT");
                    input = input.substring(17);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    if (input.startsWith(".getTable().getCardIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(".getTable().getCardIndex(INT");
                        input = input.substring(25);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        input = input.substring(input.indexOf(")."));
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(".getDiscardPileIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(".getDiscardPileIndex(INT");
                        input = input.substring(21);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        input = input.substring(input.indexOf(")."));
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(".getCardIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(".getCardIndex(INT");
                        input = input.substring(14);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        input = input.substring(input.indexOf(")."));
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(".takeCard(Player.getPlayer(")) {
                        Fparams.add("INT");
                        method = method.concat(".takeCard(Player.getPlayer(INT");
                        input = input.substring(27);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        input = input.substring(input.indexOf(")."));
                        if (input.startsWith(").getTable().getCardIndex(")) {
                            Fparams.add("INT");
                            method = method.concat(").getTable().getCardIndex(INT");
                            input = input.substring(26);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            if (input.startsWith(").id,Player.getPlayer(")) {
                                Fparams.add("INT");
                                method = method.concat(").id,Player.getPlayer(INT");
                                input = input.substring(22);
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            }
                        }
                        else if (input.startsWith(").getDiscardPileIndex(")) {
                            Fparams.add("INT");
                            method = method.concat(").getDiscardPileIndex(INT");
                            input = input.substring(22);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            if (input.startsWith(").id,Player.getPlayer(")) {
                                Fparams.add("INT");
                                method = method.concat(").id,Player.getPlayer(INT");
                                input = input.substring(22);
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            }
                        }
                        else if (input.startsWith(").getCardIndex(")) {
                            Fparams.add("INT");
                            method = method.concat(").getCardIndex(INT");
                            input = input.substring(15);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            if (input.startsWith(").id,Player.getPlayer(")) {
                                Fparams.add("INT");
                                method = method.concat(").id,Player.getPlayer(INT");
                                input = input.substring(22);
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            }
                        }
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(".takeCard(player")) {
                        method = method.concat(".takeCard(player");
                        input = input.substring(16);
                        if (input.startsWith(").getTable().getCardIndex(")) {
                            Fparams.add("INT");
                            method = method.concat(").getTable().getCardIndex(INT");
                            input = input.substring(26);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            if (input.startsWith(").id,Player.getPlayer(")) {
                                Fparams.add("INT");
                                method = method.concat(").id,Player.getPlayer(INT");
                                input = input.substring(22);
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            }
                        }
                        else if (input.startsWith(").getDiscardPileIndex(")) {
                            Fparams.add("INT");
                            method = method.concat(").getDiscardPileIndex(INT");
                            input = input.substring(22);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            if (input.startsWith(").id,Player.getPlayer(")) {
                                Fparams.add("INT");
                                method = method.concat(").id,Player.getPlayer(INT");
                                input = input.substring(22);
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            }
                        }
                        else if (input.startsWith(").getCardIndex(")) {
                            Fparams.add("INT");
                            method = method.concat(").getCardIndex(INT");
                            input = input.substring(15);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            if (input.startsWith(").id,Player.getPlayer(")) {
                                Fparams.add("INT");
                                method = method.concat(").id,Player.getPlayer(INT");
                                input = input.substring(22);
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            }
                        }
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(").takeCard(table.getCardIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(").takeCard(table.getCardIndex(INT");
                        input = input.substring(30);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        input = input.substring(input.indexOf(")."));
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(").takeCard(Game.getDiscardPileIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(").takeCard(Game.getDiscardPileIndex(INT");
                        input = input.substring(39);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        input = input.substring(input.indexOf(")."));
                        method = method.concat(input);
                        input = "";
                    }
                    else if (input.startsWith(").takeCard(")) {
                        Fparams.add("STRING");
                        method = method.concat(").takeCard(STRING");
                        input = input.substring(11);
                        Aparams.add(input.substring(0, input.lastIndexOf(",")));
                        input = input.substring(input.lastIndexOf(","));
                        if (input.startsWith(",Player.getPlayer(")) {
                            Fparams.add("INT");
                            method = method.concat(",Player.getPlayer(INT");
                            input = input.substring(18);
                            if (input.contains(").")) {
                                Aparams.add(input.substring(0, input.indexOf(").")));
                                input = input.substring(input.indexOf(")."));
                                method = method.concat(input);
                                input = "";
                            } else {
                                Aparams.add(input.substring(0, input.lastIndexOf("))")));
                                input = input.substring(input.lastIndexOf("))"));
                                method = method.concat(input);
                                input = "";
                            }
                        } else {
                            method = method.concat(input);
                            input = "";
                        }
                    }
                    else {
                        method = method.concat(input);
                        input = "";
                    }

                }
                else {
                    method = method.concat(input);
                    input = "";
                }
            }

            //Starts with INT param
            else if (input.startsWith("deck.returnDiscardPile(Player.getPlayer(")) {
                Fparams.add("INT");
                method = method.concat("deck.returnDiscardPile(Player.getPlayer(INT");
                input = input.substring(40);
                Aparams.add(input.substring(0,input.lastIndexOf("))")));
                input = input.substring(input.lastIndexOf("))"));
                method = method.concat(input);
                input = "";
            }
            else if (input.startsWith("table.discardAll(Player.getPlayer(")) {
                Fparams.add("INT");
                method = method.concat("table.discardAll(Player.getPlayer(INT");
                input = input.substring(34);
                Aparams.add(input.substring(0,input.indexOf(").")));
                input = input.substring(input.indexOf(")."));
                method = method.concat(input);
                input = "";
            }
            else if (input.startsWith("table.discard(table.getCardIndex(")) {
                Fparams.add("INT");
                method = method.concat("table.discard(table.getCardIndex(INT");
                input = input.substring(33);
                Aparams.add(input.substring(0,input.indexOf(").")));
                input = input.substring(input.indexOf(")."));
                if (input.contains("(")){
                    Fparams.add("INT");
                    method = method.concat(input.substring(0,input.indexOf("(")+1));
                    input = input.substring(input.indexOf("(")+1);
                    Aparams.add(input.substring(0,input.indexOf(").")+1));
                    input = input.substring(input.indexOf(")."));

                }
                    method = method.concat(input);
                    input = "";

            }
            else if (input.startsWith("Game.exit(Player.getPlayer(")) {
                Fparams.add("INT");
                method = method.concat("Game.exit(Player.getPlayer(INT");
                input = input.substring(27);
                Aparams.add(input.substring(0,input.lastIndexOf("))")));
                input = input.substring(input.lastIndexOf("))"));
                method = method.concat(input);
                input = "";
            }
            else if (input.startsWith("deck.getCard(")) {
                Fparams.add("INT");
                method = method.concat("deck.getCard(INT");
                input = input.substring(13);
                Aparams.add(input.substring(0, input.indexOf(").")));
                input = input.substring(input.indexOf(")."));
                method = method.concat(input);
                input = "";
            }
            else if (input.startsWith("Player.getPlayer(")) {
                Fparams.add("INT");
                method = method.concat("Player.getPlayer(INT");
                input = input.substring(17);
                if (input.contains(").")) {
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                } else {
                    Aparams.add(input.substring(0, input.length()-1));
                    input = input.substring(input.length()-1);
                }
                if (input.startsWith(").draw(")) {
                    Fparams.add("INT");
                    method = method.concat(").draw(INT");
                    input = input.substring(7);
                    Aparams.add(input.substring(0, input.length()-1));
                    input = input.substring(input.length()-1);
                    method = method.concat(input);
                    input = "";
                }
                else if (input.startsWith(").getTable().getCardIndex(")) {
                    Fparams.add("INT");
                    method = method.concat(").getTable().getCardIndex(INT");
                    input = input.substring(26);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    method = method.concat(input);
                    input = "";
                }
                else if (input.startsWith(").getDiscardPileIndex(")) {
                    Fparams.add("INT");
                    method = method.concat(").getDiscardPileIndex(INT");
                    input = input.substring(22);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    method = method.concat(input);
                    input = "";
                }
                else if (input.startsWith(").getCardIndex(")) {
                    Fparams.add("INT");
                    method = method.concat(").getCardIndex(INT");
                    input = input.substring(15);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    method = method.concat(input);
                    input = "";
                }
                else if (input.startsWith(").takeCard(Player.getPlayer(")) {
                    Fparams.add("INT");
                    method = method.concat(").takeCard(Player.getPlayer(INT");
                    input = input.substring(28);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    if (input.startsWith(").getTable().getCardIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(").getTable().getCardIndex(INT");
                        input = input.substring(26);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        if (input.startsWith(").id,Player.getPlayer(")) {
                            Fparams.add("INT");
                            method = method.concat(").id,Player.getPlayer(INT");
                            input = input.substring(22);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            input = input.substring(input.indexOf(")."));
                            method = method.concat(input);
                            input = "";
                        }
                    } else if (input.startsWith(").getDiscardPileIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(").getDiscardPileIndex(INT");
                        input = input.substring(22);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        if (input.startsWith(").id,Player.getPlayer(")) {
                            Fparams.add("INT");
                            method = method.concat(").id,Player.getPlayer(INT");
                            input = input.substring(22);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            input = input.substring(input.indexOf(")."));
                            method = method.concat(input);
                            input = "";
                        }
                    } else if (input.startsWith(").getCardIndex(")) {
                        Fparams.add("INT");
                        method = method.concat(").getCardIndex(INT");
                        input = input.substring(15);
                        Aparams.add(input.substring(0, input.indexOf(").")));
                        if (input.startsWith(").id,Player.getPlayer(")) {
                            Fparams.add("INT");
                            method = method.concat(").id,Player.getPlayer(INT");
                            input = input.substring(22);
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            input = input.substring(input.indexOf(")."));
                            method = method.concat(input);
                            input = "";
                        }
                    }
                    method = method.concat(input);
                    input = "";
                }
                else if (input.startsWith(").takeCard(table.getCardIndex(")) {
                    Fparams.add("INT");
                    method = method.concat(").takeCard(table.getCardIndex(INT");
                    input = input.substring(30);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    method = method.concat(input);
                    input = "";
                }
                else if (input.startsWith(").takeCard(Game.getDiscardPileIndex(")) {
                    Fparams.add("INT");
                    method = method.concat(").takeCard(Game.getDiscardPileIndex(INT");
                    input = input.substring(39);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    method = method.concat(input);
                    input = "";
                }
                else if (input.startsWith(").takeCard(")) {
                    Fparams.add("STRING");
                    method = method.concat(").takeCard(STRING");
                    input = input.substring(11);
                    Aparams.add(input.substring(0, input.lastIndexOf(",")));
                    input = input.substring(input.lastIndexOf(","));
                    if (input.startsWith(",Player.getPlayer(")) {
                        Fparams.add("INT");
                        method = method.concat(",Player.getPlayer(INT");
                        input = input.substring(18);
                        if (input.contains(").")){
                            Aparams.add(input.substring(0, input.indexOf(").")));
                            input = input.substring(input.indexOf(")."));
                            method = method.concat(input);
                            input = "";
                        }
                        else {
                            Aparams.add(input.substring(0, input.lastIndexOf("))")));
                            input = input.substring(input.lastIndexOf("))"));
                            method = method.concat(input);
                            input = "";
                        }
                    }
                    else  {
                        method = method.concat(input);
                        input = "";
                    } 
                }
                else {
                    method = method.concat(input);
                    input = "";
                }
                
                
            }
            else if (input.startsWith("table.getCardIndex(")) {
                Fparams.add("INT");
                method = method.concat("table.getCardIndex(INT");
                input = input.substring(19);
                Aparams.add(input.substring(0, input.indexOf(").")));
                input = input.substring(input.indexOf(")."));
                method = method.concat(input);
                input = "";
            }
            else if (input.startsWith("Game.getDiscardPileIndex(")) {
                Fparams.add("INT");
                method = method.concat("Game.getDiscardPileIndex(INT");
                input = input.substring(25);
                Aparams.add(input.substring(0, input.indexOf(").")));
                input = input.substring(input.indexOf(")."));
                method = method.concat(input);
                input = "";
            }
            else if (input.startsWith("table.draw(")) {
                Fparams.add("INT");
                method = method.concat("table.draw(INT");
                input = input.substring(11);
                Aparams.add(input.substring(0, input.indexOf(",")));
                input = input.substring(input.indexOf(","));
                method = method.concat(input);
                input = "";
            }
            else if (input.startsWith("deck.assignPoints(")) {
                Fparams.add("INT");
                method = method.concat("deck.assignPoints(INT");
                input = input.substring(18);
                Aparams.add(input.substring(0, input.indexOf(",")));
                input = input.substring(input.indexOf(","));
                method = method.concat(",SLIST");
                while (input.startsWith(",")) {
                    Fparams.add("STRING");
                    input = input.substring(1);
                    if(input.contains(",")){
                        Aparams.add(input.substring(0, input.indexOf(",")));
                        input = input.substring(input.indexOf(","));
                    }
                    else {
                        Aparams.add(input.substring(0, input.indexOf(")")));
                        input = input.substring(input.indexOf(")"));
                    }
                }
                method = method.concat(input);
                input = "";
            }
            else if (input.startsWith("deck.deal(")) {
                Fparams.add("INT");
                method = method.concat("deck.deal(INT");
                input = input.substring(10);
                Aparams.add(input.substring(0, input.lastIndexOf(")")));
                input = input.substring(input.lastIndexOf(")"));
                method = method.concat(input);
                input = "";
            }
            else if (input.startsWith("deck.addJokers(")) {
                Fparams.add("INT");
                method = method.concat("deck.addJokers(INT");
                input = input.substring(15);
                Aparams.add(input.substring(0, input.lastIndexOf(")")));
                input = input.substring(input.lastIndexOf(")"));
                method = method.concat(input);
                input = "";
            }
            else if (input.startsWith("Player.create(")) {
                Fparams.add("INT");
                method = method.concat("Player.create(INT");
                input = input.substring(14);
                Aparams.add(input.substring(0, input.lastIndexOf(")")));
                input = input.substring(input.lastIndexOf(")"));
                method = method.concat(input);
                input = "";
            } 
            
            //Starts with STRING param
            else if (input.startsWith("Game.print(")){
                Fparams.add("STRING");
                method = method.concat("Game.print(STRING");
                input = input.substring(11);
                Aparams.add(input.substring(0, input.lastIndexOf(")")));
                input = input.substring(input.lastIndexOf(")"));
                method = method.concat(input);
                input = "";
            }
            else if (input.startsWith("Game.input(") && !input.startsWith("Game.input()")){
                Fparams.add("STRING");
                method = method.concat("Game.input(STRING");
                input = input.substring(11);
                Aparams.add(input.substring(0, input.lastIndexOf(")")));
                input = input.substring(input.lastIndexOf(")"));
                method = method.concat(input);
                input = "";
            }
            else if ((input.startsWith("table.discard(") && !input.startsWith("table.discard(table.getCardIndex("))){
                Fparams.add("STRING");
                method = method.concat("table.discard(STRING");
                input = input.substring(14);
                if (input.contains(",Player.getPlayer(")) {
                    Fparams.add("INT");
                    Aparams.add(input.substring(0, input.indexOf(",Player.getPlayer(")));
                    input = input.substring(input.indexOf(",Player.getPlayer("));
                    method = method.concat(input.substring(0,input.indexOf("(")+1));
                    input = input.substring(input.indexOf("(")+1);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    method = method.concat(input);
                    input = "";
                }
                else {
                    Aparams.add(input.substring(0, input.lastIndexOf(")")));
                    input = input.substring(input.lastIndexOf(")"));
                    method = method.concat(input);
                    input = "";
                }
            }
            else {}
                
            if (Fparams.isEmpty() && ((SETM.containsKey(input) || VM.containsKey(input) || IM.containsKey(input) || SM.containsKey(input) || PM.containsKey(input) || ATTI.containsKey(input) || ATTS.containsKey(input) || ATTB.containsKey(input))|| ((SETM.containsKey(method) || VM.containsKey(method) || IM.containsKey(method) || SM.containsKey(method) || ATTI.containsKey(method) || ATTS.containsKey(method) || ATTB.containsKey(method))) )) {

                result = true;
            }
            

        //check on method, Fparams, Aparams
            if (Fparams.size()>0 &&  (SETM.containsKey(method) || VM.containsKey(method) || IM.containsKey(method) || SM.containsKey(method) || PM.containsKey(input) || ATTI.containsKey(method) || ATTS.containsKey(method) || ATTB.containsKey(method)) && input.isEmpty()){
                if (SETM.containsKey(method) && context.equals("VOID")){
                    FparamTypeCheck = SETM.get(method).equals(Fparams);
                    if (!FparamTypeCheck) {return false;}
                    int p = 0;
                    for (String aparam : Aparams) {
                        switch (Fparams.get(p)) {
                            case "INT" :
                                if (!checkArithExpr(aparam)) {return false;}
                                break;
                            case "STRING" :
                            if (!checkStringExpr(aparam)) {return false;}
                            break;
                            case "BOOL" :
                            if (!checkLogicExpr(aparam)) {return false;}
                            break;
                        }
                        p++;
                    }

                        result = true;   

                }
                else if (VM.containsKey(method) && context.equals("VOID")){
                    FparamTypeCheck = VM.get(method).equals(Fparams);
                    if (!FparamTypeCheck) {return false;}
                    int p = 0;
                    for (String aparam : Aparams) {
                        switch (Fparams.get(p)) {
                            case "INT" :
                                if (!checkArithExpr(aparam)) {return false;}
                                break;
                            case "STRING" :
                            if (!checkStringExpr(aparam)) {return false;}
                                break;
                            case "BOOL" :
                            if (!checkLogicExpr(aparam)) {return false;}
                                break;
                        }
                        p++;
                    }

                        result = true;   

                }
                else if (IM.containsKey(method) && context.equals("INT")){
                    FparamTypeCheck = IM.get(method).equals(Fparams);
                    if (!FparamTypeCheck) {return false;}
                    int p = 0;
                    for (String aparam : Aparams) {
                        
                        switch (Fparams.get(p)) {
                            case "INT" :
                                if (!checkArithExpr(aparam)) {return false;}
                                break;
                            case "STRING" :
                                if (!checkStringExpr(aparam)) {return false;}
                                break;
                            case "BOOL" :
                                if (!checkLogicExpr(aparam)) {return false;}
                                break;
                        }
                        p++;
                    }

                        result = true;   

                
                }
                
                else if (SM.containsKey(method) && context.equals("STRING")){
                    FparamTypeCheck = SM.get(method).equals(Fparams);
                    if (!FparamTypeCheck) {return false;}
                    int p = 0;
                    for (String aparam : Aparams) {
                        switch (Fparams.get(p)) {
                            case "INT" :
                                if (!checkArithExpr(aparam)) {return false;}
                                break;
                            case "STRING" :
                            if (!checkStringExpr(aparam)) {return false;}
                            break;
                            case "BOOL" :
                            if (!checkLogicExpr(aparam)) {return false;}
                            break;
                        }
                        p++;
                    }

                        result = true;   

                }
                if (PM.containsKey(method) && context.equals("VOID")){
                    FparamTypeCheck = PM.get(method).equals(Fparams);
                    if (!FparamTypeCheck) {return false;}
                    int p = 0;
                    for (String aparam : Aparams) {
                        switch (Fparams.get(p)) {
                            case "INT" :
                                if (!checkArithExpr(aparam)) {return false;}
                                break;
                            case "STRING" :
                                if (!checkStringExpr(aparam)) {return false;}
                                break;
                            case "BOOL" :
                                if (!checkLogicExpr(aparam)) {return false;}
                                break;
                        }
                        p++;
                    }

                    result = true;

                }
                else if (ATTI.containsKey(method) && context.equals("INT")){
                    FparamTypeCheck = ATTI.get(method).equals(Fparams);
                    if (!FparamTypeCheck) {return false;}
                    int p = 0;
                    for (String aparam : Aparams) {
                        switch (Fparams.get(p)) {
                            case "INT" :
                                if (!checkArithExpr(aparam)) {return false;}
                                break;
                            case "STRING" :
                            if (!checkStringExpr(aparam)) {return false;}
                            break;
                            case "BOOL" :
                            if (!checkLogicExpr(aparam)) {return false;}
                            break;
                        }
                        p++;
                    }

                        result = true;   

                }
                else if (ATTS.containsKey(method) && context.equals("STRING")){
                    FparamTypeCheck = ATTS.get(method).equals(Fparams);
                    if (!FparamTypeCheck) {return false;}
                    int p = 0;
                    for (String aparam : Aparams) {
                        switch (Fparams.get(p)) {
                            case "INT" :
                                if (!checkArithExpr(aparam)) {return false;}
                                break;
                            case "STRING" :
                            if (!checkStringExpr(aparam)) {return false;}
                            break;
                            case "BOOL" :
                            if (!checkLogicExpr(aparam)) {return false;}
                            break;
                        }
                        p++;
                    }

                        result = true;   

                }
                else if (ATTB.containsKey(method) && context.equals("BOOL")){
                    FparamTypeCheck = ATTB.get(method).equals(Fparams);
                    if (!FparamTypeCheck) {return false;}
                    int p = 0;
                    for (String aparam : Aparams) {
                        switch (Fparams.get(p)) {
                            case "INT" :
                                if (!checkArithExpr(aparam)) {return false;}
                                break;
                            case "STRING" :
                                if (!checkStringExpr(aparam)) {return false;}
                                break;
                            case "BOOL" :
                                if (!checkLogicExpr(aparam)) {return false;}
                                break;
                        }
                        p++;
                    }

                        result = true;   

                }
                   
            }    
            System.out.println("context: "+context);
            System.out.println("input: "+input);
            System.out.println("method: "+method);
            System.out.println("Fparams: ");
            for (String param : Fparams) {
                System.out.print(param+" , ");
            }
            System.out.println();
            System.out.println("Aparams: ");
            for (String param : Aparams) {
                System.out.print(param+" , ");
            }   
            System.out.println(); 
        }
        
       
        
        return result;
    }

    static void declFunc(String funcID){
        if(FuncIDs.contains(funcID)) { throw new IllegalArgumentException(funcID+" has already been declared.");}
        else {
            FuncIDs.add(funcID);
        }

    }

    static boolean declVar(String varID, String type, String value){

        if(VarType.containsKey(varID)) { throw new IllegalArgumentException(varID+" has already been declared.");}
        else if (type.equals("INT")) {
            if (checkValidValue(value,type)){
                VarType.put(varID,type);
                VarInt.put(varID,value);
                return true;
            }
        }
        else if (type.equals("BOOL")) {
            if (checkValidValue(value,type)){
                VarType.put(varID,type);
                VarBool.put(varID,value);
                return true;
            }
        }
        else if (type.equals("STRING")) {
            if (checkValidValue(value,type)){
                VarType.put(varID,type);
                VarString.put(varID,value);
                return true;
            }
        }
        return false;
    }

    static boolean assignVar(String varID, String value){

        if(VarType.containsKey(varID)) {
            if (VarType.get(varID) == "INT") {
                if (checkArithExpr(value)){
                    VarInt.put(varID,value);
                    return true;
                } else { throw new IllegalArgumentException(value+" is not an arithmetic expression."); }
            }
            else if (VarType.get(varID) == "BOOL") {
                if (checkLogicExpr(value)){
                    VarBool.put(varID,value);
                    return true;
                } else { throw new IllegalArgumentException(value+" is not a logic expression."); }
            }
            else if (VarType.get(varID) == "STRING") {
                if (checkStringExpr(value)){
                    VarString.put(varID,value);
                    return true;
                } else { throw new IllegalArgumentException(value+" is not a string expression."); }
            } 
        } else { throw new IllegalArgumentException(varID+" is not a variable."); }
        return false;
    }

    static String checkVarType(String varID){
        
        if(VarType.containsKey(varID)) {
            if (VarInt.containsKey(varID)) {
                return "INT";
            }
            else if (VarBool.containsKey(varID)) {
                return "BOOL";
            }
            else if (VarString.containsKey(varID)) {
                return "STRING";
            }
            else { throw new IllegalArgumentException(varID+" could not be found as INT, STRING or BOOL.");}
        }else { return "VOID"; }

    }
    static boolean checkVarExist (String varID) {
        if(VarType.containsKey(varID)) { return true; }
        else { throw new IllegalArgumentException(varID+" is not a variable."); }
    }

    static boolean checkValidFuncID(String funcID){
        if(FuncIDs.contains(funcID)) { return true;}
        else {
            throw new IllegalArgumentException(funcID+" has not been declared.");
        }
    }

    static boolean checkValidValue(String value, String context) {
        if (context.equals("BOOL")) {
            if (checkLogicExpr(value)) {
                return true;
            }
        } else if (context.equals("STRING")) {
            if (checkStringExpr(value)) {
                return true;
            }
        } else if (context.equals("INT")) {
            if (checkArithExpr(value)) {
                return true;
            }
        }
        return false;
    }


    public static boolean checkArithExpr(String value) {
        value = value.trim();
        String temp = "";

        if (!value.contains("&") && !value.contains("|") && !value.contains("=") && !value.contains("#") && !value.contains("\"") && !value.contains("<") && !value.contains(">") && !value.contains("!") && !value.contains("{") && !value.contains("}") && !value.contains(",")) {
            if (!value.contains(".")) {
                while (value.contains("(")) {
                    value = value.substring(0, value.indexOf("(")) + value.substring(value.indexOf("(") + 1);
                }
                while (value.contains(")")) {
                    value = value.substring(0, value.indexOf(")")) + value.substring(value.indexOf(")") + 1);
                }
            }
            while(value.contains(" ")){
                value = value.substring(0, value.indexOf(" "))+value.substring(value.indexOf(" ")+1);
            }

            if (value.endsWith("++") || value.endsWith("--")) {

                if (checkValidValue(value.substring(0,value.length()-2),"INT")) {
                    return true;
                } else { return false;}
            } else if (value.startsWith("-")) {
                value = value.substring(1);
            
            } 
            while (value.contains("*")) {
                temp = value.substring(0,value.indexOf("*"));
                if (checkArithExpr(temp)) {
                    value = value.substring(temp.length()+1);
                } else { return false;}
            } while (value.contains("/")) {
                temp = value.substring(0,value.indexOf("/"));
                if (checkArithExpr(temp)) {
                    value = value.substring(temp.length()+1);
                } else { return false;}
            } while (value.contains("+")) {
                temp = value.substring(0,value.indexOf("+"));
                if (checkArithExpr(temp)) {
                    value = value.substring(temp.length()+1);
                } else { return false;}
            } while (value.contains("-")) {
                temp = value.substring(0,value.indexOf("-"));
                if (checkArithExpr(temp)) {
                    value = value.substring(temp.length()+1);
                } else { return false;}
            }
            value = value.trim();

            if (value.contains(".")) {
                if (processInput(value,"INT")) {return true;}
            }
            Integer i = null;
            try {

                i = Integer.parseInt(value);
            } catch (Exception nfe) {
                i = null;
                if (checkVarType(value)=="INT") {
                    return true;
                }
            }
            if (i != null) {
                return true;}

        }
        

        return false;
    }

    public static boolean checkLogicExpr(String value) {
        value = value.trim();
        String temp1 = "";
        String temp2 = "";

        if ( !value.contains("{") && !value.contains("}") && !value.contains(",")) {
            if (!value.contains(".")) {
                while (value.contains("(")) {
                    value = value.substring(0, value.indexOf("(")) + value.substring(value.indexOf("(") + 1);
                }
                while (value.contains(")")) {
                    value = value.substring(0, value.indexOf(")")) + value.substring(value.indexOf(")") + 1);
                }
            }
            while(value.contains(" ")){
                value = value.substring(0, value.indexOf(" "))+value.substring(value.indexOf(" ")+1);
            }

            if (value.startsWith("!")) {
                value = value.substring(1);
            
            }
            if (value.contains("&&")) {
                temp1 = value.substring(0,value.indexOf("&&"));
                temp2 = value.substring(temp1.length()+2);
                if (checkLogicExpr(temp1) && checkLogicExpr(temp2)) {
                    return true;
                } else { return false;}
            } if (value.contains("||")) {
                temp1 = value.substring(0,value.indexOf("||"));
                temp2 = value.substring(temp1.length()+2);
                if (checkLogicExpr(temp1) && checkLogicExpr(temp2)) {
                    return true;
                } else { return false;}
            } if (value.contains("==")) {
                temp1 = value.substring(0, value.indexOf("=="));
                temp2 = value.substring(temp1.length() + 2);
                if ((checkLogicExpr(temp1) && checkLogicExpr(temp2)) || (checkArithExpr(temp1) && checkArithExpr(temp2))) {
                    return true;
                } else {
                    return false;
                }
            } if (value.contains("#")) {
                temp1 = value.substring(0,value.indexOf("#"));
                temp2 = value.substring(temp1.length()+1);
                if (checkStringExpr(temp1) && checkStringExpr(temp2)) {
                    return true;
                } else { return false;}
            } if (value.contains("!=")) {
                temp1 = value.substring(0,value.indexOf("!="));
                temp2 = value.substring(temp1.length()+2);
                if (checkLogicExpr(temp1) && checkLogicExpr(temp2)) {
                    return true;
                } else if (checkArithExpr(temp1) && checkArithExpr(temp2)) {
                    return true;
                } else if (checkStringExpr(temp1) && checkStringExpr(temp2)) {
                    return true;
                } else { return false;}
            } if (value.contains(">=")) {
                temp1 = value.substring(0,value.indexOf(">="));
                temp2 = value.substring(temp1.length()+2);
                if (checkArithExpr(temp1) && checkArithExpr(temp2)) {
                    return true;
                } else { return false;}
            } if (value.contains("<=")) {
                temp1 = value.substring(0,value.indexOf("<="));
                temp2 = value.substring(temp1.length()+2);
                if (checkArithExpr(temp1) && checkArithExpr(temp2)) {
                    return true;
                } else { return false;}
            } if (value.contains(">")) {
                temp1 = value.substring(0,value.indexOf(">"));
                temp2 = value.substring(temp1.length()+1);
                if (checkArithExpr(temp1) && checkArithExpr(temp2)) {
                    return true;
                } else { return false;}
            } if (value.contains("<")) {
                temp1 = value.substring(0,value.indexOf("<"));
                temp2 = value.substring(temp1.length()+1);
                if (checkArithExpr(temp1) && checkArithExpr(temp2)) {
                    return true;
                } else { return false;}
            } 

            value = value.trim();

            if (value.contains(".")) {
                if (processInput(value,"INT")) {return true;}
            }
            else if(value.equals("true") || value.equals("false")) {
                return true;
            }
            else if (checkVarType(value)=="BOOL") {
                return true;
            }

        }

        return false;
    }
    

    public static boolean checkStringExpr(String value) {
        String temp1 = "";
        String temp2 = "";
        value = value.trim();
        
        char[] chars;
        chars = value.toCharArray();

        int count = 0;

        if ((!value.contains("+") || (value.contains("+") && value.contains("\"") && value.indexOf("+")>value.indexOf("\"") && value.indexOf("+")<value.lastIndexOf("\""))) && ((value.contains(".") && !value.contains("\"")) || (value.contains(".") && value.contains("\"") && value.indexOf(".")<value.indexOf("\"")))) {

            if (processInput(value,"STRING")) {
                return true;
            } else if (true) {

                return true;
            } else {return false;}
        }

        while(value.contains(" ")){
                value = value.substring(0, value.indexOf(" "))+value.substring(value.indexOf(" ")+1);
                
            }

        for(char c : chars){
            if (c=='\"'){count++;}
        }



        if(count%2==0){

            if (count == 2 && value.startsWith("\"") && value.endsWith("\"") && (!value.contains("+") || (value.indexOf("+")>value.indexOf("\"") && value.lastIndexOf("+")<value.lastIndexOf("\"")))) {
                return true;
            } else if (count == 2 && value.startsWith("\"") && value.contains("+") && (value.indexOf("+")>value.lastIndexOf("\""))) {
                temp2 = value.substring(value.lastIndexOf("+")+1);
                value = value.substring(0,value.length()-temp2.length()-1);
                temp1 = value;
                if (checkStringExpr(temp1) && (checkStringExpr(temp2) || checkArithExpr(temp2) || checkLogicExpr(temp2))) {
                    return true;
                } else {return false;}
            } else if (count == 2 && value.contains("+") && (value.indexOf("+")<value.indexOf("\""))) {
                temp1 = value.substring(0,value.indexOf("+"));
                value = value.substring(value.indexOf("+")+1);
                temp2 = value;
                if (checkStringExpr(temp2) && (checkStringExpr(temp1) || checkArithExpr(temp1) || checkLogicExpr(temp1))) {
                    return true;
                } else {return false;}
            } else if (count > 2 && value.contains("+") && value.indexOf("+")>value.indexOf("\"")) {
                value = value.substring(1);
                temp1 = "\""+value.substring(0,value.indexOf("\""));
                value = value.substring(temp1.length());
                if (value.startsWith("+")) {
                    temp2 = value.substring(1);
                    if(checkStringExpr(temp1) && checkStringExpr(temp2)) {
                        return true;
                    } else {return false;}
                } else {return false;}
            } else if (count > 2 && value.contains("+") && value.indexOf("+")<value.indexOf("\"")) {
                temp1 = value.substring(0,value.indexOf("+"));
                value = value.substring(temp1.length());
                temp2 = value.substring(1);
                if ((checkStringExpr(temp1) || checkArithExpr(temp1) || checkLogicExpr(temp1)) && checkStringExpr(temp2)) {
                    return true;
                } else {return false;}
            } else if (count == 0) {
                if (value.contains("+")) {
                    temp1 = value.substring(0,value.indexOf("+"));
                    value = value.substring(temp1.length());
                    temp2 = value.substring(1);
                    if (checkStringExpr(temp1) && checkStringExpr(temp2)) {
                        return true;
                    } else {return false;}
                } else if (checkVarType(value)=="STRING") {
                    return true;
                } 
            }
        }

        return false;
    }
}
