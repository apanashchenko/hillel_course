package trash.lec_13.Enums;

public enum Roles {
    ALL("ALL description"), PARTIAL("Partial description", 123);

    private String description;
    private int number;

    Roles(String description, int number) {
        this.description = description;
        this.number = number;
    }

    Roles(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return number;
    }
}
