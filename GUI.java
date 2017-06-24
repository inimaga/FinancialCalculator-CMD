import javax.swing.*;
import java.awt.*;

public class GUI
{
	JButton standard = new JButton();
	JButton tvm = new JButton();
	JLabel financialCalculator = new JLabel();
	
	JPanel mainScreen = new JPanel();
	
	JFrame window = new JFrame();
	
	GridLayout layout0 = new GridLayout(3,1);
	
	public GUI()
	{
		
		mainScreen.setLayout(layout0);
		mainScreen.add(financialCalculator);
		mainScreen.add(standard);
		mainScreen.add(tvm);
		
		window.setTitle("Financial Calculator by Issa Nimaga");
		window.setSize(900,600);
		window.setContentPane(mainScreen);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args)
	{
		GUI graphic = new GUI();
	}
}