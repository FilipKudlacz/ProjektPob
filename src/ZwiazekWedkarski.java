import java.util.ArrayList;
import java.util.List;

public class ZwiazekWedkarski implements IWlasciciel{

    String miejscowosc;
    private List<IWody> wodyZwiazku = new ArrayList();


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
    public List<IWody> getWodyZwiazku(){
        return this.wodyZwiazku;
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
