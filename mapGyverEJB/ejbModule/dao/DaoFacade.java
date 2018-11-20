package dao;


import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import business.uc8Utilisateur.Utilisateur;
import dao.exception.uc1Administrer.DaoInexistantException;
import dao.uc1Administrer.DaoFacadeAdmin;
import service.exception.uc1Administrer.ServiceInexistantException;

@Singleton
@LocalBean
public class DaoFacade {
	
	@EJB
	private DaoFacadeAdmin daoFacadeAdmin;

	public Utilisateur getUserById(int id) throws ServiceInexistantException {
		Utilisateur user = null;
		try {
			user = daoFacadeAdmin.getUserById(id);
		}
		catch (DaoInexistantException e) {
			throw new ServiceInexistantException();
		}
		
		return user;
	}
}
