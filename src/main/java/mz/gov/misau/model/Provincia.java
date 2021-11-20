package mz.gov.misau.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "provincia")
@SequenceGenerator(name = "seq_Provincia", sequenceName = "seq_provincia", allocationSize = 1,initialValue = 1)
public class Provincia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="seq_Provincia" )
	private Long id;

	private String nome;

	private String abrevProv;

	private Date dataRegisto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAbrevProv() {
		return abrevProv;
	}

	public void setAbrevProv(String abrevProv) {
		this.abrevProv = abrevProv;
	}

	public Date getDataRegisto() {
		return dataRegisto;
	}

	public void setDataRegisto(Date dataRegisto) {
		this.dataRegisto = dataRegisto;
	}

}
