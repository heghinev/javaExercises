public class Factorial_Recursive {
        public static int getFactorial(int randomNumber){
        if(randomNumber == 1) {
            return randomNumber;
        } else{
            return randomNumber * getFactorial(randomNumber-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }


}
