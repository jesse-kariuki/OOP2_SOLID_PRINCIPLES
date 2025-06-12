public class Main {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb();
        Switch mySwitch = new Switch(bulb);
        
        mySwitch.operate(true);  // Output: LightBulb is ON
        mySwitch.operate(false); // Output: LightBulb is OFF
    }
}
