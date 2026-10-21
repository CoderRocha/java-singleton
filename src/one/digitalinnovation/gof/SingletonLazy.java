package one.digitalinnovation.gof;

// singleton preguiçoso
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getinstance() {

        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
