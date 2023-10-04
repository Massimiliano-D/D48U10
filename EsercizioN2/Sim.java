package EsercizioN2;

public class Sim {
    String numero;
    int credito;
    int[] lista;
    public static void stampaDatiSim (Sim x){
        System.out.println("numero:" + " " +x.numero);
        System.out.println("credito:" + " " +x.credito+ "€");
        for(int i= 0; i<x.lista.length; i++) {
            System.out.println(x.lista[i]);

        }
    }
    public Sim(String _numero, int _credito) {
        this.numero = _numero;
                this.credito= _credito;
                this.lista= new int[5];
    }
}
