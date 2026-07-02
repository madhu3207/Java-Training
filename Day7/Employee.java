package Day7;

class Employee{//simple employee class

    int id;
    String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args){

        Employee e1=new Employee(101,"Madhu");

        Employee e2=new Employee(102,"Kavi");

        Employee e3=new Employee(103,"Hari");

        e1.display();

        e2.display();

        e3.display();
    }
}
