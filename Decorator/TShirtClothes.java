package Decorator;

public class TShirtClothes extends WearClothes {


    @Override
    public void wearClothes() {
        System.out.println("穿上TShirt");
        super.wearClothes();
    }
}
