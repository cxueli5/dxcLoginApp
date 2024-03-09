import Controller.LoginController;
import Controller.WelcomeController;
import Model.Database;
import Model.User;
import View.LoginView;
import View.WelcomeView;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        WelcomeView welcomeView = new WelcomeView();
        Database database = new Database();

        LoginController loginController = new LoginController(loginView, welcomeView, database);
        WelcomeController welcomeController = new WelcomeController(welcomeView);

        User user = loginController.loginAuthentication();
        if (user != null) {
            welcomeController.displayWelcomePage(user);
        }
    }
}