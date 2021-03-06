package tk.salvador_nico.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ClassicActivity extends AppCompatActivity {

    private TextView resultDisplay;
    private ImageView playerThrow;
    private ImageView aiThrow;
    private TextView playerWinsDisplay;
    private TextView aiWinsDisplay;

    int playerWins;
    int aiWins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_classic);

        Button rockButton = (Button) findViewById(R.id.rock_button);
        Button paperButton = (Button) findViewById(R.id.paper_button);
        Button scissorsButton = (Button) findViewById(R.id.scissors_button);
        resultDisplay = (TextView) findViewById(R.id.result);
        playerThrow = (ImageView) findViewById(R.id.player_throw);
        aiThrow = (ImageView) findViewById(R.id.ai_throw);
        playerWinsDisplay = (TextView) findViewById(R.id.player_win_count);
        aiWinsDisplay = (TextView) findViewById(R.id.ai_win_count);

        playerWins = 0;
        aiWins = 0;
        playerWinsDisplay.setText(String.valueOf(playerWins));
        aiWinsDisplay.setText(String.valueOf(aiWins));
        GameUtils.setGameModeChoices(3);

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showResult(GameUtils.throwRock());
                playerThrow.setImageResource(R.drawable.rock);
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showResult(GameUtils.throwPaper());
                playerThrow.setImageResource(R.drawable.paper);
            }
        });

        scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showResult(GameUtils.throwScissors());
                playerThrow.setImageResource(R.drawable.scissors);
            }
        });
    }

    private void showResult(int result) {
        switch (result) {
            case 0:
                ++aiWins;
                aiWinsDisplay.setText(String.valueOf(aiWins));
                break;
            case 2:
                ++playerWins;
                playerWinsDisplay.setText(String.valueOf(playerWins));
                break;
        }
        switch (GameUtils.getAiThrow()) {
            case "Rock":
                aiThrow.setImageResource(R.drawable.rock);
                break;
            case "Paper":
                aiThrow.setImageResource(R.drawable.paper);
                break;
            case "Scissors":
                aiThrow.setImageResource(R.drawable.scissors);
                break;
        }
        resultDisplay.setText(GameUtils.getResultMessage());
    }
}
