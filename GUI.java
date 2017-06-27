import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener
{
	JButton standard = new JButton();
	JButton tvm = new JButton();
	JLabel financialCalculator = new JLabel();
	
	JPanel mainScreen = new JPanel();
	
	JFrame window = new JFrame();
	
	GridLayout layout0 = new GridLayout(3,1);
	
	//Addition of images for the graphics
	ImageIcon FC = new ImageIcon("Resources/FC.png");
	ImageIcon SC = new ImageIcon("Resources/SC.png");
	ImageIcon TVMintro = new ImageIcon("Resources/TVM(intro).png");
	
	SCalculator standardCalculator = new SCalculator();
	
	public GUI()
	{
		financialCalculator.setIcon(FC);
		standard.setIcon(SC);
		tvm.setIcon(TVMintro);
		
		standard.setContentAreaFilled(false);
		tvm.setContentAreaFilled(false);
		
		//mainScreen.setBackground(Color.WHITE);
		//standard.setOpaque(false);
		
		
		mainScreen.setLayout(layout0);
		mainScreen.add(financialCalculator);
		mainScreen.add(standard);
		mainScreen.add(tvm);
		
		window.setTitle("Financial Calculator by Issa Nimaga");
		window.setSize(1100,450);
		window.setContentPane(mainScreen);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		standard.addActionListener(this);
		tvm.addActionListener(this);
		
	}
	
	public static void main(String[] args)
	{
		GUI graphic = new GUI();
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == standard)
		{
			standardCalculator.show();
		}
	}
	
}