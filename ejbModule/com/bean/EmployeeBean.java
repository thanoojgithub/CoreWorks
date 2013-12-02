/**
 * 
 */
package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.Emp;

/**
 * @author thanooj
 * 
 */
@Stateless
public class EmployeeBean implements EmployeeBeanService {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Emp> getEmployees() {
		List<Emp> emps = new ArrayList<Emp>();
		emps = (List<Emp>) entityManager.createQuery("from Emp")
				.getResultList();
		if (!emps.isEmpty()) {
			System.out.println(emps + " list found");
		} else {
			System.out.println(emps + " :: Emp list NOT found");
		}
		return emps;
	}

	@Override
	public Emp getEmployee(Integer eId) {
		System.out.println("eId :: " + eId);
		Emp emp = entityManager.find(Emp.class, eId);
		if (emp != null) {
			System.out.println(emp + " found");
		} else {
			System.out.println(emp + " :: Emp instance NOT found");
		}

		return emp;
	}
}
