package br.com.luisfernandezbr.androidbasics_project02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int FREE_THROW_POINTS = 1;
    private static final int TWO_POINTS = 2;
    private static final int THREE_POINTS = 3;

    private int currentHomeScore;
    private int currentVisitorScore;

    private TextView textHomeScore;
    private TextView textVisitorScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initViews();
    }

    public void onClickButton(View view) {
        switch (view.getId()) {
            case R.id.buttonReset: {
                this.resetScores();
                break;
            }

            case R.id.buttonHomePlusFreeThrow: {
                this.incrementHomeScore(FREE_THROW_POINTS);
                break;
            }

            case R.id.buttonHomePlusTwoPoints: {
                this.incrementHomeScore(TWO_POINTS);
                break;
            }

            case R.id.buttonHomePlusThreePoints: {
                this.incrementHomeScore(THREE_POINTS);
                break;
            }

            case R.id.buttonVisitorPlusFreeThrow: {
                this.incrementVisitorScore(FREE_THROW_POINTS);
                break;
            }

            case R.id.buttonVisitorPlusTwoPoints: {
                this.incrementVisitorScore(TWO_POINTS);
                break;
            }

            case R.id.buttonVisitorPlusThreePoints: {
                this.incrementVisitorScore(THREE_POINTS);
                break;
            }
        }
    }

    private void initViews() {
        textHomeScore = (TextView) findViewById(R.id.textHomeScore);
        textVisitorScore = (TextView) findViewById(R.id.textVisitorScore);

        this.resetTextScores();
    }

    private void resetScores() {
        this.resetTextScores();
        this.resetScoreCounters();
    }

    private void resetTextScores() {
        textHomeScore.setText("0");
        textVisitorScore.setText("0");
    }

    private void resetScoreCounters() {
        currentHomeScore = 0;
        currentVisitorScore = 0;
    }

    private void incrementHomeScore(int pointsToAdd) {
        currentHomeScore += pointsToAdd;
        textHomeScore.setText(String.valueOf(currentHomeScore));
    }

    private void incrementVisitorScore(int pointsToAdd) {
        currentVisitorScore += pointsToAdd;
        textVisitorScore.setText(String.valueOf(currentVisitorScore));
    }
}
