import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;

public class rateCalculations implements ActionListener
{
	
	
	JLabel calculating = new JLabel();
	String[] values = {" Annual Percentage Rate (APR)", " Effective Annual Rate (EAR)"};
	String[] entryLabel = {" EAR (in %)", " Periods"};
	JComboBox valueSelected = new JComboBox(values);
	
	JLabel requiredLabel[] = new JLabel[entryLabel.length];
	JTextField requiredField[] = new JTextField[entryLabel.length];
	
	JButton calculate = new JButton();
	JLabel result = new JLabel("The APR (in %) is : 0");
	
	JPanel mainScreen = new JPanel();
	JPanel top = new JPanel();
	JPanel center = new JPanel();
	JPanel bottom = new JPanel();
	
	JFrame window = new JFrame();
	
	BorderLayout layout0 = new BorderLayout();
	GridLayout layout1 = new GridLayout(1,2);
	GridLayout layout2 = new GridLayout(1,1);
	GridLayout layout3 = new GridLayout(3,2);
	
	Font font0 = new Font("SansSerif", Font.BOLD, 25);
	
	//Addition of images for the graphics
	ImageIcon calculatingGraphic = new ImageIcon("Resources/calculating.png");
	ImageIcon calculateGraphic = new ImageIcon("Resources/calculate.png");
	
	
	double answer = 0;
	double[] valuesReceived = new double[3];
	Formulae operations = new Formulae();
	
	public rateCalculations()
	{
		calculating.setIcon(calculatingGraphic);
		calculate.setIcon(calculateGraphic);
		
		valueSelected.setFont(font0);
		result.setFont(font0);
		result.setHorizontalAlignment(JLabel.CENTER);
		result.setBackground(Color.WHITE);
		
		mainScreen.setLayout(layout0);
		top.setLayout(layout1);
		center.setLayout(layout3);
		bottom.setLayout(layout1);
		
		mainScreen.add("North", top);
		mainScreen.add("Center", center);
		mainScreen.add("South", bottom);
		
		top.add(calculating);
		top.add(valueSelected);
		
		
		for (int i = 0; i < entryLabel.length ; i++)
		{
			requiredLabel[i] = new JLabel();
			requiredField[i] = new JTextField();
			
			center.add(requiredLabel[i]);
			center.add(requiredField[i]);
			requiredLabel[i].setText(entryLabel[i]);
			requiredField[i].setText("0");
			
			requiredLabel[i].setFont(font0);
			requiredField[i].setFont(font0);
		}
		
		center.add(calculate);
		center.add(result);
		
		window.setTitle("Rate Calculations");
		window.setSize(900,450);
		window.setContentPane(mainScreen);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		valueSelected.addActionListener(this);
		calculate.addActionListener(this);
		
	}
	
	public static void main(String[] args)
	{
		rateCalculations graphic = new rateCalculations();
	}
	
	public void initialise(int index)
	{
		for (int i = 0; i < entryLabel.length ; i++)
		{
			requiredLabel[i].setText(entryLabel[i]);
			requiredField[i].setText("0");
		}
		result.setText("The APR (in %) is : 0");
		
		if(index == 1)
		{
			requiredLabel[0].setText(" APR (in %)");
			result.setText("The EAR (in %) is : 0");
		}
	}
	
	public void aprCalculation()
	{
		for (int g = 0; g < requiredField.length ; g++)
			{
				valuesReceived[g] = Double.parseDouble(requiredField[g].getText());
			}
			answer = operations.calculateAPR(valuesReceived[0],valuesReceived[1]);
			result.setText("The APR (in %) is : " + answer);
	}
	
	public void earCalculation()
	{
		for (int g = 0; g < requiredField.length ; g++)
			{
				valuesReceived[g] = Double.parseDouble(requiredField[g].getText());
			}
			answer = operations.calculateEAR(valuesReceived[0],valuesReceived[1]);
			result.setText("The EAR (in %) is : " + answer);
	}
	
	
	public void show()
	{
		window.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		int selectedItem = 0;
		
		if (event.getSource() == valueSelected)
		{
			selectedItem = valueSelected.getSelectedIndex();
			initialise(selectedItem);
		}
		else if (event.getSource() == calculate)
		{
			selectedItem = valueSelected.getSelectedIndex();
			if(selectedItem == 0)
			{
				aprCalculation();
			}
			else if(selectedItem == 1)
			{
				earCalculation();
			}
		}
	}
}