package BuilderMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体组件
 */
public class Product {

    List<String> items = new ArrayList<>();

    /**
     * 放入组件
     *
     * @param item
     */
    public void addItem(String item) {
        items.add(item);
    }

    /**
     * 展示已有的组件
     */
    public void show() {
        System.out.println(items.toString());
    }

}
