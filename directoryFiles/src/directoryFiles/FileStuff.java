package directoryFiles;


import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class FileStuff {

	
//	Create a new file and make it read only
//
//	Read a file
//
//	Write contents to a file
//
//	write and object to a file
//
//	Create program to create files with extension 
//	.txt, .tex and write another program to delete
//	 files of .tex extension
	
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		String path = "C:\\Users\\ayuchoub\\eclipse-workspace\\Assignments\\src\\Assignments\\";
		FileStuff f= new FileStuff();
//		f.createReadOnlyFile(path+"trash");
//		System.out.println("-----------READING THE NEWLY CREATED READ ONLY FILE-------");
//		String s = f.readFile(new File(path+"trash"));
//		System.out.println(s);
		f.createTextFile(path+"pepsi", false);
		System.out.println("-----------"+f.readFile(new File(path+"pepsi.tex")));
		f.createTextFile(path+"burger", false);
		System.out.println("-----------"+f.readFile(new File(path+"burger.tex")));
		f.createTextFile(path+"tom", true);
		System.out.println("-----------"+f.readFile(new File(path+"tom.txt")));
		f.createTextFile(path+"hardy", true);
		System.out.println("-----------"+f.readFile(new File(path+"hardy.txt")));
		f.deleteTexFile(path);
		
//		f.deleteTexFile(path);
	}
	
	private void deleteTexFile(String path) {
		File file = new File(path);
		if(file.isDirectory()) {
			for(File f : file.listFiles(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return name.endsWith(".tex");
				}
			}) ) {
				f.delete();
			}
			
		}
		
	}
	
	private void createTextFile(String string, boolean b) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//b=true creates text file
		// b= false creates tex file
		
		String extention;
		if(b) extention = "txt";
		else extention ="tex";
		File f= new File(string+"."+extention);
		if(f.exists()) f.delete();
		this.writeIntoFile(f);
	}

	private String readFile(File file) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream(file.toString());
		byte[] b = (byte[]) fi.readAllBytes();
		fi.close();
		return new String(b);
		
	}

	public void writeIntoFile(File file) throws FileNotFoundException,IOException {
		FileOutputStream fo= new FileOutputStream(file.toString(), true);

		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Contents of the file:: "+file.getName());
			String s = sc.nextLine()+"\n";
			byte[] buffer = s.getBytes();
			fo.write(buffer);
			fo.close();
		
	}
	
	public void createReadOnlyFile(String filename) throws IOException, FileNotFoundException 
	{
		File file = new File(filename);
		if(file.exists()) file.delete();
		this.writeIntoFile(file);
		file.setReadOnly();
		
		System.out.println("File Created and converted to Read Only");
		}
		

}



