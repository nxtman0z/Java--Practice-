final class Vehicle {   

    final int speedLimit = 80;  
    final void showSpeedLimit() {  
        System.out.println("Speed Limit is: " + speedLimit);
    }
}

public class finalkey {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.showSpeedLimit();
    }
}
