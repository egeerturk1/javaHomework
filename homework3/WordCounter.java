package homework3;

import java.io.*;
import java.util.Locale;

public class WordCounter implements FileProcessor{
    private String keySample;
    String mainFile;
    public WordCounter(String mainFile,String keySample){
        this.mainFile = mainFile;
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
        boolean isEqual=false;
        int difference='z'-'Z';
        int counter=0;
        char[] k=new char[keySample.length()];
        for(int i=0;i<keySample.length();i++) {
            k[i]=keySample.charAt(i);//I DİD THİS TO DO UPPERCASE İN EACH LETTER BECAUSE WHEN I WANT TO COUNT "THİS" MUST BE COUNTED TWİCE.
        }
        for(int i=0;i<keySample.length();i++){
            if(keySample.charAt(i)<='z'&&keySample.charAt(i)>='a'){
                k[i]-=difference;
            }
        }
        char[] c=new char[inputFilePath.length()];
        for(int i=0;i<inputFilePath.length();i++) {
            c[i]=inputFilePath.charAt(i);
        }
        for(int i=0;i<inputFilePath.length();i++){
            if(inputFilePath.charAt(i)<='z'&&inputFilePath.charAt(i)>='a'){
                c[i]-=difference;
            }
        }
        for(int i=0;i<inputFilePath.length();i++){
            if(k[0]==c[i]&&(i==0||c[i-1]==' ')){
                for(int j=0;j<keySample.length();j++){
                    if((i+keySample.length())<=inputFilePath.length()){
                        if(k[j]==c[i+j]){
                            isEqual=true;
                        }
                        else isEqual=false;
                    }
                }
                if(isEqual)
                    counter++;
            }
        }
        str=str+keySample+":"+counter+"\n";
        return str;
    }
}


