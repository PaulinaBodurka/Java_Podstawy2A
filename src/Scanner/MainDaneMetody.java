package Scanner;

import java.util.Scanner;

public class MainDaneMetody {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz coś z klawiatury");
//
//        while(scanner.hasNextInt()){
//            int wczytany = scanner.nextInt();
//            System.out.println("wczytany int: " + wczytany);
//
//        }
//        System.out.println("zakończyłem swoje działanie");

        String next;
        while(!(next = scanner.next()).equals("X")){
        System.out.println("wypisany next:" +next);
        }

        //System.out.println("zakończyłem pisanie");
    }
}
