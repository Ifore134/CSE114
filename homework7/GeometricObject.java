package homework7;


public abstract class GeometricObject implements Comparable,Cloneable {
	 private String color = "white";
	 private boolean filled;
	 private java.util.Date dateCreated;
	 protected GeometricObject() {
	 dateCreated = new java.util.Date();
	 }
	 protected GeometricObject(String color, boolean filled) {
	 dateCreated = new java.util.Date();
	 this.color = color;
	 this.filled = filled;
	 }
	 public String getColor() { return color; }
	 public void setColor(String color) { this.color = color; }
	 public boolean isFilled() { return filled; }
	 public void setFilled(boolean filled) { this.filled = filled; }
	 public java.util.Date getDateCreated() { return dateCreated; }
	 public String toString() {
	 return "created on " + dateCreated + "\ncolor: " + color +
	 " and filled: " + filled;
	 }
	 
	 public int compareTo(Object o) {
		  if(this.getArea() > ((GeometricObject)o).getArea()) {
			  return 1;
		  } else if (this.getArea() < ((GeometricObject)o).getArea()) {
			  return -1;
		  } else {
			  return 0;
		  }
	  }
	 
	 public static String max(GeometricObject o, GeometricObject b) {
		 if(o.getArea() > b.getArea())
		 return "The first geometric object is larger";
		 else if(o.getArea() == b.getArea()){
			 return "The values are equal";
		 }
		 else {
			 return"The second geometric object is larger";
		 }
	 }
	 
	 public Object clone() {
		  try {
			  GeometricObject cloned = (GeometricObject)(super.clone());
			  cloned.setFilled(this.isFilled());
			  cloned.setColor(this.getColor());
			  return cloned;
		  } catch (CloneNotSupportedException ex) {
			  return null;
		  }
	  }
	 /** Abstract method getArea */
	 public abstract double getArea();
	 /** Abstract method getPerimeter */
	 public abstract double getPerimeter();
}
