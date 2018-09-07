package edu.mum.cs.cs401.labs.lab08.problem2.partC;

public class Employee {
	String name;
	int salary;

	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary + ">");
		return sb.toString();

	}
}