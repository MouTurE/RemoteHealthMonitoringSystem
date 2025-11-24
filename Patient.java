public class Patient extends Doctor {

    static void trackHealthData(int bloodPressure, int temperature, int heartRate) {

        int bloodPressureThreshold = 50;
        int temperatureThreshold = 45;
        int heartRateThreshold = 200;

        String[] results = { "Normal", "Normal", "Normal" };
        boolean sendResults = false;

        // Checks for blood pressure
        if (bloodPressure >= bloodPressureThreshold) {
            results[0] = "Abnormal";
            sendResults = true;
        }

        // Checks for temperature
        if (temperature >= temperatureThreshold) {
            results[1] = "Abnormal";
            sendResults = true;
        }

        // Checks for heart rate
        if (heartRate >= heartRateThreshold) {
            results[2] = "Abnormal";
            sendResults = true;
        }

        // Prints out the results
        System.out.println("Results:");
        System.out.println("Blood Pressure: " + results[0]);
        System.out.println("Temperature: " + results[1]);
        System.out.println("Heart Rate: " + results[2]);
        System.out.println("");

        // Checks whether there is an abnormal value and generate alert for both patient
        // and doctor
        if (sendResults == true) {
            System.out.println("Patient has to be checked");
            System.out.println("Sending results to doctor...");
            generateAlert(results);
        } else {
            System.out.println("Patient has normal health values");
        }

    }

    public static void main(String[] args) {
        // Test Cases
        // trackHealthData(45, 42, 190);
        // trackHealthData(55, 42, 190);
        // trackHealthData(45, 50, 190);
        // trackHealthData(45, 42, 220);

        // Checks health values
        trackHealthData(50, 48, 190);
    }
}
