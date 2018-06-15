import java.util.ArrayList;
import java.util.List;

public class Wędka {

    List<String> rodzaje = new ArrayList();
    String rodzaj;

    private int jakosc;

    public Wędka(String _rodzaj, int _jakosc){
        rodzaje.add("splawik");
        rodzaje.add("grunt");
        rodzaje.add("spinning");
        this.jakosc = _jakosc;
        if(rodzaje.contains(_rodzaj)){
            this.rodzaj = _rodzaj;
        }else
            System.out.println("Podano zły rodzaj wędki!");


    }

    public int getJakosc() {
        return jakosc;
    }

    public String getRodzaj() {
        return rodzaj;
    }
}
