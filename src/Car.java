public class Car extends Item {
    private String model;
    private String type;

    public Car(String description, int itemNo, int unitPrice, String model, String type) {
        super(description, itemNo, unitPrice);
        this.model = model;
        this.type = type;
        this.itemNo = itemNo;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    @Override
    public void Display() {
        System.out.println("Model: " + model);
        System.out.println("type: " + model);
        System.out.println("itemNo: " + model);
        System.out.println("description: " + description);
        System.out.println("unitprice: " + unitPrice);
    }
}
