package br.com.luisfernandezbr.androidbasics_project02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

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
            case R.id.buttonReset : {
                this.handleResetClick();
                break;
            }

            case R.id.buttonHomePlusFreeThrow: {
                this.handleHomePlusFreeThrow();
                break;
            }

            case R.id.buttonHomePlusTwoPoints: {
                this.handleHomePlusTwoPoints();
                break;
            }

            case R.id.buttonHomePlusThreePoints: {
                this.handleHomePlusThreePoints();
                break;
            }

            case R.id.buttonVisitorPlusFreeThrow: {
                this.handleVisitorPlusFreeThrow();
                break;
            }

            case R.id.buttonVisitorPlusTwoPoints: {
                this.handleVisitorPlusTwoPoints();
                break;
            }

            case R.id.buttonVisitorPlusThreePoints: {
                this.handleVisitorPlusThreePoints();
                break;
            }
        }
    }

    private void initViews() {
        textHomeScore = (TextView) findViewById(R.id.textHomeScore);
        textVisitorScore = (TextView) findViewById(R.id.textVisitorScore);
    }

    private void handleResetClick() {

    }

    private void handleHomePlusFreeThrow() {

    }

    private void handleHomePlusTwoPoints() {

    }

    private void handleHomePlusThreePoints() {

    }

    private void handleVisitorPlusFreeThrow() {

    }

    private void handleVisitorPlusTwoPoints() {

    }

    private void handleVisitorPlusThreePoints() {

    }

    private void incrementHomeScore(int pointsToAdd) {
        currentHomeScore += pointsToAdd;
        textHomeScore.setText(currentHomeScore);
    }

    private void incrementVisitorScore(int pointsToAdd) {
        currentVisitorScore += pointsToAdd;
        textVisitorScore.setText(currentVisitorScore);
    }
}
