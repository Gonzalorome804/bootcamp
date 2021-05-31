package globant.appFarmer.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "boxs")
public class BoxEgg implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    private int quantityEgg;

    private int stock;

    @Column(nullable = false)
    @Digits(integer = 8, fraction = 2)
    private BigDecimal price;

    //"@ManyToOne" one color can appear in multiple boxes
    @ManyToOne
    @JoinColumn(name = "color_id")
    @JsonBackReference
    private ColorEgg color;

    //"@OneToMany" in a buy there may be multiple boxes
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "box")
    @JsonManagedReference
    private List<Buy> buys = new ArrayList<>();

    //"@OneToMany" in a entry there may be multiple boxes
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "box")
    @JsonManagedReference
    private List<Entry> entries = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ColorEgg getColor() {
        return color;
    }

    public void setColor(ColorEgg color) {
        this.color = color;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public List<Buy> getBuys() {
        return buys;
    }

    public void setBuys(List<Buy> buys) {
        this.buys = buys;
    }
}