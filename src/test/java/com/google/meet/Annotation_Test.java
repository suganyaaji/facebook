package com.google.meet;

import org.testng.annotations.Test;

public class Annotation_Test {
@Test(priority = 1)
private void monday() {
System.out.println("login time 9 am");
}
@Test(priority = 2)
private void Tuesday() {
System.out.println("login time 9.5 am");
}
@Test(priority = 0)
private void wednesday() {
System.out.println("login time 10 am");
}
@Test(priority = 3,enabled = false)
private void thursday() {
System.out.println("login time 1.30 am");
}
@Test(invocationCount = 2)
private void friday() {
System.out.println("login time 8.30 am ");
}
@Test(timeOut = 5000)
private void saturday() throws InterruptedException {
System.out.println("login time 9.10 am");
Thread.sleep(4900);
}
@Test(priority = 4)
private void sunday() {
System.out.println("login time 10.5 am");
}


}
