package globant.appFarmer.dto;

import java.io.Serializable;
import java.util.List;

public class ColorDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private List<BoxEggDto> boxs;

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

    public List<BoxEggDto> getBoxs() {
        return boxs;
    }

    public void setBoxs(List<BoxEggDto> boxs) {
        this.boxs = boxs;
    }
}
