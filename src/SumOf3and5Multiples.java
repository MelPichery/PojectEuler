public class SumOf3and5Multiples {

    public int findSumOf3and5Multiples(int numberChoosen) {
        int number = 0;
        int sum = 0;
        while(number<numberChoosen) {

            if(number%3 == 0 || number%5 ==0){
                sum = sum+number;
            }

            number++;
        }
        return sum;
    }

}
