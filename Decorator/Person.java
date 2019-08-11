package Decorator;

/**
 * 装饰器被装饰类
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    /**
     * 穿衣服
     *
     * @return
     */
    public void wearClothes() {
        System.out.println(name + "穿上衣服");
    }
}
