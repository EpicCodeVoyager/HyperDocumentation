public class ExtensiveCalculation {
    /**
     * This class takes the variable type and performs the extensive calculations.
     * For now just giving examples.
     * Needs to be much more generic.
     * In the given sample thresh hold wait is around 10 seconds.
     * so the given segment will run till the actual time taken by calculation alone is greater than or equal to this value.
     *
     * How does one optimize and make the for loop segment better.
     * Probably we can use bit manipulation.
     *
     * Going further this needs to be parallel and across CPU cores.
     *
     * This whole thing might be inspired by mobile app antutu. I'm not sure.
     * Anyways....
     * This is very simple and yet powerful thing to implement.
     *
     * Later on CPU and Memory Utilization.
     *
     * so summary :
     * variable types:> int, long, float, double
     * Operators:> + * - ^ |
     *
     * Addition: time taken to reach Interger.MAX to Interger.MIN using +
     * Subration: tim take to reach Integer.MIN to Interger.MAX using -
     * same for multiplication.
     *
     * Covering range.
     * Covering number of iterations.
     * Time calculation till most precise values available in the language.
     *
     */

    final static Long THRESH_HOLD_WAIT=10000000000L;

    public static Long intExtensiveCalculation(int intVal){
        long waitTime = 0L;

        while(waitTime<THRESH_HOLD_WAIT){
            long startTime = System.nanoTime();

            for(int i=0;i<1000;i++) {
                intVal = intVal * intVal;
                // Here same calculation can be called for all type of variables.
            }

            long stopTime = System.nanoTime();
            waitTime += stopTime - startTime;
        }
        return waitTime;
    }

    public static void main(String[] args) {
        long lastTimeElapsed = intExtensiveCalculation(2);
        System.out.println(":> "+lastTimeElapsed);
    }
}
