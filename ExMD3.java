//1º) Ler um valor e informar se ele é ou não múltiplo de 3.

import javax.swing.*;

public class ExercicioMultiplosDe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String entrada;
        int num;
        
        entrada = JOptionPane.showInputDialog(null, "Insira um valor", "Entrada", 3);
        num = Integer.parseInt(entrada);
        
        if (num % 3 == 0) {
            JOptionPane.showMessageDialog(null, "Numero Informado: " + num + "\n multiplo de 3", "Comparação", 1);
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Numero Informado: " + num + "\n  não multiplo de 3", "Comparação", 1);
        }
	}
		  
	}
