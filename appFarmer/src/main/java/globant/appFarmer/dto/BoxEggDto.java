package globant.appFarmer.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class BoxEggDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private ColorDto color;
    private int quantityEgg;
    private BigDecimal price;
    private int stock;
    private List<EntryDto> entries;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ColorDto getColor() {
        return color;
    }

    public void setColor(ColorDto color) {
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

    public List<EntryDto> getEntries() {
        return entries;
    }

    public void setEntries(List<EntryDto> entries) {
        this.entries = entries;
    }
}

