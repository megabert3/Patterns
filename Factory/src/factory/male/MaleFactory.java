package factory.male;

import factory.AbstractFactory;
import factory.Human;

public class MaleFactory implements AbstractFactory {
    public Human getPerson(int age){
        if (age <= 12){
            return new KidBoy();
        }else if (age <= 19){
            return new TeenBoy();
        }else return new Man();
    }
}