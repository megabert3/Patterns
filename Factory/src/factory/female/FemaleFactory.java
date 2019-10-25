package factory.female;

import factory.AbstractFactory;
import factory.Human;

public class FemaleFactory implements AbstractFactory {
    public Human getPerson(int age){
        if (age <= 12){
            return new KidGirl();
        }else if (age <= 19){
            return new TeenGirl();
        }else return new Woman();
    }
}
