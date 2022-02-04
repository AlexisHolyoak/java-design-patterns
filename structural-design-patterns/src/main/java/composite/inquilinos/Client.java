package composite.inquilinos;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		HotelComposition hotel = new Habitacion();
		HabitacionComposition hab1 = new Habitacion("S/300","1er piso");
		HabitacionComposition hab2 = new Habitacion("S/200","2do piso");
		HabitacionComposition hab3 = new Habitacion("S/100","3er piso");
		HotelComposition of1 = new Oficina("S/100", "1er piso");
		hotel.add(hab1);
		hotel.add(hab2);
		hotel.add(of1);
		HabitacionComposition jefe1 = new Encargado("20 años", "Juan");		
		HabitacionComposition company = new Company("30 años", "Maria");
		HabitacionComposition jefe2 = new Encargado("13 años", "Carlos");
		hotel.get(hotel);
		hab1.addInquilino(jefe1);
		hab1.addInquilino(company);
		hab2.addInquilino(jefe2);
		System.out.println("********");
		hab1.getInquilinos(hab1);
		hab2.getInquilinos(hab2);
		
	}

}
