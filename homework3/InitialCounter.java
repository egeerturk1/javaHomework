package homework3;
import java.io.*;
public class InitialCounter implements FileProcessor{
    String mainFile;
    public InitialCounter(String mainFile){
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
        int counter=1;
        char[] c=new char[inputFilePath.length()];
        for(int i=0;i<inputFilePath.length();i++) {
            c[i]=inputFilePath.charAt(i);//I DİD THİS BY USİNG ARRAY LİKE İN THE C PROGRAMMİNG.
        }
        for(int i=0;i<inputFilePath.length();i++){
            if(inputFilePath.charAt(i)<='z'&&inputFilePath.charAt(i)>='a'){
                c[i]-=difference;
            }
        }
        for(int i=0;i<inputFilePath.length();i++){
            if(i==0||c[i-1]==' '){
                for(int j=i+1;j<inputFilePath.length();j++){
                    if(c[j]==c[i]&&(c[j-1]==' ')){
                        counter++;
                        c[j]='#';
                    }
                }
                if((c[i]<='z'&&c[i]>='a')||(c[i]<='Z'&&c[i]>='A'))
                    str+=""+c[i]+":"+counter+"\n";
                counter=1;
            }
        }
        return str;
    }
}
