package Interface_Segregation_Principle;

public class Simple_Robot implements Workable {

    @Override
    public void work() {
        System.out.println("Robot is working");


    }
}