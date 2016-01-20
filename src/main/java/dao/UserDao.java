package dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.User;

@Repository //Mapeia a Classe
@Transactional
public class UserDao extends DaoGeneric<User, Serializable> {

	@PersistenceContext
	private EntityManager manager;

	public void create(User user) {
		manager.persist(user);
	}
}
