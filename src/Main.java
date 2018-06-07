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

        Wędka wedka = new Wędka();
        StawPrywatny Staw = new StawPrywatny("Blazeja", 5, 10, 3);
        Wedkarz Ja = new Wedkarz(1, wedka, "D");
    }
}
