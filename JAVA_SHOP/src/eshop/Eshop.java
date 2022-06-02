package eshop;
import entities.Product;
import entities.ProductInOrder;
import ui.LogIn_Frame;
import ui.MainUI;
import ui.ProductInOrderPanel;
import ui.RegisterFrame;
import ui.ShoppingCart;

public class Eshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int one = 11; float two = (float) 0.13; Product aprod = new
		 * Product(one,two,"shoes","nothing","nothing"); ProductInOrder apro = new
		 * ProductInOrder(aprod,3); new ProductInOrderPanel(apro);
		 */
		new ShoppingCart(true);
	}

}
