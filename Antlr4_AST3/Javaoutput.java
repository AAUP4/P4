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
Vars.t=1;Vars.trick=0;Vars.turnAgain=false;while(deck.size()>0||Player.getPlayer(1).handSize()>0||Player.getPlayer(2).handSize()>0)
{
Turn(Player.getPlayer(t));if(Vars.t==1&&!Vars.turnAgain)
{
Vars.t=2;Vars.turnAgain=true;
}
if(Vars.t==2&&!Vars.turnAgain)
{
Vars.t=1;Vars.turnAgain=true;
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
Vars.found=false;Vars.check=false;Vars.turnAgain=false;Vars.trick=0;Vars.card="";Vars.whenReady=player.name+"'s turn. Press ENTER when ready!";Vars.tryAgain="";Vars.tryAgainTwo="";Game.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");Vars.start=Game.input(whenReady);player.printHand();if(player.handSize()>0)
{
Vars.card=Game.input("What card will you ask for? ");for(Vars.c=0;Vars.c<player.handSize();Vars.c++)
{
if(player.getCardIndex(c).rank#Vars.card)
{
Vars.check=true;
}

}
while(!Vars.check)
{
Vars.tryAgain="You do not have any " + card;Vars.tryAgainTwo=Vars.tryAgain+"'s. Try again: ";Vars.card=Game.input(tryAgainTwo);for(Vars.d=0;Vars.d<player.handSize();Vars.d++)
{
if(player.getCardIndex(d).rank#Vars.card)
{
Vars.check=true;
}

}

}

}
if(player.handSize()==0)
{
Game.print("You do not have any cards left!");
}
if(player.name#Player.getPlayer(1).name&&player.handSize()>0)
{
for(Vars.i=0;Vars.i<Player.getPlayer(2).handSize();Vars.i++)
{
if(Player.getPlayer(2).getCardIndex(i).rank#Vars.card)
{
player.takeCard(Player.getPlayer(2).getCardIndex(i).id,Player.getPlayer(2));Vars.found=true;Vars.turnAgain=true;Game.print("You found a "+card+"!");
}

}

}
if(player.name#Player.getPlayer(2).name&&player.handSize()>0)
{
for(Vars.j=0;Vars.j<Player.getPlayer(1).handSize();Vars.j++)
{
if(Player.getPlayer(1).getCardIndex(j).rank#Vars.card)
{
player.takeCard(Player.getPlayer(1).getCardIndex(j).id,Player.getPlayer(1));Vars.found=true;Vars.turnAgain=true;Game.print("You found a "+card+"!");
}

}

}
for(Vars.k=0;Vars.k<player.handSize();Vars.k++)
{
if(player.getCardIndex(k).rank#Vars.card)
{
Vars.trick=Vars.trick+1;
}

}
if(Vars.trick==4)
{
Vars.player.score++;for(Vars.u=player.handSize();Vars.u>0;u--)
{
if(player.getCardIndex(u-1).rank#Vars.card)
{
player.discard(player.getCardIndex(u-1).id,Game.discardPile);
}

}
Game.print("You got a trick of "+card+"'s!");
}
if(!Vars.found)
{
Game.print("You did not find any "+card+"'s.");Vars.turnAgain=false;
}
if(Vars.found)
{
Game.print("It is your turn again!");
}
if(player.handSize()==0||!Vars.turnAgain)
{
if(deck.size()==0)
{
Game.print("The deck is empty. Your turn is now over.\n\n");
}
if(deck.size()>0)
{
player.draw(1,deck);Vars.size=player.handSize();Vars.drawn=player.getCardIndex(size-1).rank;Vars.trick=0;for(Vars.q=0;Vars.q<player.handSize();Vars.q++)
{
if(player.getCardIndex(q).rank#Vars.drawn)
{
Vars.trick=Vars.trick+1;
}

}
if(Vars.trick==4)
{
Vars.player.score++;for(Vars.n=player.handSize();Vars.n>0;n--)
{
if(player.getCardIndex(n-1).rank#Vars.drawn)
{
player.discard(player.getCardIndex(n-1).id,Game.discardPile);
}

}
Game.print("You got a trick of "+drawn+"'s!");
}
Game.print("You drew a card. Your turn is now over.\n\n");
}

}

}

}