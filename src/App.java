public class App {
    public static void main(String[] args) throws Exception {
        Semaforo semaforo = new Semaforo(1);
        Stampante stampante = new Stampante("Basilea");

        Dipendente d1 = new Dipendente("Arthur", stampante, semaforo);
        Dipendente d2 = new Dipendente("Nico", stampante, semaforo);
        Dipendente d3 = new Dipendente("Mario", stampante, semaforo);
        Dipendente d4 = new Dipendente("Bro", stampante, semaforo);
        Dipendente d5 = new Dipendente("Tito", stampante, semaforo);

        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();

        d1.join();
        d2.join();
        d3.join();
        d4.join();
        d5.join();


    }
}
