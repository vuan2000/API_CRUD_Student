package com.teamreact.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.NonNull;


@Entity
@Table(name = "result")
public class Result implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne()
	@Column(name = "id_student")
	@JoinColumn(name = "id_student")
	@Id
	private Student student;
	
	@ManyToOne()
	@Column(name = "id_subject")
	@JoinColumn(name = "id_subject")
	@Id
	private Subject subject;
	
	@Column(name = "point", columnDefinition = "float")
	private float point;
}
