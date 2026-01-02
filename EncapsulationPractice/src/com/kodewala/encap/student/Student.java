package com.kodewala.encap.student;

public class Student {

	private int id;
	private String name;
	private double percentage;
	private String stream;

	public Student(int _id, String _name, double _percentage, String _stream) {
		this.id = _id;
		this.name = _name;
		this.percentage = _percentage;
		this.stream = _stream;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getStream() {
		return stream;
	}

}
