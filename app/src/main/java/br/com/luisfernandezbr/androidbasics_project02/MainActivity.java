package br.com.luisfernandezbr.androidbasics_project02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
