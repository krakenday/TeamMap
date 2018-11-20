package service;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import business.uc8Utilisateur.Utilisateur;
import clientServer.IServiceFacade;
import service.exception.uc1Administrer.ServiceInexistantException;
import service.uc1Administrer.ServiceFacadeAdmin;

@Stateless
@Remote(IServiceFacade.class)
public class ServiceFacade implements IServiceFacade {
	
	@EJB
	private ServiceFacadeAdmin serviceFacadeAdmin;
	
	@Override
	public Utilisateur getUserById(int id) throws ServiceInexistantException {
		Utilisateur user = serviceFacadeAdmin.getUserById(id);
		return user;
	}

}
