public class IntNumber {
    int numbers;

    public IntNumber(int numbers) {
        this.numbers = numbers;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public int addNumbers(int a , int b){
        return a+b;
    }
    public int minusNumbers(int a , int b){
        return a-b;
    }
    public int multiplyNumbers(int a , int b){
        return a*b;
    }
    public int divisionNumbers(int a , int b){
        return a/b;
    }
    public void checkSimpleNumber(int num){
        int temp;
        boolean b = true;
        for (int i = 2; i <num/2 ; i++) {
            temp = num%i;
            if (temp==0){
                  b = false;
                  break;
            }
        }
        if (b==true){
            System.out.println(num +" - є простим числом");
        } else if (b==true){
            System.out.println(num +" - не є простим числом");
        }
    }

}