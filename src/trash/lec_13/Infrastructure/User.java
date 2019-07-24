package trash.lec_13.Infrastructure;

public class User {
    private  String name;
    private  String email;
    private int age;

   /* public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }*/

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    static class Builder{
        private User user;
        public Builder(){
            this.user = new User();
        }

        public  Builder withName(String name){
            this.user.name = name;
            return this;
        }

        public  Builder withEmail(String email){
            this.user.email = email;
            return this;
        }

        public  Builder withAge(int age){
            this.user.age = age;
            return this;
        }

        public  User build(){
            return this.user;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "user=" + user +
                    '}';
        }
    }
}
