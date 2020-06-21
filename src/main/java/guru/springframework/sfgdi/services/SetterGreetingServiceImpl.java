package guru.springframework.sfgdi.services;

public class SetterGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World from Setter";
    }
}
