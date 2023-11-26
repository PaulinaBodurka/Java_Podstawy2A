package JoinIsAlive;

public class MainJoinIsAlive {
    public static void main(String[] args){
        System.out.println("Start");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<3; i++){
                    System.out.println("Pracuję: ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) { }
                }
            }
        });

        thread.start();
        System.out.println("czy wątek zyje? "+ thread.isAlive());

        try {thread.join();} catch (InterruptedException e) {}
        System.out.println("czy wątek zyje? "+ thread.isAlive());
        System.out.println("Stop");
    }
}
