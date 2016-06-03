import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ObjectLogic	
{
	static File file=new File("flash.txt");
	
	static FileOutputStream fos=null;
	static FileInputStream fis=null;
	
 static void readObject() {
		
	 try{
			fis=new FileInputStream(file);
			ObjectInputStream os=new ObjectInputStream(fis);
			FileReader fileReader=new FileReader(file);
			BufferedReader bf=new BufferedReader(fileReader);
			String line=null;
			System.out.println("Read logic");
			/*line=bf.readLine();
			System.out.println(line);*/
			while((line=bf.readLine())!=null){
				
			FlashCardObject fco=(FlashCardObject)os.readObject();
			String s=fco.toString();
		
			System.out.println(s);
			}
		
			bf.close();
			
		}
		catch(Exception e){
			System.err.println("File not Found");
			
		}
	}
	
static void writeObject(ArrayList<FlashCardObject> cardList) {
	try{
	
		fos=new FileOutputStream(file);
		ObjectOutputStream os=new ObjectOutputStream(fos);
		for(FlashCardObject cards:cardList)
		os.writeObject(cards);
		os.close();
		
	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println("error in writing object");
		
	}
	
	}

	

	

	

}

