package CSC110;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class W4 {
    public static void main(String... args) throws IOException {
        var fileName = "C:\\Users\\Chris\\Desktop\\CSC110\\data.txt";

        var filePath = Paths.get(fileName);
        if(!Files.exists(filePath)){
            System.out.println("The file " + fileName + "could not be found.");
        }

        var userInfos = new ArrayList<String>();

        var dataElementCount = 0;
        var readStream = Files.newBufferedReader(filePath);
        var data = readStream.readLine();

        while(data != null){
            data = readStream.readLine();
            if(data != null){
                userInfos.add(data);
            }

        }
        readStream.close();

        var outFileName = "C:\\Users\\Chris\\Desktop\\CSC110\\blank.txt";
        var outFilePath = Paths.get(outFileName);
        var writeStream = Files.newBufferedWriter(outFilePath);
        for (var userData : userInfos){
            writeStream.write(userData);
            writeStream.newLine();
        }
        writeStream.close();
    }
}