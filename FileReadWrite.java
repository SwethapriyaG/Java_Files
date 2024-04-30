//Program to demonstrate reading contents from file
import java.io.*;

class FileReadWrite
{
	public static void main (String ar[]) throws Exception
	{
		//open file in read mode
		FileReader fr = new FileReader("twg.txt"); //can read single char
		
		// char ch;
		// int chr;
		
		//read the contents and print on the console
		
		/* System.out.println((char)fr.read()); 
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read()); */
		
		/* while((chr=fr.read()) !=-1) 
		{
			System.out.print((char)chr);
		}  */
		
		BufferedReader br = new BufferedReader(fr); // Can read line
		String s;
		while((s=br.readLine()) !=null)
			System.out.println(s);
		
		
		//open the file write mode
		
		FileWriter fw = new FileWriter("sample.txt");
		//FileWriter fw = new FileWriter("sample.txt", true); // append mode
		//connect FileWriter fw with BufferedWriter
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		char c[] = {'W','e','l','c','m','e'};
		
		bw.write(c, 3, 2);
		
		String st = "This is files class in Java";
		bw.write(st, 0, st.length());
		
		
		
		//write the contents into the file
		fw.write((int) 'H');
		
		//close the file
		bw.close();
		fw.close(); 
		
		
	}
	
	
}	