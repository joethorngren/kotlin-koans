package i_introduction._4_Lambdas;

import java.util.function.Consumer;

public class JavaLambdas {

    // Anatomy of an Anonymous Inner-Class (AIC)

    /*Syntax of Anonymous Classes

    As mentioned previously, an anonymous class is an expression. The syntax of an anonymous class expression is like the invocation of a constructor, except that there is a class definition contained in a block of code.

    Consider the instantiation of the frenchGreeting object:

    public void exampleLambda() {
        new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

            }
        };
    }
    The anonymous class expression consists of the following:

        - The new operator

        - The name of an interface to implement or a class to extend. In this example, the anonymous class is implementing the interface HelloWorld.

        - Parentheses that contain the arguments to a constructor, just like a normal class instance creation expression. Note: When you implement an interface, there is no constructor, so you use an empty pair of parentheses, as in this example.

        - A body, which is a class declaration body. More specifically, in the body, method declarations are allowed but statements are not.

    Because an anonymous class definition is an expression, it must be part of a statement. In this example, the anonymous class expression is part of the statement that instantiates the frenchGreeting object. (This explains why there is a semicolon after the closing brace.)*/

    public void exampleLambda() {
        new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
    }
}
