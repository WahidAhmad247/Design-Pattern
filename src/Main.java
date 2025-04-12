import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Sandwich san = new Simple();
        System.out.println("Welcome to Our Restaurant .\n Please, do you have any order");
        System.out.println("our menu : \n 1:Simple Sandwich  cost:30AF \n 2:Double Sandwich   cost:60AF \n 3:Especial Sandwich  cost:80AF \n" +
                "for Simple Sandwich Enter 1 , For Double Sandwich Enter 2 and for Especial Sandwich Enter 3");
        int FirstOrder = user.nextInt();
        if(FirstOrder == 1){
            Sandwich sim = new Simple();
            System.out.println("Than you for your order \n" + sim.getDescription() + " "  + sim.cost() + " AF");
        }else if(FirstOrder == 2){
            Sandwich Dob = new Doble();
            System.out.println( "Than you for your order \n" +Dob.getDescription() +  " " + Dob.cost()+ " AF");

        }else if(FirstOrder == 3){

            Sandwich es = new Especial();
            System.out.println("Than you for your order\n " + es.getDescription()+  " " + es.cost() + " AF");
        }else {


            System.out.println("you Enterd a invalid number . please Enter A valid number between 1 to 3 . try Again");
        }




    System.out.println("Thanks for your order");

    }
}