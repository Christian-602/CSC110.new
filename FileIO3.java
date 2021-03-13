import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class FileIO3 {
    public static void main(String... args) throws IOException{
        var fileName = "C:\\Users\\Chris\\Desktop\\CSC110\\fileio.txt";

        var filePath = Paths.get(fileName);
        if(!Files.exists(filePath)){
            System.out.println("The file " + fileName + "could not be found");
        }
        System.out.println("Success: file was found in the path " + fileName);

        var userInfos = new ArrayList<String>();

        var dataElementCount = 0;
        var readStream = Files.newBufferedReader(filePath);
        var data = readStream.readLine();

        while(data !=null){
            data = readStream.readLine();
            if(data !=null){
                userInfos.add(data);
            }

        }
        readStream.close();

        Object dataLine;
        var foundX = dataLine.startsWith("X");
        if(!foundX ){
            userList.add(dataLine);
        }
    
        
        System.out.println("Data from array list : " + data);

        System.out.println("--------NAMES--------");
        for (var userData : userInfos) {
            var elements = userData.split(",");
            System.out.println(userData);
        }
        System.out.println("----------");


        var outFileName = "C:\\Users\\Chris\\Desktop\\CSC110\\fileio.actual.txt";
        var outFilePath = Paths.get(outFileName);
        var writeStream = Files.newBufferedWriter(outFilePath);
        for (var userData : userInfos) {
            writeStream.write(userData);
            writeStream.newLine();
        }
        writeStream.close();

    }
}
