package session_16_java_collections_framework.challenges.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge_10 {
    public static void main(String[] args) {
        ArrayList<String> surgeryInstruments = new ArrayList<>();
        surgeryInstruments.add("Scalpel");
        surgeryInstruments.add("Forceps");
        surgeryInstruments.add("Cotton absorbants");
        surgeryInstruments.add("10' blade");
        surgeryInstruments.add("Bone cutter");
        surgeryInstruments.add("Knee screw");
        surgeryInstruments.add("Scissor");
        surgeryInstruments.add("LVAD wire");
        surgeryInstruments.add("Hemostasys clamp");
        surgeryInstruments.add("Valve stent");
        surgeryInstruments.add("Suture needle");
        surgeryInstruments.add("Suction tube");
        surgeryInstruments.add("Intercostal retractor");

        Collections.shuffle(surgeryInstruments);
        System.out.println(surgeryInstruments);
    }
}