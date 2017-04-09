package br.com.nanodegree.adalbertofjr.androidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import br.com.nanodegree.adalbertofjr.androidlibrary.jokes.JokeSmith;
import br.com.nanodegree.adalbertofjr.androidlibrary.jokewizard.JokeWizard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView jokeManual = (TextView) findViewById(R.id.jokeSmith);
        jokeManual.setText(JokeSmith.getJoke());

        TextView jokeWizard = (TextView) findViewById(R.id.jokeWizard);
        jokeWizard.setText(JokeWizard.getJoke());
    }
}
