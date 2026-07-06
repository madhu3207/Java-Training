package Day8;

class Employee2 {
    int id = 101;                // Instance variable
    static String company = "ABC"; // Static variable

    void show() {
        int salary = 50000;      // Local variable

        System.out.println(id);
        System.out.println(company);
        System.out.println(salary);
    }

    public static void main(String[] args) {//simple employee class with instance, static and local variables
        Employee2 e = new Employee2();
        e.show();
    }
}
