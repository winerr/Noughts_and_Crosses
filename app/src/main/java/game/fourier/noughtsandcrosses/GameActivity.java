package game.fourier.noughtsandcrosses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import game.fourier.noughtsandcrosses.UpdateData.Update;

public class GameActivity extends AppCompatActivity {


    private List<Button> buttons;
    private Update updateData;

    private TextView winText;
    private Button resetButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        updateData = new Update();

        buttons = new ArrayList<>();

        buttons.add((Button) findViewById(R.id.b_1));
        buttons.add((Button) findViewById(R.id.b_2));
        buttons.add((Button) findViewById(R.id.b_3));
        buttons.add((Button) findViewById(R.id.b_4));
        buttons.add((Button) findViewById(R.id.b_5));
        buttons.add((Button) findViewById(R.id.b_6));
        buttons.add((Button) findViewById(R.id.b_7));
        buttons.add((Button) findViewById(R.id.b_8));
        buttons.add((Button) findViewById(R.id.b_9));


        winText = (TextView) findViewById(R.id.winText);
        resetButton = (Button) findViewById(R.id.resetGameButton);

    }

    public void onClickB_1(View v){
        if(updateData.ButtonEvent(buttons.get(0), 0, 0)){
            if(updateData.getCount() == 9){
                winText.setText(R.string.death_turn);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else if(updateData.getTurn() == 1){
                winText.setText(R.string.win_first_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else{
                winText.setText(R.string.win_second_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }
        }
    }

    public void onClickB_2(View v){
        if(updateData.ButtonEvent(buttons.get(1), 0, 1)){
            if(updateData.getCount() == 9){
                winText.setText(R.string.death_turn);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else if(updateData.getTurn() == 1){
                winText.setText(R.string.win_first_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else{
                winText.setText(R.string.win_second_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }
        }
    }
    public void onClickB_3(View v){
        if(updateData.ButtonEvent(buttons.get(2), 0, 2)){
            if(updateData.getCount() == 9){
                winText.setText(R.string.death_turn);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else if(updateData.getTurn() == 1){
                winText.setText(R.string.win_first_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else{
                winText.setText(R.string.win_second_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }
        }
    }
    public void onClickB_4(View v){
        if(updateData.ButtonEvent(buttons.get(3), 1, 0)){
            if(updateData.getCount() == 9){
                winText.setText(R.string.death_turn);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else if(updateData.getTurn() == 1){
                winText.setText(R.string.win_first_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else{
                winText.setText(R.string.win_second_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }
        }
    }
    public void onClickB_5(View v){
        if(updateData.ButtonEvent(buttons.get(4), 1, 1)){
            if(updateData.getCount() == 9){
                winText.setText(R.string.death_turn);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else if(updateData.getTurn() == 1){
                winText.setText(R.string.win_first_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else{
                winText.setText(R.string.win_second_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }
        }
    }
    public void onClickB_6(View v){
        if(updateData.ButtonEvent(buttons.get(5), 1, 2)){
            if(updateData.getCount() == 9){
                winText.setText(R.string.death_turn);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else if(updateData.getTurn() == 1){
                winText.setText(R.string.win_first_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else{
                winText.setText(R.string.win_second_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }
        }
    }
    public void onClickB_7(View v){
        if(updateData.ButtonEvent(buttons.get(6), 2, 0)){
            if(updateData.getCount() == 9){
                winText.setText(R.string.death_turn);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else if(updateData.getTurn() == 1){
                winText.setText(R.string.win_first_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else{
                winText.setText(R.string.win_second_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }
        }
    }
    public void onClickB_8(View v){
        if(updateData.ButtonEvent(buttons.get(7), 2, 1)){
            if(updateData.getCount() == 9){
                winText.setText(R.string.death_turn);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else if(updateData.getTurn() == 1){
                winText.setText(R.string.win_first_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }

            }else{
                winText.setText(R.string.win_second_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }
        }
    }
    public void onClickB_9(View v){
        if(updateData.ButtonEvent(buttons.get(8), 2, 2)){
            if(updateData.getCount() == 9){
                winText.setText(R.string.death_turn);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else if(updateData.getTurn() == 1){
                winText.setText(R.string.win_first_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }else{
                winText.setText(R.string.win_second_player);
                for(Button b: buttons){
                    b.setEnabled(false);
                }
            }
        }
    }

    public void resetButtonClick(View v){
        updateData.CleanData();
        winText.setText("");
        for(Button b: buttons){
            b.setText("");
            b.setEnabled(true);
        }
    }
}
