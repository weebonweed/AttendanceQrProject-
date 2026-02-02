package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Link to Supabase auth user
    @Column(nullable = false, unique = true)
    private String supabaseUserId;

    @Column(nullable = false)
    private String role; // STUDENT or TEACHER
    
    
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSupabaseUserId() {
		return supabaseUserId;
	}

	public void setSupabaseUserId(String supabaseUserId) {
		this.supabaseUserId = supabaseUserId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
