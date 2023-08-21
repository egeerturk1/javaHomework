package homework3;
import java.io.*;
import java.util.*;
public class WordFilter implements FileProcessor{
    private String keySample;
    String mainFile;
    public WordFilter(String mainFile,String keySample){
        this.mainFile=mainFile;
        this.keySample=keySample;
    }
    public String read(){   //I WROTE THESE CODES FROM LAB LESSON
        String sample="";
        try{
            FileReader fileReader=new FileReader(mainFile);
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            String s= bufferedReader.readLine();
            while(s!=null){
                sample += s;
                s = bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();
        }
        catch(FileNotFoundException exception){
            exception.printStackTrace();
        }
        catch(IOException exception){
            exception.printStackTrace();
        }
        return sample;
    }
    public void write(String sample){
        try{
            FileWriter fileWriter=new FileWriter(mainFile);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(sample);
            bufferedWriter.close();
        } catch(IOException exception){
            exception.getStackTrace();
        }
    }
    @Override
    public String process(String inputFilePath){
        String str="";
        inputFilePath=inputFilePath.replaceAll(keySample,"");
        inputFilePath=inputFilePath.replaceAll("\\s+"," ");//I knew replaceAll method but I didn't know string.replaceAll("\\s+"," "); I learned this code stackoverflow. I did this remove space charachter.
        str+=inputFilePath+"\n";
        return str;
    }
}