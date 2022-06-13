package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class paymentframe extends JFrame{

	private JButton BankBtn,CashBtn,CreditBtn,PaypalBtn;
	private JPanel apanel;
	public paymentframe() {
		apanel  = new JPanel();
		apanel.setLayout(new FlowLayout());
		
		BankBtn =  new JButton("Bank Payment");
		BankBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new BankGUI();
			}
		});
		CashBtn =  new JButton("Cash Payment");
		CashBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				 new CashGUI();
			}
		});
		CreditBtn =  new JButton("Credit Payment");
		CreditBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new CreditGUI();
			}
		});
		PaypalBtn = new JButton("Paypal Payment");
		PaypalBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new PaypalGUI();
			}
		});
		
		apanel.add(BankBtn);
		apanel.add(CashBtn);
		apanel.add(CreditBtn);
		apanel.add(PaypalBtn);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("payment frame");
		this.setLocationRelativeTo(null);
		this.getContentPane().add(apanel);
		this.pack();
	    
		this.setVisible(true);
	}
}
