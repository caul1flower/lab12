package atm;

import lombok.Getter;
import lombok.Setter;

public abstract class Handler {
    @Setter @Getter
    private Handler next;
    int quantity;
    public  Handler(int quantity) {
        this.quantity = quantity;
    }
    public void process(int price) {
        if (next != null) {
            next.process(price % quantity);
        }
        else if (price % quantity > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println(price/quantity + " * " + quantity);
    }
}
