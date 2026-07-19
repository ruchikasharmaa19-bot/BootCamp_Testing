package FileTest;
import java.io.File;
import java.io.IOException;
public class newfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File myobj= new File("C:\\Users\\Ruchika sharma\\OneDrive\\Desktop\\Files.txt");
	if(myobj.createNewFile()) {
		System.out.println("file created"+myobj.getName());
		System.out.println("absolute path" +myobj.getAbsolutePath());
	}
	else {
		System.out.println("file exists");
	}
	
}
catch (IOException e) {
	System.out.println("error occured");
	e.printStackTrace();
}
	} 

}
