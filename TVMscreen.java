import javax.swing.*;
import java.awt.*;
import java.awt.Font;

public class TVMscreen
{
	public JButton singleCashFlow = new JButton();
	public JButton annuity = new JButton();
	public JButton rates = new JButton();
	private JLabel TVMcalculator = new JLabel();
	
	public JButton goBack = new JButton("Previous Screen");
	
	public JPanel mainScreen = new JPanel();
	private JPanel top = new JPanel();
	private JPanel center = new JPanel();
	
	private JFrame window = new JFrame();
	
	private GridLayout layout0 = new GridLayout(1,3);
	private BorderLayout layout1 = new BorderLayout();
	
	//Addition of images for the graphics
	private ImageIcon TVMlabel = new ImageIcon("Resources/tVm.png");
	private ImageIcon sCf = new ImageIcon("Resources/sCf.png");	//sCf is short for single cash flow
	private ImageIcon Ac = new ImageIcon("Resources/Ac.png");	//Ac is short for annuity calculations
	private ImageIcon ratesIcon = new ImageIcon("Resources/rates.png");
	
	public scfCalculations scf = new scfCalculations();
	public annuityCalculations aC = new annuityCalculations();
	public rateCalculations aprAndEar = new rateCalculations();
	
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
		
		Font font1 = new Font("SansSerif", Font.BOLD, 25);
		goBack.setFont(font1);
		
		mainScreen.add("North", top);
		mainScreen.add("Center", center);
		mainScreen.add("South", goBack);
		
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
		
	}
	
	public static void main(String[] args)
	{
		TVMscreen graphic = new TVMscreen();
	}
	
	public void show()
	{
		window.setVisible(true);
	}
	
}