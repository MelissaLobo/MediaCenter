package dao;
/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import java.io.Serializable;

import org.springframework.stereotype.Repository;

import model.User;

@Repository //Mapeia a Classe
public class UserDao extends DaoGeneric<User, Serializable> {
	
}
