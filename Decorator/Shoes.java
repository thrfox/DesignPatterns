package Decorator;

public class Shoes extends WearClothes {


    @Override
    public void wearClothes() {
        System.out.println("穿上鞋");
        super.wearClothes();
    }
}
