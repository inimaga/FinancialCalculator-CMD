import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;

public class annuityCalculations implements ActionListener
{
	
	
	private JLabel calculating = new JLabel();
	private String[] values = {" Present Value of Annuity", " Future Value of Annuity", " Cash Flows"};
	private String[] entryLabel = {" Cashflow", " Rate (in %)", " Time"};
	private JComboBox valueSelected = new JComboBox(values);
	
	private JLabel requiredLabel[] = new JLabel[3];
	private JTextField requiredField[] = new JTextField[4];
	
	private JButton calculate = new JButton();
	private JLabel result = new JLabel("The Present Value is : 0");
	
	public JPanel mainScreen = new JPanel();
	private JPanel top = new JPanel();
	private JPanel center = new JPanel();
	private JPanel bottom = new JPanel();
	
	private JFrame window = new JFrame();
	
	private BorderLayout layout0 = new BorderLayout();
	private GridLayout layout1 = new GridLayout(1,2);
	private GridLayout layout2 = new GridLayout(1,1);
	private GridLayout layout3 = new GridLayout(4,2);
	
	public JButton goBack = new JButton("Previous Screen");
	private Font font0 = new Font("SansSerif", Font.BOLD, 25);
	
	//Addition of images for the graphics
	private ImageIcon calculatingGraphic = new ImageIcon("Resources/calculating.png");
	private ImageIcon calculateGraphic = new ImageIcon("Resources/calculate.png");
	
	
	private double answer = 0;
	private double[] valuesReceived = new double[3];
	private Formulae operations = new Formulae();
	
	public annuityCalculations()
	{
		calculating.setIcon(calculatingGraphic);
		calculate.setIcon(calculateGraphic);
		
		goBack.setFont(font0);
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
		bottom.add(goBack);
		
		for (int i = 0; i < 3 ; i++)
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
		
		window.setTitle("Annuity Calculations");
		window.setSize(1100,450);
		window.setContentPane(mainScreen);
		//window.setVisible(true);
		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		valueSelected.addActionListener(this);
		calculate.addActionListener(this);
		
	}
	
	public static void main(String[] args)
	{
		annuityCalculations graphic = new annuityCalculations();
	}
	
	public void initialise(int index)
	{
		for (int i = 0; i < 3 ; i++)
		{
			requiredLabel[i].setText(entryLabel[i]);
			requiredField[i].setText("0");
		}
		result.setText("The Present Value is : 0");
		
		if(index == 1)
		{
			result.setText("The Future Value is : 0");
		}
		else if(index == 2)
		{
			requiredLabel[0].setText(" Present Value of Annuity");
			result.setText("The Cash Flow is : 0");
		}
	}
	
	public void pvCalculation()
	{
		for (int g = 0; g < 3 ; g++)
			{
				valuesReceived[g] = Double.parseDouble(requiredField[g].getText());
			}
			answer = operations.calculatePVA(valuesReceived[0],valuesReceived[1],valuesReceived[2]);
			result.setText("The Present Value is : " + answer);
	}
	
	public void fvCalculation()
	{
		for (int g = 0; g < 3 ; g++)
			{
				valuesReceived[g] = Double.parseDouble(requiredField[g].getText());
			}
			answer = operations.calculateFVA(valuesReceived[0],valuesReceived[1],valuesReceived[2]);
			result.setText("The Future Value is : " + answer);
	}
	
	public void cashFlowCalculation()
	{
		for (int g = 0; g < 3 ; g++)
			{
				valuesReceived[g] = Double.parseDouble(requiredField[g].getText());
			}
			answer = operations.calculateC(valuesReceived[0],valuesReceived[1],valuesReceived[2]);
			result.setText("The Cash flow is : " + answer);
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
			
			
			//System.out.println("wheel triggered, Selected item is at index " + a);
		}
		else if (event.getSource() == calculate)
		{
			selectedItem = valueSelected.getSelectedIndex();
			if(selectedItem == 0)
			{
				pvCalculation();
			}
			else if(selectedItem == 1)
			{
				fvCalculation();
			}
			else if(selectedItem == 2)
			{
				cashFlowCalculation();
			}
			
			//System.out.println("Calculate button pressed, Answer is : " + answer);
			
		}
	}
}