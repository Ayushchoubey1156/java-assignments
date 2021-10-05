package com.example.SpringJpaDemo.services;

import java.util.List;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringJpaDemo.models.Player;
import com.example.SpringJpaDemo.repository.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	public Player createPlayer(Player player) {
		player.setId(UUID.randomUUID().toString());
		playerRepository.save(player);
		return player;
	}
	
	public List<Player> getPlayers() {
		// TODO Auto-generated method stub
		return playerRepository.findAll();
	}

	public Optional<Player> getPlayerById(String id) {
		// TODO Auto-generated method stub
		return playerRepository.findById(id);
	}

	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		playerRepository.save(player);
		return player;
	}

	public void deletePlayerById(String id) {
		playerRepository.deleteById(id);
		
	}

	public List<Player> getPlayerByCountry(String country) {
		// TODO Auto-generated method stub
		return playerRepository.findByCountry(country);
	}

	public List<Player> getPlayerByCountryAndClub(String country, String club) {
		// TODO Auto-generated method stub
		return playerRepository.findByCountryAndClub(country, club);
	}
	

	
}
