package session_9_arrays.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge_3 {
    public static void main(String[] args) {
        List<String> surgeryList = new ArrayList<>();
        List<String> patientsList = new ArrayList<>();
        surgeryList.add("forceps");
        surgeryList.add("10-blade");
        surgeryList.add("clamp");
        surgeryList.add("scalpel");
        surgeryList.add("scissors");
        surgeryList.add("syringes");
        surgeryList.add("retractor");
        surgeryList.add("needles");
        surgeryList.add("bone cutter");
        surgeryList.add("loop scissor");

        surgeryList.addAll(surgeryList);
        for (String patient : surgeryList) {
            System.out.println(surgeryList.equals(patient));
        }
        System.out.println("  ");
        System.out.println(surgeryList.equals(patientsList));
    }
}