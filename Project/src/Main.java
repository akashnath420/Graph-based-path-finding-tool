import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static class Edge {
        String district_name;
        String neighbor_district;
        double distance;

        public Edge(String district_name, String neighbor_district, double distance) {
            this.district_name = district_name;
            this.neighbor_district = neighbor_district;
            this.distance = distance;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge("Bagerhat", "Khulna", 34));
        graph[0].add(new Edge("Bagerhat", "Gopalganj", 52));
        graph[0].add(new Edge("Bagerhat", "Pirojpur", 66));
        graph[0].add(new Edge("Bagerhat", "Narail", 107));

        graph[1].add(new Edge("Bandarban", "Chittagong", 85));
        graph[1].add(new Edge("Bandarban", "Rangamati", 121));
        graph[1].add(new Edge("Bandarban", "Cox's Bazar", 74));

        graph[2].add(new Edge("Barguna", "Patuakhali", 44));
        graph[2].add(new Edge("Barguna", "Pirojpur", 96));
        graph[2].add(new Edge("Barguna", "Barisal", 84));

        graph[3].add(new Edge("Barisal", "Jhalokati", 19));
        graph[3].add(new Edge("Barisal", "Pirojpur", 54));
        graph[3].add(new Edge("Barisal", "Barguna", 84));
        graph[3].add(new Edge("Barisal", "Patuakhali", 41));
        graph[3].add(new Edge("Barisal", "Bhola", 36));
        graph[3].add(new Edge("Barisal", "Madaripur", 64));
        graph[3].add(new Edge("Barisal", "Shariatpur", 87));

        graph[4].add(new Edge("Bhola", "Barisal", 36));
        graph[4].add(new Edge("Bhola", "Patuakhali", 77));
        graph[4].add(new Edge("Bhola", "Lakshmipur", 198));
        graph[4].add(new Edge("Bhola", "Noakhali", 233));

        graph[5].add(new Edge("Bogra", "Gaibandha", 71));
        graph[5].add(new Edge("Bogra", "Joypurhat", 52));
        graph[5].add(new Edge("Bogra", "Naogaon", 50));
        graph[5].add(new Edge("Bogra", "Natore", 68));
        graph[5].add(new Edge("Bogra", "Sirajganj", 72));

        graph[6].add(new Edge("Brahmanbaria", "Cumilla", 81));
        graph[6].add(new Edge("Brahmanbaria", "Narsingdi", 67));
        graph[6].add(new Edge("Brahmanbaria", "Kishoreganj", 79));
        graph[6].add(new Edge("Brahmanbaria", "Habiganj", 76));
        graph[6].add(new Edge("Brahmanbaria", "Narayanganj", 107));

        graph[7].add(new Edge("Chandpur", "Cumilla", 67));
        graph[7].add(new Edge("Chandpur", "Noakhali", 78));
        graph[7].add(new Edge("Chandpur", "Lakshmipur", 43));
        graph[7].add(new Edge("Chandpur", "Munshiganj", 128));
        graph[7].add(new Edge("Chandpur", "Shariatpur", 62));

        graph[8].add(new Edge("Chittagong", "Feni", 93));
        graph[8].add(new Edge("Chittagong", "Khagrachari", 117));
        graph[8].add(new Edge("Chittagong", "Rangamati", 78));
        graph[8].add(new Edge("Chittagong", "Bandarban", 85));
        graph[8].add(new Edge("Chittagong", "Cox's Bazar", 160));

        graph[9].add(new Edge("Chuadanga", "Jhenaidah", 37));
        graph[9].add(new Edge("Chuadanga", "Kushtia", 49));
        graph[9].add(new Edge("Chuadanga", "Meherpur", 26));

        graph[10].add(new Edge("Cox's Bazar", "Chittagong", 160));
        graph[10].add(new Edge("Cox's Bazar", "Bandarban", 121));

        graph[11].add(new Edge("Cumilla", "Brahmanbaria", 81));
        graph[11].add(new Edge("Cumilla", "Chandpur", 67));
        graph[11].add(new Edge("Cumilla", "Noakhali", 67));
        graph[11].add(new Edge("Cumilla", "Feni", 58));
        graph[11].add(new Edge("Cumilla", "Narayanganj", 94));
        graph[11].add(new Edge("Cumilla", "Munshiganj", 109));

        graph[12].add(new Edge("Dhaka", "Manikganj", 63));
        graph[12].add(new Edge("Dhaka", "Narayanganj", 17));
        graph[12].add(new Edge("Dhaka", "Munshiganj", 27));
        graph[12].add(new Edge("Dhaka", "Gazipur", 37));
        graph[12].add(new Edge("Dhaka", "Tangail", 92));

        graph[13].add(new Edge("Dinajpur", "Thakurgaon", 58));
        graph[13].add(new Edge("Dinajpur", "Panchagarh", 94));
        graph[13].add(new Edge("Dinajpur", "Nilphamari", 57));
        graph[13].add(new Edge("Dinajpur", "Rangpur", 78));

        graph[14].add(new Edge("Faridpur", "Rajbari", 31));
        graph[14].add(new Edge("Faridpur", "Gopalganj", 89));
        graph[14].add(new Edge("Faridpur", "Madaripur", 73));
        graph[14].add(new Edge("Faridpur", "Shariatpur", 96));
        graph[14].add(new Edge("Faridpur", "Manikganj", 66));
        graph[14].add(new Edge("Faridpur", "Narail", 100));

        graph[15].add(new Edge("Feni", "Cumilla", 58));
        graph[15].add(new Edge("Feni", "Chittagong", 93));
        graph[15].add(new Edge("Feni", "Noakhali", 41));

        graph[16].add(new Edge("Gaibandha", "Kurigram", 120));
        graph[16].add(new Edge("Gaibandha", "Rangpur", 76));
        graph[16].add(new Edge("Gaibandha", "Bogra", 71));
        graph[16].add(new Edge("Gaibandha", "Jamalpur", 243));
        graph[16].add(new Edge("Gaibandha", "Joypurhat", 524));

        graph[17].add(new Edge("Gazipur", "Dhaka", 37));
        graph[17].add(new Edge("Gazipur", "Mymensingh", 93));
        graph[17].add(new Edge("Gazipur", "Kishoreganj", 99));
        graph[17].add(new Edge("Gazipur", "Narsingdi", 56));
        graph[17].add(new Edge("Gazipur", "Narayanganj",51));
        graph[17].add(new Edge("Gazipur", "Tangail",64));

        graph[18].add(new Edge("Gopalganj", "Faridpur", 89));
        graph[18].add(new Edge("Gopalganj", "Madaripur", 59));
        graph[18].add(new Edge("Gopalganj", "Bagerhat", 52));
        graph[18].add(new Edge("Gopalganj", "Narail", 55));
        graph[18].add(new Edge("Gopalganj", "Pirojpur", 59));
        graph[18].add(new Edge("Gopalganj", "Barisal", 117));

        graph[19].add(new Edge("Habiganj", "Brahmanbaria", 76));
        graph[19].add(new Edge("Habiganj", "Kishoreganj", 132));
        graph[19].add(new Edge("Habiganj", "Sunamganj", 137));
        graph[19].add(new Edge("Habiganj", "Moulvibazar", 63));
        graph[19].add(new Edge("Habiganj", "Sylhet", 81));

        graph[20].add(new Edge("Jamalpur", "Sherpur", 16));
        graph[20].add(new Edge("Jamalpur", "Mymensingh", 57));
        graph[20].add(new Edge("Jamalpur", "Tangail", 87));
        graph[20].add(new Edge("Jamalpur", "Gaibandha", 243));
        graph[20].add(new Edge("Jamalpur", "Borga", 172));

        graph[21].add(new Edge("Jessore", "Jhenaidah", 46));
        graph[21].add(new Edge("Jessore", "Magura", 44));
        graph[21].add(new Edge("Jessore", "Narail", 34));
        graph[21].add(new Edge("Jessore", "Satkhira", 72));
        graph[21].add(new Edge("Jessore", "Khulna", 59));

        graph[22].add(new Edge("Jhalokati", "Barisal", 19));
        graph[22].add(new Edge("Jhalokati", "Pirojpur", 33));
        graph[22].add(new Edge("Jhalokati", "Patuakhali", 52));
        graph[22].add(new Edge("Jhalokati", "Borguna", 95));

        graph[23].add(new Edge("Jhenaidah", "Kushtia", 46));
        graph[23].add(new Edge("Jhenaidah", "Chuadanga", 37));
        graph[23].add(new Edge("Jhenaidah", "Jessore", 46));
        graph[23].add(new Edge("Jhenaidah", "Magura", 28));
        graph[23].add(new Edge("Jhenaidah", "Rajbari", 103));

        graph[24].add(new Edge("Joypurhat", "Naogaon", 39));
        graph[24].add(new Edge("Joypurhat", "Bogra", 52));
        graph[24].add(new Edge("Joypurhat", "Gaibandha", 77));
        graph[24].add(new Edge("Joypurhat", "Dinajpur", 89));

        graph[25].add(new Edge("Khagrachari", "Chittagong", 117));
        graph[25].add(new Edge("Khagrachari", "Rangamati", 70));

        graph[26].add(new Edge("Khulna", "Bagerhat", 34));
        graph[26].add(new Edge("Khulna", "Satkhira", 59));
        graph[26].add(new Edge("Khulna", "Jessore", 59));
        graph[26].add(new Edge("Khulna", "Narail", 90));

        graph[27].add(new Edge("Kishoreganj", "Narsingdi", 75));
        graph[27].add(new Edge("Kishoreganj", "Brahmanbaria", 79));
        graph[27].add(new Edge("Kishoreganj", "Habiganj", 132));
        graph[27].add(new Edge("Kishoreganj", "Mymensingh", 68));
        graph[27].add(new Edge("Kishoreganj", "Netrokona", 65));
        graph[27].add(new Edge("Kishoreganj", "Sunamganj", 266));
        graph[27].add(new Edge("Kishoreganj", "Gazipur", 99));

        graph[28].add(new Edge("Kurigram", "Lalmonirhat", 29));
        graph[28].add(new Edge("Kurigram", "Gaibandha", 120));
        graph[28].add(new Edge("Kurigram", "Rangpur", 56));
        graph[28].add(new Edge("Kurigram", "Jamalpur", 323));

        graph[29].add(new Edge("Kushtia", "Meherpur", 73));
        graph[29].add(new Edge("Kushtia", "Chuadanga", 49));
        graph[29].add(new Edge("Kushtia", "Jhenaidah", 46));
        graph[29].add(new Edge("Kushtia", "Rajbari", 65));
        graph[29].add(new Edge("Kushtia", "Pabna", 49));
        graph[29].add(new Edge("Kushtia", "Natore", 76));
        graph[29].add(new Edge("Kushtia", "Rajshahi", 122));

        graph[30].add(new Edge("Lakshmipur", "Bhola", 162));
        graph[30].add(new Edge("Lakshmipur", "Noakhali", 35));
        graph[30].add(new Edge("Lakshmipur", "Chandpur", 43));

        graph[31].add(new Edge("Lalmonirhat", "Kurigram", 29));
        graph[31].add(new Edge("Lalmonirhat", "Nilphamari", 106));
        graph[31].add(new Edge("Lalmonirhat", "Rangpur", 51));

        graph[32].add(new Edge("Madaripur", "Gopalganj", 59));
        graph[32].add(new Edge("Madaripur", "Shariatpur", 23));
        graph[32].add(new Edge("Madaripur", "Faridpur", 73));
        graph[32].add(new Edge("Madaripur", "Barisal", 73));

        graph[33].add(new Edge("Magura", "Jhenaidah", 28));
        graph[33].add(new Edge("Magura", "Jessore", 44));
        graph[33].add(new Edge("Magura", "Narail", 50));
        graph[33].add(new Edge("Magura", "Faridpur", 52));
        graph[33].add(new Edge("Magura", "Rajbari", 75));

        graph[34].add(new Edge("Manikganj", "Tangail", 84));
        graph[34].add(new Edge("Manikganj", "Dhaka", 63));
        graph[34].add(new Edge("Manikganj", "Rajbari", 55));
        graph[34].add(new Edge("Manikganj", "Faridpur", 65));
        graph[34].add(new Edge("Manikganj", "Pabna", 169));
        graph[34].add(new Edge("Manikganj", "Sirajganj", 125));

        graph[35].add(new Edge("Meherpur", "Chuadanga", 26));
        graph[35].add(new Edge("Meherpur", "Kushtia", 58));

        graph[36].add(new Edge("Moulvibazar", "Sylhet", 58));
        graph[36].add(new Edge("Moulvibazar", "Habiganj", 63));

        graph[37].add(new Edge("Munshiganj", "Dhaka", 27));
        graph[37].add(new Edge("Munshiganj", "Narayanganj", 15));
        graph[37].add(new Edge("Munshiganj", "Chandpur", 128));
        graph[37].add(new Edge("Munshiganj", "Shariatpur", 101));
        graph[37].add(new Edge("Munshiganj", "Madaripur", 91));
        graph[37].add(new Edge("Munshiganj", "Faridpur", 102));
        graph[37].add(new Edge("Munshiganj", "Cumilla", 109));

        graph[38].add(new Edge("Mymensingh", "Sherpur", 69));
        graph[38].add(new Edge("Mymensingh", "Jamalpur", 57));
        graph[38].add(new Edge("Mymensingh", "Netrokona", 39));
        graph[38].add(new Edge("Mymensingh", "Gazipur", 93));
        graph[38].add(new Edge("Mymensingh", "Kishoreganj", 68));
        graph[38].add(new Edge("Mymensingh", "Tangail", 94));

        graph[39].add(new Edge("Naogaon", "Natore", 97));
        graph[39].add(new Edge("Naogaon", "Joypurhat", 39));
        graph[39].add(new Edge("Naogaon", "Rajshahi", 78));
        graph[39].add(new Edge("Naogaon", "Bogra", 50));
        graph[39].add(new Edge("Naogaon", "Nawabganj", 98));

        graph[40].add(new Edge("Narail", "Magura", 50));
        graph[40].add(new Edge("Narail", "Jessore", 34));
        graph[40].add(new Edge("Narail", "Gopalganj", 55));
        graph[40].add(new Edge("Narail", "Bagerhat", 107));
        graph[40].add(new Edge("Narail", "Khulna", 90));
        graph[40].add(new Edge("Narail", "Faridpur", 10));

        graph[41].add(new Edge("Narayanganj", "Dhaka", 17));
        graph[41].add(new Edge("Narayanganj", "Munshiganj", 15));
        graph[41].add(new Edge("Narayanganj", "Narsingdi", 49));
        graph[41].add(new Edge("Narayanganj", "Cumilla", 94));
        graph[41].add(new Edge("Narayanganj", "Brahmanbaria", 107));
        graph[41].add(new Edge("Narayanganj", "Gazipur", 51));

        graph[42].add(new Edge("Narsingdi", "Gazipur", 56));
        graph[42].add(new Edge("Narsingdi", "Narayanganj", 49));
        graph[42].add(new Edge("Narsingdi", "Brahmanbaria", 67));
        graph[42].add(new Edge("Narsingdi", "Kishoreganj", 75));

        graph[43].add(new Edge("Natore", "Rajshahi", 46));
        graph[43].add(new Edge("Natore", "Naogaon", 97));
        graph[43].add(new Edge("Natore", "Bogra", 68));
        graph[43].add(new Edge("Natore", "Pabna", 59));
        graph[43].add(new Edge("Natore", "Kushtia", 76));
        graph[43].add(new Edge("Natore", "Sirajganj", 85));

        graph[44].add(new Edge("Netrokona", "Mymensingh", 39));
        graph[44].add(new Edge("Netrokona", "Kishoreganj", 65));
        graph[44].add(new Edge("Netrokona", "Sunamganj", 96));


        graph[45].add(new Edge("Nilphamari", "Lalmonirhat", 106));
        graph[45].add(new Edge("Nilphamari", "Rangpur", 50));
        graph[45].add(new Edge("Nilphamari", "Dinajpur", 57));
        graph[45].add(new Edge("Nilphamari", "Panchagarh", 68));

        graph[46].add(new Edge("Noakhali", "Lakshmipur", 35));
        graph[46].add(new Edge("Noakhali", "Feni", 41));
        graph[46].add(new Edge("Noakhali", "Cumilla", 67));
        graph[46].add(new Edge("Noakhali", "Chandpur", 78));

        graph[47].add(new Edge("Pabna", "Kushtia", 49));
        graph[47].add(new Edge("Pabna", "Natore", 59));
        graph[47].add(new Edge("Pabna", "Sirajganj", 91));
        graph[47].add(new Edge("Pabna", "Manikganj", 169));
        graph[47].add(new Edge("Pabna", "Rajbari", 114));

        graph[48].add(new Edge("Panchagarh", "Thakurgaon", 37));
        graph[48].add(new Edge("Panchagarh", "Dinajpur", 94));
        graph[48].add(new Edge("Panchagarh", "Nilphamari", 68));

        graph[49].add(new Edge("Patuakhali", "Barguna", 44));
        graph[49].add(new Edge("Patuakhali", "Bhola", 77));
        graph[49].add(new Edge("Patuakhali", "Barisal", 41));

        graph[50].add(new Edge("Pirojpur", "Bagerhat", 66));
        graph[50].add(new Edge("Pirojpur", "Barisal", 54));
        graph[50].add(new Edge("Pirojpur", "Barguna", 96));
        graph[50].add(new Edge("Pirojpur", "Gopalganj", 59));
        graph[50].add(new Edge("Pirojpur", "Jhalokati", 3));

        graph[51].add(new Edge("Rajbari", "Manikganj", 55));
        graph[51].add(new Edge("Rajbari", "Faridpur", 31));
        graph[51].add(new Edge("Rajbari", "Kushtia", 65));
        graph[51].add(new Edge("Rajbari", "Pabna", 114));
        graph[51].add(new Edge("Rajbari", "Magura", 75));
        graph[51].add(new Edge("Rajbari", "Jhenaidah", 103));

        graph[52].add(new Edge("Rajshahi", "Naogaon", 78));
        graph[52].add(new Edge("Rajshahi", "Natore", 46));
        graph[52].add(new Edge("Rajshahi", "Kushtia", 50));
        graph[52].add(new Edge("Rajshahi", "Nawabganj", 46));

        graph[53].add(new Edge("Rangamati", "Chittagong", 78));
        graph[53].add(new Edge("Rangamati", "Bandarban", 121));
        graph[53].add(new Edge("Rangamati", "Khagrachari", 70));

        graph[54].add(new Edge("Rangpur", "Dinajpur", 78));
        graph[54].add(new Edge("Rangpur", "Gaibandha", 76));
        graph[54].add(new Edge("Rangpur", "Lalmonirhat", 51));
        graph[54].add(new Edge("Rangpur", "Kurigram", 56));
        graph[54].add(new Edge("Rangpur", "Nilphamari", 50));

        graph[55].add(new Edge("Satkhira", "Khulna", 59));
        graph[55].add(new Edge("Satkhira", "Jessore", 72));

        graph[56].add(new Edge("Sherpur", "Jamalpur", 16));
        graph[56].add(new Edge("Sherpur", "Mymensingh", 69));


        graph[57].add(new Edge("Shariatpur", "Munshiganj", 101));
        graph[57].add(new Edge("Shariatpur", "Madaripur", 23));
        graph[57].add(new Edge("Shariatpur", "Chandpur", 62));
        graph[57].add(new Edge("Shariatpur", "Barisal", 87));

        graph[58].add(new Edge("Sunamganj", "Habiganj", 137));
        graph[58].add(new Edge("Sunamganj", "Netrokona", 96));
        graph[58].add(new Edge("Sunamganj", "Sylhet", 70));

        graph[59].add(new Edge("Sylhet", "Moulvibazar", 58));
        graph[59].add(new Edge("Sylhet", "Habiganj", 81));
        graph[59].add(new Edge("Sylhet", "Sunamganj", 70));

        graph[60].add(new Edge("Tangail", "Manikganj", 84));
        graph[60].add(new Edge("Tangail", "Jamalpur", 87));
        graph[60].add(new Edge("Tangail", "Mymensingh", 94));
        graph[60].add(new Edge("Tangail", "Sirajganj", 103));
        graph[60].add(new Edge("Tangail", "Dhaka", 92));
        graph[60].add(new Edge("Tangail", "Dhaka", 64));


        graph[61].add(new Edge("Thakurgaon", "Dinajpur", 58));
        graph[61].add(new Edge("Thakurgaon", "Panchagarh", 37));

        graph[62].add(new Edge("Nawabganj", "Naogaon", 98));
        graph[62].add(new Edge("Nawabganj", "Rajshahi",46));

        graph[63].add(new Edge("Sirajganj", "Tangail",103));
        graph[63].add(new Edge("Sirajganj", "Jamalpur",46));
        graph[63].add(new Edge("Sirajganj", "Pabna",91));
        graph[63].add(new Edge("Sirajganj", "Natore",85));
        graph[63].add(new Edge("Sirajganj", "Manikganj",120));
        graph[63].add(new Edge("Sirajganj", "Bogra",72));
    }

    public static void Calculate_Lowest_Distance(ArrayList<Edge> graph[], String Start_District, String End_District) {
        // Array of all district names to map between name and index
        String[] districtNames = new String[graph.length];

        // Initialize the district names array
        for (int i = 0; i < graph.length; i++) {
            if (graph[i].size() > 0) {
                districtNames[i] = graph[i].get(0).district_name;
            }
        }

        // Find indices for start and end districts
        int startIndex = -1;
        int endIndex = -1;
        for (int i = 0; i < districtNames.length; i++) {
            if (districtNames[i] != null && districtNames[i].equals(Start_District)) {
                startIndex = i;
            }
            if (districtNames[i] != null && districtNames[i].equals(End_District)) {
                endIndex = i;
            }
        }

        // Check if districts exist in the graph
        if (startIndex == -1) {
            System.out.println("Starting district '" + Start_District + "' not found in the graph.");
            return;
        }
        if (endIndex == -1) {
            System.out.println("Destination district '" + End_District + "' not found in the graph.");
            return;
        }

        // Dijkstra's algorithm
        double[] distance = new double[graph.length];
        boolean[] visited = new boolean[graph.length];
        int[] previous = new int[graph.length];

        // Initialize distances to infinity, previous to -1
        for (int i = 0; i < graph.length; i++) {
            distance[i] = Double.POSITIVE_INFINITY;
            previous[i] = -1;
        }

        // Distance to start is 0
        distance[startIndex] = 0;

        // Dijkstra's main loop
        for (int count = 0; count < graph.length - 1; count++) {
            // Find the vertex with the minimum distance
            int u = -1;
            double minDistance = Double.POSITIVE_INFINITY;
            for (int i = 0; i < graph.length; i++) {
                if (!visited[i] && distance[i] < minDistance) {
                    minDistance = distance[i];
                    u = i;
                }
            }

            // If we can't find a next vertex, break
            if (u == -1) break;

            // Mark as visited
            visited[u] = true;

            // If we've reached the destination, we can stop
            if (u == endIndex) break;

            // Update distances to all neighbors
            for (Edge edge : graph[u]) {
                // Find the index of the neighbor district
                int neighborIndex = -1;
                for (int i = 0; i < districtNames.length; i++) {
                    if (districtNames[i] != null && districtNames[i].equals(edge.neighbor_district)) {
                        neighborIndex = i;
                        break;
                    }
                }

                if (neighborIndex != -1 && !visited[neighborIndex]) {
                    double newDist = distance[u] + edge.distance;
                    if (newDist < distance[neighborIndex]) {
                        distance[neighborIndex] = newDist;
                        previous[neighborIndex] = u;
                    }
                }
            }
        }

        // Reconstruct and print the path
        if (distance[endIndex] == Double.POSITIVE_INFINITY) {
            System.out.println("No path exists from " + Start_District + " to " + End_District);
            return;
        }

        // Calculating the cost (assuming a fixed rate of 2.5 Taka per km)
        double costRate = 2.5;
        double totalCost = distance[endIndex] * costRate;

        // Reconstruct the path
        System.out.println("Path from " + Start_District + " to " + End_District + ":");

        // Create a stack to store the path
        int[] path = new int[graph.length];
        int pathLength = 0;

        // Start from the end and trace back
        for (int at = endIndex; at != -1; at = previous[at]) {
            path[pathLength++] = at;
        }

        // Print the path in the correct order
        for (int i = pathLength - 1; i >= 0; i--) {
            System.out.print(districtNames[path[i]]);

            if (i > 0) {
                // Calculate the distance between this node and the next
                int currentNode = path[i];
                int nextNode = path[i-1];
                double segmentDistance = 0;

                // Find the edge between these nodes
                for (Edge edge : graph[currentNode]) {
                    if (edge.neighbor_district.equals(districtNames[nextNode])) {
                        segmentDistance = edge.distance;
                        break;
                    }
                }

                double segmentCost = segmentDistance * costRate;
                System.out.print(" -> (" + segmentDistance + " km, Cost: " + segmentCost + " Taka) -> ");
            }
        }

        // speed 60 kil per hour
        int total_hour = (int) distance[endIndex] / 60;
        int total_min = (int) distance[endIndex] % 60;


        System.out.println("\nTotal Distance: " + distance[endIndex] + " km");
        System.out.println("Total Cost: " + totalCost + " Taka");
        System.out.println("Total Time (60 Kilometer per Hour) : "+ total_hour +":"+ total_min);
    }

    public static void main(String[] args) {
        int Total_Bangladesh_district = 64;
        ArrayList<Edge> graph[] = new ArrayList[Total_Bangladesh_district];
        createGraph(graph);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting district: ");
        String startDistrict = scanner.nextLine();
        System.out.print("Enter destination district: ");
        String endDistrict = scanner.nextLine();

        Calculate_Lowest_Distance(graph, startDistrict, endDistrict);
        scanner.close();
    }
}