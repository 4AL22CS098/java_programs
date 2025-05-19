/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better*/
public class PerformanceTest {

    public static void main(String[] args) {

      

        String str = "AIET";
        int times = 10000;

        // Using StringBuffer
        StringBuffer sb1 = new StringBuffer();
        long start1 = System.nanoTime();

        for (int i = 0; i < times; i++) {
            sb1.append(str);
        }

        long end1 = System.nanoTime();
        long timeTakenBuffer = end1 - start1;
        System.out.println("Time taken by StringBuffer: " + timeTakenBuffer + " ns");

        // Using StringBuilder
        StringBuilder sb2 = new StringBuilder();
        long start2 = System.nanoTime();

        for (int i = 0; i < times; i++) {
            sb2.append(str);
        }

        long end2 = System.nanoTime();
        long timeTakenBuilder = end2 - start2;
        System.out.println("Time taken by StringBuilder: " + timeTakenBuilder + " ns");

        // Final result
        if (timeTakenBuilder < timeTakenBuffer) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}
