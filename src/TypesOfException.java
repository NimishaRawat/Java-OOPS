/* Exception in java -
An exception is an event that occurs when the program is executed
disrupting the normal flow of the program.
There are mainly two types of exceptions in java -
1. Checked Exception   (Compile time exceptions(Handled by Compiler))
2. Unchecked Exceptions    (Runtime Exceptions)

Commonly occurring Exceptions -
1. Null Pointer Exception
2. Arithmetic Exception
3. ArrayIndexOutOfBounds Exception
4. IllegalArgument Exception
5. NumberFormat Exception

These exceptions are handled using try-catch block in java.

try-catch

syntax -
try{
    //code to try
    }
catch(Exception e){
    //code if exception
    }
* */
public class TypesOfException {
    public static void main(String[] args) {
        int a = 1000;
        int b = 0;
        // without try-catch block the program won't get executed
        try{
            int c = a/b;
            System.out.println("The division of "+a+" and "+b+" = "+c);
        }
        catch (Exception e){
            System.out.println("The above code can't be executed . The reason :");
            System.out.println(e);
        }
        System.out.println("Program is being executed");
    }
}
