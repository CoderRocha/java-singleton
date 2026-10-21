package one.digitalinnovation.gof;

// singleton preguiçoso
public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getinstance() {
        return Holder.instance;
    }
}
