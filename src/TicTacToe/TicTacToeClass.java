package TicTacToe;

import java.util.Scanner;

public class TicTacToeClass {

static String  user;
static String comp;

    static private char  Tacboard[] = new char[10];

    static private void create(){
        for(int i=1; i<Tacboard.length; i++){
            Tacboard[i] = ' ';
        }
    }

    static public  void  ask(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x for X and y for o ");
         user = sc.nextLine();
        if(user.equals("x"))
        {
            comp = "O";
        }
else
  {
    comp = "X";
        }

    }

    public static void main(String[] args)
    {
        create();
    }
}
