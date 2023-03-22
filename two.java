// package seminar_3;

// public class two {
//    // Count the repetitions of each planet in the list
//    Map<String, Integer> planetCounts = new HashMap<>();
//    for (String planet : planetList) {
//        Integer count = planetCounts.get(planet);
//        if (count == null) {
//            planetCounts.put(planet, 1);
//        } else {
//            planetCounts.put(planet, count + 1);
//        }
//    }

//    // Print the name of each planet and the number of repetitions in the list
//    for (String planet : planetCounts.keySet()) {
//        int count = planetCounts.get(planet);
//        System.out.println(planet + ": " + count);
//    }
// }
// }
// }
// /*import java.util.*;

// public class PlanetRepetitions {
//     public static void main(String[] args) {
//         // Define an array of planet names
//         String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

//         // Create an empty list to store planet names
//         List<String> planetList = new ArrayList<>();

//         // Fill the list with random planet names with repetitions
//         Random random = new Random();
//         for (int i = 0; i < 20; i++) {
//             int index = random.nextInt(planets.length);
//             planetList.add(planets[index]);
//         }
//         */

//         static void planetSystemIter()
//     {
//         String[] solarSystem1 = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//         ArrayList<String> solarSystemRes = new ArrayList<String>();
//         Random rnd = new Random();
//         for (int i = 0; i < 20; i++) {
//             solarSystemRes.add(solarSystem1[rnd.nextInt(0,7)]);
//         }
//         System.out.println(solarSystemRes);
//         for (int i = 0; i < solarSystem1.length; i++) {
//             System.out.printf("%s встречается %d раз \n",solarSystem1[i],Collections.frequency(solarSystemRes, solarSystem1[i]));
//         }
//     }


// /* 
//     // Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//     // Вывести название каждой планеты и количество его повторений в списке.

//     ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("Venera", "Saturn", "Venera", "Mars", "Jupiter", "Earth", "Earth"));
//     arrayList.sort(Comparator.naturalOrder());
//     int count = 1;

//     for (int i = arrayList.size()-1; i > 0 ; i--) {
//         if (arrayList.get(i).equals(arrayList.get(i-1))){
//             count++;

//         }
//         else {
//             System.out.println(arrayList.get(i) + " повторяется " + count + " раз.");
//             count = 1;
//         }

//     }

//     System.out.println(arrayList.get(0) + " повторяется " + count + " раз.");
//      */