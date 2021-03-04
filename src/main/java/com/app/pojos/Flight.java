package com.app.pojos;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "flights")
public class Flight {

	@Id
	@Column(name = "flight_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer flightId;
	
	@Column(name = "airline_name", length = 10)
	@Enumerated(EnumType.STRING)
	private AirLine airlineName;
	
	@Column(name = "departure_city", length = 20)
	private String depCity;
	
	@Column(name = "arrival_city", length = 20)
	private String arrivalCity;
	
	@Column(name = "departure_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate depDate;
	
	//LocalTime are mapped to TIME
	@Column(name = "departure_time")
	@DateTimeFormat(pattern = "HH:mm:ss")
	private LocalTime depTime;

	public Flight() {
		System.out.println("in the const of Flight()");
	}

	public Flight(Integer flightId, AirLine airlineName, String depCity, String arrivalCity, LocalDate depDate,
			LocalTime depTime) {
		super();
		this.flightId = flightId;
		this.airlineName = airlineName;
		this.depCity = depCity;
		this.arrivalCity = arrivalCity;
		this.depDate = depDate;
		this.depTime = depTime;
	}

	//getters and setters
	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public AirLine getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(AirLine airlineName) {
		this.airlineName = airlineName;
	}

	public String getDepCity() {
		return depCity;
	}

	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public LocalDate getDepDate() {
		return depDate;
	}

	public void setDepDate(LocalDate depDate) {
		this.depDate = depDate;
	}

	public LocalTime getDepTime() {
		return depTime;
	}

	public void setDepTime(LocalTime depTime) {
		this.depTime = depTime;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airlineName=" + airlineName + ", depCity=" + depCity
				+ ", arrivalCity=" + arrivalCity + ", depDate=" + depDate + ", depTime=" + depTime + "]";
	} 
	
	
}
