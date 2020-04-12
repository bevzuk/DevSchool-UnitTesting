package test;

import main.Bet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void canBet10ChipsTo1() {
        Bet bet = new Bet(10, 1);
        assertEquals(10, bet.getAmount());
        assertEquals(1, bet.getScore());
    }
}