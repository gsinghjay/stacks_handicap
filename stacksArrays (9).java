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
      int repeat = 1;
      final int SIZE = 5;
      int stack[] = new int[SIZE];
      int top = -2;

      
      while (repeat == 1)
      {
         switch (getMenuInput())
         {
            
            case 1: // create
               if (top < -1)
               {
                  top = -1;
                  System.out.println("You created the stack.");
               }
               else
               {
                  System.out.println("There is an existing stack.");
               }
            break;
            case 2: // push
               if (top >= -1)
               {
                  push(stack, top);
                  top++;
               }  
               else
                  System.out.println("You have to create the stack!");
            break;
            case 3: // pop
               if (top <= 0)
               System.out.println("The stack is empty.");
               else
               {
                  top = pop(top);
                  System.out.println("You have popped the stack.");
               }
            break;
            case 4: // top
            if (top < -1) // top is default
               System.out.println("You must create the stack!");
            else if (top == -1 || top == 0)
               System.out.println("The stack is empty.");
            else
            {
               System.out.println("The top of the stack contains: " + stack[top]);  
            }
            break;
            
            case 5:
            // purge
            break;
            
            case 6:
            // is empty?
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
   
   public static void push(int stack[], int top)
   {
      top++;
      int num = 0;
      System.out.println("Enter a number to push onto the stack: ");
      stack[top++] = getInput(stack[top++]);  
      
      // test outputs 
      System.out.println("Index our stack is at (top): " + top + "\nStack:");
      for (int i = stack.length-1; i >= 0; i--)
         System.out.println(stack[i]);
      System.out.println("Index our stack is at (top): " + top);
   }
   
   public static int pop(int top)
   {
      return top - 1;
   }
}