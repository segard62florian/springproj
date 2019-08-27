package fr.formation.inti.beans;

public class MessageBean {
	
	public void message(){
	    System.out.println( "coucou" );
	}
	
	public MessageBean() {
	    System.out.println( "Création de l'objet : MessageBean !!!" );
	}
	
	public static MessageBean MessageBeanFactory() {
		return new MessageBean();
	}

}
