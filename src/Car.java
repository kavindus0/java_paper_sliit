public class Car extends Item {
    private String model;
    private String type;

    public Car(String model, String type,int itemNo, String description, int unitPrice) {
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
