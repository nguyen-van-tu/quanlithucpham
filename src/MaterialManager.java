import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaterialManager {
    ArrayList<CrispyFloor> crispyFloors = new ArrayList<>();
    ArrayList<Meat> meats = new ArrayList<>();

    public MaterialManager() {
        CrispyFloor c1 = new CrispyFloor("01", "c1", LocalDate.of(2021, 1, 11), 10000, 1.2);
        CrispyFloor c2 = new CrispyFloor("02", "c1", LocalDate.of(2021, 1, 10), 12000, 1.2);
        CrispyFloor c3 = new CrispyFloor("03", "c1", LocalDate.of(2021, 1, 13), 14000, 1.2);
        CrispyFloor c4 = new CrispyFloor("04", "c1", LocalDate.of(2021, 1, 13), 16000, 1.2);
        CrispyFloor c5 = new CrispyFloor("05", "c1", LocalDate.of(2021, 1, 13), 18000, 1.2);

        Meat m1 = new Meat("01", "m1", LocalDate.of(2021, 1, 11), 10000, 2.0);
        Meat m2 = new Meat("01", "m1", LocalDate.of(2021, 1, 12), 13000, 2.0);
        Meat m3 = new Meat("01", "m1", LocalDate.of(2021, 1, 11), 15000, 2.0);
        Meat m4 = new Meat("01", "m1", LocalDate.of(2021, 1, 10), 17000, 2.0);
        Meat m5 = new Meat("01", "m1", LocalDate.of(2021, 1, 11), 19000, 2.0);

        crispyFloors = new ArrayList<CrispyFloor>(Arrays.asList(c1, c2, c3, c4, c5));
        meats = new ArrayList<Meat>(Arrays.asList(m1, m2, m3, m4, m5));
    }
        public double totalPriceCrispyFloor(){
        double a =0;
            for (CrispyFloor crispyFloor : crispyFloors) {
                a += (crispyFloor.getAmount() - crispyFloor.getRemainAmount());
            }
            return a;
        }
    public double totalPriceMeat(){
        double b =0;
        for (Meat meat : meats) {
            b += (meat.getAmount() - meat.getRemainAmount());
        }
        return b;
    }
}
