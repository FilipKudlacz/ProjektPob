import java.util.ArrayList;

public class Wedkarz {

    int id, stanowisko, zewolenie;
    Wędka wedka;

    public Wedkarz( int _id, Wędka _wedka, int _zezwolenie){
        this.id = _id;
        this.wedka = _wedka;
        this.zewolenie = _zezwolenie;

    }

    public void idzNadWode(IWody _woda){
        if(_woda.jestMiejsce() == true && _woda.getType()< this.zewolenie){
            this.stanowisko = _woda.zajmijStanowisko();
        }
        else
            _woda.zajmijStanowisko();
    }

    public void setZewolenie(int litera){
        this.zewolenie = litera;
    }

}
