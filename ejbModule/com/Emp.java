package com;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "emp", catalog = "mydb", uniqueConstraints = @UniqueConstraint(columnNames = "eid"))
public class Emp implements Serializable {

	private static final long serialVersionUID = 6797159321407358884L;

	private int eid;
	private String ename;

	public Emp() {

	}

	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	/**
	 * @return the eid
	 */
	@Id
	@Column(name = "eid", unique = true, nullable = false)
	public int getEid() {
		return eid;
	}

	/**
	 * @param eid
	 *            the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}

	/**
	 * @return the ename
	 */
	@Column(name = "ename", nullable = false)
	public String getEname() {
		return ename;
	}

	/**
	 * @param ename
	 *            the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Emp :: eId - "+this.getEid() + " | eName - "+this.getEname();
	}

}
