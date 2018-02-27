public class Factorial {
    public static int randomNumber = 5;
    public static int intList[] = new int[randomNumber];

    public int factorial = 1;

    public int[] getIntList(int j) {
        for (int i = 1; i <= j; i++) {
            intList[i-1] = i;
        }
        return intList;
    }

    public int getFactorial(int[] integerArrayList){
        for (int listValue : integerArrayList
             ) {
            factorial = factorial * listValue;
            System.out.println("Value is " + listValue);
            System.out.println("Fctorial value is " +factorial);
        }
        return factorial;
    }

    public static void main(String[] args) {
        Factorial sum = new Factorial();
        sum.getIntList(randomNumber);
        sum.getFactorial(intList);
    }

}
