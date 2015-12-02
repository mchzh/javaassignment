package File;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator1 extends NEUFrame {

	// GUI element
	private static final Font BIGGER_FONT = new Font("monspaced", Font.PLAIN, 20);
	private BorderLayout toplayout;
	private GridLayout layout;
	private JPanel topJpanel;
	private JPanel centerJpanel;
	private JButton refresh_btn;
	private JButton cbutton[];
	private String action = null;
	StringBuilder oper = new StringBuilder();
    private JTextField displayText;
	
    //arithmetic variables
    Double value1 = 0.0;
	Double value2 = 0.0;
	int operator = 0;
	boolean negative = false;
	
	public void create() {
		
		String[] label = {"1","2","3","*","4","5","6","-","7","8","9","+","0",".","/","="};
	
		toplayout = new BorderLayout();
		topJpanel = new JPanel();
		displayText = new JTextField("0", 20);
		layout = new GridLayout(4,4);
		centerJpanel = new JPanel(layout);
		refresh_btn = new JButton("CE");
		cbutton = new JButton[16];
		for(int i = 0; i < cbutton.length; i++) {
			cbutton[i] = new JButton(label[i]);
			cbutton[i].setFont(BIGGER_FONT);
		}
	}

	@Override
	public void add() {
		Container con = getContentPane();
		con.setLayout(toplayout);
		displayText.setSize(400, 20);
		displayText.setHorizontalAlignment(getHeight());
		displayText.setFont(BIGGER_FONT);
		topJpanel.add(displayText);
		topJpanel.add(refresh_btn, displayText);
		con.add("North",topJpanel);
		for(int i = 0; i < cbutton.length; i++) {
			centerJpanel.add(cbutton[i]);
		}
		con.add("Center", centerJpanel);
	}

	class CalculatorAction implements ActionListener {

		public void setneg() {
			if(negative) {
				value1 = (-1) * value1;
			}
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String digit = e.getActionCommand();
			try{
				if(!(digit.equals("*") || 
						digit.equals("/") ||
						digit.equals("-") ||
						digit.equals("+") ||
						digit.equals("="))) {
					if(digit.equals(".") && oper.indexOf(".") != -1) {
						return;					
					}
					oper.append(digit);
					displayText.setText(oper.toString());
				}
				
				if(e.getSource() == refresh_btn) {
					oper.replace(0, displayText.getText().length(), "");
					displayText.setText("");
				}
				
				
				if(digit.equals("*")) {
					action = e.getActionCommand();
					value1 = Double.parseDouble(displayText.getText());
					setneg();
					oper.replace(0, displayText.getText().length(), "");
					displayText.setText("");
					negative = false;
				}
				if(digit.equals("+")) {
					action = e.getActionCommand();
					value1 = Double.parseDouble(displayText.getText());
					setneg();
					oper.replace(0, displayText.getText().length(), "");
					displayText.setText("");
					negative = false;
				}
				if(digit.equals("-")) {			
					if(oper.toString().equals("")){
						negative = true;
					} else {
						action = e.getActionCommand();
						value1 = Double.parseDouble(displayText.getText());
						setneg();
						oper.replace(0, displayText.getText().length(), "");
						displayText.setText("");
						negative = false;
					}
				}
				if(digit.equals("/")) {
					action = e.getActionCommand();
					value1 = Double.parseDouble(displayText.getText());
					setneg();
					oper.replace(0, displayText.getText().length(), "");
					displayText.setText("");
					negative = false;
				}
				if(digit.equals("=")) {
					Double result = 0.0;
					value2 = Double.parseDouble(displayText.getText());
					if(action.equals("*")) {
						displayText.setText(Double.toString(value1*value2));
					} 
					if(action.equals("+")) {
						displayText.setText(Double.toString(value1+value2));
					} 
					if(action.equals("-")) {
						displayText.setText(Double.toString(value1-value2));
					} 
					if(action.equals("/")) {
						if(!value2.equals(result)) {
							displayText.setText(Double.toString(value1/value2));
						}
					} 
					oper.setLength(0);
					value1 = 0.0;
					value2 = 0.0;
					action = null;
				}
			} catch(Exception e1) {
				
			}
		}
	  }
	 
	@Override
	public void addListeners() {
		CalculatorAction calc = new CalculatorAction();
		refresh_btn.addActionListener(calc);
		
		for(int i = 0; i < cbutton.length; i++) {
			cbutton[i].addActionListener(calc);
		}
	}

	public static void main(String[] args) {
		new Calculator1();

	}
}
