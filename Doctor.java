public class Doctor {

    String name;
    int id;
    int age;

    public static void generateAlert() {
        System.out.println("");
        System.out.println("Doctor has been informed");
        provideRecommendation();
        scheduleFollowUp();
    }

    public static void provideRecommendation() {
        System.out.println("Recommendation provided");
    }

    public static void scheduleFollowUp() {
        System.out.println("Follow up schedule has been created");
    }

}