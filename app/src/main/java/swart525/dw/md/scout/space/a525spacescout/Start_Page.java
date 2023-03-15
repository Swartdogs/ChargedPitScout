package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__page);
        //WARNING: Anything above this line do not edit

        //Below to dotted line defines the needed button and are used to bring you to data collection start page
        Button Start_Collection_Open = (Button) findViewById(R.id.Start_Collection_Open_B); //Defines button for later use
        Start_Collection_Open.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override


            public void onClick(View v) {
                Data_Collection_Page_1.GenTeamNum = 0;
                        Data_Collection_Page_1.GenDimensions = "No Dimensions";
                        Data_Collection_Page_1.GenDriveBase = "No Drive Base";
                        Data_Collection_Page_1.GenCones = "False";
                        Data_Collection_Page_1.GenCubes = "False";
                        Data_Collection_Page_1.GenGround = "False";
                        Data_Collection_Page_1.GenSubstation = "False";
                        Data_Collection_Page_1.GenDefenseYes = "False";
                        Data_Collection_Page_1.GenDefenseNo = "False";
                        Data_Collection_Page_1.GenDefenseNeeded = "False";
                        Data_Collection_Page_1.GenWheelLock = "False";
                        data_Collection_sandstorm.AutoTop = "False";
                        data_Collection_sandstorm.AutoMiddle = "False";
                        data_Collection_sandstorm.AutoBottom = "False";
                        data_Collection_sandstorm.Auto0 = "False";
                        data_Collection_sandstorm.Auto1 = "False";
                        data_Collection_sandstorm.Auto2 = "False";
                        data_Collection_sandstorm.Auto3 = "False";
                        data_Collection_sandstorm.AutoEngage = "False";
                        data_Collection_sandstorm.AutoAutoBalance = "False";
                        data_Collection_sandstorm.TeleScoreTop = "False";
                        data_Collection_sandstorm.TeleScoreMiddle = "False";
                        data_Collection_sandstorm.TeleScoreBottom = "False";
                        data_Collection_sandstorm.TeleEngage = "False";
                        data_Collection_sandstorm.TelePark = "False";
                        data_Collection_sandstorm.GenCycle = "False";
                        data_collection_end_game.TeleEndTopCones = "False";
                        data_collection_end_game.TeleEndMiddleCones = "False";
                        data_collection_end_game.TeleEndBottomCones = "False";
                        data_collection_end_game.TeleEndTopCubes = "False";
                        data_collection_end_game.TeleEndMiddleCubes = "False";
                        data_collection_end_game.TeleEndBottomCubes = "False";
                        data_collection_end_game.TeleEndDefense = "False";
                        data_collection_end_game.TeleEndDock = "False";
                        data_collection_end_game.TeleEndEngage = "False";
                        data_collection_end_game.TeleEndPark = "False";
                        Save_Page.comment = "No Comment";

                //data_Collection_sandstorm.BallCountAuto = 0;
                //data_collection_TeleOP.WrongColorYes = "False";
                //data_collection_TeleOP.WrongColorNo = "False";

                Intent startintent = new Intent(getApplicationContext(), Data_Collection_Page_1.class);
                startActivity(startintent);
            }

        });
        //----------------------------------------------------------------------------------------------------------------

        /*
        //Below to dotted line defines the needed button and are used to bring you to the instruction page
        Button Instruct_Button = (Button) findViewById(R.id.Instructions);
        Instruct_Button.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Instructions_Page.class);
                startActivity(startintent);
            }
        });
        //----------------------------------------------------------------------------------------------------------------
    */
    }
}