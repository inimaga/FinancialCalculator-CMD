import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.net.URL;
import java.awt.image.BufferedImage;
import java.io.IOException;

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
	
	/*
	 * This class represents the Graphical User Interface through which other calculators are accessed by the User
	 */
	public GUI()
	{	
		//Changing Calculator Icon	//Note that Jar file compilation does not work if the below code is active
		try {
		//URL resource = window.getClass().getResource("/Resources/Calculator-icon.png");
        BufferedImage image = ImageIO.read(getClass().getResource("/Resources/Calculator-icon.png"));
		//ImageIO.read(resource);
		window.setIconImage(image);
		} catch (IOException e) {
            e.printStackTrace();
        }
		
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
		
		standardCalculator.goBack.addActionListener(this);
		tvmCalculator.goBack.addActionListener(this);
		
		tvmCalculator.scf.goBack.addActionListener(this);
		tvmCalculator.singleCashFlow.addActionListener(this);
		
		tvmCalculator.aC.goBack.addActionListener(this);
		tvmCalculator.annuity.addActionListener(this);
		
		tvmCalculator.aprAndEar.goBack.addActionListener(this);
		tvmCalculator.rates.addActionListener(this);
		
	}
	
	public static void main(String[] args)
	{
		GUI graphic = new GUI();
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == standard)
		{
			window.setContentPane(standardCalculator.main);
			window.setVisible(true);
		}
		
		if (event.getSource() == tvm || 
			event.getSource() == tvmCalculator.scf.goBack || 
			event.getSource() == tvmCalculator.aC.goBack || 
			event.getSource() == tvmCalculator.aprAndEar.goBack )
		{
			window.setContentPane(tvmCalculator.mainScreen);
			window.setVisible(true);
		}
		
		if (event.getSource() == standardCalculator.goBack || event.getSource() == tvmCalculator.goBack)
		{
			window.setContentPane(mainScreen);
		}
		if (event.getSource() == tvmCalculator.singleCashFlow)
		{			
			window.setContentPane(tvmCalculator.scf.mainScreen);
			window.setVisible(true);
		}
		if (event.getSource() == tvmCalculator.annuity)
		{
			window.setContentPane(tvmCalculator.aC.mainScreen);
			window.setVisible(true);
		}
		if (event.getSource() == tvmCalculator.rates)
		{
			window.setContentPane(tvmCalculator.aprAndEar.mainScreen);
			window.setVisible(true);
		}
	}
	
}