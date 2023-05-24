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
Player.create(2);deck.shuffle();deck.deal(7);
}
public static void Round()
{
Vars.t=1;Vars.trick=0;while(deck.size()>0&&Player.getPlayer(1).handSize()>0&&Player.getPlayer(2).handSize()>0)
{
Turn(Player.getPlayer(t));if(Vars.t==1)
{
Vars.t=2;
}
if(Vars.t==2)
{
Vars.t=1;
}

}
if(Player.getPlayer(1).score>Player.getPlayer(2).score)
{
Game.exit(Player.getPlayer(1));
}
if(Player.getPlayer(1).score<Player.getPlayer(2).score)
{
Game.exit(Player.getPlayer(2));
}

}
public static void Turn(Player player)
{
player.printHand();Vars.card=Game.input("WhatVars.cardwillyouaskfor?");if(player.name==Player.getPlayer(1).name)
{
for(Vars.i=0;Vars.i<Player.getPlayer(2).handSize();Vars.i++)
{
if(Player.getPlayer(2).getCardIndex(i).rank==Vars.card)
{
player.takeCard(Player.getPlayer(2).getCardIndex(i).id,Player.getPlayer(2));
}

}

}
if(player.name==Player.getPlayer(2).name)
{
for(Vars.j=0;Vars.j<Player.getPlayer(1).handSize();Vars.j++)
{
if(Player.getPlayer(1).getCardIndex(i).rank==Vars.card)
{
player.takeCard(Player.getPlayer(1).getCardIndex(i).id,Player.getPlayer(1));
}

}

}
for(Vars.k=0;Vars.k<player.handSize();Vars.k++)
{
if(player.getCardIndex(i).rank==Vars.card)
{
Vars.trick=Vars.trick+1;
}

}
if(Vars.trick==4)
{
Vars.player.score++;
}

}

}