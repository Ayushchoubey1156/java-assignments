package com.example.SpringJpaDemo.models;

//import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity(name="player")
public class Player {
		@Id
		private String id;
		private String name;
		private String club;
		private String country;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getClub() {
			return club;
		}
		public void setClub(String club) {
			this.club = club;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		@Override
		public String toString() {
			return "Player [id=" + id + ", name=" + name + ", club=" + club + ", country=" + country + "]";
		}
		
}
