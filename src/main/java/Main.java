import Classes.MainHero;
import Classes.Entity;
import Enums.EntityState;

public class Main {
    public static void main(String[] args) {

        Entity booba = new MainHero("Booba", EntityState.ALIVE);
        booba.setState(EntityState.ALIVE);
    }
}
