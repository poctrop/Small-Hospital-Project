import java.util.*;

public class HospitalSys implements DocManager{
    
    private LinkedList<Doctor> docs = new LinkedList<Doctor>();
    private LinkedList<Patient> operations = new LinkedList<Patient>();
    private LinkedList<Patient> discharged = new LinkedList<Patient>();
    private Doctor thisDoc;
    private int numPatients;

    public HospitalSys(Doctor user) {
        thisDoc = user;
        numPatients = 0;
    }
    
    public void hire(Doctor d) {
        docs.add(d);
    }

    public void admit(Patient p) {
        thisDoc.addP(p);
    }
    
    public Patient discharge(String name) { 
        Patient outPat = thisDoc.removeP(name);
        discharged.add(outPat);
        return outPat;
    }
    
    public Patient discharge(String name, String presc){
        Patient outPat = discharge(name);
        outPat.setMed(presc);
        return outPat;
    }
   
    
}
