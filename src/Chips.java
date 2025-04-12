public class Chips extends Condement {

    Sandwich sandwich;
    public Chips(Sandwich sandwich){

        this.sandwich = sandwich;
    }

    public String getDescription(){
        return sandwich.getDescription() + " Chips";
    }

    public  double cost(){
        return 20 + sandwich.cost();
    }
}
