# **How Event Handling Works**

### ***This section use `textField1` variable from `TextFieldFrame` class of [section 09 part 06](/code/markdown/java_swing/section09_06.md) to explain how the event-handling works.***

<br>

## **Registering Events**

```
textField1.addActionListener(handler);
```

<br>

## **Event-handler Invocation**

+ When an event occurs, the GUI component receives (from the JVM) a unique ***event ID*** specifying the event type.
+ The GUI component uses the ***event ID*** to decide the listener type to which the event should be dispatched and to decide which method to call on each listener object.

