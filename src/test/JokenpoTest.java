package test;

import static org.junit.jupiter.api.Assertions.*;

import main.Jokenpo;
import org.testng.annotations.Test;

public class JokenpoTest {

    private int playerOneChoose;
    private int playerTwoChoose;
    private String result;

    @Test
    public void shouldPlayerOneWinWithRock() {
        givenPlayerOneChooseRock();
        givenPlayerTwoChooseScissors();
        whenCallCheckGameResult();
        thenExpectStringPlayerOneWins();
    }

    @Test
    public void shouldPlayerOneWinWithPaper() {
        givenPlayerOneChoosePaper();
        givenPlayerTwoChooseRock();
        whenCallCheckGameResult();
        thenExpectStringPlayerOneWins();
    }

    @Test
    public void shouldPlayerOneWinWithScissor() {
        givenPlayerOneChooseScissor();
        givenPlayerTwoChoosePaper();
        whenCallCheckGameResult();
        thenExpectStringPlayerOneWins();
    }

    @Test
    public void shouldPlayerTwoWinWithRock() {
        givenPlayerTwoChooseRock();
        givenPlayerOneChooseScissor();
        whenCallCheckGameResult();
        thenExpectStringPlayerTwoWins();
    }

    @Test
    public void shouldPlayerTwoWinWithPaper() {
        givenPlayerTwoChoosePaper();
        givenPlayerOneChooseRock();
        whenCallCheckGameResult();
        thenExpectStringPlayerTwoWins();
    }

    @Test
    public void shouldPlayerTwoWinWithScissor() {
        givenPlayerTwoChooseScissors();
        givenPlayerOneChoosePaper();
        whenCallCheckGameResult();
        thenExpectStringPlayerTwoWins();
    }

    @Test
    public void shouldPlayerOneTieWithRock() {
        givenPlayerOneChooseRock();
        givenPlayerTwoChooseRock();
        whenCallCheckGameResult();
        thenExpectStringATie();
    }

    @Test
    public void shouldPlayerOneTieWithPaper() {
        givenPlayerOneChoosePaper();
        givenPlayerTwoChoosePaper();
        whenCallCheckGameResult();
        thenExpectStringATie();
    }

    @Test
    public void shouldPlayerOneTieWithScissor() {
        givenPlayerOneChooseScissor();
        givenPlayerTwoChooseScissors();
        whenCallCheckGameResult();
        thenExpectStringATie();
    }

    @Test
    public void shouldPlayerTwoTieWithRock() {
        givenPlayerTwoChooseRock();
        givenPlayerOneChooseRock();
        whenCallCheckGameResult();
        thenExpectStringATie();
    }

    @Test
    public void shouldPlayerTwoTieWithPaper() {
        givenPlayerTwoChoosePaper();
        givenPlayerOneChoosePaper();
        whenCallCheckGameResult();
        thenExpectStringATie();
    }

    @Test
    public void shouldPlayerTwoTieWithScissor() {
        givenPlayerTwoChooseScissors();
        givenPlayerOneChooseScissor();
        whenCallCheckGameResult();
        thenExpectStringATie();
    }

    /**
     * Given methods
     */
    private void givenPlayerOneChooseRock() {
        playerOneChoose = 0;
    }

    private void givenPlayerOneChoosePaper() {
        playerOneChoose = 1;
    }

    private void givenPlayerOneChooseScissor() {
        playerOneChoose = 2;
    }

    private void givenPlayerTwoChooseRock() {
        playerTwoChoose = 0;
    }

    private void givenPlayerTwoChoosePaper() {
        playerTwoChoose = 1;
    }

    private void givenPlayerTwoChooseScissors() {
        playerTwoChoose = 2;
    }

    /**
     * When methods
     */
    private void whenCallCheckGameResult() {
        result = Jokenpo.checkGameResult(playerOneChoose, playerTwoChoose);
    }

    /**
     * Then methods
     */
    private void thenExpectStringPlayerOneWins() {
        assertEquals("Player One Wins.", result);
    }

    private void thenExpectStringPlayerTwoWins() {
        assertEquals("Player Two Wins.", result);
    }

    private void thenExpectStringATie() {
        assertEquals("A tie.", result);
    }
}