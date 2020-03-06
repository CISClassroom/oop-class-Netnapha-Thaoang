# รายงานผลการทดลอง

<นางสาวเนตรนภา ทะอ่าง> <623410069-8>

## Student Class

สร้างคลาสสำหรับนักศึกษาประกอบไปด้วยข้อมูล

- ชื่อ-นามสกุล
- รหัสนักศึกษา
- สาขา

```java
public class Student {
    // ประกาศตัวแปรขง class
    public  String name;
    public  String id;
    public  String major;
}
```

## Student Object

สร้างวัตถุจากคลาสนักศึกษา และใส่ข้อมูลขอตนเองลงไป

```java
public static void main(String[] args) {
	// create Student object
        Student cream = new Student();
        Student not   = new Student();

        //input data to object
        cream.name = "cream";
        cream.id = "001";
        cream.major = "CIS";
```

แสดงข้อมูลวัตถุนักศึกษา ออกทาง console

```java
 public static void find_CIS_Student(Student[] students){
        for(int i = 0; i < students.length; i++){
            if(students[i].major == "CIS"){
                System.out.print(i+1 + " " + students[i].name);
            }
        }
    }
```

## Data collection

สร้าง Data collection สำหรับเก็บข้อมูลนักศึกษา และแสดงการเก็บข้อมูล

```java
Student[] oopStudents = {cream , not};
```

## Student Selection

ให้สร้างเมธอทสำหรับแสดงข้อมูลเฉพาะนักศึกษาชาย หรือหญิง จากข้อมูลนักศึกษาที่ได้สร้างขึ้น

```java
public static void find_CIS_Student(Student[] students){
        for(int i = 0; i < students.length; i++){
            if(students[i].major == "CIS"){
                System.out.print(i+1 + " " + students[i].name);
            }
        }
    }
```
