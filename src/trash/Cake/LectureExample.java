package trash.Cake;

/**
 * Created by alpa on 2019-06-28
 */
public class LectureExample {


    public static void main(String[] args) {
        Pet cat = new Pet(1, "Mike");
        Pet cat2 = new Pet(1, "Mike");

        System.out.println("cat == cat2: " + (cat == cat2));
        System.out.println("cat.equals(cat2): " + cat.equals(cat2));

        Pet cat3 = cat;
        System.out.println("cat == cat3: " + (cat == cat3));
        System.out.println("cat.equals(cat3): " + cat.equals(cat3));
    }
}
