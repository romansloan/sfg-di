package guru.springframework.sfgdi.services;

public class PropertyGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World from Property";
    }

}
