package pe.edu.idat.dsw1;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dia;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DiaRepository {
	private static final Map<String, Dia> dia = new HashMap<>();

	@PostConstruct
	public void initData() {
		Dia lunes = new Dia();
		lunes.setName("Lunes");
		lunes.setTraduccion("Monday");
	
		dia.put(lunes.getName(), lunes);

		Dia martes = new Dia();
		martes.setName("Martes");
		martes.setTraduccion("Tuesday");
	

		dia.put(martes.getName(), martes);

        Dia miercoles = new Dia();
		miercoles.setName("Miercoles");
		miercoles.setTraduccion("Wednesday");
	

		dia.put(miercoles.getName(), miercoles);

        Dia jueves = new Dia();
		jueves.setName("Jueves");
		jueves.setTraduccion("Thursday");
	

		dia.put(jueves.getName(), jueves);

        Dia viernes = new Dia();
		viernes.setName("Viernes");
		viernes.setTraduccion("Friday");
	

		dia.put(viernes.getName(), viernes);

        Dia sabado = new Dia();
		sabado.setName("Sabado");
		sabado.setTraduccion("Saturday");
	

		dia.put(sabado.getName(), sabado);

        Dia domingo = new Dia();
		domingo.setName("Domingo");
		domingo.setTraduccion("Sunday");
	

		dia.put(domingo.getName(), domingo );

      
	}

	public Dia findDia(String name) {
		Assert.notNull(name, "The day's name must not be null");
		return dia.get(name);
	}
}