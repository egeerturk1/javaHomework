package labwork3;
import java.util.Scanner;
public class Temperature {
    Scanner input = new Scanner(System.in);
    private String getScaleFromUser() {
        String str;
        try {
            str=input.nextLine();
            if(str.equals("Fahrenheit")||str.equals("fahrenheit")||str.equals("celsius")||str.equals("Celsius")||str.equals("FAHRENHEIT")||str.equals("CELSIUS"))
                return str;
            else{
                throw new Exception();
            }
        }catch(Exception e){
            System.out.print("Enter a valid scale (Celsius or Fahrenheit):");
            str=getScaleFromUser();
        }
        return str;
    }
    private double getCelsiusValueFromUser(){
        double temperature;
        try{
            temperature=input.nextInt();
            if(temperature<-273.15){
                throw new Exception();
            }
        }
        catch (Exception e){
            System.out.print("Enter a valid temperature (celsius):");
            input.nextLine();
            temperature=getCelsiusValueFromUser();
        }
        return temperature;
    }
    private double getFahrenheitValueFromUser(){
        double temperature;
        try{
            temperature=input.nextInt();
            if(temperature<-459.67){
                throw new Exception();
            }
        }
        catch (Exception e){
            System.out.print("Enter a valid temperature (fahrenheit):");
            input.nextLine();
            temperature=getFahrenheitValueFromUser();
        }
        return temperature;
    }
    public void convertingTemperatures(){
        System.out.print("Enter initial scale (Celsius or Fahrenheit):");
        String initialScale=getScaleFromUser();
        System.out.print("Enter target scale (Celsius or Fahrenheit):");
        String targetScale=getScaleFromUser();
        System.out.print("Enter the temperature value to be converted:");
        if(initialScale.equals("Celsius")||initialScale.equals("celsius")||initialScale.equals("CELSIUS")){
            double value=getCelsiusValueFromUser();
            if(targetScale.equals("Celsius")||targetScale.equals("celsius")||targetScale.equals("CELSIUS")){
                System.out.println("The converted temperature is: "+value+" "+"celsius");
            }
            else{
                System.out.println("The converted temperature is: "+((value*1.8)+32)+" "+"fahrenheit");
            }
        }
        if(initialScale.equals("Fahrenheit")||initialScale.equals("fahrenheit")||initialScale.equals("FAHRENHEIT")){
            double value=getFahrenheitValueFromUser();
            if(targetScale.equals("Fahrenheit")||targetScale.equals("fahrenheit")||initialScale.equals("FAHRENHEIT")){
                System.out.println("The converted temperature is: "+value+" "+"fahrenheit");
            }
            else{
                System.out.println("The converted temperature is: "+((value-32)/1.8)+" "+"celsius");
            }
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Would you like to exit (yes/no)");
        String answerOfUser=scanner.nextLine();
        if(answerOfUser.equalsIgnoreCase("no")){
            System.out.println("CONVERTER PROGRAM İS BEİNG STARTED AGAİN");
            convertingTemperatures();
        }
    }
    public static void main(String[] args){
        Temperature temperature=new Temperature();
        temperature.convertingTemperatures();
    }
}
