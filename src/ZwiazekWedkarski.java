import java.util.ArrayList;
import java.util.List;

public class ZwiazekWedkarski implements IWlasciciel{

    String miejscowosc;
    List<IWody> wodyZwiazku = new ArrayList();


    public ZwiazekWedkarski(String _miejscowosc){
        this.miejscowosc = _miejscowosc;
    }

    @Override
    public void podniesJakoscWody(IWody woda, int ilosc) {
        if(ilosc > 0){
            if(wodyZwiazku.contains(woda)){
                woda.increaseQuality(ilosc);
            }
        }
    }

    @Override
    public void nadajZezwolenie(Wedkarz wedkarz, int liczba){
        wedkarz.setZewolenie(liczba);
    }
    @Override
    public void dodajWode(IWody woda){
        this.wodyZwiazku.add(woda);
    }
}
