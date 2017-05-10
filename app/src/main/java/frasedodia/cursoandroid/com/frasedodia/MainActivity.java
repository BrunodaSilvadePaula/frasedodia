package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textNewPhase;
    private Button btnNewPhrase;
    private String[] phrase = {"teste", "teste2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNewPhase = (TextView) findViewById(R.id.textNewPhrase);
        btnNewPhrase = (Button) findViewById(R.id.btnNewPhrase);

        textNewPhase.setText(phrase[1]);

    }
}
