package webApp.uc8Utilisateur;

import java.time.LocalDate;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.Preparable;

import business.uc8Utilisateur.Password;
import business.uc8Utilisateur.Utilisateur;
import clientServeur.IServiceFacade;
import clientServeur.exception.ServiceFacadeExceptionUtilisateur;
import utilitaire.UtilAction;
import webApp.ApplicationSupport;

public class UtilisateurAction extends ApplicationSupport implements SessionAware, Preparable {

	private static final long serialVersionUID = 1L;
		
	private IServiceFacade iServiceFacade;	
	private Map<String, Object> sessionAttributes = null; 
	private String msg;
	
	private String inputPassword;
	private LocalDate inputDateNaiss;
	private Utilisateur utilisateur;
		
		
	public String inscription() {

		System.out.println("*** UtilisateurAction - inscription ************");
		try {			
			Password motDePasse= new Password(inputPassword);
			utilisateur.setMotDePasse(motDePasse);
			utilisateur.setDateNaiss(inputDateNaiss);
			utilisateur.setDateInscrip(LocalDate.now());
			iServiceFacade.create(utilisateur);			
			return SUCCESS;
		} catch (ServiceFacadeExceptionUtilisateur e) {
			msg= " email existant!!";
			return ERROR;
		}
	}
	
	public String delete() {

		System.out.println("*** UtilisateurAction - delete **********");	
		try {			
			Utilisateur utilisateur= (Utilisateur) sessionAttributes.get("utilisateur");			
			iServiceFacade.delete(utilisateur.getId());
			sessionAttributes.clear();
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}	

	// LES GETTERS ET SETTERS

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(String inputPassword) {
		this.inputPassword = inputPassword;
	}

	public LocalDate getInputDateNaiss() {
		return inputDateNaiss;
	}

	public void setInputDateNaiss(String inputDateNaiss) {
		try {
			if (!inputDateNaiss.isEmpty())
				this.inputDateNaiss= LocalDate.parse(inputDateNaiss);
		}catch(Exception e) {
			System.out.println(this.getClass().toString()+e);
		}
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	// END GET & SET
	
	@Override
	public void setSession(Map<String, Object> sessionAttr) {
		this.sessionAttributes= sessionAttr;
	}

	@Override
	public void prepare() throws Exception {
		try {
			InitialContext context = new InitialContext();
			iServiceFacade = (IServiceFacade) context.lookup(UtilAction.SERVICE_FACADE_LOOKUP);
			msg= null ;
		} catch (NamingException e) {
			e.printStackTrace();
		}			
	}
}
