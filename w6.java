package CSC110;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class w6 {
    public static void main(String[] args) throws IOException {
        var fileName = "C:\\Users\\Chris\\AppData\\Local\\Temp\\MicrosoftEdgeDownloads\\b790867d-e031-4eff-9420-c98bae9007c7\\Sample100.csv";
        var filePath = Paths.get(fileName);
    
        if(Files.exists(filePath)){
            System.out.println("Failure: file notfound." + fileName);
            return;
        }
        System.out.println("Success: file found."+ fileName);
        var bufferReader = Files.newBufferedReader(filePath);
        var dataLine = bufferReader.readLine();
        if(dataLine == null){
            System.out.println("Success: no more data to read.");
            bufferReader.close();
            return;
        }
        System.out.println("Data : "+ dataLine);
    }
    
    public static ArrayList<String> getData(String fileName) throws IOException {
        dataLine = bufferReader.readLine();
        var arrayList = new ArrayList<String>();
       while(dataLine !=null){
           System.out.println("Data : "+ dataLine);
       }
       dataLine = bufferReader.readLine();
   }
   bufferReader.close();  
    }

}
    