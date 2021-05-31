package globant.appFarmer.dto;

import globant.appFarmer.entities.BoxEgg;

import java.io.Serializable;
import java.util.Date;

public class EntryDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private UserDto user;
    private BoxEgg box;
    private int quantity;
    private Date entryDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public BoxEgg getBox() {
        return box;
    }

    public void setBox(BoxEgg box) {
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
