package average;

public class Average {
    public int average(int k, int[] list) {
        int average = 0; // Initialize average to 0
        int n = Math.min(k, list.length); // Use the smaller of k or array length
        if (n > 0) { // Only compute if n > 0
            for (int i = 0; i < n; i++) {
                average += list[i]; // Sum the first n elements
            }
            average = average / n; // Calculate the average
        }
        return average; // Return the computed average
    }
}
