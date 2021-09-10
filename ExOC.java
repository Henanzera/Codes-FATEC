//2º) Ler três números e mostrá-los em ordem crescente.

package ordemcrescente;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ordemcrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String v1, v2, v3;
        int num[] = new int[3];
        
        // leitura dos valores
         v1 = JOptionPane.showInputDialog(null,"Entre com o primeiro valor:" ,"v1",1);
         num[0] = Integer.parseInt(v1);

         v2 = JOptionPane.showInputDialog(null,"Entre com o segundo valor","v2",1);
         num[1] = Integer.parseInt(v2);

         v3 = JOptionPane.showInputDialog(null,"Entre com o terceiro valor","v3",1);
         num[2] = Integer.parseInt(v3);
        // função sort do objeto Array organiza valor no vetor
        Arrays.sort(num);
        
        // ira mostrar os numeros em ordem crescente
        JOptionPane.showMessageDialog(null,"Numeros em ordem crescente:"+num[0]+","+num[1]+","+num[2]);
        }
}      
