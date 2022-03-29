package mediamarkt;

public class Ejecutable {

	public static void main(String[] args) {

		Electrodomestico[] misElectrodomesticos = new Electrodomestico[10];
		Electrodomestico el1 = new Electrodomestico();
		Electrodomestico el2 = new Electrodomestico();
		Electrodomestico el3 = new Electrodomestico();
		Electrodomestico el4 = new Electrodomestico();
		Electrodomestico el5 = new Electrodomestico();
		Lavadora lav1 = new Lavadora();
		Lavadora lav2 = new Lavadora();
		Lavadora lav3 = new Lavadora();
		Television tv1 = new Television();
		Television tv2 = new Television();

		misElectrodomesticos[0] = el1;
		misElectrodomesticos[1] = el2;
		misElectrodomesticos[2] = el3;
		misElectrodomesticos[3] = el4;
		misElectrodomesticos[4] = el5;
		misElectrodomesticos[5] = lav1;
		misElectrodomesticos[6] = lav2;
		misElectrodomesticos[7] = lav3;
		misElectrodomesticos[8] = tv1;
		misElectrodomesticos[9] = tv2;

		for (int i = 0; i < misElectrodomesticos.length; i++) {
			double precioLavadoras = misElectrodomesticos[i].precioFinal();
			double precioTelevisores = misElectrodomesticos[i].precioFinal();
			double precioElectrodomesticos = precioLavadoras + precioTelevisores
					+ misElectrodomesticos[i].precioFinal();
			System.out.println("El precio de las lavadoras es de " + precioLavadoras);
			System.out.println("El precio de las televisiones es de " + precioTelevisores);
			System.out.println("El precio total de todos los electrodomesticos es de " + precioElectrodomesticos);
		}

	}

}
