package Scanner;

import java.util.Scanner;

public class MainZnaki {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");

        System.out.println("rozpocząłem swoje działanie");
        while(scanner.hasNext()){
            String next = scanner.next();
            System.out.println("wczytałem: " + next);

        }
        System.out.println(" Koniec działanie programu");
    }
}
