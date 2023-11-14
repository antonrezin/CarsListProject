package BackEndSpringBootProject.BackEndProject.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cars {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String brand, model, body, engine;
	private int powerHp;
	private int price;
	
	@Column(name = "publishing_year")
	private int year;

	@ManyToOne
	@JoinColumn(name = "colorid")
	private Color color;

	public Cars() {}

	public Cars(String brand, String model, int year, String body, String engine, int powerHp, int price, Color color) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.body = body;
		this.engine = engine;
		this.powerHp = powerHp;
		this.price = price;
		this.color = color;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getPowerHp() {
		return powerHp;
	}

	public void setPowerHp(int powerHp) {
		this.powerHp = powerHp;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}