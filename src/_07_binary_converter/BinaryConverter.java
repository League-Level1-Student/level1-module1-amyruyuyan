package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton("convert");
JTextField answer = new JTextField(20);
JLabel label = new JLabel();
public static void main(String[] args) {
BinaryConverter convert = new BinaryConverter();	
convert.setup();
}
void setup() {
button.addActionListener(this);
frame.setVisible(true);
panel.add(button);
panel.add(answer);
panel.add(label);
frame.add(panel);
frame.pack();
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String binary;
	binary = answer.getText();
	binary = convert (binary);
	label.setText(binary);
	frame.pack();
	}
	
}



                                       

