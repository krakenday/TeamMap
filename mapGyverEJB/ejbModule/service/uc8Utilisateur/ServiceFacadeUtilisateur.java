package service.uc8Utilisateur;

import java.time.LocalDate;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import business.uc8Utilisateur.Groupe;
import business.uc8Utilisateur.ListeDiffusion;
import business.uc8Utilisateur.Password;
import business.uc8Utilisateur.Utilisateur;
import service.uc8Utilisateur.catalogue.ServiceUtilisateurCatalogue;
import service.uc8Utilisateur.fabrique.ServiceUtilisateurFabrique;
import service.uc8Utilisateur.gestion.ServiceUtilisateurGestion;

@Singleton
@LocalBean
public class ServiceFacadeUtilisateur {
	
	@EJB
	ServiceUtilisateurGestion serviceUtilisateurGestion;
	
	@EJB
	ServiceUtilisateurFabrique serviceUtilisateurFabrique;
	
	@EJB
	ServiceUtilisateurCatalogue serviceUtilisateurCatalogue;
	
	
	public void create(Utilisateur utilisateur) {
		serviceUtilisateurGestion.create(utilisateur);
	}
	
	public Utilisateur read(int id) {
		return serviceUtilisateurGestion.read(id);
	}
	
	public void update(Utilisateur utilisateur) {
		serviceUtilisateurGestion.update(utilisateur);
	}

	public void delete(int id) {
		serviceUtilisateurGestion.delete(id);
	}
	// Fabrique Utilisateur
	public Utilisateur creerUtilisateur() {
		return serviceUtilisateurFabrique.creerUtilisateur();
	}

	public Utilisateur creerUtilisateur(String nom, String prenom, String adresse, String email, String telephone,
			LocalDate dateInscrip, LocalDate dateNaiss, Password motDePasse) {
		return serviceUtilisateurFabrique.creerUtilisateur(nom, prenom, adresse, email, telephone, dateInscrip, dateNaiss, motDePasse);
	}
	
// Bloc service Groupe
	
	public void createGroupe(Groupe groupe) {
		serviceUtilisateurGestion.createGroupe(groupe);
	}

	public Groupe readGroupe(int id) {
		return serviceUtilisateurGestion.readGroupe(id);
	}

	public void updateGroupe(Groupe groupe) {
		serviceUtilisateurGestion.updateGroupe(groupe);
	}

	public void deleteGroupe(int id) {
		serviceUtilisateurGestion.deleteGroupe(id);
	}
	
	// Bloc service Liste diffusion
	public void createListeDiff(ListeDiffusion listeDiff) {
		serviceUtilisateurGestion.createListeDiff(listeDiff);
	}

	public ListeDiffusion readListeDiff(int id) {
		return serviceUtilisateurGestion.readListeDiff(id);
	}

	public void updateListeDiff(ListeDiffusion listeDiff) {
		serviceUtilisateurGestion.updateListeDiff(listeDiff);
	}

	public void deleteListeDiff(int id) {
		serviceUtilisateurGestion.deleteListeDiff(id);
	}
	
// Catalogue 
	public List<Utilisateur> listerTousLesUtilisateurs() {
		return serviceUtilisateurCatalogue.listerTousLesUtilisateurs();
	}

	public List<Groupe> listerTousLesGroupes() {
		return serviceUtilisateurCatalogue.listerTousLesGroupes();
	}

	public List<ListeDiffusion> listerToutesLesListes() {
		return serviceUtilisateurCatalogue.listerToutesLesListes();
	}

}