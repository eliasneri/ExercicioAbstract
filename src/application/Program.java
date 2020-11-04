package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes!: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data");
			System.out.print("Rectangle or Cicle (r/c)? ");
			char op = sc.next().charAt(0);
			System.out.print("Color (BLACK/RED/BLUE): ");
			Color color = Color.valueOf(sc.next()); 
				
			
				if (op == 'r' || op == 'R') {
					System.out.print("Width: ");
					double width = sc.nextDouble();
					System.out.print("Height: ");
					double height = sc.nextDouble();
					list.add(new Rectangle(color, width, height));
				
				} else if (op == 'c' || op == 'C') {
					System.out.print("Radius: ");
					double radius = sc.nextDouble();
					list.add(new Circle(color, radius));
				} else {
					System.out.println("option incorrect!!!");
				}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("SHAPES AREAS");
		
		for (Shape l : list) {
			System.out.printf("%.2f\n", l.area());
		}
		
		sc.close();

	}

}
