package comm.app.fruits;

import java.util.Scanner;

public class Fruit {
   String color;
   double weight;
   String name;
    boolean isFresh;
    
    
    
	public Fruit() {
	
	}

	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
    public String taste()
    {
    	return "no specific taste";
    }
    
   public void accept() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Name of fruit-");
	   name=sc.next();
	   System.out.println("Enter color-");
	   color=sc.next();
	   System.out.println("Enter Weight-");
	   weight=sc.nextDouble();
   }
 
   public void display() {
	   System.out.println("Name of Fruit"+name);
	   System.out.println("Name of Color"+color);
	   System.out.println("Name of Weight"+weight);
	   
   }
}
