public class Item {
    int itemNo;
    String description;
    int unitPrice;

    public Item() {
    }

    public void Display() {
        System.out.println(this.description);
        System.out.println(this.itemNo);
        System.out.println(this.unitPrice);
    }
}
