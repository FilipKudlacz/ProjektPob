import java.util.Random;

public class Ryba {
    Random rand = new Random();

    private String nazwa;
    private int szansaDrap, szansaNDrap;
    private static int wielkosc;

    public Ryba(String _nazwa){
        this.nazwa = _nazwa;

        switch(this.nazwa){
            case"karp":
                this.szansaDrap = 0;
                this.szansaNDrap = 40;
                this.wielkosc = rand.nextInt(10)+1;
                break;

            case"szczupak":
                this.szansaDrap = 30;
                this.szansaNDrap = 0;
                this.wielkosc = rand.nextInt(7)+1;
                break;

            case"Okoń":
                this.szansaNDrap = 20;
                this.szansaDrap = 25;
                this.wielkosc = rand.nextInt(2)+1;
                break;

            case"sum":
                this.szansaNDrap = 10;
                this.szansaDrap = 30;
                this.wielkosc = rand.nextInt(30)+1;
                break;

            case"lin":
                this.szansaNDrap = 40;
                this.szansaDrap = 0;
                this.wielkosc = rand.nextInt(3)+1;
                break;
        }
    }

    public int szansaZlapania(Wędka wedka){
        switch(wedka.getRodzaj()){
            case"splawik":
                return this.szansaNDrap*wedka.getJakosc();
            case"grunt":
                return this.szansaNDrap*wedka.getJakosc();
            case"spinning":
                return this.szansaDrap*wedka.getJakosc();
            default:
                return 0;
        }
    }
    public int getWielkosc(){
        return this.wielkosc;
    }

    public String getNazwa(){
        return this.nazwa;
    }
}
