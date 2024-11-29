package Classes;

import Abstracts.Objct;
import Enums.EntityState;

public abstract class Entity extends Objct {
    private EntityState state;
    private final String name;

    public Entity(String name, EntityState state) {
        super(name);
        this.state = state;
        this.name = name;
    }

    public void setState(EntityState state) {
        System.out.print("[Изменение EntityState] ");
        if (this.state != state){
            this.state = state;
        } else {
            System.out.print(textColor);
            System.out.printf("%s и так %s", this.name, this.state);
            System.out.println(textColorReset);
        }
    }
}
