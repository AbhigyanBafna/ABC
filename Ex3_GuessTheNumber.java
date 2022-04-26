package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    int goal;
    int guess;
    int noofguess = 1;
    public Game(){
        Random rand = new Random();
        goal = rand.nextInt(101);
    }
    public void userinput(){
        Scanner sc = new Scanner(System.in);
        guess = sc.nextInt();
        logic();
    }
    public void logic(){
        if (noofguess == 25) {
            System.out.println("Too many guesses! You lose :(");
            System.exit(0);
        }
        if(goal < guess) {
                System.out.println("Uh-oh! Wrong Guess :(");
                System.out.println("The Correct Number is lower than the Number you guessed.");
                noofguess += 1;
                userinput();
        }
        if (goal > guess) {
                System.out.println("Uh-oh! Wrong Guess :(");
                System.out.println("The Correct Number is higher than the Number you guessed.");
                noofguess += 1;
                userinput();
        }
        if(goal == guess){
            awards();
        }
    }
    public void awards(){
            System.out.println("Congratulations, You Win!");
            System.out.println("You took " +  noofguess + " guesses");
            if(noofguess <= 2){
                System.out.println("You get 80/100 Points. Hardcore");
                System.exit(0);
            }
            if(noofguess <= 6){
                System.out.println("You get 75/100 Points. Pro Player!");
                System.exit(0);
            }
            if(noofguess <= 10){
                System.out.println("You get 50/100 Points. Good Player!");
                System.exit(0);
            }
            if(noofguess <= 14){
                System.out.println("You get 0/100 Points. Noob!");
                System.exit(0);
            }
            if(noofguess >= 20){
                System.out.println("You get -100/100 Points. Please don't try again!");
                System.exit(0);
            }
    }
}

public class Ex3_GuessTheNumber {
    public static void main(String[] args) {
        Game Ab1 = new Game();
        System.out.println("Please Enter Your Guess");
        Ab1.userinput();
    }
}
