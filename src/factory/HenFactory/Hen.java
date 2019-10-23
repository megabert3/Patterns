package factory.HenFactory;

public abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    public String getDescription(){
        return "Я - курица.";
    }
}