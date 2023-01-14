package Application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Entities.Circle;
import Entities.Color;
import Entities.Rectangle;
import Entities.Shape;
import Entities.Square;
import Entities.Triangle;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ArrayList<Shape> list = new ArrayList<Shape>();
		
		System.out.println("Deseja adicionar uma nova forma?");
		char novo = sc.next().charAt(0);
		
		while(novo == 'y') {
			System.out.println("Qual a forma?(R/S/T/C)");
			char tip = sc.next().charAt(0);
			char cor;
			
			if(tip == 'R' || tip == 'r') {
				
				System.out.println("Altura:");
				Double height = sc.nextDouble();
				System.out.println("Largura:");
				Double weidth = sc.nextDouble();
				System.out.println("Tem cor?");
				cor = sc.next().charAt(0);
				
				if(cor == 'y') {
					Color color = Color.valueOf(sc.next());
					list.add(new Rectangle(color, weidth, height));
				}else {
					list.add(new Rectangle(weidth, height));
				}
				
			}else if(tip == 'S' || tip == 's') {
				
				System.out.println("Base:");
				Double base = sc.nextDouble();
				System.out.println("Tem cor?");
				cor = sc.next().charAt(0);
				
				if(cor == 'y') {
					Color color = Color.valueOf(sc.next());
					list.add(new Square(color, base));
				}else {
					list.add(new Square(base));
				}
				
			}else if(tip == 'T' || tip == 't') {
				
				System.out.println("Base:");
				Double base = sc.nextDouble();
				System.out.println("Altura:");
				Double height = sc.nextDouble();
				
				System.out.println("Tem cor?");
				cor = sc.next().charAt(0);
				
				if(cor == 'y') {
					Color color = Color.valueOf(sc.next());
					list.add(new Triangle(color, base, height));
				}else {
					list.add(new Triangle(base, height));
				}
				
			}else if(tip == 'C' || tip == 'c') {
				
				System.out.println("Raio:");
				Double radius = sc.nextDouble();
				System.out.println("Tem cor?");
				cor = sc.next().charAt(0);
				
				if(cor == 'y') {
					Color color = Color.valueOf(sc.next());
					list.add(new Circle(color, radius));
				}else {
					list.add(new Circle(radius));
				}
				
			}else {
				System.out.println("Forma invalida");
			}
			
			System.out.println("Deseja adicionar uma nova forma?");
			novo = sc.next().charAt(0);
		}

		System.out.println("Formas:");
		for(Shape shape: list) {
			System.out.println(shape.toString());
		}
		
		sc.close();
	}

}
