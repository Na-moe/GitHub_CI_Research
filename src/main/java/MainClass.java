import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ArrayList<ArrayList<Cuboid>> boxes =
                new ArrayList<ArrayList<Cuboid>>();
        for (int i = 0; i < a; ++i) {
            ArrayList<Cuboid> arrayList = new ArrayList<Cuboid>();
            boxes.add(arrayList);
        }
        for (int i = 0; i < b; i++) {
            int operator = scanner.nextInt();
            int num = scanner.nextInt();
            if (operator == 1) {
                double tmp = 0;
                for (Cuboid box: boxes.get(num - 1)
                     ) {
                    if (box.getVolume() > tmp) {
                        tmp = box.getVolume();
                    }
                }
                System.out.println(tmp);
            }
            else if (operator == 2) {
                double tmp = 0;
                for (Cuboid box: boxes.get(num - 1)
                     ) {
                    tmp += box.getVolume();
                }
                System.out.println(tmp);
            }
            else if (operator == 3) {
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                Cuboid newbox = new Cuboid(length, width, height);
                boxes.get(num - 1).add(newbox);
            }
        }
    }
}
