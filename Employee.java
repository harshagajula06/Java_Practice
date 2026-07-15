class Employee
{
    int eid;
    String ename;
    int eage;
    String edept;
    int exp;

    Employee(int eid, String ename, int eage, String edept, int exp)
    {
        this.eid = eid;
        this.ename= ename;
        this.eage= eage;
        this.edept=edept;
        this.exp=exp;
    }
    double salary = 0;
    void display()
    {
        if (exp>=5)
            salary = 15000;
        else if (exp>=3)
            salary = 10000;
        else
            salary = 5000;
        System.out.println("Employee ID:"+eid);
        System.out.println("Employee Name:"+ename);
        System.out.println("Employee Age:"+eage);
        System.out.println("Employee Department:"+edept);
        System.out.println("Employee Salary:"+salary);
        System.out.println("Employee Experience:"+exp);
    }
}