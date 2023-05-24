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
Vars.y=0;
}
public static void Round()
{
Vars.x=Player.getPlayer(1).handSize();if( player>Player.getPlayer(1).handSize())
{
Vars.x=Vars.x++;Game.exit(Player.getPlayer(1));
}

}

}