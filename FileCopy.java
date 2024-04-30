//program to demonstrate copy one file contents into another file

import java.io.*;

class FileCopy
{
	public static void main(String ar[]) throws Exception
	{
		
	  //open image file in read mode
	  FileInputStream fin = new FileInputStream("image.JPG");
	
	
	  //open new file in write mode
	  FileOutputStream fout = new FileOutputStream("eleImage.JPG");
		
	  // perform the copy operation
	  int ch;
	
	  while((ch=fin.read()) !=-1)
		fout.write(ch);
	
	   //close the stream
	   fout.close();
	}
}	