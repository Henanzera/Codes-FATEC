/*4�) Ler a idade de uma pessoa e informar a sua classe eleitoral:
N�o-eleitor (abaixo de 16 anos)
Eleitor obrigat�rio (entre 18 e 65 anos)
Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)*/

import javax.swing.JOptionPane;

public class Eleitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String entrada;
	        int idade;

	        entrada = JOptionPane.showInputDialog(null,"Por favor inserir a idade do eleitor: ","Entrada",1);
	        idade = Integer.parseInt(entrada);

	        String situa��o1 = "N�o eleitor.", 
	        	   situa��o2 = "Eleitor facultativo", 
	        	   situa��o3 = "Eleitor obrigat�rio", 
	        	   S_idade = "Idade do eleitor: ";

	        // Menores de 16 anos
	        if(idade<16){

	            JOptionPane.showMessageDialog(null,S_idade+idade+"anos.\n"+situa��o1,"Compara��o",1);
	        }
	        //De 16 a 17 anos e maiores de 65 anos
	        if((idade==16) || (idade==17) || (idade>65)){

	            JOptionPane.showMessageDialog(null,S_idade+idade+"anos.\n"+situa��o2,"Compara��o",1);
	        }
	        //De 18 a 65 anos
	        if ((idade>=18) && (idade<=65)){

	            JOptionPane.showMessageDialog(null,S_idade+idade+"anos.\n"+situa��o3,"Compara��o",1);
	        }
	    }
	
	}


