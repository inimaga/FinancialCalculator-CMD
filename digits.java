import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;


public class digits implements ActionListener
{
		Font font2 = new Font("SansSerif", Font.BOLD, 45);
		JTextField typeArea = new JTextField("0");
		
		//Creation of Digit Buttons begin here
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton zero = new JButton("0");
		
		JButton point = new JButton(".");
		JButton equal = new JButton("=");
		//Creation of Digit Buttons end here
		
		//Creation of Arithmetic Buttons begin here
		JButton plus = new JButton("+");
		JButton substract = new JButton("-");
		JButton multiply = new JButton("x");
		JButton divide = new JButton("/");
		//Creation of Arithmetic Buttons end here
		
		JButton CE = new JButton("CE");
		
		JButton empty = new JButton("_");
		
		String userInput = "";
		String userInput2 = "0";
		int arithmetic = 1;
		
		float a = 0;
		float b = 0;
			
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == one)
		{
			userInput = (userInput + "1");
			userInput2 = (userInput2 + "1");
			typeArea.setText(userInput);
		}
		else if (event.getSource() == two)
		{
			userInput = (userInput + "2");
			userInput2 = (userInput2 + "2");
			typeArea.setText(userInput);
		}
		else if (event.getSource() == three)
		{
			userInput = (userInput + "3");
			userInput2 = (userInput2 + "3");
			typeArea.setText(userInput);
		}
		else if (event.getSource() == four)
		{
			userInput = (userInput + "4");
			userInput2 = (userInput2 + "4");
			typeArea.setText(userInput);
		}
		else if (event.getSource() == five)
		{
			userInput = (userInput + "5");
			userInput2 = (userInput2 + "5");
			typeArea.setText(userInput);
		}
		else if (event.getSource() == six)
		{
			userInput = (userInput + "6");
			userInput2 = (userInput2 + "6");
			typeArea.setText(userInput);
		}
		else if (event.getSource() == seven)
		{
			userInput = (userInput + "7");
			userInput2 = (userInput2 + "7");
			typeArea.setText(userInput);
		}
		else if (event.getSource() == eight)
		{
			userInput = (userInput + "8");
			userInput2 = (userInput2 + "8");
			typeArea.setText(userInput);
		}
		else if (event.getSource() == nine)
		{
			userInput = (userInput + "9");
			userInput2 = (userInput2 + "9");
			typeArea.setText(userInput);
		}
		else if (event.getSource() == zero)
		{
			userInput = (userInput + "0");
			userInput2 = (userInput2 + "0");
			typeArea.setText(userInput);
		}
		else if (event.getSource() == point)
		{
			userInput = (userInput + ".");
			userInput2 = (userInput2 + ".");
			typeArea.setText(userInput);
		}
		else if (event.getSource() == equal)
		{
			if (arithmetic == 1)
			{
				a = Float.parseFloat(userInput2);
				b = b + a;
				a = 0;
			
				userInput = (userInput + " = " + b);
				typeArea.setText(userInput);
				userInput = ("Ans");
				userInput2 = ("0");
			}
			else if (arithmetic == 2)
			{
				a = Float.parseFloat(userInput2);
				b = b - a;
				a = 0;
			
				userInput = (userInput + " = " + b);
				typeArea.setText(userInput);
				userInput = ("Ans");
				userInput2 = ("0");
			}
			else if(arithmetic == 3)
			{
				a = Float.parseFloat(userInput2);
				b = b * a;
				a = 0;
			
				userInput = (userInput + " = " + b);
				typeArea.setText(userInput);
				userInput = ("Ans");
				userInput2 = ("0");
			}
			else if(arithmetic == 4)
			{
				a = Float.parseFloat(userInput2);
				b = b / a;
				a = 0;
			
				userInput = (userInput + " = " + b);
				typeArea.setText(userInput);
				userInput = ("Ans");
				userInput2 = ("0");
			}
		}
		else if (event.getSource() == plus)
		{
			a = Float.parseFloat(userInput2);
			b = b + a;
			a = 0;
			userInput2 = "0";
			userInput = (userInput + " + ");
			typeArea.setText(userInput);
			arithmetic = 1;
			
		}
		else if (event.getSource() == substract)
		{
			a = Float.parseFloat(userInput2);
			b = b + a;
			a = 0;
			userInput2 = "0";
			userInput = (userInput + " - ");
			typeArea.setText(userInput);
			arithmetic = 2;
			
		}
		else if (event.getSource() == multiply)
		{
			a = Float.parseFloat(userInput2);
			b = b + a;
			a = 0;
			userInput2 = "0";
			userInput = (userInput + " x ");
			typeArea.setText(userInput);
			arithmetic = 3;
		}
		else if (event.getSource() == divide)
		{
			a = Float.parseFloat(userInput2);
			b = b + a;
			a = 0;
			userInput2 = "0";
			userInput = (userInput + " / ");
			typeArea.setText(userInput);
			arithmetic = 4;
		}
		else if (event.getSource() == CE)
		{
			userInput = ("");
			userInput2 = ("0");
			typeArea.setText(userInput);
			a = 0;
			b = 0;
		}
		else
		{
			System.out.println("How the hell did you get this to show?");	//Easter egg?? LOL
		}
		
	}
	
}
