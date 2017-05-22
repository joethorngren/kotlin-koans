package i_introduction._2_Named_Arguments

import i_introduction._1_Java_To_Kotlin_Converter.task1
import util.TODO
import util.doc2

// JAVA

// [visibility] [return type] [name] [parameters] [open curly] [body] [close curly]

// [public/private/protected/default] [return type] [name] [parameters] [open curly] [body] [close curly]

// public void bar (int i, String s, Boolean b) { }

// KOTLIN:

// [visibility = public, private, protected, internal] [name] [parameters] : [return type] [open curly] [body] [close curly]

// default values for arguments:
fun bar(i: Int, s: String = "", b: Boolean = true) {}

fun usage() {
    // named arguments:
    bar(1, b = false)
}

fun todoTask2(): Nothing = TODO(
    """
        Task 2.
        Implement the same logic as in 'task1' again through the library method 'joinToString()'.
        Specify only two of the 'joinToString' arguments.
    """,
    documentation = doc2(),
    references = { collection: Collection<Int> -> task1(collection); collection.joinToString() })

fun task2(collection: Collection<Int>): String {

    return collection.joinToString(postfix = "}", prefix = "{")
}