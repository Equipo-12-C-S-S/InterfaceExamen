package Clases.ito.poo;
import java.util.Scanner;

import javax.swing.JOptionPane;

import interfaces.ito.poo.Serial;

public class Secuencias5en5 implements Serial {
	
	static Secuencia5en5 s;
     int valor, iniciar;
	
	public Secuencias5en5(){
		iniciar=0;
		valor=5;
	}

	@Override
	public void reiniciar() {
		int res;	
		this.valor=5;
		for (int i=1; i<=40; i++) {
		res=(i*valor);
		System.out.println(  res);
		}		
	}

	public  void iniciar(long x) {	
		 x = 0;
	}

	public long siguiente() {
		long res=0;
		long x=Integer.parseInt(JOptionPane.showInputDialog("Ingresa desde donde se inicia ahora"));
		for (int i=1; i<=40; i++) {
		res=(i*valor);
		System.out.println("Sucecion de la siguiente iniciacion "+res);
	}
		return res;
	}
}
