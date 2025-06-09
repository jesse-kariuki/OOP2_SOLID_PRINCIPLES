package Open_Closed_Principle;
// creating a class that violates OCP
public class Notificationservice {
    public void send(String type,String message){
        if (type.equals("email")){
            System.out.println("Email sent:"+message);
        } else if (type.equals("push")) {
            System.out.println("Push notification sent:"+message);

        }//ADDING SMS  ONE MUST MODIFY THIS CLASS
        //HARDER TO MAINTAIN
    }
}
