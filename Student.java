class Student{
      public static void main(String[] args){
             Student student=new Student();
             student.setId(1);
             student.setAge(25);
             student.setName("Ankita");


            System.out.println(student.getId());
            System.out.println(student.getAge());
            System.out.println(student.getName());


}


      private int id;
      private String name;
      private int age;

    public void setId(int studentId){
       id=studentId;
    }
    public int getId(){
      return id;
    }

    public void setAge(int studentAge){
      age=studentAge;
    }
    public int getAge(){
      return age;
    }

    public void setName(String studentName){
       name=studentName;
    }
     public String getName(){
        return name;
     }
}