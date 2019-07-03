package trash;


/**
 * Created by alpa on 2019-06-28
 */
public class Pet {

    private int id;
    private String name;

    public Pet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return id == pet.id &&
                name.equals(pet.name);
    }

}
