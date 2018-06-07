public class Rzeka implements IWody{


    private int liczbaRyb, jakoscWody;
    private String nazwa, typ = "1";

    public Rzeka(String _nazwa, int _jakoscWody, int _iloscRyb){
        this.liczbaRyb = _iloscRyb;
        this.jakoscWody = _jakoscWody;
        this.nazwa = _nazwa;

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
        return true;
    }

    public int zajmijStanowisko() {
        return 1;
    }
    @Override
    public String getType(){
        return typ;
    }
}
