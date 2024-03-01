package priorityerqueue;
import java.util.*;

public class Patient implements Comparable<Patient>{
    private int severityID;
    private String patientName;
    private String conditionName;
    public Patient(int severity, String name, String condition){
        severityID = severity;
        patientName = name;
        conditionName = condition;
    }
    //getter methods also called accessors
    public int getSeverityID(){
        return severityID;
    }
    public String getPatientName(){
        return patientName;
    }
    public String getConditionName(){
        return conditionName;
    }
    //equals and comparison methods
    public Boolean equals(Patient theOtherPatient){
        return this.getSeverityID() == theOtherPatient.getSeverityID();
    }
    @Override
    public int compareTo(Patient theOtherPatient){
        if(this.equals(theOtherPatient))
            return 0;
        else if (getSeverityID() > theOtherPatient.getSeverityID())
            return 1;
        else
            return -1;
    }
    @Override
    public String toString(){
        return "Next Patient (" + getSeverityID() + "): " + 
            getPatientName() + "\tCondition: " + 
            getConditionName();
    }
}
