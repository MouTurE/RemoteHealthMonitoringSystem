public class Doctor {

    String name;
    int id;
    int age;

    public static void generateAlert(String[] results) {
        System.out.println("Doctor has been informed\n");
        provideRecommendation(results);
        scheduleFollowUp();
    }

    public static void provideRecommendation(String[] results) {
        // Initialization of the final output
        String recommendation = "Recommendation(s):\n";

        // Recommendation for high blood pressure
        if (results[0] == "Abnormal") {
            recommendation += "Your blood pressure is higher than normal. Reduce salt intake, stay hydrated, and avoid caffeine or stressful activity for the rest of the day. Make sure to take your prescribed medication regularly if you have one. I recommend monitoring your blood pressure at home and scheduling a follow-up appointment soon. If you experience chest pain, shortness of breath, severe headache, or vision changes, seek immediate medical care.";
            recommendation += "\n\n";
        }

        // Recommendation for high temperature
        if (results[1] == "Abnormal") {
            recommendation += "Your temperature is elevated. Make sure to rest, stay well-hydrated, and take a fever-reducing medication such as paracetamol if needed. Avoid heavy physical activity, and monitor your temperature over the next 24-48 hours. If it continues to rise, you develop severe symptoms, or the fever lasts more than two days, please return for further evaluation.";
            recommendation += "\n\n";
        }

        // Recommendation for high heart rate
        if (results[2] == "Abnormal") {
            recommendation += "Your heart rate is elevated. Sit down, rest, and take slow deep breaths. Avoid caffeine, nicotine, and intense activity for the remainder of the day. Stay hydrated, as dehydration can raise heart rate. If your heart rate does not return to normal within an hour, or you feel dizziness, chest discomfort, or faintness, please go to the nearest medical facility.";
            recommendation += "\n\n";
        }

        System.out.println(recommendation);
    }

    public static void scheduleFollowUp() {
        System.out.println("Follow up schedule has been created");
    }

}