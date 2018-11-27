package dao.uc4Voyage;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import business.uc4Voyage.PointInteret;
import business.uc4Voyage.RoadBook;
import business.uc4Voyage.Voyage;
import dao.exception.uc4Voyage.DaoVoyageException;
import entity.uc4Voyage.EntityVoyage;


@Singleton
@LocalBean
public class DaoFacadeVoyage {

	private static final String ZONE_EXCEPTION_MSG = ".Bdd";
	
	@EJB
	private DaoVoyage daoVoyage;

	private FactoryEntity factoryEntity = new FactoryEntity();
	
	public void createVoyage(Voyage voyage) throws DaoVoyageException {
		EntityVoyage entityVoyage = factoryEntity.createEntityFrom(voyage);
			try {
				daoVoyage.create(entityVoyage);
			} catch (DaoVoyageException e) {
				throw new DaoVoyageException(e.getCode(),
						ZONE_EXCEPTION_MSG+ e.getMessage());
			}
	}

	public List<Voyage> readVoyageOrderByID() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateVoyage(Voyage voyage) throws DaoVoyageException {
		EntityVoyage entityVoyage = factoryEntity.createEntityWithIDFrom(voyage);
		try {
			daoVoyage.update(entityVoyage);
		} catch (DaoVoyageException e) {
			throw new DaoVoyageException(e.getCode(),
					ZONE_EXCEPTION_MSG+ e.getMessage());
		}

	}

	public void deleteVoyage(int id) throws DaoVoyageException {
		try {
			daoVoyage.delete(id, EntityVoyage.class);
		} catch (DaoVoyageException e) {
			throw new DaoVoyageException(e.getCode(),
					ZONE_EXCEPTION_MSG+ e.getMessage());
		}
	}

	public Voyage findVoyagebyID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void createRoadBook(RoadBook roadBook) {
		// TODO Auto-generated method stub

	}

	public List<RoadBook> readRoadBookOrderByID() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateRoadBook(RoadBook roadBook) {
		// TODO Auto-generated method stub

	}

	public void deleteRoadBook(int id) {
		// TODO Auto-generated method stub

	}

	public RoadBook findRoadBookbyID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void createPOInteret(PointInteret pointInteret) {
		// TODO Auto-generated method stub

	}

	public List<PointInteret> readPOInteretOrderByID() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updatePOInteret(PointInteret pointInteret) {
		// TODO Auto-generated method stub

	}

	public void deletePOInteret(int id) {
		// TODO Auto-generated method stub

	}

	public PointInteret findPOInteretByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}