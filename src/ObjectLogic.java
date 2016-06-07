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
static ArrayList<FlashCardObject> cardList=new ArrayList<FlashCardObject>();
	static FileOutputStream fos=null;
	static FileInputStream fis=null;
	static private int index;
 static ArrayList<FlashCardObject> readObject() throws Exception{
		
	 
			fis=new FileInputStream(file);
			ObjectInputStream os=new ObjectInputStream(fis);
			FileReader fileReader=new FileReader(file);
			BufferedReader bf=new BufferedReader(fileReader);
		
		
		//	System.out.println("Read logic");
		FlashCardObject obj=null;
			try{
			while((obj=(FlashCardObject) os.readObject())!=null){
				cardList.add(obj);
				
				
				
				
			}}catch(Exception e){
				//e.printStackTrace();
			}
			
	
				finally{
			bf.close();
				}
			return cardList;
			
		
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

