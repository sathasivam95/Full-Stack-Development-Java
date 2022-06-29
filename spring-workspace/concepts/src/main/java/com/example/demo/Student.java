package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MYSTUDENTNEW")
public class Student {
	
	private  @Id @GeneratedValue Long std_id;
	private String first_name;
	private String last_name;
	private Long mathematics;
	private Long science;
	private Long zoology;
	
	Student(){
		
	}

	public Student(Long std_id, String first_name, String last_name, Long mathematics, Long science, Long zoology) {
		super();
		this.std_id = std_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mathematics = mathematics;
		this.science = science;
		this.zoology = zoology;
	}

	/**
	 * @return the std_id
	 */
	public Long getStd_id() {
		return std_id;
	}

	/**
	 * @param std_id the std_id to set
	 */
	public void setStd_id(Long std_id) {
		this.std_id = std_id;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return the mathematics
	 */
	public Long getMathematics() {
		return mathematics;
	}

	/**
	 * @param mathematics the mathematics to set
	 */
	public void setMathematics(Long mathematics) {
		this.mathematics = mathematics;
	}

	/**
	 * @return the science
	 */
	public Long getScience() {
		return science;
	}

	/**
	 * @param science the science to set
	 */
	public void setScience(Long science) {
		this.science = science;
	}

	/**
	 * @return the zoology
	 */
	public Long getZoology() {
		return zoology;
	}

	/**
	 * @param zoology the zoology to set
	 */
	public void setZoology(Long zoology) {
		this.zoology = zoology;
	}

	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", mathematics=" + mathematics + ", science=" + science + ", zoology=" + zoology + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(first_name, last_name, mathematics, science, std_id, zoology);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(first_name, other.first_name) && Objects.equals(last_name, other.last_name)
				&& Objects.equals(mathematics, other.mathematics) && Objects.equals(science, other.science)
				&& Objects.equals(std_id, other.std_id) && Objects.equals(zoology, other.zoology);
	}
	
	

}
