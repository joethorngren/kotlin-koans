package i_introduction._4_Lambdas

import util.TODO
import util.doc4
import java.util.function.Predicate

fun example() {

    /*
    * Lambda Body
    *
    * [parameters] -> [body]
    *
    * parameters: if there is only one argument then you don't need to specify the type + no need for parentheses
    *            multiple: need the type + need parens
    */

    val sum = { x: Int, y: Int -> x + y }

    /*
    * public int sum(int x, int y) {
    *    return x + y;
    * }
    *
    */

    val square: (Int) -> Int = { x -> x * x }

    /*
    * public int square(int x) {
    *
    *    return x * x;
    * }
    *
    */

    sum(1, square(2)) == 5
}

fun todoTask4(collection: Collection<Int>): Nothing = TODO(
    """
        Task 4.
        Rewrite 'JavaCode4.task4()' in Kotlin using lambdas.
        You can find the appropriate function to call on 'collection' through IntelliJ IDEA's code completion feature.
        (Don't use the class 'Iterables').
    """,
    documentation = doc4(),
    references = { JavaCode4().task4(collection) })

/*
*   Anatomy of a Lambda
*
*   Lambda expressions are described in more detail below, but for purposes of continuing this section, let's see a brief overview:
*
*       - A lambda expression is always surrounded by curly braces,
*       - Its parameters (if any) are declared before -> (parameter types may be omitted),
*       - The body goes after -> (when present).
*
*/

fun task4(collection: Collection<Int>): Boolean {
     return collection.any({number -> number % 42 == 0})
}




