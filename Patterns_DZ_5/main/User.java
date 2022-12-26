
public class User {
    public userRole role = userRole.admin;
    static public User user = new User();

    private User() {}
    static public User getUser() {
        return user;
    }
}
