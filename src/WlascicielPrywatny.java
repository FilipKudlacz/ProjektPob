import java.util.ArrayList;
import java.util.List;

public class WlascicielPrywatny implements IWlasciciel {

    private String name, number;
    private List<IWody> wodyPrywatne = new ArrayList();

    public WlascicielPrywatny(String name, String number){
        this.name = name;
        this.number = number;
    }

    @Override
    public void podniesJakoscWody(IWody woda, int liczba) {
        if (liczba > 1) {
            if (wodyPrywatne.contains(woda)) {
                woda.increaseQuality(liczba);
            }
        }
    }

    @Override
    public void nadajZezwolenie(Wedkarz wedkarz, int liczba) {
        wedkarz.setZewolenie(liczba);
    }

    @Override
    public void dodajWode(IWody woda) {
        this.wodyPrywatne.add(woda);
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }
}
