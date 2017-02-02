package tk.salvador_nico.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button rockButton;
    private Button paperButton;
    private Button scissorsButton;
    private TextView resultDisplay;
    private TextView playerThrow;
    private TextView aiThrow;
    private TextView playerWinsDisplay;
    private TextView aiWinsDisplay;

    int playerWins;
    int aiWins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);
        resultDisplay = (TextView) findViewById(R.id.result);
        playerThrow = (TextView) findViewById(R.id.player_throw);
        aiThrow = (TextView) findViewById(R.id.ai_throw);
        playerWinsDisplay = (TextView) findViewById(R.id.player_win_count);
        aiWinsDisplay = (TextView) findViewById(R.id.ai_win_count);

        playerWins = 0;
        aiWins = 0;
        playerWinsDisplay.setText(String.valueOf(playerWins));
        aiWinsDisplay.setText(String.valueOf(aiWins));
    }

    public void throwRock (View view) {
        playerThrow.setText(R.string.label_rock);
        int result = throwComputer();
        if (result == 1)
            resultDisplay.setText(R.string.result_draw);
        else if (result == 2) {
            resultDisplay.setText(R.string.result_lose);
            countAiWin();
        }
        else if (result == 3) {
            resultDisplay.setText(R.string.result_win);
            countPlayerWin();
        }
    }

    public void throwPaper (View view) {
        playerThrow.setText(R.string.label_paper);
        int result = throwComputer();
        if (result == 1) {
            resultDisplay.setText(R.string.result_win);
            countPlayerWin();
        }
        else if (result == 2)
            resultDisplay.setText(R.string.result_draw);
        else if (result == 3) {
            resultDisplay.setText(R.string.result_lose);
            countAiWin();
        }
    }

    public void throwScissors (View view) {
        playerThrow.setText(R.string.label_scissors);
        int result = throwComputer();
        if (result == 1) {
            resultDisplay.setText(R.string.result_lose);
            countAiWin();
        }
        else if (result == 2) {
            resultDisplay.setText(R.string.result_win);
            countPlayerWin();
        }
        else if (result == 3)
            resultDisplay.setText(R.string.result_draw);
    }

    public int throwComputer() {
        Random rand = new Random(System.currentTimeMillis());
        int randNum;
        randNum = rand.nextInt(4);
        if (randNum == 1)
            aiThrow.setText(R.string.label_rock);
        else if (randNum == 2)
           aiThrow.setText(R.string.label_paper);
        else if (randNum == 3)
            aiThrow.setText(R.string.label_scissors);
        return randNum;
    }

    public void countPlayerWin() {
        ++playerWins;
        playerWinsDisplay.setText(String.valueOf(playerWins));
    }

    public void countAiWin() {
        ++aiWins;
        aiWinsDisplay.setText(String.valueOf(aiWins));
    }
}
