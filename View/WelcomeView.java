package View;

import Model.User;

public class WelcomeView {
    public void showWelcomePage(User user) {
        System.out.println("Welcome, " + user.getName() + "!");
        System.out.println("Your username is " + user.getUsername());
        System.out.println("Your role is " + user.getRole());

        // if (user.getRole().equals("manager")) {
        //     System.out.println("Access restricted page: /restricted");
        // }
    }

    public void showRestrictedPage() {
        System.out.println("Link to restricted webpage: /restricted");
    }
}
