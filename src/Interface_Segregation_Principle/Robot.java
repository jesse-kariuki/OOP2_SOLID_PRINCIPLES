package Interface_Segregation_Principle;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot doesn't eat");
    }

    @Override
    public void drive() {
        throw new UnsupportedOperationException("Robot can't drive");
    }
}

/*

}

 */


