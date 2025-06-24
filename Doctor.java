public class Doctor {
    private String name;
    private Patient[] patients = new Patient[5];
    private int numPatients;

    public Doctor(String inN) {
        name = inN;
        numPatients = 0;
    }
    
    public Patient getPatient(int i){
        if (i >= 5 || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        return patients[i];
    }
    
    public void addP(Patient p){
        assert numPatients < 5;
        patients[numPatients++] = p;
    }
    
    public Patient removeP(String s){
            int i = 0;
        while(i < numPatients){
            if(patients[i].getName().equalsIgnoreCase(s)){
                break;
            }
            i++;
        }
        if (i >= numPatients) {
            throw new RuntimeException("No patient under this name was found.");
        }
        patients[i].setDocter(null);
        Patient out = patients[i];
        for (int j = i; j < numPatients - 1; j++) {
            patients[j] = patients[j+1];
        }
        numPatients--;
        return out;
    }
    
    
    
    
}
