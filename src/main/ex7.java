interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Home: The living room lights are turned ON.");
    }
    public void turnOff() {
        System.out.println("Smart Home: The living room lights are turned OFF.");
    }
}

class Fan implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Home: Fan speed set to default. Fan is now ON.");
    }
    public void turnOff() {
        System.out.println("Smart Home: Ceiling Fan stopped. Fan is now OFF.");
    }
}

class AirConditioner implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Home: AC configured to cooling mode. AC is now ON.");
    }
    public void turnOff() {
        System.out.println("Smart Home: Compressor stopped. AC is now OFF.");
    }
}

public class ex7 {
    public static void main(String[] args) {
       
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();
        AirConditioner bedroomAC = new AirConditioner();

        
        livingRoomLight.turnOn();
        ceilingFan.turnOn();
        bedroomAC.turnOn();
        
        System.out.println(); 
        
        bedroomAC.turnOff();
    }
}
