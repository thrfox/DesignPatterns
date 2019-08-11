package Decorator;

/**
 * 穿衣服 装饰类
 */
public class WearClothes extends Person {
    protected Person person;

    public void wearClothes(Person person) {
        this.person = person;
    }

    @Override
    public void wearClothes() {
        person.wearClothes();
    }
}
