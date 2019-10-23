package factory.HenFactory;
/*
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.print(hen.getDescription());
    }

    static class HenFactory {
        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals("Ukraine")) return  hen = new UkrainianHen();
            else if (country.equals("Russia")) return hen = new RussianHen();
            else if (country.equals("Moldova")) return hen = new MoldovanHen();
            else if (country.equals("Belarus")) return hen = new BelarusianHen();
            else return hen;
        }
    }
}
