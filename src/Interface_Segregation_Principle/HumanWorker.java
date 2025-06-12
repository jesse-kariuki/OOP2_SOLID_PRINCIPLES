package Interface_Segregation_Principle;

public class HumanWorker implements Workable, Eatable, Drivable {
    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void drive() {
        System.out.println("Human is driving");
    }
}

