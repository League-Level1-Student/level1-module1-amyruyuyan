package _05_vault;

import java.util.Random;

public class Vault {
int SecretCode = 0;
Vault(int SecretCode){	
	this.SecretCode = SecretCode;
}
boolean tryCode(int guess) {
	if (guess == SecretCode) {
	return true;	
	}
	else {
	return false;	
}
}
public static void main(String[] args) {
	Vault vault = new Vault(new Random().nextInt(1000000));	
	JamesBond Bond = new JamesBond();
	System.out.println(Bond.findCode(vault)); 
}
}
