package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Socket clientSocket = null;
		ServerSocket serverSocket = null;
		Scanner sc = null;
		try{
			serverSocket = new ServerSocket(6083);
			System.out.println("Server started....");
			clientSocket = serverSocket.accept();
			System.out.println("Client connected.");
			sc = new Scanner(clientSocket.getInputStream());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		String message;
		
		while(true){
			if(sc.hasNext()){
				message = sc.nextLine();
				System.out.println("Client message: " + message);
			}
		}

	}

}
