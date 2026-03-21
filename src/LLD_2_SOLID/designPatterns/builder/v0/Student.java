package LLD_2_SOLID.designPatterns.builder.v0;

public class Student {
   String name;
   String rollNo;
   int age;
   String course;
   Double psp;
   String batch;

   Student(Builder builder) {
       this.name = builder.name;
       this.rollNo = builder.rollNo;
       this.age = builder.age;
       this.course = builder.course;
       this.psp = builder.psp;
       this.batch = builder.batch;
   }


}
