class Main {
	public static void main(String[] args) {

		Car porche = new Car();
		Car ferrari = new Car();
		porche.setModel("Correra ");
		porche.setEngine("2x");
		porche.setColour("Black");
		porche.setWheels(4);
		porche.setDoors(4);
		ferrari.setModel("AVG");
		ferrari.setEngine("5x");
		ferrari.setColour("Red");
		ferrari.setWheels(4);
		ferrari.setDoors(4);

		System.out.println("Model is " + porche.getModel() + "The Engine is " + porche.getEngine() + " And Colour is "
				+ porche.getColour());
		System.out.println("it has " + porche.getWheels() + " Wheels " + " and  " + porche.getDoors() + " Doors ");
		System.out.println("Model is " + ferrari.getModel() + " The Engine is " + ferrari.getEngine()
				+ " And Colour is " + ferrari.getColour());
		System.out.println("it has " + ferrari.getWheels() + " Wheels " + " and " + ferrari.getDoors() + " Doors ");
		p
	}

}