package Decorator;

public class Main {

    public static void main(String[] args) {
        Person handsomeGuy = new Person("帅哥");

        // 穿上TShirt
        TShirtClothes tShirtGuy = new TShirtClothes();
        tShirtGuy.wearClothes(handsomeGuy);
        // 穿上TShirt后穿上鞋
        Shoes shoesGuy = new Shoes();
        shoesGuy.wearClothes(tShirtGuy);

        shoesGuy.wearClothes();

    }
}
