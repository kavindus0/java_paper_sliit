public abstract class Item {
    private int itemNo;
    private String description;
    private int unitPrice;

    public Item(String description, int itemNo, int unitPrice) {
        this.description = description;
        this.itemNo = itemNo;
        this.unitPrice = unitPrice;
    }

    public void Display() {
        System.out.println(this.description);
        System.out.println(this.itemNo);
        System.out.println(this.unitPrice);
    }
}
