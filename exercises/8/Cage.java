
public class Cage {
	private int id;

	private String name;
	private Bird[] birds = new Bird[2];

	public Cage() {

	}

	public Cage(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bird[] getBirds() {
		return birds;
	}

	public void setBirds(Bird[] birds) {
		this.birds = birds;
	}

}

class Bird {
	private String name;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
