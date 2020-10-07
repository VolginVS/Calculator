package CalculatorJavaMentor.processes.calc;



public class Division implements CalculationProcess{
    private int a;
    private int b;
    
    private Division(){
        
    }
    public Division(int a, int b){
        this.a=a;
        this.b=b;
    }
       
    public int calculateNumbers(){
        return a/b;
    }   
}
