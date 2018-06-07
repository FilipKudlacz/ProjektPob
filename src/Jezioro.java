public class Jezioro implements IWody {

    private String nazwa, typ = "3";
    private int liczbaRyb, jakoscWody, liczbaStanowisk, liczbaWolnychStanowisk;

    public Jezioro(String _nazwa, int _jakoscWody, int _iloscRyb, int _liczbaStanowisk){
        this.liczbaRyb = _iloscRyb;
        this.jakoscWody = _jakoscWody;
        this.liczbaStanowisk = _liczbaStanowisk;
        this.nazwa = _nazwa;
        this.liczbaWolnychStanowisk = this.liczbaStanowisk;
    }

    public int zajmijStanowisko(){
        if(liczbaWolnychStanowisk > 0){
            liczbaWolnychStanowisk --;
            return (liczbaStanowisk-liczbaWolnychStanowisk +1);
        }else
            System.out.println("Na stawie " + this.nazwa + " zabrakło miejsca");
            return 0;
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
    public void decFIshNumber(int liczba) {
        this.liczbaRyb -= liczba;
    }

    @Override
    public boolean jestMiejsce() {
        if(liczbaWolnychStanowisk>0)
            return true;
        else
            return false;
    }
    @Override
    public String getType(){
        return typ;
    }
}
