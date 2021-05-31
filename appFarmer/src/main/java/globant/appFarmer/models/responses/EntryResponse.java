package globant.appFarmer.models.responses;

import java.util.Date;

public class EntryResponse {

    private long id;
    private UserResponse user;
    private BoxEggResponse box;
    private int quantity;
    private Date entryDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserResponse getUser() {
        return user;
    }

    public void setUser(UserResponse user) {
        this.user = user;
    }

    public BoxEggResponse getBox() {
        return box;
    }

    public void setBox(BoxEggResponse box) {
        this.box = box;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}
