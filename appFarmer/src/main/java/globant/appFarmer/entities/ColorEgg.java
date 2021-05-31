package globant.appFarmer.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "colors")
public class ColorEgg implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    private String name;

    //"@OneToMany" one color can appear in multiple boxes
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "color")
    @JsonManagedReference
    private List<BoxEgg> boxs = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BoxEgg> getBoxs() {
        return boxs;
    }

    public void setBoxs(List<BoxEgg> boxs) {
        this.boxs = boxs;
    }
}
