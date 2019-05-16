import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalcularPeriodo {
	
	public static void main(String[] args) {
		
		//Creamos la fecha del descubrimiento de américa
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);	 
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("El descubrimiento de América", fecha);

		//Creamos la fecha de la primera guerra mundial
		LocalDate fechaG = LocalDate.of(1914, Month.JULY, 28);	 
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("La primera guerra mundial", fechaG);
		
		//Creamos la fecha de salida de Minecraft
		LocalDate fechaM = LocalDate.of(2009, Month.MAY, 17);	 
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("La salida de Minecraft", fechaM);
		
	}
	
	public static void calcularPeriodo(String nombre, LocalDate fecha) {
        
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        
        // Cálculo de las diferencias
        int anyos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        String texto = String.format(nombre + " ocurrió hace %d años, %d meses y %d días.", anyos, meses, dias);
         
        System.out.println(texto);
    }
 
}
