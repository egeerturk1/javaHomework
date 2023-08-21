package homework3;

import java.io.*;

public class Capitalizer implements FileProcessor{
    String mainFile;
    public Capitalizer(String mainFile){
        this.mainFile = mainFile;
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
        int difference='z'-'Z';
        char[] c=new char[inputFilePath.length()];//I LEARNED THİS FROM C PROGRAMMİNG.
        for(int i=0;i<inputFilePath.length();i++){
            c[i]=inputFilePath.charAt(i);
        }
        for(int i=0;i<inputFilePath.length();i++){
            if(i==0||inputFilePath.charAt(i-1)==' '){
                if(inputFilePath.charAt(i)<='z'&&inputFilePath.charAt(i)>='a'){
                    c[i]-=difference;
                }
            }
        }
        for(int i=0;i<c.length;i++){
            str+=c[i];
        }
        return str+"\n";
    }
}
