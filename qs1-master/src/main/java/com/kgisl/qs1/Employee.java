package com.kgisl.qs1;
/**
 * Employee
 */
public class Employee {

    
    int id;
    String name;
    float salary;


Employee(int id,String name,float salary)
{
this.id=id;
this.name=name;
this.salary=salary;
 
}

public int getid()
{
    return id;
}

public String getname()
{
    return name;

}
public float getsalary()
{
    return salary;
}
@Override
public String toString() {
    return id+"" +name+""+salary+"";
}
}
