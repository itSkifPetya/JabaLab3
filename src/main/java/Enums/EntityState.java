package Enums;

public enum EntityState {
    ALIVE("Живой"),
    NOTALIVE("Мёртв");

    private String title;

    EntityState(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
