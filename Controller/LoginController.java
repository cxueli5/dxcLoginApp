package Controller;

import Model.Database;
import Model.User;
import View.LoginView;
import View.WelcomeView;

public class LoginController {
    private LoginView loginView;
    private WelcomeView welcomeView;
    private Database database;

    // Constructor
    public LoginController(LoginView loginView, WelcomeView welcomeView, Database database) {
        this.loginView = loginView;
        this.welcomeView = welcomeView;
        this.database = database;
    }

    public User loginAuthentication() {
        String username = loginView.usernameInput();
        String password = loginView.passwordInput();
        User authenticateUser = database.getUserDatabase(username, password);
        if (authenticateUser!=null) {
            return authenticateUser;
        } else {
            loginView.displayErrorMsg();
            return null;
        }
    }
}