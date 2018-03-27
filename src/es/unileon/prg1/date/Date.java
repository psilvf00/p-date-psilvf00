package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;

	}
	
	public int getYear(){
		return this.year;
	}
		
	public int getMonth(){
		return this.month;	
	}

	public int getDay(){
		return this.day;
	}

	boolean isSameYear(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	public boolean isSameMonth(Date another){
		if(this.month==another.getMonth()){
			return true;
		}
		return false;
	}

	public boolean isSameDay(Date another){
		if(this.day==another.getDay()){
			return true;
		}
		return false;
	}

	public boolean isSame(Date another){
		if((this.year==another.getYear()) && (this.month==another.getMonth()) && (this.day==another.getDay())){
			return true;
		}
		return false;
	}

	public String getMonthName(){
		switch(getMonthName()){
			case 1: System.out.println("Enero");
			break;
			case 2: System.out.println("Febrero");
			break;
			case 3: System.out.println("Marzo");
			break;
			case 4: System.out.println("Abril");
			break;
			case 5: System.out.println("Mayo");
			break;
			case 6: System.out.println("Junio");
			break;
			case 7: System.out.println("Julio");
			break;
			case 8: System.out.println("Agosto");
			break;
			case 9: System.out.println("Septiembre");
			break;
			case 10: System.out.println("Octubre");
			break;
			case 11: System.out.println("Noviembre");
			break;
			case 12: System.out.println("Diciembre");
			break;
		}
	}

}
