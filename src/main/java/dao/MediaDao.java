package dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import model.Media;

@Repository
public class MediaDao extends DaoGeneric<Media, Serializable> {

	@SuppressWarnings("unchecked")
	public List<Media> buscaMedia(Media media){
			Query query = entityManager.createQuery("from Media m where m.nameFile like :nameFile");
			query.setParameter("nameFile", "%"+media+"%");
			return query.getResultList();
	}
}
