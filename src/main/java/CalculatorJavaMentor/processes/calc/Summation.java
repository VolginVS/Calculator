package CalculatorJavaMentor.processes.calc;



public class Summation implements CalculationProcess{
    private int a;
    private int b;
    
    private Summation(){
        
    }
    public Summation(int a, int b){
        this.a=a;
        this.b=b;
    }
       
    public int calculateNumbers(){
        return a+b;
    }
}
