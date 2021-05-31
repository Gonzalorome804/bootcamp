package globant.appFarmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BuyDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private UserDto user;
    private BoxEggDto box;
    private int quantity;
    private BigDecimal total;
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

    public BoxEggDto getBox() {
        return box;
    }

    public void setBox(BoxEggDto box) {
        this.box = box;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}
