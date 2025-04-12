public class Wurst extends Condement {

    Sandwich sandwich;
    public Wurst(Sandwich sandwich){
        this.sandwich = sandwich;
    }

    public String getDescription(){
        return sandwich.getDescription() + " Wurst";
    }

    public  double cost(){
        return 10 + sandwich.cost();
    }
}
