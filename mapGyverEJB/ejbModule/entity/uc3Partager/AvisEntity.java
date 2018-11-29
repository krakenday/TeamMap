package entity.uc3Partager;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import dao.util.partager.UtilBdD;
import entity.uc8Utilisateur.EntityUtilisateur;

@Entity
@Table(name = UtilBdD.ENTITY_AVIS)
public class AvisEntity implements Serializable{

	private static final long serialVersionUID = -1186192722608763726L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = UtilBdD.ENTITY_DATE_CREATION, unique = true, nullable = true)
	private LocalDate dateEdition;
	@Column(name = UtilBdD.ENTITY_COMMENTAIRE, nullable = false)
	private String libelleCommentaire;
	@Column(name = UtilBdD.ENTITY_NOMBRE_LIKE)
	private int nbLike;
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name = "id_Utilisateur", nullable = false)
	private EntityUtilisateur utilisateur;
	
	
	public AvisEntity() {
		super();
	}
	
	public AvisEntity(int id, LocalDate dateEdition, String libelleCommentaire, int nbLike) {
		super();
		this.id = id;
		this.dateEdition = dateEdition;
		this.libelleCommentaire = libelleCommentaire;
		this.nbLike = nbLike;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateEdition() {
		return dateEdition;
	}

	public void setDateEdition(LocalDate dateEdition) {
		this.dateEdition = dateEdition;
	}

	public String getLibelleCommentaire() {
		return libelleCommentaire;
	}

	public void setLibelleCommentaire(String libelleCommentaire) {
		this.libelleCommentaire = libelleCommentaire;
	}

	public int getNbLike() {
		return nbLike;
	}

	public void setNbLike(int nbLike) {
		this.nbLike = nbLike;
	}

	@Override
	public String toString() {
		return "CLASSE METIER AVIS >>> Avis [id=" + id + ", dateEdition=" + dateEdition + ", libelleCommentaire=" + libelleCommentaire
				+ ", nbLike=" + nbLike + "]";
	}

}