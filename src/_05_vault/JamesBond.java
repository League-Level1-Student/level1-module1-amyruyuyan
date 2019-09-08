package _05_vault;

public class JamesBond {
int findCode(Vault vault) {
for (int i = 0; i < 1000000; i ++) {
if (vault.tryCode(i)) {
return i;	
}
	}
return -1;
}
}
