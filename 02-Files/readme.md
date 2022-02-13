# Files

### Writing to a file in Java
- Use a string to represent the file path. This string will be passed to the objects used to read and write to files. exaample: 
```
String path = "studentFolder/text/practice1.txt";
```
- A buffer is a block of memory that stores data. Your program interacts with the buffer (which is fast) before interacting with the disk (which is slow). Buffers can read or write more than one byte of data at a time, so it interacts with the disk less often.

<img src="/images/buffer.png" alt="buffer"/>

- Be sure to import the java.io package.

- Use a try... catch block to handle input/output exceptions. In the try portion of the block, create a BufferedWriter object. If there is an exception, print it in the catch portion of the block. This code should run without any errors, but it does not do anything.

```
String path = "studentFolder/text/practice1.txt";
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(path));
    } catch (IOException e) {
      System.out.println(e);
    }
```
- Create a string with the text you want to write to the file. Then use the write method to write this text to the file. Always close the file once you are done writing to it. Add a finally block so the user gets a message that the program has finished writing to file. After running the program, you can click the link to open the file and see the message.

```
    //add code below this line
    String path = "studentFolder/text/practice1.txt";
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(path));
      String text = "Hello there";
      writer.write(text);
      writer.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished writing to a file.");
    }
    //add code above this line 
```
- If you tell Java to write to a nonexistent file (the third suggestion), it will create the file for you. That is why you do not see an error message. `FileWriter` will throw an input/output exception if the path is a directory rather than a regular file, if the file does not exist but cannot be created, or if the file cannot be opened for any other reason. 
- To add a new line after a text :
```
String text1 = "Hello there\n";
```
- Another way to add new line is using the method newLine from BufferedWriter class which writes a line separator. You can use this method instead of using the newline character in your strings.

```
      String text1 = "Hello there";
      String text2 = "my friend";
      writer.write(text1);
      writer.newLine();
      writer.write(text2);
      writer.close();
```
- If you want to add to an existing file, you need to tell Java that you want to append to a file rather than overwrite it. 
- To append to this file, use the boolean `true` after the file path when declaring a `FileWriter` object. Set `text` to a different string. 

```
BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
String text = "but smile, smile, smile";
```




