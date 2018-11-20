package service.uc4Voyage;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import business.uc4Voyage.PointInteret;
import business.uc4Voyage.RoadBook;
import business.uc4Voyage.Voyage;
import dao.DaoFacade;
import dao.exception.uc4Voyage.DaoFacadeExceptionVoyage;
import service.exception.uc4Voyage.ServiceVoyageErrorMessage;
import service.exception.uc4Voyage.ServiceVoyageException;

@Singleton
@LocalBean
public class ServiceVoyage {

	@EJB
	private DaoFacade daoFacade;

	public void createVoyage(Voyage voyage) throws ServiceVoyageException {
		try {
			daoFacade.createVoyage(voyage);
		} catch (DaoFacadeExceptionVoyage e) {
			throw new ServiceVoyageException(e.getCode(),
					e.getMessage());
		}
	}

	public List<Voyage> readVoyageOrderByID() {
		return daoFacade.readVoyageOrderByID();
	}

	public void updateVoyage(Voyage voyage) {
		daoFacade.updateVoyage(voyage);
	}

	public void deleteVoyage(int id) {
		daoFacade.deleteVoyage(id);
	}

	public Voyage findVoyagebyID(int id) {
		return daoFacade.findVoyagebyID(id);
	}

	public void createRoadBook(RoadBook roadBook) {
		daoFacade.createRoadBook(roadBook);
	}

	public List<RoadBook> readRoadBookOrderByID() {
		return daoFacade.readRoadBookOrderByID();
	}

	public void updateRoadBook(RoadBook roadBook) {
		daoFacade.updateRoadBook(roadBook);
		
	}

	public void deleteRoadBook(int id) {
		daoFacade.deleteRoadBook(id);
	}

	public RoadBook findRoadBookbyID(int id) {
		return daoFacade.findRoadBookbyID(id);
	}

	public void createPOInteret(PointInteret pointInteret) {
		daoFacade.createPOInteret(pointInteret);
	}

	public List<PointInteret> readPOInteretOrderByID() {
		return daoFacade.readPOInteretOrderByID();
	}

	public void updatePOInteret(PointInteret pointInteret) {
		daoFacade.updatePOInteret(pointInteret);
	}

	public void deletePOInteret(int id) {
		daoFacade.deletePOInteret(id);
	}

	public PointInteret findPOInteretByID(int id) {
		return daoFacade.findPOInteretByID(id);
	}



}
