package CalculatorJavaMentor.processes;



public class ProcessData {
    private int value1;
    private int value2;
    private String operation;
    private String numericalSystem;
    private int result;
      
    public ProcessData(){
        
    }
    
    public ProcessData(int value1, int value2, String operation, String numericalSystem){
        this.value1=value1;
        this.value2=value2;
        this.operation=operation;
        this.numericalSystem=numericalSystem;
    }
    
    public int getValue1(){
        return this.value1;
    }
    
    public int getValue2(){
        return this.value2;
    }
    
    public String getOperation(){
        return this.operation;
    }
    
    public String getNumericalSystem(){
        return this.numericalSystem;
    }
    
    public int getResult(){
        return this.result;
    }
    
    public void setResult(int result){
        this.result=result;
    }
}
