package EsercizioN1;

public class Rettangolo {
    int altezza;
    int larghezza;


    public static int clacolaArea(Rettangolo x){
        return x.altezza * x.larghezza;
    }
    public static int clacolaPerimetro(Rettangolo x){
        return (x.altezza + x.larghezza)*2;
    }
    public static void stampaRettangolo(Rettangolo x){
        System.out.println(clacolaArea(x));
        System.out.println(clacolaPerimetro(x));
    }
    public static void stampaDueRettangoli(Rettangolo x, Rettangolo y){
        System.out.println("primo Rettangolo");
        System.out.println("area" + " " + clacolaArea(x));
        System.out.println("perimetro" + " " + clacolaPerimetro(x));
        System.out.println("secondo Rettangolo");
        System.out.println("area" + " " + clacolaArea(y));
        System.out.println("perimetro" + " " + clacolaPerimetro(y));
        int sommaPerimetro = Rettangolo.clacolaPerimetro(x) + Rettangolo.clacolaPerimetro(y);
        int sommaArea = Rettangolo.clacolaArea(x) + Rettangolo.clacolaArea(y);
        System.out.println("somma perimetro dei 2 ret:" +" "+ sommaPerimetro);
        System.out.println("somma area dei 2 ret:" +" "+ sommaArea);


    }
    public Rettangolo(int _altezza, int _larghezza){
        this.altezza=_altezza;
        this.larghezza= _larghezza;
    }
}
