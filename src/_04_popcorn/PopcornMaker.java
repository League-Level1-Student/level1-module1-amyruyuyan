package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
Microwave microwave  = new Microwave();
String flavor = JOptionPane.showInputDialog("what flavor popcorn do you want?");
Popcorn popcorn = new Popcorn(flavor);
microwave.putInMicrowave(popcorn);
String time = JOptionPane.showInputDialog("How many minutes do you want your popcorn to be cooked for?");
int cooktime = Integer.parseInt(time);
microwave.setTime(cooktime);
microwave.startMicrowave();
}
}
