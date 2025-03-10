package Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class KillController {

	public static void main(String[] args) {
	

	}
	
	private static String NomeSO() {
		
		String nome = System.getProperty("os.name");
		System.out.print("Sistema operacional identificado: "+nome+"\n");
	return nome;
	}
	
	public void listaProcessos(){
		String a = NomeSO();
		String comando = "";
		
		if ( a.contains("Win")) {
	
			// comando para encontrar o IPv4 no ipconfig
			comando = "cmd.exe /c TASKLIST /FO TABLE";
			
		}
		else if((a.contains("nux")) || (a.contains("mac"))) {
			
			// comando para encontrar o IPv4 no ip addr
			comando = "cmd.exe /c ps -ef";	
				
		}
		else {
			
			System.out.println("Sistema operacional não suportado: "+a);
			
		}
		
		try {
		//execução do código no terminal
		Process processo = Runtime.getRuntime().exec(comando);
        BufferedReader leitor = new BufferedReader(new InputStreamReader(processo.getInputStream()));
		
        String linha;

        	// Exibe a saída do comando
        	while ((linha = leitor.readLine()) != null) {
        		System.out.println(linha);
        	}
		}
		catch(Exception e){
			
			String aviso = e.getMessage();
			System.err.println(aviso);
			
		}	
	}
	
	public void matapid() {
		String a = NomeSO();
		String comando = "";
		
		if ( a.contains("Win")) {
	
			// comando para encontrar o IPv4 no ipconfig
			comando = "cmd.exe /c TASKKILL /PID "+JOptionPane.showInputDialog("Insira o PID da tarefa que deseja matar");
			
		}
		else if((a.contains("nux")) || (a.contains("mac"))) {
			
			// comando para encontrar o IPv4 no ip addr
			comando = "kill -9"+JOptionPane.showInputDialog("Insira o PID da tarefa que deseja matar");;	
				
		}
		else {
			
			System.out.println("Sistema operacional não suportado: "+a);
			
		}
		
		try {
		//execução do código no terminal
		Process processo = Runtime.getRuntime().exec(comando);
        BufferedReader leitor = new BufferedReader(new InputStreamReader(processo.getInputStream()));
		}
		catch(Exception e){
			
			String aviso = e.getMessage();
			System.err.println(aviso);
			
		}	
	}
	
	public void matanome() {
		String a = NomeSO();
		String comando = "";
		
		if ( a.contains("Win")) {
	
			// comando para encontrar o IPv4 no ipconfig
			comando = "cmd.exe /c TASKKILL /IM "+JOptionPane.showInputDialog("Insira o nome da tarefa que deseja matar");
			
		}
		else if((a.contains("nux")) || (a.contains("mac"))) {
			
			// comando para encontrar o IPv4 no ip addr
			comando = "pkill -f "+JOptionPane.showInputDialog("Insira o nome da tarefa que deseja matar");;	
				
		}
		else {
			
			System.out.println("Sistema operacional não suportado: "+a);
			
		}
		
		try {
		//execução do código no terminal
		Process processo = Runtime.getRuntime().exec(comando);
        BufferedReader leitor = new BufferedReader(new InputStreamReader(processo.getInputStream()));

		}
		catch(Exception e){
			
			String aviso = e.getMessage();
			System.err.println(aviso);
			
		}	
		
		
	}

}
