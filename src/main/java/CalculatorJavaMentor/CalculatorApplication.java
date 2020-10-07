package CalculatorJavaMentor;


public class CalculatorApplication {
    public static void main(String[] args){
        System.out.println("Hello! It's simple app for calculations using +-/* operations with two numbers.\nPlease, use values from 1 to 10 using arabic or roman numbers\nTo complete the work with the application enter 'exit'\n"); 
        do{
            try{
                ProcessManager processManager = new ProcessManager();
                processManager.inputValues();
                processManager.calculate();
                processManager.outputValues();
            }catch(Exception ex){
                System.out.println("Incorrect input ("+ex.getMessage()+")\n");
            }
        }while(true);  
    }
}
