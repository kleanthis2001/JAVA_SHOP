package Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import entities.*;
public class EshopData {
	public static ArrayList<User> users ;
	public static ArrayList<Product> products ;
	public Customer thiscustomer;
	
	public EshopData() {
		users = new ArrayList<User>();
		products = new ArrayList<Product>();
		
	}
	public static ArrayList<User> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<User> users) {
		EshopData.users = users;
	}
	

	public static void ReadData() {
		try {
		      File myObj = new File("//home//kle009//Documents//GitHub//JAVA_SHOP//JAVA_SHOP//src//products.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] linesData = data.split("	");
		        System.out.println(Arrays.toString(linesData));
		        String title = linesData[0];
		        String description = linesData[1];
		        String category = linesData[2];
		        double price  =  Double.parseDouble(linesData[3]);
		        double taxis = Double.parseDouble(linesData[4]);
		        products.add(new Product(price, taxis, title, category, description));
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

	public static ArrayList<Product> getProducts() {
		return products;
	}

	public static void setProducts(ArrayList<Product> products) {
		EshopData.products = products;
	}
	
	
}
