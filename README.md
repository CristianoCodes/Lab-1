This project contains the Gasoline and Electric interfaces, the HybridVehicles class, and the CarRunner class, and the HybridVehicleTest test class.

Structure:
c/
  Gasoline.java
  Electric.java
  HybridVehicle.java
  CarRunner.java
u/
  HybridVehicleTest.java

Compile: javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" c/*.java u/*.java
Run program: java -cp "." c.CarRunner
Run tests: java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore u.HybridVehicleTest