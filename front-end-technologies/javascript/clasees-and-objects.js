class Employee{
    id;
    name;
    email;
    dob;
    gender;

    constructor(id, name, email, dob, gender){
        this.id=id;
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.email=email;
    }

    printEmployee(){
        console.log(this)
    }

}

class Manager extends Employee{
    managerId
    constructor(id, name, email, dob, gender,managerId){
        super(id, name, email, dob, gender)
        this.managerId=managerId;
    }
    printEmployee(){
        console.log(this)
    }
}


let emp = new Manager(1001,'Javed','jaced@abc.com','2002-10-10','male','m01010101')

emp.printEmployee()