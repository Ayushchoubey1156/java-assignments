package com.example.SpringJpaDemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJpaDemo.models.Player;
import com.example.SpringJpaDemo.services.PlayerService;

@RestController
public class PlayerController {
	@Autowired
	private PlayerService playerService;
	
	@PostMapping(path="/player")
	public Player createPlayer(@RequestBody Player player) {
		return playerService.createPlayer(player);
	}
	
	@GetMapping(path="/player")
	public List<Player> getPlayers(){
		return playerService.getPlayers();
	}
	
	@GetMapping(path="/player/{id}")
	public Optional<Player> getPlayerById(@PathVariable String id) {
		return playerService.getPlayerById(id);
	}
	
	@PutMapping(path="/player/{id}")
	public Player updatePlayer(@PathVariable String id, @RequestBody Player player) {
		player.setId(id);
		return playerService.updatePlayer(player);
	}
	@DeleteMapping(path="/player/{id}")
	public void deletePlayer(@PathVariable String id) {
		playerService.deletePlayerById(id);
	}
	
	
	@GetMapping(path="/player/country/{country}")
	public List<Player> getplayerByCountry(@PathVariable String country) {
		return playerService.getPlayerByCountry(country);
	}
	
	@GetMapping(path="/player/{country}/{club}")
	public List<Player> getPlayerByCountryAndClub(@PathVariable String country, @PathVariable String club){
		return playerService.getPlayerByCountryAndClub(country, club);
	}
}
