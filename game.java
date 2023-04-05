import java.util.Random;
import java.util.Scanner;

class Game {


// if Player 1

    public static void main(String[] args) {
        Random random= new Random();
        Scanner input= new Scanner(System.in);

        int Score1=0;
        // it shows Score of player 1
        int Score2=0;
        // it shows Score of player 2

        int turn ;


        int player1 ;
        int player2 ;


        // senitall loop

        do {
            System.out.println("\n Enter 1 to Continue game and\n 0 for End Game ");
            turn =input.nextInt();
            System.out.println("___________________________________________________");
            if (turn == 1) {
                player1 = random.nextInt(7);
                System.out.println(" Player 1 : Turn "+player1);

                player2 = random.nextInt(7);
                System.out.println(" Player 2 : Turn "+player2);


                // Player1 data------------------------------------>

                if (player1==6)
                {
                    Score1 += player1;
                    System.out.println("This Six by Player 1 ");
                    System.out.println("_____________________________________>");
                    player1 = random.nextInt(7);
                    System.out.println(" Player 1 : 2nd Turn "+player1);
                    if(player1==6)
                    {
                        System.out.println("This @nd six by plyer 1");
                        System.out.println("_____________________________________>");
                        Score1 += player1;
                        player1 = random.nextInt(7);
                        System.out.println(" Player 1 : 3nd Turn "+player1);
                        if (player1==6)
                        {
                            Score1=0;
                        }
                    }


                }

                else {

                    Score1 += player1;

                    if (Score1 == 33 || Score1 == 66 || Score1 == 99) {

                        Score1 = 0;
                        System.out.println("oho! Snake Mouth Player 1 ----> ");
                        System.out.println("Now youR Score is Zero Try Again Good Luck \n ");
                        System.out.println("_____________________________________>");
                    }

                    if (Score1 >= 100) {
                        System.out.println("Palayer 1 win the game");
                        System.out.println("_____________________________________>");
                        break;
                    }
                }
                // Player2 data ------------------------------------>


                if(player2==6)
                {
                    Score2 += player2;


                    System.out.println("This Six by Player 2 ");
                    System.out.println("_____________________________________>");
                    player2 = random.nextInt(7);
                    System.out.println(" Player 1 : 2nd Turn "+player2);
                    if(player2==6)
                    {
                        Score2 += player2;
                        player2 = random.nextInt(7);
                        System.out.println("This Six by Player 2 ");
                        System.out.println("_____________________________________>");
                        System.out.println(" Player 1 : 3nd Turn "+player2);
                        if (player2==6)
                        {
                            Score2=0;
                        }
                    }



                }
                else {
                    Score2 += player2;
                    if(Score2==33|| Score2==66|| Score2==99){

                        Score2=0;
                        System.out.println("oho! Snake Mouth  Player 2 ---->");
                        System.out.println("Now youR Score is Zero Try Again Good Luck \n ");
                        System.out.println("_____________________________________>");
                    }

                    if (Score2 >= 100) {
                        System.out.println("Palayer 2 win the game");
                        System.out.println("_____________________________________>");
                        break;
                    }
                    System.out.println("SCORE OF Player 1 : "+Score1);

                    System.out.println("SCORE OF Player 2 : "+Score2);

                }

                // end of if
            }

            else {
                break;
            }

            //end of Do
        }
        while (1==1);

    }
}
