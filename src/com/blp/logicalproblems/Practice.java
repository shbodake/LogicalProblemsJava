package com.blp.logicalproblems;
import java.util.Scanner;
public class Practice {
        public static char[] board = new char[10];
        public static char playerchoice;
        public static void createBoard()
        {
            for(int i = 1; i < board.length; i++)
            {
                board[i] = ' ';
            }
        }
    public static void assignInput()
    {
        System.out.println("Choose your choice between X or O");
        Scanner scanner = new Scanner(System.in);
        char playerchoice = scanner.next().charAt(0);
        if(playerchoice == 'O' || playerchoice == 'o')
        {
            System.out.println("Player choice is:" +playerchoice);
            System.out.println("Computer choice is X ");
        }else if (playerchoice == 'X' || playerchoice == 'x')
        {
            System.out.println("Player choice is:" +playerchoice);
            System.out.println("Computer choice is O ");
        }else
        {
            System.out.println("Enter choice is not correct enter correct one:");
            assignInput();
        }
    }
    public static void showBoard()
    {
        System.out.println("|-----------|");
        System.out.println("| " +board[1]+ " | " +board[2]+ " | " +board[3]+ " |");
        System.out.println("|-----------|");
        System.out.println("| " +board[4]+ " | " +board[5]+ " | " +board[6]+ " |");
        System.out.println("|-----------|");
        System.out.println("| " +board[7]+ " | " +board[8]+ " | " +board[9]+ " |");
        System.out.println("|-----------|");

    }
    public static void playMove()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Position in Index to Move in Board(1 to 9) :");
        int indexNumber = scanner.nextInt();
        if(indexNumber < 1 || indexNumber > 9)
        {
            System.out.println("You entered Invalid Position");
            playMove();
        }else
        {
            board[indexNumber] = playerchoice;
            showBoard();
        }
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe game");
        createBoard();
        assignInput();
        showBoard();
        playMove();
        }
    }

