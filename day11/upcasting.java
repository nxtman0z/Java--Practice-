class Animal{
    void sound(){
        System.out.println("Animal sounds");
    }

    void fetch() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
    void fetch(){
        System.out.println("dog is fetching");
    }
}

public class upcasting {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.fetch();
    }
}
