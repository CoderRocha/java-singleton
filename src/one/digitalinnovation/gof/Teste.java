package one.digitalinnovation.gof;

public class Teste {

    public static void main(String[] args) {
        // testes relacionados ao design pattern 'singleton'
        SingletonLazy lazy = SingletonLazy.getinstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getinstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getinstance();
        System.out.println(eager);
        eager = SingletonEager.getinstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getinstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getinstance();
        System.out.println(lazyHolder);
    }
}
