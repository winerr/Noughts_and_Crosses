package game.fourier.noughtsandcrosses.UpdateData;

import android.widget.Button;

import game.fourier.noughtsandcrosses.GameLogic.Logic;

/**
 * Created by winer on 6/20/2017.
 */

public class Update {

    private int count = 0;
    private Logic logic;
    private int turn;

    public int getCount() {
        return count;
    }

    public int getTurn() {

        return turn;
    }

    public Update(){
        logic = new Logic();
        turn = 1;
    }

    public void CleanData(){
        turn = 1;
        logic = new Logic();
        count = 0;
    }

    public boolean ButtonEvent(Button button, int x, int y){
        count++;
        if (logic.Update(x, y, turn)){
            if (turn == 1){
                button.setText("X");
                return true;
            }else{
                button.setText("O");
                return true;
            }
        }
        if (turn == 1){
            turn = 2;
            button.setText("X");
        }else{
            turn = 1;
            button.setText("O");
        }

        if (count == 9){
            return true;
        }

        return false;
    }

}
