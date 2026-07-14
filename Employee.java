class Employee
{
    int eid;
    String ename;
    int eage;
    String edept;

    Employee(int eid, String ename, int eage, String edept)
    {
        this.eid = eid;
        this.ename= ename;
        this.eage= eage;
        this.edept=edept;
    }
    void display()
    {
        System.out.println("Employee ID:"+eid);
        System.out.println("Employee Name:"+ename);
        System.out.println("Employee Age:"+eage);
        System.out.println("Employee Department:"+edept);
    }
}