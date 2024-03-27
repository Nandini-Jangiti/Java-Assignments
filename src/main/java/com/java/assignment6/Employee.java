package com.java.assignment6;


/*
it is a java14 feature.
it will generate by default with getters, constructors, tostring, hashcode, equals method. these are immutable
when user want to change or modify the object then use the setter methods.
 */
public record Employee(String name, int age, int experience, double salary, String department) {}

