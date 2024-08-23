package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge_12 {
    public static void main(String[] args) {
        ArrayList<String> vehicleTypes = new ArrayList<>();
        vehicleTypes.add("Car");
        vehicleTypes.add("Truck");
        vehicleTypes.add("Boat");
        vehicleTypes.add("Plane");
        vehicleTypes.add("Skateboard");
        vehicleTypes.add("Bike");

        System.out.println("The original list is: " + vehicleTypes);

        int fromIndex = 2;
        int toIndex = 4;
        List<String> subList = vehicleTypes.subList(2, 6);

        System.out.println("The extracted portion of this list is: " + vehicleTypes);
    }
}