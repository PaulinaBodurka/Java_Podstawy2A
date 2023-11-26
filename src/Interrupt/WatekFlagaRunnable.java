package Interrupt;

public class WatekFlagaRunnable implements Runnable {

    private boolean watekDziala;
    @Override
    public void run() {
        watekDziala =true;
        while(watekDziala){
            System.out.println("watek Flaga dziala ");
        }
        System.out.println("watek Flaga zakończył działnie");
    }

    public void zatrzymajWatek(){
        watekDziala = false;
    }
}
