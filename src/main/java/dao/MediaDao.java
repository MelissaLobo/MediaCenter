package dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Media;
import model.User;

@Repository
@Transactional
public class MediaDao extends DaoGeneric<User, Serializable> {

	@PersistenceContext
	private EntityManager manager;
	
	public void create(Media media) {
		manager.persist(media);
	}
}
