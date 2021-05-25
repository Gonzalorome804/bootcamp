package globant.appFarmer.entities.interfaces;

public interface Being<T> {
    void breathe();
    void eat();
    void sleep();
    T gaveBirth();
}
