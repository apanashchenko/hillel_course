package trash.lec_13.Enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(Users.ADMIN);
        System.out.println(Users.USER);
        System.out.println(Users.LOGGED_USER);

        Users[] users = Users.values();
        for(Users user: users){
            System.out.println(users);
        }

        Users admin = Users.valueOf("ADMIN");
        System.out.println(admin);
        System.out.println(admin.ordinal());
        System.out.println(admin.name());



        Users loggedUser = Users.valueOf("LOGGED_USER");
        System.out.println(loggedUser);

        Users user = Users.valueOf(Users.class,"USER");
        System.out.println(user);

        Roles all = Users.valueOf(Roles.class, "ALL");
        System.out.println(all);
        System.out.println(all.getDescription());

        Roles partial = Users.valueOf(Roles.class, "PATIAL");
        System.out.println(partial);
        System.out.println(partial.getDescription());


    }

    public static void showUser(Users user){
        switch (user){
            case ADMIN:
                System.out.println("Admin");
            case USER:
                System.out.println("User");
            case LOGGED_USER:USER:
                System.out.println("Logged user");
        }
    }
}
