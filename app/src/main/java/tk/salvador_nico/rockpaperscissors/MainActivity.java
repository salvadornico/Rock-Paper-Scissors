package tk.salvador_nico.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button classicButton = (Button) findViewById(R.id.classic_button);
        Button spockButton = (Button) findViewById(R.id.spock_button);

        classicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent classicIntent = new Intent(MainActivity.this, ClassicActivity.class);
                startActivity(classicIntent);
            }
        });

        spockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spockIntent = new Intent(MainActivity.this, SpockActivity.class);
                startActivity(spockIntent);
            }
        });
    }
}
