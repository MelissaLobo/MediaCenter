package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medias")
public class Media {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="namearquivo")
	private String nameArquivo;
	private String arquivo;
	private String tag;
	private Category category;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameArquivo() {
		return nameArquivo;
	}
	public void setNameArquivo(String nameArquivo) {
		this.nameArquivo = nameArquivo;
	}
	public String getArquivo() {
		return arquivo;
	}
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Media [id=" + id + ", nameArquivo=" + nameArquivo + ", arquivo=" + arquivo + ", tag=" + tag
				+ ", category=" + category + "]";
	}
	
	
}
