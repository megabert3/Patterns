package factory.HenFactory;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
