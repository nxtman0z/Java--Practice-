public class downcasting {
    public static void main(String[] args) {
        Animal a = new Dog();   // Upcasting

        Dog d = (Dog) a;        // ✅ Downcasting
        d.fetch();              // Dog is fetching
    }
}
