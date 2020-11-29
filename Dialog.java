import java.awt.*;
import java.awt.event.*;

public class Dialog extends Frame implements ActionListener
{
	Label labelResult; 

	TextField textMonth;
	TextField textYear;

	Button button;

	public void displayDialog(){
	
		// Set input fields
		Label labelMonth = new Label("Month:");
		labelMonth.setBounds(100, 60, 45, 30);

		textMonth = new TextField();
		textMonth.setBounds(155, 60, 50, 30);

		Label labelYear = new Label("Year:");
		labelYear.setBounds(220, 60, 40, 30);

		textYear = new TextField();
		textYear.setBounds(260, 60, 52, 30);

		// Set button
		button = new Button("Show results");
		button.setBounds(350, 60, 120, 30);
		button.addActionListener(this);

	        // Set result text	
		labelResult = new Label("");
		labelResult.setBounds(100, 105, 380, 30);

		// Create new frame
		Frame window = new Frame("Calendar Result");
		window.setSize(600, 180);

		// Position the frame to the center of the screen
		window.setLocationRelativeTo(null);

		// Have the close button close the application
		window.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		});

		// Add components to window
		window.add(labelMonth);
		window.add(textMonth);

		window.add(labelYear);
		window.add(textYear);

		window.add(button);
		window.add(labelResult);

		window.setLayout(null);
		window.setVisible(true);
	}

	@Override
    	public void actionPerformed(ActionEvent e)
	{
		try{
			int month = Integer.parseInt(textMonth.getText());
			int year = Integer.parseInt(textYear.getText());
	       		
			labelResult.setText("Number of days is: " + Calendar.getDaysInMonth(month, year) + " and the year is" + (Calendar.isLeapYear(year) ? "" : " not") + " a leap year." );
		}
		catch(Exception ex){
			labelResult.setText("Please insert a valid date and month.");
		}

       	}

}
