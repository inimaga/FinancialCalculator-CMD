import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;

public class SCalculator implements ActionListener
{
	JFrame window = new JFrame();
	JPanel main = new JPanel();
	
	JButton goBack = new JButton("<html>Previous <br/> Screen </html>");
	
	public SCalculator()
	{
		
		operations math = new operations();
		digits calc = new digits();
		
		Font font1 = new Font("SansSerif", Font.ITALIC, 45);
		Font font2 = new Font("SansSerif", Font.BOLD, 45);
		Font font3 = new Font("SansSerif", Font.BOLD, 30);
		Font font4 = new Font("SansSerif", Font.BOLD, 20);

		//Creation of instances of different layout begin here
		BorderLayout layout0 = new BorderLayout();
		GridLayout layout1 = new GridLayout(2,8);
		GridLayout layout2 = new GridLayout();
		//Creation of instances of different layout end here
		
		
		main.setLayout(layout0);
		
		JPanel numbers = new JPanel();				//Panel for numbers
		numbers.setLayout(layout1);
		
		calc.typeArea.setPreferredSize(new Dimension(0,100));
		calc.typeArea.setFont(font1);
		calc.typeArea.setHorizontalAlignment(JTextField.RIGHT);
		
		//
			calc.one.setFont(font2);
			calc.two.setFont(font2);
			calc.three.setFont(font2);
			calc.four.setFont(font2);
			calc.five.setFont(font2);
			calc.six.setFont(font2);
			calc.seven.setFont(font2);
			calc.eight.setFont(font2);
			calc.nine.setFont(font2);
			calc.zero.setFont(font2);
			
			calc.plus.setFont(font2);
			calc.substract.setFont(font2);
			calc.multiply.setFont(font2);
			calc.divide.setFont(font2);
			calc.equal.setFont(font2);
			calc.point.setFont(font2);
			calc.CE.setFont(font3);
		//

		main.add("North", calc.typeArea);
		main.add("Center",numbers);
		//main.add("South", calc.CE);
		
		
		goBack.setFont(font4);
		
		numbers.add(goBack);
		//goBack.addActionListener(this);
		
		//Addition of Buttons and action listener from the digit class began here
	 	numbers.add(calc.one);
		calc.one.addActionListener(calc);
		numbers.add(calc.two);
		calc.two.addActionListener(calc);
		numbers.add(calc.three);
		calc.three.addActionListener(calc);
		numbers.add(calc.four);
		calc.four.addActionListener(calc);
		numbers.add(calc.five);
		calc.five.addActionListener(calc);
		
		
		numbers.add(calc.equal);
		calc.equal.addActionListener(calc);
		numbers.add(calc.plus);
		calc.plus.addActionListener(calc);
		numbers.add(calc.substract);
		calc.substract.addActionListener(calc);
		
		
		numbers.add(calc.CE);
		calc.CE.addActionListener(calc);
		
		numbers.add(calc.six);
		calc.six.addActionListener(calc);
		numbers.add(calc.seven);
		calc.seven.addActionListener(calc);
		numbers.add(calc.eight);
		calc.eight.addActionListener(calc);
		numbers.add(calc.nine);
		calc.nine.addActionListener(calc);

		
		
		numbers.add(calc.zero);
		calc.zero.addActionListener(calc);
		
		numbers.add(calc.point);
		calc.point.addActionListener(calc);
		
		
		numbers.add(calc.multiply);
		calc.multiply.addActionListener(calc);
		numbers.add(calc.divide);
		calc.divide.addActionListener(calc);
		
		
		//Addition of Buttons from the digit class ends here
		
		//Properties of the window frame begin here
		window.setTitle("Nimaga's Calculator");
		window.setSize(1120,465);
		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(main);
		window.setVisible(false);
		//Properties of the window frame end here
		
	}
	
	public void show()
	{
		window.setVisible(true);
	}
	
	/*
	public static void main(String[] args)
	{
		SCalculator graphic = new SCalculator();
	}
	*/
	
	
	public void actionPerformed(ActionEvent event)
	{
	}
	
}