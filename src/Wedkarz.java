import java.util.ArrayList;

public class Wedkarz {

    int id, stanowisko;
    String zewolenie;
    Wędka wedka;

    public Wedkarz( int _id, Wędka _wedka, String _zezwolenie){
        this.id = _id;
        this.wedka = _wedka;
        this.zewolenie = _zezwolenie;

    }

    public void idzNadWode(IWody _woda){
        if(_woda.jestMiejsce() == true){
            this.stanowisko = _woda.zajmijStanowisko();
        }
        else
            _woda.zajmijStanowisko();
    }

}
