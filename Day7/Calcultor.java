package Day7;

class Calculator {//simple calculator class

    void add(int a,int b){
        System.out.println("Addition = "+(a+b));
    }

    static void multiply(int a,int b){
        System.out.println("Multiplication = "+(a*b));
    }

    public static void main(String[] args){

        Calculator c=new Calculator();

        c.add(10,20);

        multiply(10,20);
    }
}
