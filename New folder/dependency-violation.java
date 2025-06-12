class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}

class Switch {
    private LightBulb bulb = new LightBulb(); // depends on concrete class

    public void operate(boolean on) {
        if (on) {
            bulb.turnOn();
        } else {
            bulb.turnOff();
        }
    }
}
