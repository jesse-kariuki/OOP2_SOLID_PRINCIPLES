public class Main {
    public static void main(String[] args) {
        Switch mySwitch = new Switch(); // cannot choose what device it controls
        mySwitch.operate(true);  // Output: LightBulb is ON
        mySwitch.operate(false); // Output: LightBulb is OFF
    }
}
