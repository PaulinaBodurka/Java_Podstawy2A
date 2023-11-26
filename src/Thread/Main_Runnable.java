package Thread;

public class Main_Runnable {
    public static void main(String[]args){
        Thread thread = new Thread(new Moj_wątek());
        thread.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i = 0; i<1000; i ++){
                    System.out.println("jestem z klasy anonimowej: " + i);
                }
            }
        });
        thread2.start();


        //bez przypisania do zmiennej
        new Thread(new Runnable(){
            @Override
            public void run() {
                for( int i = 0; i<1000; i ++) {
                    System.out.println("bez przypisania do zmiennej: " + i);
                }
            }
        }).start();
    }
}
