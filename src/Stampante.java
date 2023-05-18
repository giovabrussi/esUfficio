public class Stampante {
    private String nome;

    public Stampante(String nome) {
        this.nome = nome;
    }

    public void Stampa(Dipendente d, int n){

        for (int i = 0; i < n; i++) {
            System.out.println("------------");
            System.out.println("|          |");
            System.out.println("|PRINTED BY|");
            System.out.println("|   "+d.getNome()+"   |");
            System.out.println("|          |");
            System.out.println("|  foglio"+ (i+1) +" |");
            System.out.println("----------");

        }


    }

    


}
