package eshop;
import Data.EshopData;
import entities.Product;
import entities.ProductInOrder;
import ui.LogIn_Frame;
import ui.MainUI;
import ui.ProductInOrderPanel;
import ui.RegisterFrame;
import ui.ShoppingCart;
import ui.paymentframe;

public class Eshop {

	public static void main(String[] args) {
		new EshopData();
		new LogIn_Frame();
	}

}
