public class Patient {
    private String name;
    private String desc;
    private Doctor doc;
    private String medication;
    
    public Patient(String inName, String inDes, Doctor inDoc){
        name = inName;
        desc = inDes;
        doc = inDoc;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public void setMed(String med){
        medication = med;
    }
    
    public void setDocter(Doctor d){
        doc = d;
    }

    public String getMedication() {
        return medication;
    }
   
}
