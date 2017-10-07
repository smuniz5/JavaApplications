//Savannah Muniz

import java.io.*;

public class Encryption{

	public static void main(String[] args) throws IOException{
		
		int code;
		boolean endOfFile = false;
		
		FileOutputStream ostream = new FileOutputStream("normalFile.dat");
		DataOutputStream outputFile = new DataOutputStream(ostream);
		
		String message = "This is a coded message.";
		System.out.println("Message to be encrypted: "+message);
		
		outputFile.writeUTF(message);
		
		outputFile.close();
		
		FileInputStream istream = new FileInputStream("normalFile.dat");
		DataInputStream inputFile = new DataInputStream(istream);
		
		FileOutputStream stream = new FileOutputStream("encryption.dat");
		DataOutputStream outputEncryption = new DataOutputStream(stream);
		
		FileInputStream istream1 = new FileInputStream("encryption.dat");
		DataInputStream inputFile1 = new DataInputStream(istream1);
		
		System.out.print("Encrypted message: ");
		
		while(!endOfFile){
			try{
				code = (int)(inputFile.readChar()) + 10;
				outputEncryption.writeChar((char)code);
				System.out.print(inputFile1.readLine());
			}catch(EOFException e){
				endOfFile = true;
			}
			
		}
		outputEncryption.close();
		inputFile.close();
		inputFile1.close();
		
		
	}
	
}
