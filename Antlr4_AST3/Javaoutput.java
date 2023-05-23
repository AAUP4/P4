public class Main {
public static Deck deck = new Deck();
public static Table table = new Table();
public static void main(String[] args) {
Setup();
for (Player player : Player.getPlayers()){
Round();
}
Game.exit();
}
public static void Setup()
{Vars.g=3;Vars.s="hello there another word";}
public static void Round()
{Vars.t=0;Vars.i=2;if(Vars.i>5||Vars.i<8&&Vars.i>6)
{Vars.y=3;}
for(Vars.u=3;Vars.u>8;Vars.u++)
{Vars.t=Vars.t+1;}
Turn(Player.getPlayer(1));}
public static void Turn(Player player)
{Vars.p=3;}
public void Test(){Vars.k=5;}

}