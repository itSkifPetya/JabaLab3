package Classes;

import Enums.EntityState;

public class MainHero extends Entity {
    protected final String name;

    public MainHero(String name, EntityState state) {
        super(name, state);
        this.name = name;
    }
}
