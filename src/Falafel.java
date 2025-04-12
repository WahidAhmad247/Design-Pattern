public class Falafel extends Condement {

    Sandwich sandwich;
    public Falafel(Sandwich sandwich){
        this.sandwich = sandwich;
    }

    public String getDescription(){
        return sandwich.getDescription() + " Falafel";
    }

    public  double cost(){
        return 5 + sandwich.cost();
    }
}
