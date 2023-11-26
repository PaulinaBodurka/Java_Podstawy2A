package Thread_Zadania;

public class Scigacz implements Runnable {
    private String nazwa;

    public Scigacz(String nazwa){
        this.nazwa =nazwa;
    }
    @Override
    public void run() {
        for(int i = 0; i<1000; i++){
            System.out.println("Będę pierwszym wątkiem " + nazwa);

        }
        System.out.println("zakończeyłem wypisywanie " + nazwa );

    }
}
