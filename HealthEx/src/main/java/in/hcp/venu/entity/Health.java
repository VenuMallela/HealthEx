package in.hcp.venu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="health")
public class Health {
	
	@Id
	@GeneratedValue
	@Column(name="specialid")
	private Integer id;
	
	@Column(name="specialcode")
	private String code;
	
	@Column(name="specialname")
	private String name;
	
	@Column(name="specialnote")
	private String Note;

	
	
	
}
