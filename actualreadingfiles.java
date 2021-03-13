package CSC110;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class actualreadingfiles {
    public static void main(ArrayList<String> userList) {
        var fileName = "C:\\Users\\Chris\\Desktop\\CSC110\\readingfiles.txt";
        try {
            var userList = getData(fileName);
            writeData(userList);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    public static (ArrayList<String> getData(String fileName)) {
        var userList = new ArrayList<String>();
        var filePath = Paths.get(fileName);
        if(!Files.exists(filePath)){
            return userList;
        }
        var bufferReader = Files.newBufferedReader(filePath);
        var dataLine = bufferReader.readLine();
        if(dataLine == null){
            bufferReader.close();
            return userList;
        }
        dataLine = bufferReader.readLine();

        while(dataLine != null){
            System.out.println("Data: " + dataLine);

            var foundX = dataLine.startsWith("X");
            if(!foundX ){
                userList.add(dataLine);
            }
            dataLine = bufferReader.readLine();
        }
        bufferReader.close();
        return userList;
    }
    public static void writeData(ArrayList<String> userList) throws IOException{
        var outFleName = "C:\\Users\\Chris\\Desktop\\CSC110\\readingbad.txt";
        var outFilePath = Paths.get(outFleName);
        var writeStream = Files.newBufferedWriter(outFilePath);
        for (var userData : userList) {
            writeStream.write(userData.name + "," + userData.phone + "," + userData.address + "," + userData.amountOwed.toString());
        }
        writeStream.close();
    }

    public static void getData(String fileName){
        var fileName = "C:\\Users\\Chris\\Desktop\\CSC110\\readingfiles.txt";
        var filePath = Paths.get(fileName);

        if(!Files.exists(filePath)){
            System.out.println("**** Error: Could not find the file in the path" + fileName);
            return;
        }
        System.out.println("Success: file was found in the path " + fileName);

        var bufferReader = Files.newBufferedReader(filePath);
        var dataLine = bufferReader.readLine();
        if(dataLine == null){
            System.out.println("Success: there is no data in the file " + fileName);
            bufferReader.close();  
            return;
        }
        System.out.println("Data : " + dataLine);

        dataLine = bufferReader.readLine();
        var userList = new ArrayList<String>();
        while(dataLine != null){
            System.out.println("Data : "+ dataLine);
    
            var foundX =  dataLine.startsWith("X");
            if(!foundX ){// if the data does not start with X
                var person = new Person();
                var dataPart = dataLine.split(",");
                person.name = dataPart[0];
                person.address = dataPart[1];
                person.phone = dataPart[2];
                person.amountOwned = Double.parseDouble(dataPart[3]);
                userList.add(person);
            }		
            dataLine = bufferReader.readLine();
        }
        bufferReader.close();
    }
    
    var sortedMap = new TreeMap<String, String<();
    for (var userData : userList) {
        var dataElement = userData.split(",");
        sortedMap.put(dataElement[0], userData); // key, value
    }
    
    public static void GetData(String fileName){
        var fileName = "C:\\Users\\chris\\OneDrive\\Desktop\\codecademy\\CSC110\\data-1.txt";
        var filePath = Paths.get(fileName);
        // defensive programming
    
        if(!Files.exists(filePath)){		
            System.out.println("**** Error: Could not find the file in the path "+ fileName);
            return;
        }	
        System.out.println("Success:  file was found in the path "+ fileName);
        
        var bufferReader = Files.newBufferedReader(filePath); // this is to throw away the the column labels
        var dataLine = bufferReader.readLine(); // assign
        if(dataLine == null){ /// compare
            System.out.println("Success:  There is no data in the file"+ fileName);
            bufferReader.close();
            return;
        }
        System.out.println("Data : "+ dataLine);
    
        dataLine = bufferReader.readLine(); 
        var userList = new ArrayList<String>();
        while(dataLine != null){
            System.out.println("Data : "+ dataLine);
    
            var foundX =  dataLine.startsWith("X");
            if(!foundX ){// if the data does not start with X
                userList.add(dataLine);
            }		
            dataLine = bufferReader.readLine();
        }
        bufferReader.close();
        return userList;
    
    }
    var userList = getData(fileName);
    writeData(userList);
    catch (Exception e) {
        //TODO handle exception
        System.out.println(e.getMessage());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
