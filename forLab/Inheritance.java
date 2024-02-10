import java.util.*;

class Employee{
    int age,number,salary;
    String Name,address;

    Employee(int _age,int _number,int _salary,String _Name,String _address){
        age = _age;
        number = _number;
        salary = _salary;
        Name = _Name;
        address = _address;
    }

    void Salary(){
        System.out.println(salary);
    }
}

class Officer extends Employee{
    String Specialization;
    Officer(int _number,int _salary,String _Name,String _address,int _age,String _Specialization){
        super(_age, _number, _salary, _Name, _address);
        Specialization = _Specialization;
    }
}

class Manager extends Employee{
    String Department;
    Manager(int _age,int _number,int _salary,String _Name,String _address,String _Department){
        super(_age, _number, _salary, _Name, _address);
        Department = _Department;
    }
}


public class Inheritance {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Input details of Officer 👇");
        Officer o = new Officer(obj.nextInt(),obj.nextInt(),obj.nextLine(),obj.nextLine(),obj.nextInt(),obj.nextLine());
        o.Salary();

        System.out.println("Input details of Officer 👇");
        Manager m = new Manager(obj.nextInt(),obj.nextInt(),obj.nextInt(),obj.next(),obj.nextLine(),obj.nextLine());
        m.Salary();

    }
}
