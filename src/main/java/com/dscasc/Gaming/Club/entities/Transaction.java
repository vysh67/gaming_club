package com.dscasc.Gaming.Club.entities;



import java.time.LocalDateTime;

import jakarta.persistence.*;


@Entity
@Table(name="transactions")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float amount;
	private LocalDateTime date_time;
	
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;
	
	@ManyToOne
	@JoinColumn(name="game_id")
	private Game game;
	
	public Transaction() {}

	
	
	public Transaction(float amount, LocalDateTime date_time, Member member, Game game) {
		super();
		this.amount = amount;
		this.date_time = date_time;
		this.member = member;
		this.game = game;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public LocalDateTime getDate_time() {
		return date_time;
	}

	public void setDate_time(LocalDateTime date_time) {
		this.date_time = date_time;
	}
	
	
	public float getAmount() {
		return amount;
	}



	public void setAmount(float amount) {
		this.amount = amount;
	}



	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
	

	
	
	
	

	



	
	
	
	
}
