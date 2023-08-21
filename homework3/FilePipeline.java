package homework3;

import java.io.*;
import java.util.*;

public class FilePipeline implements FileProcessor{
    private String keySampleOfCounter;
    private String keySampleOfFilter;
    String mainFile;
    public FilePipeline(String mainFile,String keySampleOfCounter,String keySampleOfFilter){
        this.mainFile = mainFile;
        this.keySampleOfCounter=keySampleOfCounter;
        this.keySampleOfFilter=keySampleOfFilter;
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
        ArrayList<FileProcessor> fileProcessors= new ArrayList<>();
        fileProcessors.add(new InitialCounter(inputFilePath));
        fileProcessors.add(new WordCounter(inputFilePath,keySampleOfCounter));
        fileProcessors.add(new WordFilter(inputFilePath,keySampleOfFilter));
        fileProcessors.add(new Capitalizer(inputFilePath));
        for(int i=0;i<fileProcessors.size();i++){
            str+=fileProcessors.get(i).process(inputFilePath)+"\n";
        }
        return str;
    }
}
