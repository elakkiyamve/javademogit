public class student {
    public String name;
    public int roll_number;
    public int marks;
    public String books;

    student(){
        this. books = "not provided";
    }
    public void firststudent(String name,int roll_number, int marks, String books){
    this.name = "Rani";
    this.roll_number = 102;
    this.marks = 55;
    this.books = "provided";
    }
    public void secondstudent(String name,int roll_number, int marks, String books){
        this.name = "Raja";
        this.roll_number = 122;
        this.marks = 25;
    }

    public void studentmarks(){
        if(marks>40){
            System.out.println("student passed: " + name + marks + books );

        }else
            System.out.println("failed:" + name + marks + books );

    }

}
