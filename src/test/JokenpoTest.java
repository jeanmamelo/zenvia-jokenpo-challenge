package test;

import main.Jokenpo;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JokenpoTest {

    private int playerOneChoose;
    private int playerTwoChoose;
    private String result;
    private String invalidInput;

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
    public void shouldPlayerOneWinWithScissors() {
        givenPlayerOneChooseScissors();
        givenPlayerTwoChoosePaper();
        whenCallCheckGameResult();
        thenExpectStringPlayerOneWins();
    }

    @Test
    public void shouldPlayerTwoWinWithRock() {
        givenPlayerTwoChooseRock();
        givenPlayerOneChooseScissors();
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
    public void shouldPlayerTwoWinWithScissors() {
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
    public void shouldPlayerOneTieWithScissors() {
        givenPlayerOneChooseScissors();
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
    public void shouldPlayerTwoTieWithScissors() {
        givenPlayerTwoChooseScissors();
        givenPlayerOneChooseScissors();
        whenCallCheckGameResult();
        thenExpectStringATie();
    }
    
    @Test
    public void shouldNotRunDueToInvalidInput() {
        givenInvalidInput();
        whenCallJokenpoClass();
        thenExpectNothing();
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

    private void givenPlayerOneChooseScissors() {
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

    private void givenInvalidInput() {
        invalidInput = "a";
    }

    /**
     * When methods
     */
    private void whenCallCheckGameResult() {
        result = Jokenpo.checkGameResult(playerOneChoose, playerTwoChoose);
    }

    private void whenCallJokenpoClass() {
        new Jokenpo();
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

    private void thenExpectNothing() {
        // Expect nothing
    }
}