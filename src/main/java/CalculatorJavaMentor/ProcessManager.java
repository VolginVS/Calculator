package CalculatorJavaMentor;

import CalculatorJavaMentor.processes.CalculationProcessFactory;
import CalculatorJavaMentor.processes.InputProcess;
import CalculatorJavaMentor.processes.OutputProcess;
import CalculatorJavaMentor.processes.ProcessData;
import CalculatorJavaMentor.processes.calc.CalculationProcess;
import java.io.IOException;



public class ProcessManager {
    private ProcessData processData;
    
    public void inputValues() throws IOException,Exception{      
        String[] parsedInput;
        InputProcess inputProcess = new InputProcess();

        inputProcess.readString();
        if(inputProcess.getInput().equals("exit"))System.exit(0);
        parsedInput=inputProcess.parseString();   // parse input string
        processData=inputProcess.validateParsedString(parsedInput); //validate and process data  
    }
    
    public void calculate(){ 
        int result;
        
        CalculationProcessFactory calculationProcessFactory = new CalculationProcessFactory();
        CalculationProcess calculationProcess = calculationProcessFactory.defineOperation(processData);
        result=calculationProcess.calculateNumbers();
        processData.setResult(result);     
    }
    
    public void outputValues() throws Exception{
        OutputProcess outputProcess= new OutputProcess();
        outputProcess.printResult(processData);
    }
}
