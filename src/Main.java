import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Ryba szczupak = new Ryba("szczupak");
        Ryba sum = new Ryba("sum");
        Ryba okon = new Ryba("okon");

        List<Ryba> drapiezne = new ArrayList();
        drapiezne.add(szczupak);
        drapiezne.add(okon);
        drapiezne.add(sum);

        Wędka wedka = new Wędka("spinning", 1);

        Jezioro kiekrz = new Jezioro("Kierskie",8, 120, 30, drapiezne);
        Rzeka warta = new Rzeka("Warta", 3, 300, drapiezne);
        StawPrywatny Staw = new StawPrywatny("Blazeja", 5, 50, 3, drapiezne);

        Wedkarz Ja = new Wedkarz(1, wedka, 1);

        ZwiazekWedkarski ZWPoznan = new ZwiazekWedkarski("Poznan");
        ZWPoznan.nadajZezwolenie(Ja,3);
        ZWPoznan.dodajWode(warta);
        ZWPoznan.podniesJakoscWody(warta,2);

        Ja.idzNadWode(kiekrz);
        System.out.println("Jestem nad " + Ja.getGdzie().getName());
        Ja.zlapRybe();
    }
}
