//Ajout de méthode de validation pour les numéros de téléphone!!
jQuery.validator.addMethod(
  "regex",
   function(value, element, regexp) {
	  console.log("je rentre dans le methode regex");
       if (regexp.constructor != RegExp)
          regexp = new RegExp(regexp);
       else if (regexp.global)
          regexp.lastIndex = 0;
          return this.optional(element) || regexp.test(value);
   },"exemple : 0607080910"
);
// Traitement des messages d'erreurs et validation des inputs
$().ready(function() {
	console.log('Je rentre dans mon Jquery');
	// valider formulaire
	$("#inscription").validate({
		rules: {
			"utilisateur.nom": "required",
			"utilisateur.prenom": "required",
			inputPassword: {
				required: true,
				minlength: 6
			},
			inputConfirmPassword: {
				required: true,
				minlength: 6,
				equalTo: "#inputPassword"
			},
			"utilisateur.email": {
				required: true,
				email: true
			},
            inputDateNaiss: {
            	required: true,
            	date: true,
            	dateFormat: true
            },
            "utilisateur.telephone": {
            	required: true,
            	// maxlength: 13,
            	"regex": /^(\+33\.|0)[0-9]{9}$/
            },
            "utilisateur.adresse" : "required",             
            inputVille: "required",
            inputPays: "required"
		},
		messages: {
			"utilisateur.nom": "Veuillez entrez votre nom",
			"utilisateur.prenom": "Veuillez entrez votre pr&eacute;nom",
			inputPassword: {
				required: "Veuillez de fournir votre mot de passe",
				minlength: "Votre mot de passe doit contenir au moins 6 caract&eacute;res"
			},
			inputConfirmPassword: {
				required: "Veuillez confirmer votre mot de passe",
				minlength: "Votre mot de passe doit contenir au moins 6 caract&eacute;res",
				equalTo: "Veuillez entrez un mot de passe identique",
			},
			"utilisateur.email": {
				required: "Veuillez entrez une adresse email",
				email : "Veuillez entrez une adresse email valide"
			},
	        inputDateNaiss : "Veuillez entrez votre de date de naissance",
	        "utilisateur.telephone": {
	            required: "Veuillez entrez votre numéro de téléphone",
	            number: "Le numéro de téléphone c'est seulement des chiffre, pas besoin du minitel"
	        },
	        "utilisateur.adresse": "Veuillez entrez votre adresse"
		}
	});
});
  	
// Formulaire de modification d'utilisateur
$().ready(function() {
	// valider formulaire
	console.log("formulaire modifier")
	$("#modifierUtilisateur").validate({
		rules: {
			inputNom: "required",
			inputPrenom: "required",
            inputTelephone: {
            	required: true,
            	"regex": /^(\+33\.|0)[0-9]{9}$/
            },
            inputAdresse: "required",             
            inputVille: "required",
            inputPays: "required"
		},
		messages: {
			inputNom: "Veuillez entrez votre nom",
			inputPrenom: "Veuillez entrez votre pr&eacute;nom",
	        inputTelephone: {
	            required: "Veuillez entrez votre numéro de téléphone",
	            number: "Le numéro de téléphone c'est seulement des chiffre, pas besoin du minitel"
	        },
	        inputAdresse: "Veuillez entrez votre adresse"
		}
	});
});
// Code JavaScript pour valider le formulaire
  	

console.log('Je rentre dans le javascript');

