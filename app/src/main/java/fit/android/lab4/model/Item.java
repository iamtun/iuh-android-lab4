package fit.android.lab4.model;

public class Item {
    private int id;
    private String name;
    private String shop;

    public Item(int id, String name, String shop) {
        this.id = id;
        this.name = name;
        this.shop = shop;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShop() {
        return shop;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}
