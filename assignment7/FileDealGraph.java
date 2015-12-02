package File;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FileDealGraph extends NEUFrame {
	private JTextField wordsText;
	private JButton helloButton;
	private JButton quitButton;

	@Override
	public void create() {
		wordsText = new JTextField(35);
		helloButton = new JButton("Reverse");
		quitButton = new JButton("Quit");
	}

	@Override
	public void add() {
		getContentPane().setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		panel.add(new JLabel("Output reverse"));
		panel.add(wordsText);
		getContentPane().add(panel, "North");
		getContentPane().add(helloButton,"Center");
		getContentPane().add(quitButton,"Center");
	}

	class ButtonClick implements ActionListener {
		int clicked = 0;
		String filecontent="/assignment/workspace/workspace/FileDeal/src/File/FileLineReverse.java";
		FileLineReverse flr = new FileLineReverse(filecontent);
		ArrayList<String> buList = new ArrayList<>();
		
		public ButtonClick() {
			System.out.println("beigin response the button click");
			try {
				buList = flr.getStrList();
		    } catch (IOException e) {
		    }
		}
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource() == helloButton){
				if(clicked < buList.size()) {
					wordsText.setText(buList.get(clicked));
				} else {
					JOptionPane.showMessageDialog(null,
						    "File has been finished display.");
					System.out.println("Hello World -> " + clicked + buList);
				}
				clicked++;
				System.out.println("Hello World -> " + clicked + buList);
			}
		}

	}

	@Override
	public void addListeners() {
		ButtonClick bc = new ButtonClick();
		helloButton.addActionListener(bc);
		quitButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Quitting..");
				System.exit(0);
			}
			
		});
	}

	public static void main(String[] args) {
		new FileDealGraph();

	}
}
