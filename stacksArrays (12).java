/*
William, Emiris, Jay Singh
Prof. F. Aljamal
CSC-214-02
Due Date: 11/23/2020 **/

/*  **/

import java.util.Scanner;
public class stacksArrays
{
   public static void main(String[] args) 
   {
      int repeat = 1, top = -2;
      final int SIZE = 5;
      int stack[] = new int[SIZE];

      
      while (repeat == 1)
      {
         switch (getMenuInput())
         {
            
            case 1: // create
               top = create(top);
            break;
            
            case 2: // push
               top = push(stack, top);
            break;
            
            case 3: // pop
               if (top < 0)
               System.out.println("The stack is empty.");
               else
                  top = pop(top);
            break;
            
            case 4: // top
               top(stack, top);
            break;
            
            case 5: // purge
            break;
            
            case 6: // empty
            break;
           
            case 99: // display and check
            for (int i = stack.length-1; i >= 0; i--)
               System.out.println(stack[i]);
            System.out.println("Top = " + top);
            break;
            
            default:
            System.out.println("\n\nIncorrect selection. Please restart the program.");
         }
         System.out.println("Press [1] to continue. ");
         repeat = getInput(repeat);
      }
   }
   
   // display menu and request input
   public static int getMenuInput() 
   { 
      int input;
     
      Scanner KB = new Scanner(System.in);
      System.out.println("STACK MENU:" );
      System.out.println("1: Create\n2: Push\n3: Pop\n4: Top\n6: Display");
      input = KB.nextInt();
      
      return input;  
   } 
   
   // get integer type input
   public static int getInput(int input)
   {
      Scanner KB = new Scanner(System.in);
      input = KB.nextInt();
      
      return input;
   } 
   
   public static int push(int stack[], int top)
   {
      if (top < -1)
         System.out.println("You have to create the stack!");
      else
      {
         //System.out.println("Top Before = " + top); // check
         top++;
         System.out.println("Enter a number to push onto the stack: ");
         stack[top++] = getInput(stack[top++]);  
         //System.out.println("Top After = " + top); // check
      }   
      // check if number is getting pushed into the array
      for (int i = stack.length-1; i >= 0; i--)
         System.out.println(stack[i]);
      
      return top - 2;
   }
   
   public static int pop(int top)
   {
      System.out.println("You have popped the stack.");
      
      return top - 1;
   }
   
   public static int create(int top)
   {
      if (top < -1)
      {
         top = -1;
         System.out.println("You created the stack.");
      }
      else
         System.out.println("There is an existing stack.");
         
      return top;
   }
   
   public static void top(int stack[], int top)
   {
      if (top < -1)
         System.out.println("You must create the stack!");
      else if (top == -1)
         System.out.println("The stack is empty.");
      else
         System.out.println("The top of the stack contains: " + stack[top]);  
   }
}

