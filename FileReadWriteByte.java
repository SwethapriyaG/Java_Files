import java.io.*;

class FileReadWriteByte
{
	public static void main(String ar[]) throws Exception
	{
		//open file by using byte stream - FileInputStream
		
		FileInputStream fin = new FileInputStream("sample.txt");
		int ch;
		//read and print the contents
		while((ch=fin.read()) !=-1)
		System.out.print((char)ch);
		
		//open the file in write mode
		FileOutputStream fos=new FileOutputStream("xzy.txt");
		
		//write the contents into the file
		fos.write((int)'Z');
		
		byte b[]={34, 78, 36, 76};
		
		fos.write(b);
		
		fos.close();
		fin.close();
		
	}
}	