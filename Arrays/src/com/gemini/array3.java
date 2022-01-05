package com.gemini;

class student{
	public int roll_no;
	public String name;
student(int roll_no,String name) {
	this.roll_no=roll_no;
	this.name=name;
	
	}
	
}
public class array3 {

	public static void main(String[] args) {
student[] arr=new student[3];
arr[0]=new student(1,"asritha");
arr[1]=new student(2,"divya");
arr[2]=new student(3,"grishma");

for (student i:arr) 
	System.out.println(i.roll_no +" "+i.name);


	}

}
