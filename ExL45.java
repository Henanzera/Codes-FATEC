/*3º) Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o 
valor da compra for menor que R$20,00; caso contrário, o lucro será de 30%. Entrar 
com o valor do produto e imprimir o valor da venda*/

import javax.swing.JOptionPane;

public class Lucro45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	String entrada;
	double VP, VV;
	
	     entrada = JOptionPane.showInputDialog(null, "Insira um valor", "x", 1);
         VP = Double.parseDouble(entrada);
		
         if (VP<20) {
        	 VV = VP*1.45;
        	 JOptionPane.showMessageDialog(null,"Lucro de 45% sobre a venda\n" + "Valor de venda: R$" + String.format("%.2f",VV),"Venda" ,1);
        	 }
         else {
        	 VV = VP*1.3;
        	 JOptionPane.showMessageDialog(null,"Lucro de 30% sobre a venda\n" + "Valor de venda: R$"+ String.format("%.2f",VV),"Venda" ,1);
         }
         System.exit(0);
	}
}
