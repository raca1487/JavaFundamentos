
public class App {


	
//	public void setMiTaller(Vehiculo vehiculo) {
//		if (getMiTaller() == null) {
//			miTaller = new ArrayList<>();
//		} else {
//			miTaller.add(vehiculo);
//		}
//	}
	
	public static void main(String[] args) {
		
		Vehiculo coche = new Coche("1234-ABC", "Ferrari", "Rojo");
		Taller miTaller = new Taller();
		
//		miTaller.setAveria("Motor");
		miTaller.diagnosticar(coche);
//		miTaller.generarPresupuesto(coche);
	
		
	}

}
