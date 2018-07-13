import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

import javax.swing.JOptionPane;

public class ClienteTCPBasico {
	public static void main(String[] args) {
	    try {
	      Socket cliente = new Socket("127.0.0.1",12345);
	      ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
	      Date data_atual = (Date)entrada.readObject();
	      System.out.println("Data recebida do servidor:" + data_atual.toString());
	      entrada.close();
	      System.out.println("Conex�o encerrada");
	    }
	    catch(Exception e) {
	      System.out.println("Erro: " + e.getMessage());
	 }
	 }
}