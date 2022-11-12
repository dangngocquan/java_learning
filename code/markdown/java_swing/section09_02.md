# **Java's New Nimbus Look-and-Fell**

## There are 3 ways that you can use **Numbus**:
+ ### Set it as default for all Java applications that run on your computer.
    
    To set Nimbus as the default for all Java applications, you must create a text file named `swing.properties` in the lib folder of both your JDK installation folder and your JRE installation folder. Place the following line of code in the file:
    ```
    swing.defaultlaf=com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel
    ```

+ ### Set it as the look-and-feel at the time that you launch an application by passing a command-line argument to the Java command.
+ ### Set it as the look-and-feel programatically in your application.