package newpackage;

import org.springframework.stereotype.Component;

@Component
public class welcomeMessage {

    public String getwelcomeMessage(){
        return "Welcome to my Deployed springboot web app";
    }
}
