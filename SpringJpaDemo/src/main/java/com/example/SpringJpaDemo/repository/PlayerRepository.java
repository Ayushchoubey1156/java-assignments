package com.example.SpringJpaDemo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringJpaDemo.models.Player;
@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
	
	public List<Player> findByCountry(String country);
	public List<Player> findByCountryAndClub(String country, String club);
}
