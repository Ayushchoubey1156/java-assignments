package directoryFiles;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;


	/*
	 * Implement Copy directories in java

	Delete a directory with all files inside it

	*/

	public class DirectoryStuff {

		public static void main(String[] args) throws IOException {
			File src = new File("C:\\Users\\ayuchoub\\eclipse-workspace\\Assignments\\src\\Assignments\\Source");
			File tgt = new File("C:\\Users\\ayuchoub\\eclipse-workspace\\Assignments\\src\\Assignments\\Target");	
			if(!src.exists()) throw new IOException("Source Folder Not Found");
			DirectoryStuff d = new DirectoryStuff();
			if(tgt.exists()) {
				d.deleteDir(tgt);
			}
			else {
				d.copyDir(src, tgt);
			}
		}
		

		public void copyDir(File src, File tgt) throws IOException, FileNotFoundException {
//			if directory encountered
			if(src.isDirectory()) {
				if (!tgt.exists()) {
					tgt.mkdir();
					System.out.println(src.getName()+" Folder Copied");
				}
				String[] files = src.list();
				for(String f : files) {
					copyDir(new File(src, f), new File(tgt, f));
				}
				
			}
			
			//if file encountered
			else {
				FileInputStream in = null;
				FileOutputStream out = null;
				
				try {
					in = new FileInputStream(src);
					out = new FileOutputStream(tgt);
					
					byte stream[] = new byte[1024];
					int length =1;
					while((length = in.read(stream)) > 0) {
						out.write(stream, 0, length);
					}
				}
				finally {
					if(in!=null) in.close();
					if(out!=null) out.close();
					
				}
				System.out.println(tgt.getName()+" File Copied");
			}	
		}
		
		public void deleteDir(File tgt) {
			if(tgt.isDirectory()) {
				if(tgt.list().length == 0) {
					tgt.delete();
					System.out.println(tgt.getName()+" Folder Deleted");
				}
				else{
					for(File f : tgt.listFiles()) {
					deleteDir(f);
					}
					if(tgt.list().length == 0) {
						tgt.delete();
						System.out.println(tgt.getName()+" Folder Deleted");
					}
				}
				
			}
			else {
				tgt.delete();
				System.out.println(tgt.getName()+" File Deleted");
			}
				
		}
	}
