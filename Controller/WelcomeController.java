package Controller;

import Model.User;
import View.WelcomeView;

public class WelcomeController {
    private WelcomeView welcomeView;

    // Constructor
    public WelcomeController(WelcomeView welcomeView) {
        this.welcomeView = welcomeView;
    }

    public void displayWelcomePage(User user) {
        welcomeView.showWelcomePage(user);
        if (user.getRole().equals("manager")) {
            welcomeView.showRestrictedPage();
        }
    }
}
