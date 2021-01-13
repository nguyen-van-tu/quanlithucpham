import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaterialManager m = new MaterialManager();
        Scanner sc = new Scanner(System.in);
        int index;
        do {
            System.out.println("1: CrispyFloor");
            System.out.println("2: Meat");
            index = Integer.parseInt(sc.nextLine());
            switch (index) {
                case 1:
                    System.out.println(m.totalPriceCrispyFloor());
                    break;
                case 2:
                    System.out.println(m.totalPriceMeat());
                    break;
            }
        } while (index != 0);
    }
}