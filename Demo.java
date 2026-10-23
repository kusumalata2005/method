package com.tka;

public class Demo {

//	Q--1 demo

	void show() {

		System.out.println("welcome to java");
	}

//	Q--2 student

	void display() {

		System.out.println("student details");
	}

//	Q---3 teacher

	void salary() {

		System.out.println("salary = 25000");
	}

//	Q---4 calculator

	void add() {

		int a = 10;
		int b = 20;
		System.out.println("the addition of a + b---->" + (a + b));

	}

//	Q---5 three method

	void name() {

		System.out.println("my name is---->" + "priya");
	}

	void age() {

		System.out.println("my age is---->" + 22);
	}

	void course() {

		System.out.println("my course is---->" + "b.tech");
	}

//	Q---6

	void add(int a, int b) {

		System.out.println(a + b);
	}

//	Q---7 student name + roll number 

	void details(String name, int roll) {

		System.out.println("name=" + name);
		System.out.println("roll=" + roll);
	}
//	Q---8 rectangle area

	void area(int length, int breadth) {

		int result = length * breadth;
		System.out.println("area = " + result);
	}

//	Q---9 even or odd

	void check(int n) {

		if (n % 2 == 0)
			System.out.println("even");
		else {
			System.out.println("odd");
		}
	}
		
//		Q---10 table 5
		void table() {
			
			int n = 5;
			
			for (int i = 1;i<=10;i++) {
				
			System.out.println(n + " x " + i + " = " + (n*i));
			
			}	

	}
		
//		Q---11  factorial
		

		    int factorial(int n) {

		        int fact = 1;

		        for (int i = 1; i <= n; i++) {
		            fact = fact * i;
		        }

		        return fact;
		    }
//	Q----12 display college details
		    
		
		        void displayCollege() {
		            System.out.println("College: Gandhi Academy of Technology and Engineering");
		            System.out.println("Course: B.Tech Computer Science");
		        }
		    
//	Q---13 print odd numbers
    

    void printOddNumbers() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            
     
        }    
    }
//    Q---14 print even numbers
    
   
        void printEvenNumbers() {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
//    Q----15 print 1 to 10
        
      
            void printNumbers() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
            }
            
//  Q---16 return message
            
          
                String getMessage() {
                    return "Welcome to Java";
                }
//   Q---17 return square  
        
               
                    int getSquare() {
                        int n = 8;
                        return n * n;
                    }
//    Q---18      Return college name  
           
         String getCollegeName() {
      return "Gandhi Academy of Technology and Engineering";
      
       }
         
//  Q19. Return salary
         
         double getSalary() {
             return 25000.50;
         }
//  Q20. Return age  
         
         int getAge() {
             return 21;
         }
         
//   Q21. Return number 
                    
         int getNumber() {
             return 100;
         }  
         
//Q22. Return name
         
         String getName() {
             return "Sala";
         }
         
        
         
// Q23. Full name  
         
         void printFullName(String firstName, String lastName) {
             System.out.println(firstName + " " + lastName);
         }
// Q24. Print rectangle area 
         
         void printArea(int length, int width) {
             System.out.println("Area = " + (length * width));
         }
         
//   Q25. Print largest  
         
         void printLargest(int a, int b) {
             if (a > b)
                 System.out.println("Largest = " + a);
             else
                 System.out.println("Largest = " + b);
         }
         
//  Q26. Area of rectangle  
         int areaOfRectangle(int length, int width) {
             return length * width;
         }
         
//  Q27. Cube  
         
         int cube(int n) {
             return n * n * n;
         }
         
//  28. Greater number
         
         int max(int a, int b) {
             if (a > b)
                 return a;
             else
                 return b;
         }  
         
//   29. Prime Number — Parameterized with Return Type  
         

         boolean isPrime(int n) {

             if (n <= 1) {
                 return false;
             }

             for (int i = 2; i <= n / 2; i++) {
                 if (n % i == 0) {
                     return false;
                 }
             }

             return true;
         }
// 30. Reverse Number — Parameterized with Return Type 
         
         int reverse(int n) {

             int rev = 0;

             while (n > 0) {
                 int digit = n % 10;
                 rev = rev * 10 + digit;
                 n = n / 10;
             }

             return rev;
         }    
}
		    
		    
		    
		    
		    
		    
		    
		    
		
			
	




























