package tk.salvador_nico.rockpaperscissors;

import java.util.Random;

class GameUtils {

    private static String aiThrow;
    private static String resultMessage;
    private static int gameModeChoices;

    static void setGameModeChoices(int numChoices) {
        gameModeChoices = numChoices;
    }

    private static String throwComputer() {
        Random rand = new Random(System.currentTimeMillis());
        int randNum;
        randNum = rand.nextInt(gameModeChoices);
        switch (randNum) {
            case 1:
                aiThrow = "Rock";
                break;
            case 2:
                aiThrow = "Paper";
                break;
            case 3:
                aiThrow = "Scissors";
                break;
            case 4:
                aiThrow = "Lizard";
                break;
            case 5:
                aiThrow = "Spock";
        }
        return aiThrow;
    }

    static String getAiThrow() {
        return aiThrow;
    }

    static String getResultMessage() {
        return resultMessage;
    }

    static int throwRock() {
        int result;
        aiThrow = throwComputer();
        switch (aiThrow) {
            case "Paper":
                result = 0;
                resultMessage = "Paper covers rock!";
                break;
            case "Scissors":
                result = 2;
                resultMessage = "Rock breaks scissors!";
                break;
            case "Lizard":
                result = 2;
                resultMessage = "Rock crushes lizard!";
                break;
            case "Spock":
                result = 0;
                resultMessage = "Spock vaporizes rock!";
                break;
            default:
                result = 1;
                resultMessage = "Draw";
        }
        return result;
    }

    static int throwPaper() {
        int result;
        aiThrow = throwComputer();
        switch (aiThrow) {
            case "Rock":
                result = 2;
                resultMessage = "Paper covers rock!";
                break;
            case "Scissors":
                result = 0;
                resultMessage = "Scissors cuts paper!";
                break;
            case "Lizard":
                result = 0;
                resultMessage = "Lizard eats paper!";
                break;
            case "Spock":
                result = 2;
                resultMessage = "Paper disproves Spock!";
                break;
            default:
                result = 1;
                resultMessage = "Draw";
        }
        return result;
    }

    static int throwScissors() {
        int result;
        aiThrow = throwComputer();
        switch (aiThrow) {
            case "Rock":
                result = 0;
                resultMessage = "Rock breaks scissors!";
                break;
            case "Paper":
                result = 2;
                resultMessage = "Scissors cuts paper!";
                break;
            case "Lizard":
                result = 2;
                resultMessage = "Scissors decapitates lizard!";
                break;
            case "Spock":
                result = 0;
                resultMessage = "Spock smashes scissors!";
                break;
            default:
                result = 1;
                resultMessage = "Draw";
        }
        return result;
    }

    static int throwLizard() {
        int result;
        aiThrow = throwComputer();
        switch (aiThrow) {
            case "Rock":
                result = 0;
                resultMessage = "Rock crushes lizard!";
                break;
            case "Paper":
                result = 2;
                resultMessage = "Lizard eats paper!";
                break;
            case "Scissors":
                result = 0;
                resultMessage = "Scissors decapitates lizard!";
                break;
            case "Spock":
                result = 2;
                resultMessage = "Lizard poisons Spock!";
                break;
            default:
                result = 1;
                resultMessage = "Draw";
        }
        return result;
    }

    static int throwSpock() {
        int result;
        aiThrow = throwComputer();
        switch (aiThrow) {
            case "Rock":
                result = 2;
                resultMessage = "Spock vaporizes rock!";
                break;
            case "Paper":
                result = 0;
                resultMessage = "Paper disproves Spock!";
                break;
            case "Scissors":
                result = 2;
                resultMessage = "Spock smashes scissors!";
                break;
            case "Lizard":
                result = 0;
                resultMessage = "Lizard poisons Spock!";
                break;
            default:
                result = 1;
                resultMessage = "Draw";
        }
        return result;
    }
}
