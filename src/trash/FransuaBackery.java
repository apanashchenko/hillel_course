package trash;

/**
 * Created by alpa on 2019-06-30
 */
public class FransuaBackery extends AbstractBackery {

    @Override
    public Cake bake(Cake cake) {
        cake.setBakaryName("Fransua");
        return cake;
    }
}
