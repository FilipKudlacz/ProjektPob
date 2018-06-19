import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class StawPrywatny implements IWody {

    private String nazwa;
    private int liczbaRyb, jakoscWody, liczbaStanowisk, liczbaWolnychStanowisk, typ = 2;
    private List<Ryba> ryby;
    private IWlasciciel wlasciciel;

    public StawPrywatny(String _nazwa, int _jakoscWody, int _iloscRyb, int _liczbaStanowisk, List<Ryba> _ryby, IWlasciciel wlasciciel){
        this.liczbaRyb = _iloscRyb;
        this.jakoscWody = _jakoscWody;
        this.liczbaStanowisk = _liczbaStanowisk;
        this.nazwa = _nazwa;
        this.liczbaWolnychStanowisk = this.liczbaStanowisk;
        this.ryby = _ryby;
        this.wlasciciel = wlasciciel;
    }

    public int zajmijStanowisko(){
        if(liczbaWolnychStanowisk > 0){
            liczbaWolnychStanowisk --;
            return (liczbaStanowisk-liczbaWolnychStanowisk +1);
        }else
            System.out.println("Na prywatnym stawie " + this.nazwa + " zabrakło miejsc");
            return 0;
    }
    public Ryba sprobujZlapac(Wędka wedka){
        if(this.jakoscWody < 5){
            System.out.println("Łowisko zakmnięte z powowdu zbyt słabej jakości wody");
            return null;
        }
        if (this.liczbaRyb > 0){
            for (int i=0; i<ryby.size();i++){
                int szansa = ryby.get(i).szansaZlapania(wedka);
                int random = ThreadLocalRandom.current().nextInt(0,100+1);
                if(random <= szansa){
                    this.liczbaRyb--;
                    return ryby.get(i);
                }
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return this.nazwa;
    }

    @Override
    public int getQuality() {
        return this.jakoscWody;
    }

    @Override
    public void increaseQuality(int liczba) {
        this.jakoscWody += liczba;
    }

    @Override
    public int getFN() {
        return this.liczbaRyb;
    }

    @Override
    public boolean jestMiejsce() {
        if (liczbaWolnychStanowisk > 0){
            return true;
        }else
            return false;
    }

     @Override
    public int getType(){
        return typ;
     }

    @Override
    public void increaseFN(int ile) {
        this.liczbaRyb = liczbaRyb + ile;
    }

    public IWlasciciel getWlasciciel() {
        return wlasciciel;
    }
}
