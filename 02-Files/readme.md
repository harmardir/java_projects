# Files

### Writing to a file in Java
- Use a string to represent the file path. This string will be passed to the objects used to read and write to files. exaample: 
```
String path = "studentFolder/text/practice1.txt";
```
- A buffer is a block of memory that stores data. Your program interacts with the buffer (which is fast) before interacting with the disk (which is slow). Buffers can read or write more than one byte of data at a time, so it interacts with the disk less often.

<img src="https://github.com/harmardir/java_projects/blob/main/02-Files/images/buffer.png"/>

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

### Reading a file in Java

- The `readLine` method will read from the file until it encounters a newline character. All of the text read up until the newline character will be returned. Combine the `readLine` method with the the `println` command to see the first line of the file.

```
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      System.out.println(reader.readLine());
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.");
    }
    //add code above this line 
```
- Java represents the end of the file when the `readLine` method returns `null`.
- To read an entire file create string use the `ready` method in the while loop, and print the the value of the `readLine` method. Not only is this a more concise way of iterating over a file, you do not have to worry about an infinite loop.
```
      //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      while(reader.ready()) {
        System.out.println(reader.readLine());
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.");
    }
    //add code above this line 

```
- Tokens :To craete tokens we use the string method `split`.This method takes a delimiter as a parameter. The `split` method returns an array of strings. The code below will read just the first line of the file and then split it into words since a space is the delimiter. Finally, use an enhanced loop to iterate through the array and print each token.
```
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String line = reader.readLine();
      String [] tokens = line.split(" ");
      for (String t: tokens) {
        System.out.println(t);
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.");
    }
    //add code above this line 
```
- Strink Tokenizer : Java has the `StringTokenizer` class which allows you to convert strings into tokens with some added features when compared to the `split` method. You need to import the `java.util` package. When instantiating a `StringTokenizer` object, it requires a string and a delimiter as parameters. The methods `hasMoreTokens` (returns a Boolean) and `nextToken `(returns a string) allow you to iterate over the tokens.

```
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String line = reader.readLine();
      StringTokenizer tokens = new StringTokenizer(line, " ");
      while (tokens.hasMoreTokens()) {
        System.out.println(tokens.nextToken());
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.");
    }
    //add code above this line 
```
- The `skip` method takes an integer as a parameter, and causes Java to go to a specific character in the text file. The integer is the index for the text file. So skip(0) is the first character of the file, skip(1) is the second character, etc. The code below prints out the first line from the file.
In the code below ava will skip the first 30 characters and then print the remaining characters from the first line.

```
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      reader.skip(30);
      System.out.println(reader.readLine());
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.");
    }
    //add code above this line 
```
### CSV Files

- In order to read a CSV file, Java needs to import the `opencsv` package and the `apache.commons` package in addition to the `java.io` package. The CSV file will be opened much like a text file; open the file in a `FileReader` object, but wrap it in a `CSVReader` object as opposed to a `BufferedReader` object.

```
        //add code below this line
    String path = "studentFolder/csv/montyPythonMovies.csv";
    try {
      CSVReader reader = new CSVReader(new FileReader(path));
      for (String[] row : reader) {
        for (String item : row) {
          System.out.print(item + " ");
        }
        System.out.println();
      }
      reader.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }
    //add code above this line

```
- To skip the first row:
```
CSVReader reader = new CSVReader(new FileReader(path));
      reader.skip(1);
```
- With the string `format` method, you can introduce consistent spacing printing a string. Start with `String.format("%s", item)`. That tells Java that the value stored in `item` is to be printed as a string. To add padding, insert 15 between the "% " and the “s” so it looks like `String.format("%17s", item)`

```
    //add code below this line
    String path = "studentFolder/csv/homeRuns.csv";
    try {
      CSVReader reader = new CSVReader(new FileReader(path));
      for (String[] row : reader) {
        String column1 = String.format("%-17s", row[0]);
        String column2 = String.format("%-11s", row[1]);
        String column3 = String.format("%-13s", row[2]);
        System.out.println(column1 + column2 + column3);
      }
      reader.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }
    //add code above this line
```
- The data for each row in a CSV file stored as an array of strings once it is read.
- Delimiters are a predefined character that separates one piece of information from another. CSV files use commas as the delimiter by default, we can use tabs `("\t")` as delimiter.
```
    //add code below this line
    String path = "studentFolder/csv/dataWithTabs.csv";
    String delimiter = "\t";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      while(reader.ready()) {
        String line = reader.readLine();
        String[] tokens = line.split(delimiter);
        for(String token : tokens) {
          System.out.print(String.format("%-10s", token));
        }
        System.out.println();
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }
    //add code above this line
```
- `CSVWriter` object is used to write to a CSV file.
```
    //add code below this line
    String path = "studentFolder/csv/writePractice.csv";
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(path));
      
      String[] header = {"Greeting", "Language"};
      String[] row1 = {"Hello", "English"};
      String[] row2 = {"Bonjour", "French"};
      String[] row3 = {"Hola", "Spanish"};
      String[] row4 = {"Namaste", "Hindi"};
      
      writer.writeNext(header);
      writer.writeNext(row1);
      writer.writeNext(row2);
      writer.writeNext(row3);
      writer.writeNext(row4);
      
      writer.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished writing to a CSV");
    }
    //add code above this line
```





