package game.fourier.noughtsandcrosses.GameLogic;

/**
 * Created by winer on 6/20/2017.
 */

public class Logic {


    private int[][] field;


    public Logic(){
        field = new int[3][3];
    }

    public boolean Update(int x, int y, int turn){
        if(turn == 1){
            field[x][y] = turn;
        }else{
            field[x][y] = turn;
        }

        return Check(turn);

    }

    private boolean Check(int turn){



        for (int i=0; i<3; i++){
            if(field[0][i] == turn && field[1][i] == turn && field[2][i] == turn){
                return true;
            }
        }

        for (int i = 0; i < 3; i++){
            if (field[i][0] == turn && field[i][1] == turn && field[i][2] == turn){
                return true;
            }
        }

        if (field[0][0] == turn && field[1][1] == turn && field[2][2] == turn){
            return true;
        }
        if (field[0][2] == turn && field[1][1] == turn && field[2][0] == turn){
            return true;
        }


        return false;
    }

    public boolean CheckEmptyBox(){
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(field[i][j] == 0){
                    return true;
                }
            }
        }
        return false;
    }


}
