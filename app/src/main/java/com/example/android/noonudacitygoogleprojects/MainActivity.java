package com.example.android.noonudacitygoogleprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // Declares and Initializes team A score to zero
    int teamA = 0;
    // Declares and Initializes team B score to zero
    int teamB = 0;

    // Declares and Initializes team A shot on goal to zero
    int shotsOnGoalA = 0;
    // Declares and Initializes team A corner kick to zero
    int cornerKickA = 0;
    // Declares and Initializes team A offside to zero
    int offSideA = 0;

    // Declares and Initializes team B shot on goal to zero
    int shotsOnGoalB = 0;
    // Declares and Initializes team B corner kick to zero
    int cornerKickB = 0;
    // Declares and Initializes team B offside to zero
    int offSideB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * Initializes all the scores displays
         * to zero when the app first starts
         * */
        displayScoreTeamA(teamA);
        displayScoreTeamB(teamB);
        displayAccessoriesTeamA(shotsOnGoalA, offSideA, cornerKickA);
        displayAccessoriesTeamB(shotsOnGoalB, offSideB, cornerKickB);
    }

    public void addPoints(View view){
        // Stores the clicked button id into the whichOne variable
        int whichOne = view.getId();

        // Switch block to filter the right action
        switch (whichOne){
            // In case goal team A is pressed
            case R.id.goal_btn_a:
                // Add 1 to the existing score of team A
                teamA = teamA + 1;
                // Get out of the switch block
                break;
            // In case shot on goal team A is pressed
            case R.id.shot_on_goal_btn_a:
                // Add 1 to the existing amount of shot on goal of team A
                shotsOnGoalA = shotsOnGoalA + 1;
                // Get out of the switch block
                break;
            // In case offside team A is pressed
            case R.id.off_side_btn_a:
                // Add 1 to the existing amount of offside of team A
                offSideA = offSideA + 1;
                // Get out of the switch block
                break;
            // In case corner kick team A is pressed
            case R.id.corner_kick_btn_a:
                // Add 1 to the existing amount of corner kick of team A
                cornerKickA = cornerKickA + 1;
                // Get out of the switch block
                break;
            // In case goal team B is pressed
            case R.id.goal_btn_b:
                // Add 1 to the existing amount of goal of team B
                teamB = teamB + 1;
                // Get out of the switch block
                break;
            // In case shot on goal team B is pressed
            case R.id.shot_on_goal_btn_b:
                // Add 1 to the existing amount of shot on goal of team B
                shotsOnGoalB = shotsOnGoalB + 1;
                // Get out of the switch block
                break;
            // In case offside team B is pressed
            case R.id.off_side_btn_b:
                // Add 1 to the existing amount of offside of team B
                offSideB = offSideB + 1;
                // Get out of the switch block
                break;
            // In case corner kick team B is pressed
            case R.id.corner_kick_btn_b:
                // Add 1 to the existing amount of corner kick of team B
                cornerKickB = cornerKickB + 1;
                // Get out of the switch block
                break;
        }

        // Displays the Team A other stats view after processing them
        displayAccessoriesTeamA(shotsOnGoalA, offSideA, cornerKickA);
        // Displays the Team B other stats view after processing them
        displayAccessoriesTeamB(shotsOnGoalB, offSideB, cornerKickB);
        // Displays the Team A score view after processing it
        displayScoreTeamA(teamA);
        // Displays the Team B score view after processing it
        displayScoreTeamB(teamB);
    }

    public void resetScores(View view){
        // Initializes both teams scores to zero
        teamA = 0; teamB = 0;
        // Initializes all other Team A stats to zero
        shotsOnGoalA = 0; offSideA = 0; cornerKickA = 0;
        // Initializes all other Team B stats to zero
        shotsOnGoalB = 0; offSideB = 0; cornerKickB = 0;

        // Updates the Team A score view
        displayScoreTeamA(teamA);
        // Updates the Team B score view
        displayScoreTeamB(teamB);
        // Updates the Team A other stats view
        displayAccessoriesTeamA(shotsOnGoalA, offSideA, cornerKickA);
        // Updates the Team B other stats view
        displayAccessoriesTeamB(shotsOnGoalB, offSideB, cornerKickB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreTeamA(int score) {
        // Initializes and Declares scoreView to the Team A score view
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        // Sets the scoreView text attribute to the team A current score
        scoreView.setText(String.valueOf(score));
        // When the score reaches ten (10) or higher, the scoreView's size
        // shrinks wider to display the zero (0) and when the user resets
        // the score to zero, the scoreView's width doesn't decrease to show
        // the ImageView (soccer ball) close to it.
        // Calling the requestLayout() solves this problem by
        // measuring, laying out, and drawing the View as appropriate
        scoreView.requestLayout();

//        EditText editText;
//        editText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                s.toString()
//            }
//        });
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreTeamB(int score) {
        // Initializes and Declares scoreView to the Team A score view
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        // Sets the scoreView text attribute to the team A current score
        scoreView.setText(String.valueOf(score));
        // When the score reaches ten (10) or higher, the scoreView's size
        // shrinks wider to display the zero (0) and when the user resets
        // the score to zero, the scoreView's width doesn't decrease to show
        // the ImageView (soccer ball) close to it.
        // Calling the requestLayout() solves this problem by
        // measuring, laying out, and drawing the View as appropriate
        scoreView.requestLayout();
    }

    /**
     * Displays the given other soccer stats for Team A.
     */
    public void displayAccessoriesTeamA(int sog, int os, int ck){
        // Initializes and Declares shotsView to the Team A shot on goal View
        TextView shotsView = (TextView) findViewById(R.id.shot_on_goal_a);
        // Sets the shotsView text attribute to the team A current shot on goal amount
        shotsView.setText(String.valueOf(sog));

        // Initializes and Declares offsideView to the Team A offside View
        TextView offsideView = (TextView) findViewById(R.id.off_side_a);
        // Sets the offsideView text attribute to the team A current offside amount
        offsideView.setText(String.valueOf(os));

        // Initializes and Declares cornerView to the Team A corner kick View
        TextView cornerView = (TextView) findViewById(R.id.corner_kick_a);
        // Sets the cornerView text attribute to the team A current corner kick amount
        cornerView.setText(String.valueOf(ck));
    }

    /**
     * Displays the given other soccer stats for Team B.
     */
    public void displayAccessoriesTeamB(int sog, int os, int ck){
        // Initializes and Declares shotsView to the Team B shot on goal View
        TextView shotsView = (TextView) findViewById(R.id.shot_on_goal_b);
        // Sets the shotsView text attribute to the team B current shot on goal amount
        shotsView.setText(String.valueOf(sog));

        // Initializes and Declares offsideView to the Team B offside View
        TextView offsideView = (TextView) findViewById(R.id.off_side_b);
        // Sets the offsideView text attribute to the team B current offside amount
        offsideView.setText(String.valueOf(os));

        // Initializes and Declares cornerView to the Team B corner kick View
        TextView cornerView = (TextView) findViewById(R.id.corner_kick_b);
        // Sets the cornerView text attribute to the team B current corner kick amount
        cornerView.setText(String.valueOf(ck));
    }
}
