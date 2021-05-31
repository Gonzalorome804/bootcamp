package globant.appFarmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BuyCreationDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private long user;
    private long box;
    private int quantity;
    private BigDecimal total;
    private Date entryDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
