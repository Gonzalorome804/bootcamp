package globant.appFarmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class BoxEggCreationDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private long color;
    private int quantityEgg;
    private BigDecimal price;
    private int stock;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public int getQuantityEgg() {
        return quantityEgg;
    }

    public void setQuantityEgg(int quantityEgg) {
        this.quantityEgg = quantityEgg;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
