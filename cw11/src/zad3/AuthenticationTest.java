package zad3;

public class AuthenticationTest {
    public static void main(String[] args) {
        AdminAuthentication admin = new AdminAuthentication();
        UserAuthentication user = new UserAuthentication();
        admin.login("admin", "qwerty123$%");
        admin.resetPassword("admin", "qwerty123$%", "zaq1@WSX");
        admin.logout();
        user.login("jacek", "jacek1999");
        user.resetPassword("jacek", "jacek1999", "qwerty12#");
        user.logout();
    }
}
