package dev.ranieri.objects;

public class Student {

    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override // confirms that you are overriding something
    public String toString(){ // return a string representation of this object
        // by default if you do not override it, it returns the memory address
        return  "name : " + this.name +" grade: " + this.grade;
    }

    @Override
    public boolean equals(Object obj){

        if(obj instanceof  Student){
            Student otherStudent = (Student) obj; // downcast turning a more broad parent class into a child
            // allows you to treat the object as if it is student
            // DANGEROUS PRACTICE. If the object cannot be turned into a student it will create an exception
            return this.grade == otherStudent.grade;

        }
        return  false;


    }
}
