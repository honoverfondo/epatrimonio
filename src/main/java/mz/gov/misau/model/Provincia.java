package mz.gov.misau.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
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

	@Column(nullable = false)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincia other = (Provincia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
