package globant.appFarmer.models.request;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public class BoxEggRequest {

    @NotNull(message = "color is required.")
    private long color;

    @NotNull(message = "price is required")
    @Digits(integer = 8, fraction = 2, message = "the price cannot have more than two decimal places.")
    @Positive
    private BigDecimal price;

    @Positive
    private int quantityEgg;

    @Positive
    private int stock;

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantityEgg() {
        return quantityEgg;
    }

    public void setQuantityEgg(int quantityEgg) {
        this.quantityEgg = quantityEgg;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}


