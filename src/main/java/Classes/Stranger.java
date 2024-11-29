package Classes;

import Enums.EntityState;

public class Stranger extends Entity {
    protected EntityState state;

    public Stranger(String name, EntityState state) {
        super(name, state);
        this.state = state;
    }
}
