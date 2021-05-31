package globant.appFarmer.models.responses;

import globant.appFarmer.entities.ColorEgg;

import java.math.BigDecimal;

public class BoxEggResponse {

    private ColorEgg color;
    private int quantityEgg;
    private BigDecimal price;
    private int stock;

    public ColorEgg getColor() {
        return color;
    }

    public void setColor(ColorEgg color) {
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
