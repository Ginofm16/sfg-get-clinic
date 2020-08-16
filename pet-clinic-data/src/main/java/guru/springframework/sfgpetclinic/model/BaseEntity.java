package guru.springframework.sfgpetclinic.model;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/*esta anotacion estable esto como una clase base de JPA, en el que se indica
* que esta clase va ser heredada por otras clases, y no se necesita especificar
* esta clse asignada a la base de datos*/
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
