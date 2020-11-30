package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> tools = new ArrayList<>();
        tools.add("Papier");
        tools.add("Kamien");
        tools.add("Nozyce");

        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("Papier, Kamien, Nozyce, 1, 2, 3 >");

        String your_choose = scanner.nextLine();
        System.out.println("You choosed " + your_choose);

        String computer_choose = tools.get(rand.nextInt(3));
        System.out.println("Computer choosed " + computer_choose);

        if(your_choose.equals("Papier") && computer_choose.equals("Kamien")){
            System.out.println("You won");
        }
        else if(your_choose.equals("Kamien") && computer_choose.equals("Kamien")){
            System.out.println("Draw");
        }
        else if(your_choose.equals("Nozyce") && computer_choose.equals("Kamien")){
            System.out.println("You lose");
        }
        else if(your_choose.equals("Papier") && computer_choose.equals("Papier")){
            System.out.println("Draw");
        }
        else if(your_choose.equals("Kamien") && computer_choose.equals("Papier")){
            System.out.println("You lose");
        }
        else if (your_choose.equals("Nozyce") && computer_choose.equals("Papier")){
            System.out.println("You won");
        }
        else if(your_choose.equals("Papier") && computer_choose.equals("Nozyce")){
            System.out.println("You lose");
        }
        else if(your_choose.equals("Kamien") && computer_choose.equals("Nozyce")){
            System.out.println("You won");
        }
        else if(your_choose.equals("Nozyce") && computer_choose.equals("Nozyce")){
            System.out.println("Draw");
        }






    }
}
