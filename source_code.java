// Java Program for Rock Program Scissors 

package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

                Scanner s = new Scanner(System.in);
                Random ran = new Random();
                System.out.println("->Type 1 for Rock\n->Type 2 for Paper\n->Type 3 for Scissors");

                int userinput;
                int system;

                userinput = s.nextInt();
                system = ran.nextInt(4);

                if(userinput > 3){
                    System.out.println("Invalid input");
                }
                else if(userinput == system){
                    System.out.println("Match Tie Keep Try again");
                }
                else if(userinput == 1 && system == 2){
                    System.out.println("You Loos");
                }
                else if(userinput == 2 && system == 3){
                    System.out.println("You Loos");
                }
                else if(userinput == 3 && system == 2){
                    System.out.println("You Win");
                }
                else if(userinput == 1 && system == 3){
                    System.out.println("You Win");
                }
                else if(userinput == 2 && system == 1){
                    System.out.println("You Win");
                }
                else if(userinput == 3 && system == 1){
                    System.out.println("You Loos");
                }

            }
        }

