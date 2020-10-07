package CalculatorJavaMentor.processes;

import CalculatorJavaMentor.properpies.RomanNumerals;
import static java.lang.Math.pow;


public class OutputProcess {
  
    public void printResult(ProcessData processData) throws Exception{
        String romanResult="";    
        
        if(processData.getNumericalSystem().equals("arabic")){
            System.out.println("Result: \n"+processData.getResult()+"\n");      
        }
        if(processData.getNumericalSystem().equals("roman")){
            if(processData.getResult()<=0){
                   throw new Exception("The result of roman number calculation can't be less than 'I'. The first number must be greater than the second");
            }else{
                romanResult=convertArabianToRoman(processData.getResult(), romanResult, 2);
            }
            System.out.println("Result: \n"+romanResult+"\n");
        }
    }  
    
    public String convertArabianToRoman(int result, String romanResult, int order) throws Exception{
        int digit; 
        digit=result/(int)pow(10, order);        
        if(digit>0){
            for(RomanNumerals num: RomanNumerals.values()) if(num.getArabName()==(int)pow(10, order)*digit) romanResult+=num.name();
            result=result-(int)pow(10, order)*digit;
        }        
        if(order>0){
            return convertArabianToRoman(result, romanResult, order-1);
        }else{
            return romanResult;
        }
    } 
}
    


