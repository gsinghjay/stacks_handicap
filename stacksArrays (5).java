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
      int top = -2, counter = 0;

      
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
               int num = 0;
               if (top == -1)
               {
                  top++;
                  System.out.println("Enter a number to push onto the stack: ");
                  num = getInput(num);
                  stack[top++] = num;
                  counter++; // to determine what index the stack is at
                  
                  // test output
                  for (int i = 0; i < stack.length; i++)
                     System.out.println(stack[i]);
               }  
               else if(top <= -1)
               {
                  System.out.println("You have to create the stack!");
                  
                  // test output
                  for (int i = 0; i < stack.length; i++)
                  System.out.println(stack[i]);
               } 
               else
               {
                  System.out.println("Enter a number to push onto the stack: ");
                  num = getInput(num);
                  stack[top++] = num;
                  counter++; // to determine what index the stack is at
                  
                  // test output
                  for (int i = 0; i < stack.length; i++)
                  System.out.println(stack[i]);
               }
            break;
            
            case 3:
               // pop
            break;
            
            case 4: // top
            if (top < -1) // top is default
               System.out.println("You must create the stack!");
            else if (top == -1) // the stack is empty
               System.out.println("The stack is empty.");
            else
            {
               System.out.println("The top of the stack contains: " + stack[top-1]);  
               // test outputs 
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
}