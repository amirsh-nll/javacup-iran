


public class Square extends Shape {

	Integer length;

	public Square(Color c, Pattern p, int length) {
		super(c, p);
		this.length = length; // autoboxing

	}

	@Override
	public String toString() {
		String color = String.valueOf(this.color).toUpperCase();
		String pattern = String.valueOf(this.pattern).toUpperCase();

		return "Square[color:" + color + ", pattern:" + pattern + ", length:" + this.length + "]";
	}

	public boolean equals(Square obj) {
		if(obj==null)
			return false;
		else if(this.color == obj.color && this.pattern == obj.pattern &&  this.length == obj.length)
			return true;
		else
			return false;

	}
}
