import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;  

public abstract class TypeCheck {

    static Map<String, ArrayList<String>> SETM = new HashMap<>();
    static Map<String, ArrayList<String>> VM = new HashMap<>();
    static Map<String, ArrayList<String>> IM = new HashMap<>();
    // static Map<String, ArrayList<String>> BM = new HashMap<>();
    static Map<String, ArrayList<String>> SM = new HashMap<>();
    // static Map<String, ArrayList<String>> CM = new HashMap<>();
    // static Map<String, ArrayList<String>> PM = new HashMap<>();
    // static Map<String, ArrayList<String>> TM = new HashMap<>();
    // static Map<String, ArrayList<String>> ACM = new HashMap<>();
    static Map<String, ArrayList<String>> ATTI = new HashMap<>();
    static Map<String, ArrayList<String>> ATTB = new HashMap<>();
    static Map<String, ArrayList<String>> ATTS = new HashMap<>();
    // static Map<String, ArrayList<String>> ATTT = new HashMap<>();
    // static Map<String, ArrayList<String>> ATTAC = new HashMap<>();

    static Map<String, String> VarType = new HashMap<>();
    static Map<String, String> VarInt = new HashMap<>();
    static Map<String, String> VarBool = new HashMap<>();
    static Map<String, String> VarString = new HashMap<>();

    public static void TypeMapSetup(){
        ArrayList<String> V = new ArrayList<>(); Collections.addAll(V,"VOID");
        ArrayList<String> I = new ArrayList<>(); Collections.addAll(I,"INT");
        ArrayList<String> II = new ArrayList<>(); Collections.addAll(II,"INT", "INT");
        ArrayList<String> III = new ArrayList<>(); Collections.addAll(III,"INT", "INT", "INT");
        ArrayList<String> IIIB = new ArrayList<>(); Collections.addAll(IIIB,"INT", "INT", "INT", "BOOL");
        ArrayList<String> IIII = new ArrayList<>(); Collections.addAll(IIII,"INT", "INT", "INT", "INT");
        ArrayList<String> IIIII = new ArrayList<>(); Collections.addAll(IIIII,"INT", "INT", "INT", "INT", "INT");
        ArrayList<String> IIIIII = new ArrayList<>(); Collections.addAll(IIIIII,"INT", "INT", "INT", "INT", "INT", "INT");
        ArrayList<String> IIIIB = new ArrayList<>(); Collections.addAll(IIIIB,"INT", "INT", "INT", "INT", "BOOL");
        ArrayList<String> IS = new ArrayList<>(); Collections.addAll(IS,"INT", "STRING");
        ArrayList<String> ISI = new ArrayList<>(); Collections.addAll(ISI,"INT", "STRING", "INT");
        ArrayList<String> ISII = new ArrayList<>(); Collections.addAll(ISII,"INT", "STRING", "INT", "INT");
        ArrayList<String> ISIII = new ArrayList<>(); Collections.addAll(ISIII,"INT", "STRING", "INT", "INT", "INT");
        ArrayList<String> ISB = new ArrayList<>(); Collections.addAll(ISB,"INT", "STRING", "BOOL");
        ArrayList<String> ISIB = new ArrayList<>(); Collections.addAll(ISIB,"INT", "STRING", "INT", "BOOL");
        ArrayList<String> ISL = new ArrayList<>(); Collections.addAll(ISL,"INT", "SLIST");
        ArrayList<String> S = new ArrayList<>(); Collections.addAll(S,"STRING");
        ArrayList<String> SI = new ArrayList<>(); Collections.addAll(S,"STRING", "INT");

        
        SETM.put("Player.create(INT)", I); //
        SETM.put("deck.addJokers(INT)", I); //
        SETM.put("deck.deal(INT)", I); // måske ikke setup method??
        SETM.put("deck.assignPoints(INT,SLIST)", ISL); //

        
        VM.put("Game.exit()", V); //
        VM.put("Game.exit(Player.getPlayer(INT))", I); //
        
        VM.put("Game.print(STRING)", S); 
        
        VM.put("table.discard(STRING,Game.discardPile)", S); 
        VM.put("table.discard(STRING,Player.getPlayer(INT).getDiscardPile())", SI); 
        VM.put("table.discard(table.getCardIndex(INT).id,Game.discardPile)", I);  //
        VM.put("table.discard(table.getCardIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", II); //
        
        VM.put("table.discardAll(Game.discardPile)", V); //
        VM.put("table.discardAll(Player.getPlayer(INT).getDiscardPile())", I); //
        
        VM.put("table.draw(INT,deck)", I); //
        
        VM.put("table.getCardIndex(INT).flip()", I);//
        
        VM.put("Player.getPlayer(INT).discard(STRING,Game.discardPile)", IS);//
        VM.put("Player.getPlayer(INT).discard(STRING,Player.getPlayer(INT).getDiscardPile())", ISI);//
        VM.put("Player.getPlayer(INT).discard(Player.getPlayer(INT).getCardIndex(INT),Game.discardPile)", III);//
        VM.put("Player.getPlayer(INT).discard(Player.getPlayer(INT).getCardIndex(INT),Player.getPlayer(INT).getDiscardPile())", IIII);//
        
        VM.put("Player.getPlayer(INT).discardAll(discardPile)", I);             //
        VM.put("Player.getPlayer(INT).discardAll(Player.getPlayer(INT).getDiscardPile())", II);//
        
        VM.put("Player.getPlayer(INT).draw(INT,deck)", II);                     //
        
        VM.put("Player.getPlayer(INT).getCardIndex(INT).flip()", II);           //
        
        VM.put("Player.getPlayer(INT).getDiscardPileIndex(INT).flip()", II);//
        
        VM.put("Player.getPlayer(INT).getTable().discard(STRING,Game.discardPile)", IS);//
        VM.put("Player.getPlayer(INT).getTable().discard(STRING,Player.getPlayer(INT).getDiscardPile())", ISI);//
        VM.put("Player.getPlayer(INT).getTable().discard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,Game.discardPile)", III);//
        VM.put("Player.getPlayer(INT).getTable().discard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", IIII);//
        
        VM.put("Player.getPlayer(INT).getTable().discardAll(discardPile)", I);          //
        VM.put("Player.getPlayer(INT).getTable().discardAll(Player.getPlayer(INT).getDiscardPile())", II);//
        
        VM.put("Player.getPlayer(INT).getTable().draw(INT,deck)", II);          //
        
        VM.put("Player.getPlayer(INT).getTable().getCardIndex(INT).flip()", II);//
        
        VM.put("Player.getPlayer(INT).getTable().print()", I);                      //
        
        VM.put("Player.getPlayer(INT).layDown(STRING,Player.getPlayer(INT).getTable(),BOOL)", ISIB);//
        VM.put("Player.getPlayer(INT).layDown(STRING,table,BOOL)", ISB);            //
        VM.put("Player.getPlayer(INT).layDown(Player.getPlayer(INT).getCardIndex(INT),Player.getPlayer(INT).getTable(),BOOL)", IIIIB);//
        VM.put("Player.getPlayer(INT).layDown(Player.getPlayer(INT).getCardIndex(INT),table,BOOL)", IIIB);//
        VM.put("Player.getPlayer(INT).layDown(STRING,Player.getPlayer(INT).getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", ISIII);//
        VM.put("Player.getPlayer(INT).layDown(STRING,table,Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", ISII);//
        VM.put("Player.getPlayer(INT).layDown(Player.getPlayer(INT).getCardIndex(INT),Player.getPlayer(INT).getTable(),Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", IIIIII);//
        VM.put("Player.getPlayer(INT).layDown(Player.getPlayer(INT).getCardIndex(INT),table,Player.getPlayer(INT).getCardIndex(INT).isFaceUp)", IIIII);//
        
        VM.put("Player.getPlayer(INT).takeCard(STRING,Player.getPlayer(INT).getDiscardPile())", ISI);//
        VM.put("Player.getPlayer(INT).takeCard(STRING,Game.discardPile)", IS);          //
        VM.put("Player.getPlayer(INT).takeCard(Player.getPlayer(INT).getDiscardPileIndex(INT).id,Player.getPlayer(INT).getDiscardPile())", IIII);//
        VM.put("Player.getPlayer(INT).takeCard(Game.getDiscardPileIndex(INT).id,Game.discardPile)", II);//
        
        VM.put("Player.getPlayer(INT).takeCard(STRING,Player.getPlayer(INT).getTable())", ISI);//
        VM.put("Player.getPlayer(INT).takeCard(STRING,table)", IS);                     //
        VM.put("Player.getPlayer(INT).takeCard(Player.getPlayer(INT).getTable().getCardIndex(INT).id,Player.getPlayer(INT).getTable())", IIII);//
        VM.put("Player.getPlayer(INT).takeCard(table.getCardIndex(INT).id,table)", II);//
       
        VM.put("Player.getPlayer(INT).takeCard(STRING,Player.getPlayer(INT))", ISI);//
        VM.put("Player.getPlayer(INT).takeCard(Player.getPlayer(INT).getCardIndex(INT).id,Player.getPlayer(INT))", IIII);//
        
        VM.put("Player.getPlayer(INT).printHand()", I);                             //
        
        VM.put("deck.shuffle()", V);                                                //
        
        VM.put("deck.getCard(INT).flip()", I);                                   //
        
        VM.put("deck.print()", V);                                              //
        
        VM.put("deck.size()", V);                                               //
        
        VM.put("deck.returnDiscardPile()", V);                                   //
        VM.put("deck.returnDiscardPile(Player.getPlayer(INT))", I);             //



        IM.put("table.getCardIndex(INT).getPoints()", I);                   //
        IM.put("table.size()", V);                                          //
        IM.put("Player.getPlayer(INT).getCardIndex(INT).getPoints()", II);//
        IM.put("Player.getPlayer(INT).getDiscardPileIndex(INT).getPoints()", II);//
        IM.put("Player.getPlayer(INT).getHandPoints()", I);                 //
        IM.put("Player.getPlayer(INT).handSize()", I);                      //
        IM.put("Player.getPlayer(INT).getTable().getCardIndex(INT).getPoints()", II);//
        IM.put("Player.getPlayer(INT).getTable().size()", I);                   //
        IM.put("Player.getPlayer(INT).getTablePoints()", I);                //
        IM.put("Player.getPlayersAmount()", V);                          //
        IM.put("deck.getCard(INT).getPoints()", I);                      //
    

        SM.put("Game.input()", V);                                      //
        SM.put("Game.input(STRING)", S); 
        


        ATTI.put("Player.getPlayer(INT).score", I);                         //

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
        ATTS.put("deck.getCard(INT).id", I);                                //
        ATTS.put("deck.getCard(INT).rank", I);                              //
        ATTS.put("deck.getCard(INT).suit", I);                                  //

        ATTB.put("table.getCardIndex(INT).isFaceUp", I);                        //
        ATTB.put("Player.getPlayer(INT).getCardIndex(INT).isFaceUp", II);       //
        ATTB.put("Player.getPlayer(INT).getDiscardPileIndex(INT).isFaceUp", II);//
        ATTB.put("Player.getPlayer(INT).getTable().getCardIndex(INT).isFaceUp", II);//
        ATTB.put("deck.getCard(INT).isFaceUp", I);                              //

    }


    public static boolean processInput(String input){
        
        boolean result = false; // is input valid
        boolean FparamTypeCheck = false;
        boolean AparamTypeCheck = false;
        String method = ""; // method call to check against method hashtables
        ArrayList<String> Fparams = new ArrayList<>(); // INT, BOOL, STRING
        ArrayList<String> Aparams = new ArrayList<>(); // Actual parameters
        

        if(input.contains(".")) {

            //Starts with INT param
            if (input.startsWith("deck.returnDiscardPile(Player.getPlayer(")) {
                Fparams.add("INT");
                method = method.concat("deck.returnDiscardPile(Player.getPlayer(INT");
                input = input.substring(40);
                Aparams.add(input.substring(0,input.lastIndexOf("))")));
                input = input.substring(input.lastIndexOf("))"));
                method = method.concat(input);
                input = "";
            } else if (input.startsWith("table.discardAll(Player.getPlayer(")) {
                Fparams.add("INT");
                method = method.concat("table.discardAll(Player.getPlayer(INT");
                input = input.substring(34);
                Aparams.add(input.substring(0,input.indexOf(").")));
                input = input.substring(input.indexOf(")."));
                method = method.concat(input);
                input = "";
            } else if (input.startsWith("table.discard(table.getCardIndex(")) {
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
                    method = method.concat(input);
                    input = "";
                } else {
                    method = method.concat(input);
                    input = "";
                }
            } else if (input.startsWith("Game.exit(Player.getPlayer(")) {
                Fparams.add("INT");
                method = method.concat("Game.exit(Player.getPlayer(INT");
                input = input.substring(27);
                Aparams.add(input.substring(0,input.lastIndexOf("))")));
                input = input.substring(input.lastIndexOf("))"));
                method = method.concat(input);
                input = "";
            } else if (input.startsWith("deck.getCard(")) {
                Fparams.add("INT");
                method = method.concat("deck.getCard(INT");
                input = input.substring(13);
                Aparams.add(input.substring(0, input.indexOf(").")));
                input = input.substring(input.indexOf(")."));
                method = method.concat(input);
                input = "";
            } else if (input.startsWith("Player.getPlayer(")) {
                Fparams.add("INT");
                method = method.concat("Player.getPlayer(INT");
                input = input.substring(17);
                Aparams.add(input.substring(0, input.indexOf(").")));
                input = input.substring(input.indexOf(")."));
                if (input.startsWith(").getTable().getCardIndex(")) {
                    Fparams.add("INT");
                    method = method.concat(").getTable().getCardIndex(INT");
                    input = input.substring(26);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    method = method.concat(input);
                    input = "";
                } else if (input.startsWith(").getDiscardPileIndex(")) {
                    Fparams.add("INT");
                    method = method.concat(").getDiscardPileIndex(INT");
                    input = input.substring(22);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    method = method.concat(input);
                    input = "";
                } else if (input.startsWith(").getCardIndex(")) {
                    Fparams.add("INT");
                    method = method.concat(").getCardIndex(INT");
                    input = input.substring(15);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    method = method.concat(input);
                    input = "";
                } else if (input.startsWith(").takeCard(Player.getPlayer(")) {
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
                } else if (input.startsWith(").takeCard(table.getCardIndex(")) {
                    Fparams.add("INT");
                    method = method.concat(").takeCard(table.getCardIndex(INT");
                    input = input.substring(30);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    method = method.concat(input);
                    input = "";
                } else if (input.startsWith(").takeCard(Game.getDiscardPileIndex(")) {
                    Fparams.add("INT");
                    method = method.concat(").takeCard(Game.getDiscardPileIndex(INT");
                    input = input.substring(39);
                    Aparams.add(input.substring(0, input.indexOf(").")));
                    input = input.substring(input.indexOf(")."));
                    method = method.concat(input);
                    input = "";
                } else if (input.startsWith(").takeCard(")) {
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
                        } else {
                            Aparams.add(input.substring(0, input.lastIndexOf("))")));
                            input = input.substring(input.lastIndexOf("))"));
                            method = method.concat(input);
                            input = "";
                        }
                    } else  {
                        method = method.concat(input);
                        input = "";
                    } 
                }
                
                
            } else if (input.startsWith("table.getCardIndex(")) {
                Fparams.add("INT");
                method = method.concat("table.getCardIndex(INT");
                input = input.substring(19);
                Aparams.add(input.substring(0, input.indexOf(").")));
                input = input.substring(input.indexOf(")."));
                method = method.concat(input);
                input = "";
            } else if (input.startsWith("Game.getDiscardPileIndex(")) {
                Fparams.add("INT");
                method = method.concat("Game.getDiscardPileIndex(INT");
                input = input.substring(25);
                Aparams.add(input.substring(0, input.indexOf(").")));
                input = input.substring(input.indexOf(")."));
                method = method.concat(input);
                input = "";
            } else if (input.startsWith("table.draw(")) {
                Fparams.add("INT");
                method = method.concat("table.draw(INT");
                input = input.substring(11);
                Aparams.add(input.substring(0, input.indexOf(",")));
                input = input.substring(input.indexOf(","));
                method = method.concat(input);
                input = "";
            } else if (input.startsWith("deck.assignPoints(")) {
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
                    } else {
                        Aparams.add(input.substring(0, input.indexOf(")")));
                        input = input.substring(input.indexOf(")"));
                    }
                }
                method = method.concat(input);
                input = "";
            } else if (input.startsWith("deck.deal(")) {
                Fparams.add("INT");
                method = method.concat("deck.deal(INT");
                input = input.substring(10);
                Aparams.add(input.substring(0, input.lastIndexOf(")")));
                input = input.substring(input.lastIndexOf(")"));
                method = method.concat(input);
                input = "";
            } else if (input.startsWith("deck.addJokers(")) {
                Fparams.add("INT");
                method = method.concat("deck.addJokers(INT");
                input = input.substring(15);
                Aparams.add(input.substring(0, input.lastIndexOf(")")));
                input = input.substring(input.lastIndexOf(")"));
                method = method.concat(input);
                input = "";
            } else if (input.startsWith("Player.create(")) {
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
            } else if (input.startsWith("Game.input(") && !input.startsWith("Game.input()")){
                Fparams.add("STRING");
                method = method.concat("Game.input(STRING");
                input = input.substring(11);
                Aparams.add(input.substring(0, input.lastIndexOf(")")));
                input = input.substring(input.lastIndexOf(")"));
                method = method.concat(input);
                input = "";
            } else if ((input.startsWith("table.discard(") && !input.startsWith("table.discard(table.getCardIndex("))){
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
                } else {
                    Aparams.add(input.substring(0, input.lastIndexOf(")")));
                    input = input.substring(input.lastIndexOf(")"));
                    method = method.concat(input);
                    input = "";
                }
            }
                
            if (Fparams.size()==0 && (VM.containsKey(input) || IM.containsKey(input) || SM.containsKey(input))) {                
                result = true;
            }
            

        //missing check on method, params, Aparams
            if (Fparams.size()>0 &&  (SETM.containsKey(method) || VM.containsKey(method) || IM.containsKey(method) || SM.containsKey(method) || ATTI.containsKey(method) || ATTS.containsKey(method) || ATTB.containsKey(method)) && input == ""){
                if(SETM.containsKey(method)){
                    FparamTypeCheck = SETM.get(method).equals(Fparams);

                    
                }
                
                
                
                result = true;
            }    
                
        }


        System.out.println("method: "+method);
        return result;
    }
   


    static void declVar(String varID, String type, String value){

        if(VarType.containsKey(varID)) { throw new IllegalArgumentException(varID+" has already been declared."); }
        else if (type == "INT") {
            if (checkArithExpr(value)){
                VarType.put(varID,type);
                VarInt.put(varID,value);
            }
        }
        else if (type == "BOOL") {
            if (checkLogicExpr(value)){
                VarType.put(varID,type);
                VarBool.put(varID,value);
            }
        }
        else if (type == "STRING") {
            if (checkStringExpr(value)){
                VarType.put(varID,type);
                VarString.put(varID,value);
            }
        }
    }

    static void assignVar(String varID, String value){

        if(VarType.containsKey(varID)) {
            if (VarType.get(varID) == "INT") {
                if (checkArithExpr(value)){
                    VarInt.put(varID,value);
                }
            }
            else if (VarType.get(varID) == "BOOL") {
                if (checkLogicExpr(value)){
                    VarBool.put(varID,value);
                }
            }
            else if (VarType.get(varID) == "STRING") {
                if (checkStringExpr(value)){
                    VarString.put(varID,value);
                }
            }
        } else { throw new IllegalArgumentException(varID+" is not a variable."); }
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
        }else { throw new IllegalArgumentException(varID+" is not a variable."); }

    }


    static boolean checkValue(String value, String context) {
        boolean result = false;
        if (context == "BOOL") {
            if (checkLogicExpr(value)==true) {
                result = true;
            }
        } else if (context == "STRING") {
            if (checkStringExpr(value)==true) {
                result = true;
            }
        } else if (context == "INT") {
            if (checkArithExpr(value)==true) {
                result = true;
            }
        }
        return result;
    }


    public static boolean checkArithExpr(String value) {
        value.trim();
        String temp = "";

        if (!value.contains("&") || !value.contains("|") || !value.contains("=") || !value.contains("\"") || !value.contains("<") || !value.contains(">") || !value.contains("!") || !value.contains(".") || !value.contains("{") || !value.contains("}") || !value.contains(",")) {

            while(value.contains("(")){
                value = value.substring(0, value.indexOf("("))+value.substring(value.indexOf("(")+1);
            }
            while(value.contains(")")){
                value = value.substring(0, value.indexOf(")"))+value.substring(value.indexOf(")")+1);
            }

            if (value.endsWith("++") || value.endsWith("--")) {
                if (checkVarType(value.substring(0,value.indexOf("++")).trim())=="INT") {
                    return true;
                } else { return false;}
            } while (value.contains("*")) {
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
            Integer i = null;
            value.trim();
            try {
                i = Integer.parseInt(value);
            } catch (NumberFormatException nfe) {
                i = null;
                if (checkVarType(value)=="INT") {
                    return true;
                }
            }
            if (i != null) {return true;}

        }

        return false;
    }

    public static boolean checkLogicExpr(String value) {
        return true;
    }

    public static boolean checkStringExpr(String value) {
        return true;
    }
}
