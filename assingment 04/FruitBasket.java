package tester;

import java.util.Arrays;
import java.util.Scanner;

import comm.app.fruits.Apple;
import comm.app.fruits.Fruit;
import comm.app.fruits.Mango;
import comm.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, index = 0,n;
		
		System.out.println("Enter size of Basket - ");
		n = sc.nextInt();
		Fruit[] arr = new Fruit[n];
		Fruit f;
		
		do
		{
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display All Fruits in Basket");
			System.out.println("5. Display Name, Colour, Weight, Taste All Fruits in Basket");
			System.out.println("6. Display Taste of Stale Fruits");
			System.out.println("7. Make a Fruit as Stale");
			System.out.println("8. Make All Sour Fruits Stale"); // optional
			System.out.println("Enter you choice");
			choice = sc.nextInt();
			
			switch(choice)
			{
					case 0 : 
						System.out.println("Thank You for Visiting our App");
						break;
						
					case 1 : 
					{
						
						if(index < n) {
							f = new Mango();
							f.accept();
							arr[index] = f;
							index++;
							}
						else {
							System.out.println("Basket is Full");
						}
					
					}
					break;
					case 2 : 
					{
						
						if(index < n)
						{
							f = new Orange();
							f.accept();
							arr[index] = f;
							index++;
						}
						else {
							System.out.println("Basket is Full");
						}
						}
					break;
						
					case 3 :
					{
						
						if(index < n)
						{
							f = new Apple();
							f.accept();
							arr[index] = f;
							index++;
						}
						else {
							System.out.println("Basket is Full");
						}
			
					}
					break;		
				
					case 4 : 
					{
						
						
						for(int i=0; i<index;i++)
						{
							if(arr[i].isFresh())
							{
								System.out.println(arr[i].getName());
							}
						}
					}
					break;
					
					case 5 : 
					{
						for (Fruit fruitBasket : arr) {
							if(fruitBasket != null)
							{
								System.out.println(Arrays.toString(arr));
								
							}
						}
					}
					break;
					
					case 6 : 
					{
						for (Fruit fruit : arr) {
							if(fruit.isFresh()== false)
							{
								System.out.println("Tase of Stale Fruit - "+fruit.taste()); 
							}
							
						}
					}
					break;
					
					case 7 :
					{
						int staleIndex;
						System.out.println("Enter Index Which Fruit is Stale");
						staleIndex = sc.nextInt();
						if(staleIndex < arr.length)
						{
							arr[staleIndex].setFresh(false);
						}else {
							System.out.println("Error");
						}
						
					}
					break;
					
					case 8 :
//						
						for (Fruit fruit : arr) {
							if(fruit.taste()=="Sour")
							{
								fruit.setFresh(false);
							}
						}
						break;
	
			}
		
	}while(choice!=0);
		
		

}
	
	
}
        
