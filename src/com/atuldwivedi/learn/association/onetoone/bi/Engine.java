package com.atuldwivedi.learn.association.onetoone.bi;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	
	@OneToOne(mappedBy="engine", cascade=CascadeType.ALL)
	private Car car;

	public Engine(Double mileage, Integer speed) {
		super();
		this.mileage = mileage;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Engine [engineNbr=" + engineNbr + ", mileage=" + mileage + ", speed=" + speed + "]";
	}

}
