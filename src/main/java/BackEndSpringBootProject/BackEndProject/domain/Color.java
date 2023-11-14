package BackEndSpringBootProject.BackEndProject.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long colorid;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "color")
    private List<Cars> cars;

    public Color() {
    }

    public Color(String name) {
        super();
        this.name = name;
    }

    public long getColorid() {
        return colorid;
    }

    public void setColorid(long colorid) {  // Corrected method name
        this.colorid = colorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cars> getCars() {  // Corrected method name
        return cars;
    }

    public void setCars(List<Cars> cars) {  // Corrected method name
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Color [colorid=" + colorid + ", name=" + name + "]";
    }
}
