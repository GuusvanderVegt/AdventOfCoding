package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AOC {

    public AOC(String day) {
        File file = new File("files/day" + day + ".txt");
        BufferedReader reader;

        try{
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex){
            System.err.println("File not found!");
//            solve(new ArrayList<>());
            return;
        }

        List<String> fileLines = new ArrayList<>();
        try{
            String line;
            while((line = reader.readLine()) != null){
                fileLines.add(line);
            }

            reader.close();
        } catch(IOException e)
        {
            e.printStackTrace();
        }

        solve(fileLines);
    }

    abstract void solve(List<String> input);
}
