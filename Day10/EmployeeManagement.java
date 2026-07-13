package Day10;

class EmployeeInfo {
    private int id;
    private String name;

    public void setId(int id) {
        if (id > 0)
            this.id = id;
        else
            System.out.println("Invalid ID");
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo();

        e.setId(101);
        e.setName("Madhu");

        System.out.println(e.getId());
        System.out.println(e.getName());
    }
}
