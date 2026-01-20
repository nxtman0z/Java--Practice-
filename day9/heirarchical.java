class A {
    void show() {
        System.out.println("Parent A");
    }
}

class B extends A {
}

class C extends A {
}

public class heirarchical {
    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();
        obj1.show();
        obj2.show();
    }
}
