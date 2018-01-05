import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener
{
	private JButton standard = new JButton();
	private JButton tvm = new JButton();
	private JLabel financialCalculator = new JLabel();
	
	private JPanel mainScreen = new JPanel();
	
	private JFrame window = new JFrame();
	
	private GridLayout layout0 = new GridLayout(3,1);
	
	//Addition of images for the graphics
	private ImageIcon FC = new ImageIcon("Resources/FC.png");
	private ImageIcon SC = new ImageIcon("Resources/SC.png");
	private ImageIcon TVMintro = new ImageIcon("Resources/TVM(intro).png");
	
	SCalculator standardCalculator = new SCalculator();
	TVMscreen tvmCalculator = new TVMscreen();
	
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
		window.setSize(900,450);
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
		if (event.getSource() == tvm)
		{
			tvmCalculator.show();
		}
	}
	
}