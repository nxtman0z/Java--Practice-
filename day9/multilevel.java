class A {
    void a() {
        System.out.println("A");
    }
}

class B extends A {
    void b() {
        System.out.println("B");
    }
}

class C extends B {
    void c() {
        System.out.println("C");
    }
}

public class multilevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.a();
        obj.b();
        obj.c();
    }
}
