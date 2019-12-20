package com.company;

public class Main {

    public static void main(String[] args) {
	// create Student object
        Student cream = new Student();
        Student not   = new Student();

        //input data to object
        cream.name = "cream";
        cream.id = "001";
        cream.major = "CIS";
        not.name = "not";
        not.id = "002";
        not.major = "HOT";

        //get data from object
        //System.out.println("1. " + cream.name + " " + cream.major);
        //System.out.println("2. " + not.name + " " + not.major);


        //add student to array
        //array index
        Student[] oopStudents = {cream , not};

        //System.out.println("1. "+oopStudents[0].name);
        //System.out.println("2. "+oopStudents[1].name);

        find_CIS_Student(oopStudents);
    }
    // To find CIS Student
    public static void find_CIS_Student(Student[] students){
        for(int i = 0; i < students.length; i++){
            if(students[i].major == "CIS"){
                System.out.print(i+1 + " " + students[i].name);
            }
        }
    }
}
