package service.uc1Administrer;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import business.uc8Utilisateur.Utilisateur;
import dao.DaoFacade;
import service.exception.uc1Administrer.ServiceInexistantException;

@Singleton
@LocalBean
public class ServiceFacadeAdmin {

	@EJB
	private DaoFacade daoFacade;
	
	public Utilisateur getUserById(int id) throws ServiceInexistantException {
		Utilisateur user = daoFacade.getUserById(id);
		return user;
	}

}
