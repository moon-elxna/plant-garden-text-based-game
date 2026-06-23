package app;

import java.util.Scanner;

public class App implements Runnable {

    @Override
    public void run(){
        boolean running = true;
        while (running){
            System.out.println("Welcome To Your Little Plant Garden!");
            System.out.println("Choose Action: \n1. Open The Garden Manager \n2. Exit The Game");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) sayHello();
            if (choice == 2) running = false;

        }
    }

    private void sayHello() {
        System.out.println("Hallo!");
    }
}

