class Hangar{

	public static void main(String[] args){
	
		Boat titanic = new Boat("Titanic");
		Car renault = new Car("Renault");

		System.out.println(titanic.doStuff());
		System.out.println(renault.doStuff());
	}

}
