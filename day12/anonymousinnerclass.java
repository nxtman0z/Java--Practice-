abstract class Animal {
    abstract void sound();
}

public class anonymousinnerclass {
    public static void main(String[] args) {

        Animal a = new Animal() {
            void sound() {
                System.out.println("Animal makes sound");
            }
        };
        a.sound();
    }
}
