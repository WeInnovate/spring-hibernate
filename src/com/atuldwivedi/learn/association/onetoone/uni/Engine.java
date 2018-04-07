package com.atuldwivedi.learn.association.onetoone.uni;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.Mapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ENGINE")
public class Engine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ENGINE_NBR")
	private BigInteger engineNbr;

	@Column(name = "MILEAGE")
	private Double mileage;

	@Column(name = "SPEED")
	private Integer speed;

}
