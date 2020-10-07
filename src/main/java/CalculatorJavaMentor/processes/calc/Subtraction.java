package CalculatorJavaMentor.processes.calc;



public class Subtraction implements CalculationProcess {
    private int a;
    private int b;
    
    private Subtraction(){
        
    }
    public Subtraction(int a, int b){
        this.a=a;
        this.b=b;
    }
       
    public int calculateNumbers(){
        return a-b;
    }
}
