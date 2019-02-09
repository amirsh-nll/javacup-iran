

import java.text.DecimalFormat;

public class Circle extends Shape {
	Double radius;

	public Circle(Color c, Pattern p, double r) {
		super(c, p);
		this.radius = r;
	}

	@Override
	public String toString() {
		String color = String.valueOf(this.color).toUpperCase();
		String pattern = String.valueOf(this.pattern).toUpperCase();
		DecimalFormat df = new DecimalFormat("###");
		return "Circle[color:" + color + ", pattern:" + pattern + ", radius:" + df.format(this.radius)  + "]";
	}

	public boolean equals(Circle obj) {
		if(obj==null)
			return false;
		else if(this.color == obj.color && this.pattern == obj.pattern && Double.compare(this.radius, obj.radius) == 0)
			return true;
		else
			return false;

	}
}
