class Person {

	private String name;
	private int age;
	private String work;
	

	public Person(){
	}

	public Person(String name, int age, String work) {
		this.name = name;
		this.age = age;
		this.work = work;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public String work() {
		return work;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String aboutMe() {
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Work position: " + work;
	}

}