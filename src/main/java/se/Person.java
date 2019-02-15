package se;

import java.io.Serializable;
import javax.persistence.*;

//to enable you to create a compatible datbase table:
//CREATE TABLE IF NOT EXISTS `Person` (`id` int(11) NOT NULL,`name` varchar(10) DEFAULT NULL) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
//ALTER TABLE `Person` ADD PRIMARY KEY (`id`);
//ALTER TABLE `Person` MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
//INSERT INTO `Person` (`id`, `name`) VALUES (1, 'VAMK Oy'), (2, 'Timo');
/**
 * The persistent class for the Person database table.
 * 
 */
@Entity
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	public Person() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}