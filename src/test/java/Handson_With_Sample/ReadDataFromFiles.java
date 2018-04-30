package Handson_With_Sample;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.annotations.Test;

public class ReadDataFromFiles {


final static Logger logger = Logger.getLogger(ReadDataFromFiles.class.getName());

	private ReadDataFromFiles() { }

	//To read data from the file either txt or Pdf
	public static String readAllText(String filePath) {
	File file = new File(filePath);
	
	if (file.exists()) {
		byte[] data;
	
		try (FileInputStream fis = new FileInputStream(file)) {
			data = new byte[(int)file.length()];
			fis.read(data);
	
	return new String(data, "UTF-8");
	}
	catch (IOException e) {
		logger.log(Level.SEVERE, filePath, e);
		}
	}
	
	return null;
	}
	
	public static String readAllText(File file) {
	return readAllText(file.getAbsolutePath());
	}



	
	@Test
	public void FileReadTest(){
	
		String nameaa = ReadDataFromFiles.readAllText("C:\\Social\\Cognizant\\Project allocation.xlsx");
		System.out.println(nameaa);
		
	}
	
	
	@Test
	public static void fileread() throws Exception
	  {
	    // pass the path to the file as a parameter
	    FileReader fr =
	      new FileReader("C:\\Social\\Cognizant\\Project allocation.xlsx");
	 
	    int i;
	    while ((i=fr.read()) != -1)
	      System.out.print((char) i);
	  }

	@Test
    public static void subtract()
    {
        int a = 300;
        int b = 200;
 
        System.out.println(Math.subtractExact(a, b));
    }

	
	@Test
    public static void filedelete() throws IOException
    {
        File file = new File("C:\\Social\\Cognizant\\Name.txt");

        if(file.delete())
        {
            System.out.println("File deleted successfully");
        }
        else
        {
            System.out.println("Failed to delete the file");
        }
    }

	
	
	public static void main(String[] args) throws IOException {
	
	File file = new File("C:\\Social\\Cognizant\\Name.txt");
	
    //***********WRITING TO A TEXT FILE**********//
    //FileWriter f = new FileWriter(file,true); //append
    FileWriter f = new FileWriter(file);
    BufferedWriter b = new BufferedWriter(f);
    b.write("Sunil");
    b.newLine();
    //b.write("Sunil n");// n moves cursor to new line
    b.write("Kumaraaaa");
    b.flush();
	
	
    //**********READING A TEXT FILE***********//
    String str=null;
    FileReader fr = new FileReader(file);
    BufferedReader  br = new BufferedReader(fr);
    System.out.println(br.read());
    while((str=br.readLine())!=null)
    {
     System.out.println(str);
    }

	}
	
}














