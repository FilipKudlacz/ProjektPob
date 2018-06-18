import java.util.ArrayList;

public class Wedkarz {

    private int id, stanowisko, zewolenie;
    private Wędka wedka;
    private IWody gdzie;

    public Wedkarz( int _id, Wędka _wedka, int _zezwolenie){
        this.id = _id;
        this.wedka = _wedka;
        this.zewolenie = _zezwolenie;

    }

    public void idzNadWode(IWody _woda){
        if(_woda.jestMiejsce() == true && _woda.getType()<= this.zewolenie){
            this.stanowisko = _woda.zajmijStanowisko();
            this.gdzie = _woda;
        }
        else
            _woda.zajmijStanowisko();
    }

    public void zlapRybe(){
        Ryba zlapana = this.gdzie.sprobujZlapac(this.wedka);
        if (zlapana != null){
            System.out.println("Został złapany " + zlapana.getNazwa() + ", ta ryba ma " + zlapana.getWielkosc() + "kg. Gratulacje!");
        }
    }

    public void setZewolenie(int litera){
        this.zewolenie = litera;
    }

    public IWody getGdzie(){
        return gdzie;
    }

}
