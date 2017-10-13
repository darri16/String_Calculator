#!/bin/bash

javac src/main/java/is/ru/stringcalculator/*.java -d classesjavac -classpath "src/test/resources/junit-4.11.jar:Classes/" src/test/java/is/ru/stringcalculator/CalculatorTest.java -d classes
