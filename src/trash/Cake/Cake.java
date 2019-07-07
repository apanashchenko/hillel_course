package trash.Cake;

import java.util.Objects;

/**
 * Created by alpa on 2019-06-30
 */
public class Cake {

    private String name;
    private double width;
    private double height;
    private double weight;
    private int layerNumber;
    private ILogger logger;
    private String bakaryName;


    public Cake() {

    }

    public Cake(ILogger logger) {
        this.logger = logger;

    }

    public Cake(String name) {
        this.name = name;
    }

    public Cake(String name, double width, double height, double weight, int layerNumber) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.layerNumber = layerNumber;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLayerNumber() {
        return layerNumber;
    }

    public void setLayerNumber(int layerNumber) {
        this.layerNumber = layerNumber;
    }

    public String getBakaryName() {
        return bakaryName;
    }

    public void setBakaryName(String bakaryName) {
        this.bakaryName = bakaryName;
    }

    public void print() {
        logger.log(toString());
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", layerNumber=" + layerNumber +
                ", bakaryName=" + bakaryName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cake)) return false;
        Cake cake = (Cake) o;
        return Double.compare(cake.getWidth(), getWidth()) == 0 &&
                Double.compare(cake.getHeight(), getHeight()) == 0 &&
                Double.compare(cake.getWeight(), getWeight()) == 0 &&
                getLayerNumber() == cake.getLayerNumber() &&
                Objects.equals(getName(), cake.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWidth(), getHeight(), getWeight(), getLayerNumber());
    }
}
