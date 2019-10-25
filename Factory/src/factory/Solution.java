package factory;

import factory.female.FactoryProducer;

public class Solution {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.FEMALE);
        System.out.println(abstractFactory.getPerson(13));
    }
}
