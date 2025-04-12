public class GreenVegetable extends Condement {

    Sandwich sandwich;
    public GreenVegetable(Sandwich sandwich){
        this.sandwich = sandwich;
    }

    public String getDescription(){
        return sandwich.getDescription() + " GreenVegetable";
    }

    public  double cost(){
        return 3 + sandwich.cost();
    }
}
