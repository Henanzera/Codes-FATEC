package Sorvetedoze.pkg5; 

 

/** 

* 

* @author Henan Byaze Mendonça Fatec Tatui GTI 2° Semestre

*/ 

import javax.lang.model.SourceVersion;
import javax.swing.*; 

public class Sorvetedoze { 

 

/** 

* @param args the command line arguments 

*/ 

public static void main(String[] args) { 

// TODO code application logic here 

 

int escolha; 

// criar a "String desta forma facilita a formação da mensagem 

String st = " Escolha um sabor: "+ 

"\nAbacaxi        = 1"+ 

"\nAbacate        = 2"+ 

"\nAbobora        = 3"+ 

"\nChocolate      = 4"+ 

"\nCoco           = 5"+ 

"\nLaranja        = 6"+ 

"\nMorango        = 7"+ 

"\nTangerina      = 8"; 

 

/* em vez de escrever a mensagem dentro da caixa de InputDialog ela foi 

escrita em separado. */ 

 

String a = JOptionPane.showInputDialog(null,st); 

escolha = Integer.parseInt (a); 

 

switch (escolha) 

{ 

case 1 : st = "Abacaxi "; break ; 

case 2 : st = "Abacate "; break ; 

case 3 : st = "Abobora "; break ; 

case 4 : st = "Chocolate "; break ; 

case 5 : st = "Coco "; break ; 

case 6 : st = "Laranja "; break ; 

case 7 : st = "Morango "; break ; 

case 8 : st = "Tangerina "; break ; 

default : st = "Inexistente !"; 

 

} 

 

// duas "Strings" são criadas fora do painel de mensagem 

String ms = "Sorvete do Zé"; 

String mss = "Sabor escolhido = "; 

 

// as tres "Strings" são chamadas dentro de MessageDialog 

JOptionPane.showMessageDialog (null, mss+st+ms+1); 

 

System.exit(0); // provoca a saida do sistema 

 

} 

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

 

} 

 