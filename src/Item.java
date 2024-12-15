public abstract class Item {
    private final int itemNo;
    private final String description;
    private final int unitPrice;

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
