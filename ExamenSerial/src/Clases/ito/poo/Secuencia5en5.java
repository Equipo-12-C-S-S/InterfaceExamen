package Clases.ito.poo;
import java.util.Scanner;
import javax.swing.JOptionPane;
import interfaces.ito.poo.Serial;

public class Secuencia5en5 {
	public Secuencia5en5() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*int op;
	do {
		
		 op =Integer.parseInt(JOptionPane.showInputDialog("¿Desea comenzar?"
				+ "\n1.-Si.\n2.-No."));*/
		Secuencias5en5 inter = new Secuencias5en5();
		System.out.println( "\nReiniciando ");
	    inter.reiniciar();
	   long x=Integer.parseInt(JOptionPane.showInputDialog("Ingresa desde donde se inicia ahora"));
	    System.out.println( "El numero siguiente es 5");
	    inter.siguiente();
	//} while(op==1);
	//JOptionPane.showMessageDialog(null, "Fin del programa");	
}
}