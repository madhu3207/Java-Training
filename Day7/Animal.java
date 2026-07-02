package Day7;

class Animal{//simple animal class

    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog Barks");
    }

    public static void main(String[] args){

        Animal a=new Dog();

        a.sound();
    }
}
