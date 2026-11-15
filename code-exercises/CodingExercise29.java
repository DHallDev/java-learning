// Coding Exercise 29 Solution:
// See README.md for full challenge description
public class CodingExercise29 {
    
    public static void main(String[] args) {
        // First method
        int testCase1 = getBucketCount(-3.4, 2.1, 1.5, 2);
        int testCase2 = getBucketCount(3.4, 2.1, 1.5, 2);
        int testCase3 = getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println(testCase1);
        System.out.println(testCase2);
        System.out.println(testCase3);

        System.out.println();

        // Second method
        int testCase4 = getBucketCount(-3.4, 2.1, 1.5);
        int testCase5 = getBucketCount(3.4, 2.1, 1.5);
        int testCase6 = getBucketCount(7.25, 4.3, 2.35);
        System.out.println(testCase4);
        System.out.println(testCase5);
        System.out.println(testCase6);

        System.out.println();

        // Third method
        int testCase7 = getBucketCount(3.4, 1.5);
        int testCase8 = getBucketCount(6.26, 2.2);
        int testCase9 = getBucketCount(3.26,0.75);
        System.out.println(testCase7);
        System.out.println(testCase8);
        System.out.println(testCase9);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        return getBucketCount(width * height, areaPerBucket) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }
}
