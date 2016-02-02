package model;
import java.util.List;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import javax.persistence.Column;
import javax.persistence.ElementCollection;
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
	@Column(name="namefile")
	private String nameFile;
	private String file;
	private Category category;
	
	@ElementCollection
	private List<String> tag;
		
	public List<String> getTag() {
		return tag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setTag(List<String> tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Media [id=" + id + ", nameFile=" + nameFile + ", file=" + file + ", category=" + category + ", tag="
				+ tag + "]";
	}
}