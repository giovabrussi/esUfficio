public class Dipendente extends Thread{
    private String nome;
    private Stampante stamp;
    private Semaforo s;
    
    public Dipendente(String nome, Stampante stamp, Semaforo s) {
        this.nome = nome;
        this.stamp = stamp;
        this.s = s;
    }

    public String getNome() {
        return nome;
    }

    public Stampante getStamp() {
        return stamp;
    }

    public Semaforo getS() {
        return s;
    }

    @Override
    public void run() {
        int nfogli = (int)((Math.random()*3)+1);
        System.out.println(nome + " ha iniziato a lavorare.");

        try {
            Thread.sleep(1000*((int)((Math.random()*3)+1)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        s.P();

        System.out.println(nome+ " deve stampare "+ nfogli + " FOGLI");
        stamp.Stampa(this, nfogli);
        System.out.println(nome+ " ha FINITO");

        s.V();
    }
    


}
