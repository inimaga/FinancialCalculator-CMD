import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TVMscreen implements ActionListener
{
	JButton singleCashFlow = new JButton();
	JButton annuity = new JButton();
	JButton rates = new JButton();
	JLabel TVMcalculator = new JLabel();
	
	JPanel mainScreen = new JPanel();
	JPanel top = new JPanel();
	JPanel center = new JPanel();
	
	JFrame window = new JFrame();
	
	GridLayout layout0 = new GridLayout(1,3);
	BorderLayout layout1 = new BorderLayout();
	
	//Addition of images for the graphics
	ImageIcon TVMlabel = new ImageIcon("Resources/tVm.png");
	ImageIcon sCf = new ImageIcon("Resources/sCf.png");	//sCf is short for single cash flow
	ImageIcon Ac = new ImageIcon("Resources/Ac.png");	//Ac is short for annuity calculations
	ImageIcon ratesIcon = new ImageIcon("Resources/rates.png");
	
	SCalculator standardCalculator = new SCalculator();
	
	public TVMscreen()
	{
		TVMcalculator.setIcon(TVMlabel);
		singleCashFlow.setIcon(sCf);
		annuity.setIcon(Ac);
		rates.setIcon(ratesIcon);
		
		singleCashFlow.setContentAreaFilled(false);
		annuity.setContentAreaFilled(false);
		rates.setContentAreaFilled(false);
		
		//mainScreen.setBackground(Color.WHITE);
		center.setBackground(Color.WHITE);
		//singleCashFlow.setOpaque(false);
		
		
		mainScreen.setLayout(layout1);
		center.setLayout(layout0);
		
		mainScreen.add("North", top);
		mainScreen.add("Center", center);
		
		top.add(TVMcalculator);
		center.add(singleCashFlow);
		center.add(annuity);
		center.add(rates);
		
		window.setTitle("TVM Calculator");
		window.setSize(1100,450);
		window.setContentPane(mainScreen);
		//window.setVisible(true);
		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		singleCashFlow.addActionListener(this);
		annuity.addActionListener(this);
		rates.addActionListener(this);
		
	}
	
	public static void main(String[] args)
	{
		TVMscreen graphic = new TVMscreen();
	}
	
	public void show()
	{
		window.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == singleCashFlow)
		{
		}
		else if (event.getSource() == annuity)
		{
			
		}
		else if (event.getSource() == rates)
		{
			
		}	
	}
	
}