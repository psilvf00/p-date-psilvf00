package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow, nombre, prueba, prueba2, prueba3, prueba4, prueba5, prueba6, prueba7, prueba8, prueba9, prueba10;

	try{	
		today = new Date(20, 3, 2018);
		tomorrow = new Date(21, 3, 2018);
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow));
		System.out.println(today + " isSame " + tomorrow + "? " + today.isSame(tomorrow));

		//Prueba del método del nombre de los meses;
		nombre = new Date(5, 4, 2018);
		System.out.println("El nombre del mes es :" + nombre.getMonthName());

		//Prueba del método isDayRight();
		prueba = new Date(32, 1, 2018);
		prueba2 = new Date(31, 4, 2018);
		prueba3 = new Date(25, 10, 2018);
		System.out.println("La fecha" + prueba + "es correcta?" + prueba.isDayRight());
		System.out.println("La fecha" + prueba2 + "es correcta?" + prueba2.isDayRight());
		System.out.println("La fecha" + prueba3 + "es correcta?" + prueba3.isDayRight());

		//Prueba del método de las estaciones;
		prueba4 = new Date(30, 5, 2018);
		prueba5 = new Date(21, 6, 2018);
		prueba6 = new Date(20, 12, 2018);
		prueba7 = new Date(17, 3, 2018);
		System.out.println("La estacion es:" + prueba4.getSeasonName());
		System.out.println("La estacion es:" + prueba5.getSeasonName());
		System.out.println("La estacion es:" + prueba6.getSeasonName());
		System.out.println("La estacion es:" + prueba7.getSeasonName());

		//Prueba del método getMonthsLeft();
		prueba8 = new Date(23, 5, 2018);
		System.out.println("Para terminar el anio quedan:" + prueba8.getMonthsLeft());

		//Prueba del método para generar la fecha;
		prueba9 = new Date(29, 5, 2018);
		System.out.println("La fecha es:" + prueba9.printDate());

		//Prueba del método getDaysLeftOfMonth();
		System.out.println("Los dias que quedan para el final del mes son:"+prueba7.getDaysLeftOfMonth());

		//Prueba del método getMonthsSameDays();
		System.out.println(today.getMonthsSameDays());

		//Prueba del método daysPast();
		System.out.println("Han pasado " + today.daysPast() + " dias desde que empezo el anio");

		//Prueba del método fecha aleatoria;
		System.out.println("El numero de intentos es:" + today.numRandomTrasEqualDate1());

		//Prueba del método fecha aleatoria2;
		System.out.println("El numero de intentos es:" + today.numRandomTrasEqualDate2());

		//Pruba del método del dia de la semana;
		prueba10= new Date(7, 4, 2018);
		System.out.println("El dia " + prueba10 + " es:" + prueba10.dayOfWeek()); 

		//Prueba del método isSame sin if;
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear2(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth2(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay2(tomorrow));
		System.out.println(today + " isSame " + tomorrow + "? " + today.isSame2(tomorrow));


	}
	catch(DateException e){
		System.out.println(e.getMessage());
	}


	}

}
