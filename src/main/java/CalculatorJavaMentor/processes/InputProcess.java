package CalculatorJavaMentor.processes;


import CalculatorJavaMentor.properpies.RomanNumerals;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputProcess  {
    private String input="";

    public String getInput(){
        return this.input;
    }
     
    public void readString() throws IOException{
        System.out.println("Input: ");
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        this.input= reader.readLine();     
    }

    public String[] parseString(){
        String[] parsedString= {"","",""};
        String symb;

        for(int i=0; i<input.length();i++){
            symb=input.substring(i,i+1);
            if(symb.matches("[+-/*]{1}")) {
                parsedString[0]=input.substring(0,i); // extract val1
                parsedString[1]=symb; //extract operation
                parsedString[2]=input.substring(i+1); //extract val2
                break;
            }
        }
        return parsedString;         
    }
    
    public ProcessData validateParsedString (String[] parsedString) throws Exception{
        int val1=0;
        int val2=0; 
        String numericalSystem="";
        
        if(!parsedString[1].matches("[+-/*]{1}")){
            throw new Exception("You should use two values and mathmatical operation symbol for calculations");
        }              
        for(RomanNumerals num: RomanNumerals.values()){
            if(parsedString[0].trim().equalsIgnoreCase(num.name())){ 
                val1=num.getArabName();
            }
            if(parsedString[2].trim().equalsIgnoreCase(num.name())){
                val2=num.getArabName();
            }        
            if( val1!=0 && val2!=0 && !numericalSystem.equals("roman")){ 
                numericalSystem="roman";
            }
        }
        if(!numericalSystem.equals("roman")){
            val1=Integer.parseInt(parsedString[0].trim());
            val2=Integer.parseInt(parsedString[2].trim());
            numericalSystem="arabic";
        }      
        if((val1<1 || val1>10)||(val2<1 || val2>10)) {
           throw new Exception("Please, use numbers from 1 to 10 (for roman numbers - from I to X)");
        }
        return new ProcessData(val1,val2,parsedString[1],numericalSystem);  
    }
}
