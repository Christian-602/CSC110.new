
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class ReadingLargeFiles {
	public static void main(ArrayList<Person> userList) {
		// starting point or the entry point
		var fileName = "C:\\Users\\Chris\\Desktop\\sample100csv.csv";		
		try {
			var userList = getData(fileName);
			writeData(userList);
		} catch (Exception e) {
			//TODO: handle exception
			System.out.println(e.getMessage());
		}	
	}
	public static ArrayList<Person> getData(String fileName) throws IOException {
		var userList = new ArrayList<Person>();
		var filePath = Paths.get(fileName);
		if(!Files.exists(filePath)){		
			return userList;
		}	
		var bufferReader = Files.newBufferedReader(filePath); // this is to throw away the the column labels
		var dataLine = bufferReader.readLine(); // assign
		if(dataLine == null){ /// compare
			bufferReader.close();
			return userList;
		}
		dataLine = bufferReader.readLine(); 
		
		while(dataLine != null){
			System.out.println("Data : "+ dataLine);

			var foundX =  dataLine.startsWith("X");
			if(!foundX ){// if the data does not start with X
				var person = new Person();
				var dataPart  = dataLine.split(",");
				person.name = dataPart[0];
				person.address = dataPart[1];
				person.phone= dataPart[2];
				person.amountOwed = Double.parseDouble(dataPart[3]);
				userList.add(person);
			}		
			dataLine = bufferReader.readLine();
		}
		bufferReader.close();
		return userList;
	}
	public static void writeData(ArrayList<Person> userList) throws IOException{
		// write the data to the file       
		var outFleName = "/Volumes/BU-2020/GateWayCC/Week 1 Demos/1-Demo Hello/data__bad_out.txt";        
		var outFilePath = Paths.get(outFleName);        
		var writeStream = Files.newBufferedWriter(outFilePath);        
		for (var userData : userList) {  
		   writeStream.write(userData.name+","+ userData.phone +","+ userData.address+","+ userData.amountOwed.toString());  
		   writeStream.newLine();  // ** need to know why you need to do this       
		}          
		writeStream.close(); // ** why you
	}
}
