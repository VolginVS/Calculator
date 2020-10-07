package CalculatorJavaMentor.processes.calc;



public class Multiplication implements CalculationProcess {
    private int a;
    private int b;
    
    private Multiplication(){
        
    }
    public Multiplication(int a, int b){
        this.a=a;
        this.b=b;
    }
       
    public int calculateNumbers(){
        return a*b;
    } 
}
