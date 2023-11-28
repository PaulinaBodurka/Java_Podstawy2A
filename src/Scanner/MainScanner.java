package Scanner;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

//        while(true){
//            String linia =scanner.nextLine();
//            System.out.println("wprowadziłem: " +linia);
//
//            if(linia.equals("Koniec")){
//                System.out.println("no to kończę pisanie");
//                break;
//            }
//        }
//        String linia;
//        do{
//            linia = scanner.nextLine();
//        }while(!linia.equals("Koniec"));
//        System.out.println("no to kończę pisanie");

        String linia;
        while(!(linia = scanner.nextLine()).equals("Koniec")){
            System.out.println("While w inny sposób" + linia);
        }
        System.out.println("Zakończyłem działanie");
    }
}
