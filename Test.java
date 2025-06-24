public class Test {
    public static void main(String[] args) {
        // Create doctors
        Doctor drMiller = new Doctor("Miller");
        Doctor drYoung = new Doctor("Young");

        // Create patients
        Patient p1 = new Patient("Ivy", "Cold", drMiller);
        Patient p2 = new Patient("Jack", "Sprained wrist", drYoung);

        // Create hospital system with Dr. Miller as thisDoc
        HospitalSys hospital = new HospitalSys(drMiller);

        // --- Use hospital as DocTasks ---
        DocTasks docTasks = hospital;  // hospital implements DocTasks
        System.out.println("=== Using HospitalSys as DocTasks ===");

        docTasks.admit(p1);
        System.out.println("Admitted patient: " + p1.getName());

        Patient discharged = docTasks.discharge("Ivy");
        System.out.println("Discharged patient: " + discharged.getName());

        // --- Use hospital as DocManager ---
        DocManager docManager = hospital;  // hospital implements DocManager

        docManager.hire(drYoung);
        System.out.println("\nHired Dr. Young.");

        // Admit patient for Dr. Miller (since thisDoc is drMiller)
        docManager.admit(p2);  // Adds patient to drMiller, not drYoung!
        System.out.println("Admitted patient: " + p2.getName() + " to Dr. Miller (current thisDoc)");

        // Discharge with prescription
        Patient discharged2 = docManager.discharge("Jack", "Painkillers");
        System.out.println("Discharged patient with medication: " + discharged2.getMedication());

        // To admit patient to Dr. Young, you'd need to switch thisDoc or use another HospitalSys
    }
}
