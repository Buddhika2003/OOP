//Q09
class TemperatureConverter{
	double fahrenheit;
	double celsius;
	
	double toFahrenheit(double celsius){
		fahrenheit=(celsius * 9/5) + 32;
		return fahrenheit;
	}

	double toCelsius(double fahrenheit){
		celsius=(fahrenheit - 32 ) * 5/9;
		return celsius;	
	}
}

class TCMain{
	public static void main(String[]args){
		TemperatureConverter converter=new TemperatureConverter();
		System.out.println("30 Celsius to Fahrenheit : " + converter.toFahrenheit(30));
		System.out.println("86 Fahrenheit to Celsius : " + converter.toCelsius(86));
	}
}