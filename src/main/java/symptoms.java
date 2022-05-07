import java.util.Scanner;


public class symptoms {
    public static void main(String[] args) {
        symptoms.defSymptoms();
    }

    //determining symptoms
    public static void defSymptoms() {
        String symptoms[] = {"Shortness of Breath", "Chest pain", "Body aches", "Immobility", "Cough", "Fever", "Lose of taste or smell",
                "Tiredness", "Nausea", "Sore throat", "Discoloration", "Irritation of eyes", "Vomiting", "Diarrhoea"};
        String seriousSymptoms[] = {"Shortness of Breath", "Chest pain", "Body aches", "Immobility"};
        String commonSymptoms[] = {"Cough", "Fever", "Lose of taste or smell", "Tiredness"};
        String mildOrRareSymptoms[] = {"Nausea", "Sore throat", "Discoloration", "Irritation of eyes", "Vomiting", "Diarrhoea"};

        System.out.println("What symptoms do you have?");
        Scanner scanner = new Scanner(System.in);
        String symptom_1 = scanner.nextLine();
        String result = "Symptom not found";
        int i;
        for (i = 0; i < symptoms.length; i++) {
            if (symptoms[i].equalsIgnoreCase(symptom_1)) {
                System.out.print("Symptom found");
            }
        }
        for (String symptom : seriousSymptoms) {
            if (symptom.equalsIgnoreCase(symptom_1)) {
                result = "\tContact 112";
            }
        }
        for (String symptom : commonSymptoms) {
            if (symptom.equalsIgnoreCase(symptom_1)) {
                result = "\tIsolate and get tested";
            }
        }
        for (String symptom : mildOrRareSymptoms) {
            if (symptom.equalsIgnoreCase(symptom_1)) {
                result = "\tMaintain social distance";
            }
        }

        System.out.print(result);
    }
}
