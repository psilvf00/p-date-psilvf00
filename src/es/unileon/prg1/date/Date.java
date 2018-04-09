package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year) throws DateException{
		this.day = day;

		if(month<1 || month>12){
			throw new DateException("Mes no valido");
		}
		else{
			this.month = month;
		}	
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

	//Sin if;

	boolean isSameYear2(Date another){
		return (this.year==another.getYear());
		
	}	

	boolean isSameMonth2(Date another){
		return (this.month==another.getMonth());
		
	}

	boolean isSameDay2(Date another){
		return (this.day==another.getDay());
	}	

	boolean isSame2(Date another){
		return ((this.year==another.getYear()) && (this.month==another.getMonth()) && (this.day==another.getDay()));
	}						

	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
}
	
	public int day (int month){
		int diasMes= this.day;

		switch(this.month){
			case 1: 
				diasMes= 31;
			break;
			case 2: 
				diasMes= 28;
			break;
			case 3: 
				diasMes= 31;
			break;
			case 4: 
				diasMes= 30;
			break;		
			case 5: 
				diasMes= 31;
			break;
			case 6: 
				diasMes= 30;
			break;
			case 7: 
				diasMes= 31;
			break;
			case 8: 
				diasMes= 31;
			break;
			case 9: 
				diasMes= 30;
			break;
			case 10: 
				diasMes= 31;
			break;
			case 11: 
				diasMes= 30;
			break;
			case 12: 
				diasMes= 31;
			break;
		}
		return diasMes;		
	}	

	public void setMonth (int month) throws DateException{
		if(month<=0){
			throw new DateException("Numero no valido");
		}
		else{
			this.month=month;	
		}
		if(month>12){
			throw new DateException("Numero no valido");
		}
		else{
			this.month=month;
		}
	}
	

	public String getMonthName (){
		
		String name="enero";
		switch(this.month){
			case 1:
					name="enero";
			break;
			case 2:
					name="febrero";
			break;

			case 3:
					name="marzo";
			break;

			case 4:
					name="abril";
			break;

			case 5:
					name="mayo";
			break;

			case 6:
					name="junio";
			break;

			case 7:
					name="julio";
			break;

			case 8:
					name="agosto";
			break;

			case 9:
					name="septiembre";
			break;

			case 10:
					name="octubre";
			break;

			case 11:
					name="noviembre";
			break;

			case 12:
					name="diciembre";
			break;

			}
		return name;
	}

	public boolean isDayRight(){
		if(this.month==1 || this.month==3 || this.month==5 || this.month==7 || this.month==8 || this.month==10 || this.month==12){
			if(this.day<=31){
				return true;	
			}
			else{
				return false;
			}
		}
		else if(this.month==2){
			if(this.day<=28){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			if(this.day<=30){
				return true;
			}
			else{
				return false;
			}
		}								
	}

	public String getSeasonName(){
		String season;		

		if(this.month>=3 && this.month<=6){
			if(this.month==3){
				if(this.day>=21){
					season="Primavera";
				}
				else{
					season="Invierno";
				}
			}
			else if(this.month==6){
				if(this.day<=20){
					season="Primavera";
				}
				else{
					season="Verano";
				}
			}
			else{
				season="Primavera";
			}
		}

		else if(this.month>6 && this.month<=9){
			if(this.month==9){
				if(this.day<=20){
					season="Verano";
				}
				else{
					season="Otono";
				}
			}
			else{
				season="Verano";
			}
		}

		else if(this.month>9 && this.month<=12){
			if(this.month==12){
				if(this.day<=20){
					season="Otono";
				}
				else{
					season="Invierno";
				}
			}
			else{
				season="Otono";
			}
		}

		else{
			season="Invierno";
		}
	return season;
	}

	public String getMonthsLeft(){
		StringBuffer months;
		months = new StringBuffer();
		for(int i=this.month; i<=12; i++){
			months.append("\n");
			months.append(this.getMonthName());
			this.month = this.month+1 ;
		}
		return months.toString();
	}	

	public String printDate(){
		String date= new String("");
		try{
			Date aux = new Date(29,5,2018);
			date = (aux.getDay() + "/" + aux.getMonth() + "/" + aux.getYear());
		}
		catch(DateException e){
			System.out.println(e.getMessage());
		}
		return date;
	}	

	public String getDaysLeftOfMonth(){
		StringBuffer days;
		days = new StringBuffer();
			if(this.month==1 || this.month==3 || this.month==5 || this.month==7 || this.month==8 || this.month==10 || this.month==12){
				for(int i=this.day; i<=31; i++){
					days.append("\n");			days.append(this.day+"/"+this.month+"/"+this.year);
					this.day=this.day+1;
				}
			}
			else if(this.month==4 || this.month==6 || this.month==9 || this.month==11){
				for(int i=this.day; i<=30; i++){
					days.append("\n");
					days.append(this.day+"/"+this.month+"/"+this.year);
					this.day=this.day+1;
				}
			}
			else{
				for(int i=this.day; i<=28; i++){
					days.append("\n");
					days.append(this.day+"/"+this.month+"/"+this.year);
					this.day=this.day+1;
				}
			}

	return days.toString();
	}	

	public String getMonthsSameDays(){
		String mesesIguales="";

		switch(this.month){
			case 1:
				mesesIguales="Los meses con el mismo numero de dias son: marzo, mayo, julio, agosto, octubre y diciembre.";
			break;
			case 2:
				mesesIguales="Ningun mes tiene el mismo numero de dias.";
			break;
			case 3:
				mesesIguales="Los meses con el mismo numero de dias son: enero, mayo, julio, agosto, octubre y diciembre.";
			break;
			case 4:
				mesesIguales="Los meses con el mismo numero de dias son: junio, septiembre y noviembre.";
			break;
			case 5:
				mesesIguales="Los meses con el mismo numero de dias son: enero, marzo, julio, agosto, octubre y diciembre.";
			break;
			case 6:
				mesesIguales="Los meses con el mismo numero de dias son: abril, septiembre y noviembre.";
			break;
			case 7:
				mesesIguales="Los meses con el mismo numero de dias son: enro, marzo, mayo, agosto, octubre y diciembre.";
			break;
			case 8:
				mesesIguales="Los meses con el mismo numero de dias son: enero, marzo, mayo, julio, octubre y diciembre.";
			break;
			case 9:
				mesesIguales="Los meses con el mismo numero de dias son: abril, junio, y noviembre.";
			break;
			case 10:
				mesesIguales="Los meses con el mismo numero de dias son: enero, marzo, mayo, julio, agosto y diciembre.";
			break;
			case 11:
				mesesIguales="Los meses con el mismo numero de dias son: abril, junio y septiembre.";
			break;
			case 12:
				mesesIguales="Los meses con el mismo numero de dias son: enero, marzo, mayo, julio, agosto y octubre.";
			break;

		}
	return mesesIguales;
	}
	
	public int daysPast(){
		int num=0;

		try{
			Date aux= new Date (1, 1, this.year);

		for(int i=1; i<this.month; i++){
			num+=aux.day(i);
			aux.setMonth(i+1);
		}
		}
		catch (DateException e){
			System.err.println(e.getMessage());
		}
		return num+this.day;

	}

	public int numRandomTrasEqualDate1(){
		int num = 1;
		int dayR = (int) (Math.random()*31+1);
		int mesR = (int) (Math.random()*12+1);
		while(dayR!=this.day || mesR!=this.month){
			dayR = (int) (Math.random()*31+1);
			mesR = (int) (Math.random()*12+1);
			num = num+1;
		}
	return num;	
	}

	public int numRandomTrasEqualDate2(){
		int num2 = 1;
		int dayR2 = (int) (Math.random()*31+1);
		int mesR2 = (int) (Math.random()*12+1);
		do{
			dayR2 = (int) (Math.random()*31+1);
			mesR2 = (int) (Math.random()*12+1);
			num2 = num2+1;
		}while(dayR2!=this.day || mesR2!=this.month);
	return num2;	
	}

	public String dayOfWeek(){
		String primerDiaAnio= "Lunes";
		try{
		Date fecha = new Date(7, 4, 2018);
		int diasPasados = fecha.daysPast();

		if((diasPasados%7)==1){
			primerDiaAnio="Lunes";
		}
		else if((diasPasados%7)==2){
			primerDiaAnio="Martes";
		}
		else if((diasPasados%7)==3){
			primerDiaAnio="Miercoles";
		}
		else if((diasPasados%7)==4){
			primerDiaAnio="Jueves";
		}
		else if((diasPasados%7)==5){
			primerDiaAnio="Viernes";
		}
		else if((diasPasados%7)==6){
			primerDiaAnio="Sabado";
		}
		else{
			primerDiaAnio="Domingo";
		}
		}
		catch(DateException e){
			System.out.println(e.getMessage());
		}

	return primerDiaAnio;
	}
	
}

