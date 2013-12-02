/**
 * 
 */
package com.bean;

import java.util.List;

import javax.ejb.Remote;

import com.Emp;

/**
 * @author thanooj
 * 
 */
@Remote
public interface EmployeeBeanService {

	List<Emp> getEmployees();
	Emp getEmployee(Integer eId);
}
