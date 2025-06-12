// Abstraction
interface Switchable {
    void turnOn();
    void turnOff();
}

// Concrete implementation
class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}

// High-level module depends on abstraction
class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(boolean on) {
        if (on) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}
