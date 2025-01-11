public class Quiz {

    public static void main(String[] args) {
        // question 2: values of a and b after execution
        int a, b;
        a = b = 10;
        System.out.println(a);
        System.out.println(b);

        // question 3: predict the output
        a = 3;
        b = 6;
        int result = (~a & b) | (a & ~b);
        System.out.println(result);

        // question 4: Which conditional statement is used to check multiple possible values of a variable?
        // answer: switch
        
        // question 5: What is the output of the following program in Java
        // if (1) {
        //     System.out.println("Matt");
        // }
        // answer: compile-time error

        // question 6: Predict the output of the code
        // answer: fly
        int x=2;

        switch(x) {
            case 1:
            case 2:
            case 3:
            System.out.println("Fly");
            break;
            case 4:
            System.out.println("Swim");
        }

        // question 7: value of variables ‘x’ and ‘y’ from the given code
        x = 5;
        int y = 10;
        int z = (x++ > 5 && y-- < 10) ? x-- : y;
        System.out.println("x: " + x + " y: " + y + " z: " + z);

        // question 8: Which loop executes the code block based on a condition that is checked before each iteration in Java
        // answer: while and for loops

        // question 9: What is the type of the do-while loop in terms of control flow
        // answer: exit-controlled loop

        // question 10: What will be the output of the given code snippet
        int i, j;
        i = 100;
        j = 300;
        while(++i < --j);
        System.out.println(i);
    }
}