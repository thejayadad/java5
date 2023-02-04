import java.util.Scanner;

public class Dice {


    //Welcome Player
    //Explain rules
    //Show Score
    //End game

    //Rules - 6 game over - 5 nothing happens - 2 loose 2 points = otherwise 2 points - total points player wins otherwise player looses



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.println("***DICE ROLLING GAME***");
        System.out.println("Do you want to play? Press any key to continue");
        scan.nextLine();
        System.out.println("Here are the rules of the game");
        System.out.println("Get 6 points and you win!");
        System.out.println("Roll 6 - Game Over");
        System.out.println("Roll 2 - Loose 2 points");
        System.out.println("Roll 5 - Nothing happens");
        System.out.println("Otherwise you get 2 points");
        System.out.println("************");
        System.out.println("Press any key to roll the dice");
        while(true){
            scan.next();
            int dice = rollDice();
            System.out.println("Roll: " + dice);
            if(dice == 6){
                System.out.println("GAME OVER LOSER!");
                break;
            } else if( dice == 5){
                System.out.println("Safe Roll");
            } else if(dice == 2){
                System.out.println("You loss 2 points for this one");
                score = score -2;
                System.out.println("Score: " + score);
            } else{
                score++;
                System.out.println("NICE ONE POINT! Current score: " + score);
            }
        }

        if(score >= 6){
            System.out.println("WOW! YOU WON!!!!");

        } else {
            System.out.println("Oh well, you loss!");
        }
        scan.close();
    }
    //ROLL DICE - GENERATE DICE
    public static int rollDice(){
        double ran = Math.random() * 6;
        ran += 1;
        return (int)ran;
    }


}
