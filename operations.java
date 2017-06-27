import java.awt.event.*;

public class operations implements ActionListener
{
	
	digits temp = new digits();
	//Calculator temp2 = new Calculator();
	
	public void actionPerformed(ActionEvent zz)
	{
		if(zz.getSource() == temp.one)
		{
			System.out.println("Button uno");
		}
		else if (zz.getSource() == temp.two)
		{
			System.out.println("Second button");
		}
		else
		{
			System.out.println("Bummer... :(");
		}
	}
	
	
	
}