package EsercizioN1;

public class Main_Ret {
    public static void main(String[] arg){
        Rettangolo ret1 = new Rettangolo(2,4);
        Rettangolo ret2 = new Rettangolo(6,8);
        Rettangolo.stampaRettangolo(ret1);
        Rettangolo.stampaDueRettangoli(ret1,ret2);
    }
}
