package trash;

/**
 * Created by alpa on 2019-06-30
 */
public class BackaryMain {

    public static void main(String[] args) {
        Cake cake = new Cake("Chocolate cake", 4.0, 10.0, 30.0, 4);

        AbstractBackery backery = new FransuaBackery();
        backery.showInfo(cake);
        backery.bake(cake);
        backery.showInfo(cake);


    }
}
