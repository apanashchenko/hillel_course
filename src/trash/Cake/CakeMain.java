package trash.Cake;

/**
 * Created by alpa on 2019-06-30
 */
public class CakeMain {

    public static void main(String[] args) {
        Cake cake = new Cake("Chocolate cake", 4.0, 10.0, 30.0, 4);
        System.out.println(cake);
        Cake cakeNew = new Cake("Chocolate cake", 4.0, 10.0, 30.0, 4);
        System.out.println(cake.equals(cakeNew));

        Cake cake2 = new Cake();
        cake2.setName("Chocolate cake 2");
        cake2.setWeight(5.0);
        cake2.setHeight(15.0);
        cake2.setWidth(35.0);
        cake2.setLayerNumber(3);
        System.out.println(cake2.toString());

        Cake cake3 = new Cake("New name");
        System.out.println(cake3.toString());

    }
}
