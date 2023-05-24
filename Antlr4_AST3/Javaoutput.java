public class Main {
public static Deck deck = new Deck();
public static Table table = new Table();
public static void main(String[] args) {
Setup();
while (Game.running) {
Round();
}
System.exit(0);
}
public static void Setup()
{
Vars.g=3;Vars.s="hello there another word";table.draw(3,deck);Test();
}
public static void Round()
{
Vars.t=0;Vars.i=2;Vars.x= playerif(Vars.x>7)
{
Vars.y=3;
}
for(Vars.u=3;Vars.u>8;Vars.u++)
{
Vars.t=Vars.t+1;
}
Turn(Player.getPlayer(1));
}
public static void Turn(Player player)
{
Vars.p=3; playerif(8>7)
{
 playerGame.exit(player);
}

}
public void Test(){Vars.k=5;
}

}