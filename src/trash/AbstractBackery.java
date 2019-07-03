package trash;

/**
 * Created by alpa on 2019-06-30
 */
public abstract class AbstractBackery {

    public abstract Cake bake(Cake cake);


    public void showInfo(Cake cake) {
        System.out.println(cake.toString());
    }
}
