public class student {
    int rollno;
    String name ;
   public student(int r, String n)
   {
         rollno = r;
         name = n;
   }
   public void display()
    {
        String college = "KL University";
        System.out.println("Name: "+name);
        System.out.println("Roll Number : "+rollno);
        System.out.println("College Name : "+college);

    }
   public static void main (String[] args)

   {
       student obj1 =new student(2,"Razia");
       student obj2 =new student(3,"Aahil");
       obj1.display();
       obj2.display();

   }

}



