import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Rzeka implements IWody{


    private int liczbaRyb, jakoscWody,typ = 1;
    private List<Ryba> ryby;
    private String nazwa;

    public Rzeka(String _nazwa, int _jakoscWody, int _iloscRyb, List<Ryba> _ryby){
        this.liczbaRyb = _iloscRyb;
        this.jakoscWody = _jakoscWody;
        this.nazwa = _nazwa;
        this.ryby = _ryby;

    }

    public Ryba sprobujZlapac(Wędka wedka){
        if (this.jakoscWody <6){
            int wiecej = 6 - jakoscWody;
            System.out.println("Łowisko zamknięte z powodu zbyt słabej jakości wody. Zwiększ jakoś wody przynajmniej o " + wiecej + ".");
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
        }else{
            System.out.println("W rzece " + nazwa + " nie ma już ryb.");
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
        if(this.jakoscWody > 10)
            this.jakoscWody = 10;
    }

    @Override
    public int getFN() {
        return this.liczbaRyb;
    }


    @Override
    public boolean jestMiejsce() {
        return true;
    }

    public int zajmijStanowisko() {
        return 1;
    }
    @Override
    public int getType(){
        return typ;
    }

    @Override
    public void increaseFN(int ile) {
        this.liczbaRyb = liczbaRyb + ile;
    }
}
