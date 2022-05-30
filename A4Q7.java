
import java.util.Scanner;

class NoRecordFound extends Exception{
    String err(){
        return "Unknown Object.";
    }
}
class Student{
    String name;
    String branch;
    String Class;
    int roll;
    Student(String name,String branch,String Class,int roll){
        this.name = name;
        this.branch = branch;
        this.Class = Class;
        this.roll = roll;
    }
}

class CheckA4Q7{

    static void studentRecord(Student temp, Student ob) throws NoRecordFound{

            if (temp.name.equals(ob.name)) {
                System.out.println("Name:  " + ob.name);
                System.out.println("Branch:  " + ob.branch);
                System.out.println("Class:  " + ob.Class);
                System.out.println("Roll no.:  " + ob.roll);
            }
            else
                throw new NoRecordFound();

        }
}

public class A4Q7 {
    public static int i;

    public static void main(String[] args) {
        Student ob[] = new Student[20];
        ob[0] = new Student("Cris", "Science", "12th", 7);
        ob[1] = new Student("Leo", "Humanities", "11th", 10);
        ob[2] = new Student("Alex", "Science", "11th", 1);
        ob[3] = new Student("Luffy", "Arts", "11th", 5);
        ob[4] = new Student("Sanji","Humanities","12th",15);
        ob[5] = new Student("Zoro","Commerce","12th",20);
        ob[6] = new Student("Nami","Law","12th",16);
        ob[7] = new Student("Stephen","Science","11th",18);
        ob[8] = new Student("Tony","Arts","11th",2);
        ob[9] = new Student("Kaguya","Humanities","12th",3);
        ob[10] = new Student("Bill","Science","11th",6);
        ob[11] = new Student("Steve","Science","12th",8);
        ob[12] = new Student("Harold","Law","12th",9);
        ob[13] = new Student("Hannah","Humanities","12th",4);
        ob[14] = new Student("Jennifer","Law","11th",13);
        ob[15] = new Student("Justin","Science","12th",11);
        ob[16] = new Student("Jack","Commerce","11th",12);
        ob[17] = new Student("Archie","Science","11th",17);
        ob[18] = new Student("Veronica","Commerce","12th",19);
        ob[19] = new Student("Cole","Arts","11th",14);

        String name;
        String branch;
        String Class;
        int roll;

        Scanner sc = new Scanner(System.in);
        try {

            for (i = 0; i < 20; i++) {
                System.out.println("Name    " + "Branch    " + "Class   " + "Roll No.");
                name = sc.next();
                branch = sc.next();
                Class = sc.next();
                roll = sc.nextInt();

                Student temp = new Student(name, branch, Class, roll);

                CheckA4Q7.studentRecord(temp, ob[i]);
            }

        }catch(NoRecordFound e){
                System.out.println("Exception: " + e.err());
            }
        }
    }
