package CalculatorJavaMentor.processes;

import CalculatorJavaMentor.processes.calc.Division;
import CalculatorJavaMentor.processes.calc.Multiplication;
import CalculatorJavaMentor.processes.calc.Subtraction;
import CalculatorJavaMentor.processes.calc.Summation;
import CalculatorJavaMentor.processes.calc.CalculationProcess;



public class CalculationProcessFactory  {
    
    public CalculationProcess defineOperation(ProcessData processData) {
        int val1=processData.getValue1();
        int val2=processData.getValue2();
        String operation=processData.getOperation();

        switch(operation){
            case"+": return new Summation(val1,val2);
            case"-":return new Subtraction(val1,val2);
            case"*":return new Multiplication(val1,val2);
            case"/":return  new Division(val1,val2);
        }
    return null;           
    }
}
