package json.hibernate.tests;

import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import json.hibernate.modelo.Empleado;

public class TestEmpleados {

	private static EntityManager manager;
	private static EntityManagerFactory emf;
	
	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("Persistencia");
		manager = emf.createEntityManager();
		
		Empleado e = new Empleado(1L,"Jehison","Gelvez",LocalDate.of(1997,2,26));
		Empleado e2 = new Empleado(2L,"Jehison","Gelvez",LocalDate.of(1997,2,26));
		manager.getTransaction().begin();
		manager.persist(e);
		manager.persist(e2);
		manager.getTransaction().commit();
		imprimirTodo();
		//List<Empleado> empleados = manager.createQuery("FROM Empleado").getResultList();
		while(true)
		{}

	}
	
	@SuppressWarnings("unchecked")
	public static void imprimirTodo()
	{
		List<Empleado> empleados = manager.createQuery("FROM Empleado").getResultList();
		System.out.println("Hay "+empleados.size()+" empleados en el sistema");	
		for(Empleado e : empleados) {
			e.toString();
		}
	}

}
