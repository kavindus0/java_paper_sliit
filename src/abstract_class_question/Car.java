package abstract_class_question;

public class Car extends Item {
    private final String model;
    private final String type;

    public Car(String description, int itemNo, int unitPrice, String model, String type) {
        super(description, itemNo, unitPrice);
        this.model = model;
        this.type = type;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println(this.model);
        System.out.println(this.type);
    }
}
