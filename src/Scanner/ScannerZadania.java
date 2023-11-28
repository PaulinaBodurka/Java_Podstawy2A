package Scanner;

import java.util.Scanner;

public class ScannerZadania {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
//        String name= scanner.next();
//        String surname= scanner.next();
//        int height = scanner.nextInt();
//        System.out.println("My name is " + name + " " + surname + " and my height is:" + height);

        while(true){
            String next = scanner.next();
            if(next.equals("X")|| next.equals("x")){
                break;
            }

            System.out.println("wypisuję zdanie w częściach: " + next);
        }
    }
}
