public class Factorial_Recursive {
    public static int randomNumber = 5;
    public static int factorial = 0;
    public static int finalSum = 1;

    public static void getFactorial(){
        factorial++;
        if(factorial <= randomNumber){
            finalSum = finalSum * factorial;
            //System.out.println(finalSum);
            getFactorial();
        }
    }

    public static void main(String[] args) {
        getFactorial();
        System.out.println(finalSum);
    }
}
