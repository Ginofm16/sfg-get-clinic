package guru.springframework.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*clase de inicio principal en SpringBoot, va a hacer un escanedio de componentes de todo
*lo que hay en el paquete gutu.spr..ork.sfgpetclinic hacia abajo y al entrar a la clase
* DataLoader buscara los componentes que estan inyectados del otro modulo(esta clase
* tienes que estar con una anotacion @Service o @Component)*/
@SpringBootApplication
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgPetClinicApplication.class, args);
	}

}
