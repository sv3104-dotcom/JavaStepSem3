class StaffCompany {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    StaffCompany(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        StaffCompany e1 = new StaffCompany("Divya", 65000);
        StaffCompany e2 = new StaffCompany("Arjun", 50000);
        StaffCompany e3 = new StaffCompany("Priya", 55000);

        StaffCompany.printCompanyInfo();
    }
}