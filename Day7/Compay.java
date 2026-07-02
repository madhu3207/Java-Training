package Day7;

class Company{//simple company class

    String companyName="Microsoft";

    void display(){
        System.out.println("Company: "+companyName);
    }

    public static void main(String[] args){

        Company c=new Company();

        c.display();
    }
}
