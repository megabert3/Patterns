package factory.female;

import factory.AbstractFactory;
import factory.male.MaleFactory;

public class FactoryProducer {
    public enum HumanFactoryType{
        MALE,
        FEMALE
    }

    public static AbstractFactory getFactory(HumanFactoryType humanFactoryType){
        if (humanFactoryType.equals(HumanFactoryType.MALE)) return new MaleFactory();
        else return new FemaleFactory();
    }

}
