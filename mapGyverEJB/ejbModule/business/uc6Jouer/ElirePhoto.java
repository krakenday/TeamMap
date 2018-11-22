package business.uc6Jouer;

import java.io.Serializable;
import java.time.LocalDate;

public class ElirePhoto extends Jeu implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private LocalDate dateFinInscription;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	
	public ElirePhoto(){
		
	}
	
	public ElirePhoto(int id,String nom,LocalDate dateCreation, LocalDate dateFinInscription, LocalDate dateDebut, LocalDate dateFin) {
		super(id,nom, dateCreation);
		this.dateFinInscription = dateFinInscription;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	public ElirePhoto(String nom,LocalDate dateCreation, LocalDate dateFinInscription, LocalDate dateDebut, LocalDate dateFin) {
		super(nom, dateCreation);
		this.dateFinInscription = dateFinInscription;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public LocalDate getDateFinInscription() {
		return dateFinInscription;
	}

	public void setDateFinInscription(LocalDate dateFinInscription) {
		this.dateFinInscription = dateFinInscription;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	@Override
	public String toString() {
		return "ElirePhoto [dateFinInscription=" + dateFinInscription + ", dateDebut=" + dateDebut + ", dateFin="
				+ dateFin + "]";
	}
}