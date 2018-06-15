public class Rzeka implements IWody{


    private int liczbaRyb, jakoscWody,typ = 1;
    private String nazwa;

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
        if(this.jakoscWody > 10)
            this.jakoscWody = 10;
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
    public int getType(){
        return typ;
    }
}
