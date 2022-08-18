public class Student{
  String name;
  String school;
  int id;
  
  Student(String name, String school, int id){
    this.name=name;
    this.school=school;
    this.id=id;
  }
  public void display(){
    System.out.println("Name: "+name+" school: "+school+" id: "+id);
  }
}

public static void main(String args[]){
  Student st1=new Student("Shubham","DPS",12);
  st1.display;
}
  
