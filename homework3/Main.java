package homework3;
public class Main{
    public static void main(String[] args){
        InitialCounter initialCounter=new InitialCounter("C:\\java.yasar\\homework3\\src\\homework3\\Sample.txt");
        String text1=initialCounter.read();
        String newText=initialCounter.process(text1);
        WordCounter wordCounter=new WordCounter("C:\\java.yasar\\homework3\\src\\homework3\\Sample.txt","this");
        String text2=wordCounter.read();
        newText+=wordCounter.process(text2);
        WordFilter wordFilter=new WordFilter("C:\\java.yasar\\homework3\\src\\homework3\\Sample.txt","file");
        String text3=wordFilter.read();
        newText+=wordFilter.process(text3);
        Capitalizer capitalizer=new Capitalizer("C:\\java.yasar\\homework3\\src\\homework3\\Sample.txt");
        String text4=capitalizer.read();
        newText+=capitalizer.process(text4);
        FilePipeline filePipeline=new FilePipeline("C:\\java.yasar\\homework3\\src\\homework3\\Sample.txt","this","file");
        String text5= filePipeline.read();
        newText+=filePipeline.process(text5);
        filePipeline.write(newText);
    }
}
