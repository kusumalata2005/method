package com.tka;

public class Mainclass {
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
//		 Q--1
	     d.show();
//	     Q--2
	     d.display();
//	     Q--3
	     d.salary();
//	     Q--4
	     d.add();
//	     Q--5
	     d.name();
	     d.age();
	     d.course();
//	     Q--6
	     d.add(34,40);
//	     Q--7
	     d.details("priya", 10);
//	   Q--8
	     d.area(50, 2);
	     
//	     Q---9
	     
	     d.check(5);
	     
//	     Q--10
	  d.table();
	  
//	  Q--11
	

      int result = d.factorial(5);

      System.out.println("Factorial = " + result);
//      Q----12
      
      d.displayCollege();
      
//      Q---13
      d.printOddNumbers();
      
//    Q--14 
      d.printEvenNumbers();
      
//      Q--15
      d.printNumbers();
      
//      Q--16
      
      String message= d.getMessage();

      System.out.println(message);
      
      
      
//    Q---17 return square  
      

      int result1 = d.getSquare();

      System.out.println("Square = " + result1);
      
//    Q---18      Return college name  
      
      String result2 = d.getCollegeName();

      System.out.println(result2);
      
//   Q19. Return salary
      
      double result3 = d.getSalary();

      System.out.println("Salary = " + result3);
      
//      Q20. Return age  
      
      int result4 = d.getAge();

      System.out.println("Age = " + result4);
      
//    Q21. Return number
      
      int result5 = d.getNumber();

      System.out.println(result5);
      
//  Q22. Return name  
      
      String result6= d.getName();

      System.out.println(result6);
      
//     Q23. Full name   
  
      d.printFullName("Sala", "Kusumalata");
      
//   Q24. Print rectangle area
      
      d.printArea(10, 5);
      
      
//Q25. Print largest /
      
      d.printLargest(40, 25);
      
  //  Q26. Area of rectangle  
      
      d.printArea(10, 5);
      
//    Q27. Cube
      
      int result7 = d.cube(3);

      System.out.println("Cube = " + result7);
  //  28. Greater number
      
      int result8 = d.max(25, 15);

      System.out.println("Greater = " + result8);
      
 //   29. Prime Number — Parameterized with Return Type  

      boolean message1= d.isPrime(29);

      if (message1) {
          System.out.println("29 is a Prime Number");
      } else {
          System.out.println("29 is not a Prime Number");
      }
      
//       Reverse Number — Parameterized with Return Type 
      
      int result10 = d.reverse(12345);

      System.out.println("Reverse = " + result10);
	
    }  
	
}

      
      
      
      
      
      
      
      
  
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	
