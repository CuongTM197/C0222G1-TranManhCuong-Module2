package _04_access_modifier_static_metod_static_property.practice;

        public class Student{
            private int rollno;
            private String name;
            private static String college = "BBDIT";

           Student(int r,String n){
           rollno = r;
           name = n;
           }
           static void change(){
               college = "CODEGYM";
           }
           void display(){
               System.out.println(rollno + " " + name + " " +college);
           }
        }


