public class Main {
    public static int q;
    public static int c;
    public static int t;
    public static int d;
    public static int size;
    public static int u;
    public static int i;
    public static int j;
    public static int trick;
    public static int k;
    public static int n;
    public static String tryAgain;
    public static String start;
    public static String tryAgainTwo;
    public static String drawn;
    public static String card;
    public static String whenReady;
    public static Boolean found;
    public static Boolean turnAgain;
    public static Boolean check;

    public static Deck deck = new Deck();
    public static Table table = new Table();

    public static void main(String[] args) {
        Setup();
        while (Game.running) {
            Round();
        }
        System.exit(0);
    }

    public static void Setup() {
        Player.create(2);
        deck.shuffle();
        deck.deal(7);
    }

    public static void Round() {
        t = 1;
        trick = 0;
        turnAgain = false;
        while (deck.size() > 0 || Player.getPlayer(1).handSize() > 0 || Player.getPlayer(2).handSize() > 0) {
            Turn(Player.getPlayer(t));
            if (t == 1 && !turnAgain) {
                t = 2;
                turnAgain = true;
            }
            if (t == 2 && !turnAgain) {
                t = 1;
                turnAgain = true;
            }

        }
        if (Player.getPlayer(1).score > Player.getPlayer(2).score) {
            Game.exit(Player.getPlayer(1));
        }
        if (Player.getPlayer(1).score < Player.getPlayer(2).score) {
            Game.exit(Player.getPlayer(2));
        }

    }

    public static void Turn(Player player) {
        found = false;
        check = false;
        turnAgain = false;
        trick = 0;
        card = "";
        whenReady = player.name + "'s turn. Press ENTER when ready!";
        tryAgain = "";
        tryAgainTwo = "";
        Game.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        start = Game.input(whenReady);
        if (player.handSize() == 0 && deck.size() > 0) {
            player.draw(1, deck);
            Game.print("Your hand is empty. You drew a card!");
        }
        player.printHand();
        if (player.handSize() > 0) {
            card = Game.input("What card will you ask for? ");
            for (c = 0; c < player.handSize(); c++) {
                if (player.getCardIndex(c).rank.equals(card)) {
                    check = true;
                }

            }
            while (!check) {
                tryAgain = "You do not have any " + card;
                tryAgainTwo = tryAgain + "'s. Try again: ";
                card = Game.input(tryAgainTwo);
                for (d = 0; d < player.handSize(); d++) {
                    if (player.getCardIndex(d).rank.equals(card)) {
                        check = true;
                    }

                }

            }

        }
        if (player.name.equals(Player.getPlayer(1).name) && player.handSize() > 0) {
            for (i = Player.getPlayer(2).handSize(); i > 0; i--) {
                if (Player.getPlayer(2).getCardIndex(i - 1).rank.equals(card)) {
                    player.takeCard(Player.getPlayer(2).getCardIndex(i - 1).id, Player.getPlayer(2));
                    found = true;
                    turnAgain = true;
                    Game.print("You found a " + card + "!");
                }

            }

        }
        if (player.name.equals(Player.getPlayer(2).name) && player.handSize() > 0) {
            for (j = Player.getPlayer(1).handSize(); j > 0; j--) {
                if (Player.getPlayer(1).getCardIndex(j - 1).rank.equals(card)) {
                    player.takeCard(Player.getPlayer(1).getCardIndex(j - 1).id, Player.getPlayer(1));
                    found = true;
                    turnAgain = true;
                    Game.print("You found a " + card + "!");
                }

            }

        }
        for (k = 0; k < player.handSize(); k++) {
            if (player.getCardIndex(k).rank.equals(card)) {
                trick = trick + 1;
            }

        }
        if (trick == 4) {
            player.score++;
            for (u = player.handSize(); u > 0; u--) {
                if (player.getCardIndex(u - 1).rank.equals(card)) {
                    player.discard(player.getCardIndex(u - 1).id, Game.discardPile);
                }

            }
            Game.print("You got a trick of " + card + "'s!");
        }
        if (!found) {
            Game.print("You did not find any " + card + "'s.");
            turnAgain = false;
        }
        if (found) {
            Game.print("It is your turn again!");
        }
        if (player.handSize() == 0 || !turnAgain) {
            if (deck.size() == 0) {
                Game.print("The deck is empty. Your turn is now over.\n\n");
            }
            if (deck.size() > 0) {
                player.draw(1, deck);
                size = player.handSize();
                drawn = player.getCardIndex(size - 1).rank;
                trick = 0;
                for (q = 0; q < player.handSize(); q++) {
                    if (player.getCardIndex(q).rank.equals(drawn)) {
                        trick = trick + 1;
                    }

                }
                if (trick == 4) {
                    player.score++;
                    for (n = player.handSize(); n > 0; n--) {
                        if (player.getCardIndex(n - 1).rank.equals(drawn)) {
                            player.discard(player.getCardIndex(n - 1).id, Game.discardPile);
                        }

                    }
                    Game.print("You got a trick of " + drawn + "'s!");
                }
                Game.print("You drew a card. Your turn is now over.\n\n");
            }

        }

    }

}