package View;

import javax.swing.JOptionPane;
import Controller.KillController;

public class Principal_SO2 {

	public static void main(String[] args) {
		KillController k = new KillController();	
		int menu = 0;
		
		while (menu != 9) {
			
			menu = Integer.parseInt(JOptionPane.showInputDialog("""
					1 - Lista de Processos
					2 - Mata tarefa (PID) 
					3 - Mata tarefa (Nome)
					9 - Encerra
					"""));
			
			switch (menu){

			case 1:
				
			k.listaProcessos();
				
			break;
				
			case 2:
				
			k.matapid();
				
			break;
			
			case 3:
				
			k.matanome();
				
			break;
				
			case 9: System.out.println("\nEncerrando...");

			}	
		}

	}

}
