package globant.appFarmer.models.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class EntryRequest {

    @NotNull(message = "user is required.")
    private long user;

    @NotNull(message = "box is required.")
    private long box;

    @NotNull(message = "quantity is required.")
    @Positive(message = "the quantity entered must be positive.")
    private int quantity;

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public long getBox() {
        return box;
    }

    public void setBox(long box) {
        this.box = box;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
