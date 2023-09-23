package hw.task5;

public class UsGen implements Shape{

//    static void test(Gen<? extends D> o) {
//        // ...
//    }
//    static void test(Gen<? extends C> o) {
//        // ...
//    }
    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();

    Gen<A> genA = new Gen<A>(a);
    Gen<B> genB = new Gen<B>(b);
    Gen<C> genC = new Gen<C>(c);
    Gen<D> genD = new Gen<D>(d);

    @Override
    public void test() {
        System.out.println(genA.toString());
        System.out.println(genB.toString());
        System.out.println(genC.toString());
        System.out.println(genD.toString());
    }
}
