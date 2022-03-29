package basico;

public class Exercise2_3 {

	public static void main(String[] args) {

		int hour = 14;
		int minute = 59;
		int second = 25;
		
		int hour2 = 15;
		int minute2 = 10;
		int second2 = 43;
		
		int secMidnight = (hour*3600) + (minute*60) + second;
		int secMidnight2 = (hour2*3600) + (minute2*60) + second2;
		int restSecond = (24*3600) - secMidnight;
		float percentage = secMidnight*100/86400;
		
		int restTime = secMidnight2 - secMidnight;
		
		System.out.print("¿Qué hora es?\t");;
		System.out.println("Son las " + hour + ":" + minute + ":" + second);
		
		System.out.print("¿Cuántos segundos llevamos desde medianoche?\t");
		System.out.println(secMidnight + " segundos");
		
		System.out.print("¿Cuántos segundos quedan para finalizar el día?\t");
		System.out.println(restSecond + " segundos");
		
		System.out.println("El porcentaje de día que llevamos es " + percentage + "%");
		
		System.out.println("EL tiempo que llevamos trabajando en este ejercicio es de " + restTime + " segundos");
		System.out.println("O lo que es lo mismo, " + restTime/60 + " minutos");
		
	}

}
