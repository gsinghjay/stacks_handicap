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
      int top = -2, counter = 0, counter_top = 0;

      
      while (repeat == 1)
      {
         switch (getMenuInput())
         {
            
            case 1: // create
               top = createStack(top); // sets top to -1
            break;
            case 2: // push
            pushStack(top, stack);
            break;
            
            case 3: // pop
               System.out.println("The number: " + stack[top] + " has been popped.");
               top--;
               System.out.println("The number that is now on top is " + stack[top]);
            break;
            
            case 4: // top
               if (top == -2)
                  System.out.println("You must create the stack!");
               else if (top == -1)
                  System.out.println("The stack is empty.");
               else
               {
                  top--;
                  System.out.println("counter = ");
                  System.out.println("The top of the stack contains: " + stack[top]);
                  System.out.println("The counter is at: " + counter + " and the numbers in the array are:");
                  
                  for (int i = 0; i < stack.length; i++)
                    System.out.println(stack[i]);
               }
            break;
            
            case 5:
            // purge
            break;
            
            case 6:
               for (int i = 0; i < stack.length; i++)
                  System.out.println(stack[i]);
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
      System.out.println("1: Create\n2: Push\n4: Top\n6: Display");
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
   
   // set top to -1
   public static int createStack(int top)
   {
         top = -1;
         System.out.println("You created the stack.");
      
      return top;
   }
   
   public static int pushStack(int top, int stack[])
   {
      int num = 0;
      if (top == -1)
      {
         top++;
         System.out.println("Enter a number to push onto the stack: ");
         num = getInput(num);
         stack[top++] = num;
      }  
      else if(top <= -1)
      {
         System.out.println("You have to create the stack!");
      } 
      else
      {
         System.out.println("Enter a number to push onto the stack: ");
         num = getInput(num);
         stack[top++] = num;
      }
      
       return stack[top];
    }
 
   
}