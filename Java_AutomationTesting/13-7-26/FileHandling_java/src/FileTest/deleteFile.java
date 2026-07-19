package FileTest;
import java.io.File;

public class deleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File myobj= new File("C:\\Users\\Ruchika sharma\\OneDrive\\Desktop\\Files.txt");
	if(myobj.delete()) {
		System.out.println("file created"+myobj.getName());
		System.out.println("absolute path" +myobj.getAbsolutePath());
	}
}
	

catch (Exception e) {
	System.out.println("error occured");
	e.printStackTrace();
}
	


}
}
