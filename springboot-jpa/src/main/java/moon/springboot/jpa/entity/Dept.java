package moon.springboot.jpa.entity;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "t_dept")
public class Dept implements Serializable{



    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    public Dept(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
