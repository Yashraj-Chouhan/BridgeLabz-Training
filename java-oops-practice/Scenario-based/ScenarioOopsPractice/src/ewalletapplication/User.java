package ewalletapplication;

public class User {
    private String userId;
    private String name;

    User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

