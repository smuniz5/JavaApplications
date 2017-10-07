//Savannah Muniz

import java.io.*;

public class Decryption {
	public static void main(String[] args) throws IOException{
		
		int decode;
		boolean endOfFile = false;
		
		FileInputStream istream = new FileInputStream("encryption.dat");
		DataInputStream inputFile = new DataInputStream(istream);
		
		FileOutputStream ostream = new FileOutputStream("decryption.dat");
		DataOutputStream outputFile = new DataOutputStream(ostream);
		
		FileInputStream stream = new FileInputStream("decryption.dat");
		DataInputStream inputFile1 = new DataInputStream(stream);
		
		System.out.print("Decoded message: ");
		
		while(!endOfFile){
			try{
				decode = (int)(inputFile.readChar() - 10);
				outputFile.writeChar((char)decode);
				System.out.print(inputFile1.readLine());	
			}catch(EOFException e){
				endOfFile = true;
			}
		}
		
		inputFile.close();
		outputFile.close();
		inputFile1.close();
		
	}

}
