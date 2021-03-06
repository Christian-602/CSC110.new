package CSC110;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.TreeSet;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
// importing tools that'll be used moving forward

public class finalproject {
    public static void main(String[] args) throws IOException {
        var fileName = "C:\\Users\\Chris\\Desktop\\sample100csv.csv";
        var goodDataExport = "C:\\Users\\Chris\\Desktop\\CSC110\\goodDataExport.txt";
        var badDataExport = "C:\\Users\\Chris\\Desktop\\CSC110\\badDataExport.txt";
        //above - setting "nodes" for paths

        var outFilePathfN = Paths.get(fileName);
        var outFilePathGood = Paths.get(goodDataExport);
        var outFilePathBad = Paths.get(badDataExport);
        // above - paths created between respective nodes

        if(!Files.exists(fileName)){
            System.out.println("Error 001: The following file does not exist: " + fileName);
            return;
        }
        if(!Files.exists(goodDataExport)){
            System.out.println("Error 001: The following file does not exist: " + goodDataExport);
            return;
        }
        if(!Files.exists(badDataExport)){
            System.out.println("Error 001: The following file does not exist: " + badDataExport);
            return;
        }
        //above - set error messages if file path is obstructed

        //below - setting up read/write framework
        var reader = Files.newBufferedReader(outFilePathfN);
        var goodWriter = Files.newBufferedWriter(outFilePathGood);
        var BadWriter = Files.newBufferedWriter(outFilePathBad);
        var dataRead = reader.readLine();

        var userList = getData(fileName);
    writeData(userList);
    catch (Exception e) {
        
    }
    //TODO handle exception
    System.out.println(e.getMessage());

        //below - setting up framework for Tree
        var set = new TreeSet<String>();
        int setTime = 0;
        var tree = new ArrayList<String>();
        int listTime = 0;
        dataRead = reader.readLine();

        // below - splitting data and sorting into respective 'good', 'bad' categories. writing bad data first
        var startingNumber = 1;
        while(dataRead != null){
            var dataSplit = data.split(",", 4);
            var badData = Arrays.asList(dataSplit).contains(",") || Arrays.asList(dataSplit).contains(null);
            ((Object) dataSplit).serialNumber();
            ((Object) dataSplit).company();
            ((Object) dataSplit).employee();
            ((Object) dataSplit).description();
            ((Object) dataSplit).leave();

            dataRead = reader.readLine();
            startingNumber = startingNumber + 1;
        }


        var stop = System.currentTimeMillis();
        listTime += (setTime - long.toString(stop));

        // below - writing out good data after bad data has been sorted above
        for (var userData : tree) {
            goodWriter.append(userData.toString());
            goodWriter.newLine();
        }

        setTime += (stop - setTime);
        System.out.println("List Time = " + String.valueOf(listTime));
        System.out.println("List Time = " + String.valueOf(listTime));
        
        // below - all data taken care of, close readers and writers
        reader.close();
        goodWriter.close();
        BadWriter.close();
    }

    private static void writeBadData(BufferedWriter writer, User user, int counter) throws IOException {
        writer.append("Line " + counter + " Row " + user.getBadLine());
        writer.newLine();
    }
}
