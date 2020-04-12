package main;

import java.util.HashMap;
import java.util.Random;

public class RollDiceGame {
    private HashMap<Player, Bet> playersBets = new HashMap<>();

    public void addBet(Player player, Bet bet) {
        playersBets.put(player, bet);
    }

    public void play() {
        Random random = new Random();
        int winningScore = random.nextInt(6) + 1;

        for (Player player : playersBets.keySet()) {
            Bet bet = playersBets.get(player);
            if (bet.getScore() == winningScore) {
                player.win(bet.getAmount() * 6);
            } else {
                player.lose();
            }
        }
        playersBets.clear();
    }

    public void leave(Player player) {
        if (!playersBets.containsKey(player)) {
            return;
        }

        playersBets.remove(player);
    }
}
