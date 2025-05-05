import javax.swing.*;
import java.awt.event.*;

class SimpleGui{
	public static void main(String[]args){
		JFrame frame=new JFrame("My first Java Graphical Interface");
		frame.setSize(500,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		JTextField textField=new JTextField();
		textField.setBounds(100,40,300,60);
		frame.add(textField);

		JButton button=new JButton("Click Here For Output");
		button.setBounds(100,100,300,50);
		frame.add(button);

		JButton button1=new JButton("Close Application");
		button1.setBounds(100,150,300,50);
		frame.add(button1);

		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String text=textField.getText();
				JOptionPane.showMessageDialog(frame, "You Entered : " +text);


			}
		});
		frame.setVisible(true);

		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent c){
				JOptionPane.showMessageDialog(frame, "You Are Exiting now");
				frame.dispose();
			}
		});
	}
}
