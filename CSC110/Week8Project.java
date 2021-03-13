import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Week8Project {

    public static void main(String... args) throws IOException{

    var fileName = "C:\\Users\\Chris\\Desktop\\CSC110\\data.txt";
    var filePath = Paths.get(fileName); 
    var bufferReader = Files.newBufferedReader(filePath); 
    var dataLine = bufferReader.readLine();
    var userList = new ArrayList<String>();


        while(dataLine != null){
        var foundX = dataLine.startsWith("X"); 

        if(foundX){ 
            userList.add(dataLine);

            var outFileName = "C:\\Users\\Chris\\Desktop\\CSC110\\goodDataExport.txt"; 
            var outFilePath = Paths.get(outFileName); 
            var writeStream = Files.newBufferedWriter(outFilePath); 
                for(var userData : userList){
                    writeStream.write(userData); 
                    writeStream.newLine(); 
                    }        
                    writeStream.close(); 
                    } 
        else{  

            var outFileNameBad = "/Users/ericolson/ERIC/AssmtReadWrite/src/CSC110/BadData.txt1"; 
            var outFilePathBad = Paths.get(outFileNameBad); 
            var writeStreamBad = Files.newBufferedWriter(outFilePathBad); 
                for(var userData : userList){
                    writeStreamBad.write(userData); 
                    writeStreamBad.newLine(); 
                    }        
                    writeStreamBad.close();
                    }
                }
            dataLine = bufferReader.readLine();

            bufferReader.close();

}}