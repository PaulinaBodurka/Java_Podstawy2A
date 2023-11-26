package Thread;

public class Main {
    public static void main(String[]args){

        Thread wątek1 = new PierwszyWatek();
        Thread wątek2 = new DrugiWatek();

        wątek1.start();
        wątek2.start();

    }
}
