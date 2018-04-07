package com.atuldwivedi.learn.association.onetoone.bi;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CAR")
public class Car {

	@Id
	@Column(name = "MODEL_NBR")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger modelNbr;

	@Column(name = "MODEL_NAME")
	private String modelName;

	@Column(name = "COMPANY")
	private String company;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CAR_ENGINE_NBR")
	private Engine engine;

}
