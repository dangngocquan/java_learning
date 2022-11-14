# **Java Swing**

| Section | Title - Exercises | 
| ------- | ----- |
| 1 | [Using Dialog Boxes - Basic input and output with dialog boxes](/code/markdown/java_swing/section01.md) |
| 2 | [Create Simple Drawings - Displaying and drawing lines on the screen](/code/markdown/java_swing/section02.md)|
| 3 | [Drawing Rectangles and Ovals - Using shapes to represent data](/code/markdown/java_swing/section03.md) |
| 4 | [Colors and Filled Shapes - Drawing a bull's-eye and random graphics](/code/markdown/java_swing/section04.md) |
| 5 | [Drawings Arcs - Drawing spirals with arcs](/code/markdown/java_swing/section05.md) |
| 6 | [Using Objects with Graphics - Storing shapes as objects](/code/markdown/java_swing/section06.md) |
| 7 | [Displaying Text and Images Using Labels - Providing status information](/code/markdown/java_swing/section07.md) |
| 8 | [Drawing with Polymorphism - Identifying the similarities between shapes](/code/markdown/java_swing/section08.md) |
| 9 | [GUI Components - Part 01](/code/markdown/java_swing/section09.md) |
| 10 | Adding Java 2D - Using the Java 2D API to enhance drawings |

<br>

## **List**
+ Java Swing
    + Using Dialog Boxes
        + Displaying Text in a Dialog Box
        + Entering Text in a Dialog
    + Create Simple Drawings
        + Java's Coordinate System
        + First Drawing Application
    + Drawing Rectangles and Ovals
    + Colors and Filled Shapes
    + Drawings Arcs
    + Using Objects with Graphics
    + Displaying Text and Images Using Labels
    + Drawing with Polymorphism
    + GUI Components - Part 01
        + Introduction
        + Java's New Nimbus Look-and-Fell
        + Simple GUI-Based Input/Output with JOptionPane
        + Overview of Swing Components
        + Displaying Text and Images in a Window
        + Text Fields and an Introduction to Event Handling with Nested Classes
        + Common GUI Event Types and Listener Interfaces
        + How Event Handling Works
        + JButton 
        + Buttons That Maintain State 
        + JCommonBox: Using an Anonymous Inner Class for Event Handling 
        + JList
        + Multiple-Selection Lists
        + Mouse Event Handling 
        + Adapter Classes
        + JPanel Subclass for Drawing with the Mouse 
        + Key Event Handling
        + Introduction to Layout Managers
        + Using Panels to Manager More Complex Layouts
        + JTextArea


<br> 

## **Constructor and Method Summary**

|   | ######## | Syntax | Modifier and Type | Class/Interface |
| - | -------- | ------ | ---- | ----- |
|  | 🌱 | showMessageDialog(Component parentComponent, Object message, String title, int messageType, Icon icon) | static void | JOptionPane |
|  | 🌱 | showInputDialog(Component parentComponent, Object message, String title, int messageType) | static String | JOptionPane |
|  |  |  |  |  |
|  |  |  |  |  |
|  | 🌱 | setColor(Color c) | abstract void | Graphics |
|  | 🌱 | setFont(Font font) | abstract void | Graphics |
|  |  | getColor() | abstract Color | Graphics |
|  |  | getFont() | abstract Font | Graphics |
|  | 🌱 | drawLine(int x1, int y1, int x2, int y2) | abstract void | Graphics |
|  |  | drawOval(int x, int y, int width, int height) | abstract void | Graphics |
|  |  | drawPolygon(int[] xPoints, int[] yPoints, int nPoints) | abstract void | Graphics |
|  |  | 	drawPolyline(int[] xPoints, int[] yPoints, int nPoints) | abstract void | Graphics |
|  | 🌱 | drawRect(int x, int y, int width, int height) | void | Graphics |
|  |  | drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) | abstract void | Graphics |
|  |  | drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) | abstract void | Graphics |
|  |  | drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) | abstract boolean | Graphics |
|  |  | drawString(String str, int x, int y) | abstract void | Graphics |
|  |  | fillOval(int x, int y, int width, int height) | abstract void | Graphics |
|  |  | fillPolygon(int[] xPoints, int[] yPoints, int nPoints) | abstract void | Graphics |
|  |  | fillRect(int x, int y, int width, int height) | abstract void | Graphics |
|  |  | fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) | abstract void | Graphics |
|  |  | fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) | abstract void | Graphics |
|  |  |  |  |  |
|  |  |  |  |  |
|  | 🌱🌱🌱 | paintComponent(Graphics g) | protected void | JPanel |
|  |  | getSize() | public Dimension | JPanel |
|  |  | setSize(int width, int height) | public void | JPanel |
|  |  |  |  |  |
|  |  |  |  |  |
|  | 🌱 | add(String name, Component comp) | public Component | JFrame |
|  |  | remove(Component comp) | void | JFrame |
|  | 🌱🌱 | setDefaultCloseOperation(int operation) | void | JFrame |
|  | 🌱🌱 | setVisible(boolean b) | public void | JFrame |
|  | 🌱🌱 | setSize(int width, int height) | public void | JFrame |
|  | 🌱🌱 | setLayout(LayoutManager manager) | void | JFrame |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  | 🌱 | setIcon(Icon icon) | void | JLabel |
|  | 🌱 | setText(String text) | void | JLabel |
|  |  | setIconTextGap(int iconTextGap) | void | JLabel |
|  |  | setVerticalAlignment(int alignment) | void | JLabel |
|  |  | setHorizontalAlignment(int alignment) | void | JLabel |
|  |  | setToolTipText(String text) | public void | JLabel |
|  |  |  |  |  |
|  |  |  |  |  |
|  | 🌱 | Font(String name, int style, int size) | Font | Font |
|  |  |  |  |  |
|  |  |  |  |  |
|  | 🌱🌱🌱 | actionPerformed(ActionEvent e) | void | ActionListener |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  | getActionCommand() | String | ActionEvent |
|  | 🌱 | getSource() | public Object | ActionEvent |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  | 🌱 | setFont(Font f) | void | JTextField |
|  | 🌱 | setColumns(int columns) | void | JTextField |
|  | 🌱 | setText(String t) | public void | JTextField |
|  |  | setEditable(boolean b) | public void | JTextField |
|  | 🌱🌱 | addActionListener(ActionListener l) | void | JTextField |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  | JButton(String text, Icon icon) | JButton | JButton |
|  | 🌱 | setText(String text) | public void | JButton |
|  | 🌱 | setIcon(Icon defaultIcon) | public void | JButton |
|  |  | setPressedIcon(Icon pressedIcon) | public void | JButton |
|  |  | setSelectedIcon(Icon selectedIcon) | public void | JButton |
|  | 🌱 | setRolloverIcon(Icon rolloverIcon) | public void | JButton |
|  | 🌱🌱 | addActionListener(ActionListener l) | public void | JButton |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |