import java.util.ArrayList;
import java.util.Scanner;

public class Main {
ArrayList<BattleShip> ships = new ArrayList<>();

    public static void main(String[] args) {



    }

    public void setupBoard (){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Two player battleship game!!! \n P1: battle ship 1 \n 1. horizontal \n 2. vertical");
        int sel = Integer.parseInt(scanner.nextLine());
        if(sel==1){
            System.out.println("x axis point");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter y axis points one by one (hit enter after each one");
            ArrayList<String> y = new ArrayList<>();

            y.add(scanner.nextLine());
            y.add(scanner.nextLine());
            y.add(scanner.nextLine());



        }
        else{
            System.out.println("y axis point");
            String x = (scanner.nextLine());
            System.out.println("Enter y axis points one by one (hit enter after each one");
            ArrayList<String> y = new ArrayList<>();

            y.add(scanner.nextLine());
            y.add(scanner.nextLine());
            y.add(scanner.nextLine());

        }

    }
}