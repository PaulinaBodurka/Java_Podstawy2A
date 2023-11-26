package Thread_Zadania;

public class ZadaniaWatki {
    //    public static void main(String[]args){
//        try {Thread.sleep(3000);} catch (InterruptedException e) {
//        }
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Ta informacja została wypisana z klasy anonimowej");
//            }
//        });
//        thread.start();
//    }
//        public static void main(String[]args){
//            Thread czasoodmierzacz = new Thread(new Czasoodmierzacz());
//            czasoodmierzacz.start();
//
//        }
    public static void main(String[]args){
        Scigacz scigaczPierwszyRunnable = new Scigacz("Ścigacz nr 1");
        Scigacz scigaczDrugiRunnable = new Scigacz("Ścigacz nr 2");
        Thread scigaczPierwszyThread = new Thread(scigaczPierwszyRunnable);
        Thread scigaczDrugiThread = new Thread(scigaczDrugiRunnable);

        scigaczPierwszyThread.start();
        scigaczDrugiThread.start();
    }

}
