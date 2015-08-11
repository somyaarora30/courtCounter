package com.example.android.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.View;



public class MainActivity extends ActionBarActivity {

    int score=0;
    int scores=0;
    int Bscore=0;
    int Bscores=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void incrementbythree(View v)
    {
        scores=scores+3;
        displayForTeamA(scores);
    }

    public void incrementbytwo(View v)
    {
        scores=scores+2;
        displayForTeamA(scores);
    }

    public void incrementbyone(View v)
    {   scores=scores+1;
        displayForTeamA(scores);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void Bincrementbythree(View v)
    {
        Bscores=Bscores+3;
        displayForTeamB(Bscores);
    }

    public void Bincrementbytwo(View v)
    {
        Bscores=Bscores+2;
        displayForTeamB(Bscores);
    }

    public void Bincrementbyone(View v)
    {   Bscores=Bscores+1;
        displayForTeamB(Bscores);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int Bscore) {
        TextView scoreView = (TextView) findViewById(R.id.Bteam_a_score);
        scoreView.setText(String.valueOf(Bscore));
    }

    public void reset(View v)
    {int Bscores=0;
    int scores=0;
    displayForTeamA(scores);
    displayForTeamB(Bscores);}
}
