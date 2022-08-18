public class Student{
  String name;
  String school;
  int id;
  int newwwww;
  
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

  Student st2=new Student("Sohan","VBS",13);
  st2.display;
  Student st3=new Student("Rahul","tango",14);
  st3.display;
  
  
}
  
