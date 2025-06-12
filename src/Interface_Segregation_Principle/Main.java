package Interface_Segregation_Principle;

public class Main {
    public static void main(String[] args) {
        // Robot only implements Workable
        Workable robot = new Simple_Robot();
        robot.work();

        System.out.println();

        // HumanWorker implements Workable, Eatable, Drivable
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();
        human.drive();
    }
}

