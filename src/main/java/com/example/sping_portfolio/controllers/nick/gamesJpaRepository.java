package com.example.sping_portfolio.controllers.nick;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface gamesJpaRepository extends JpaRepository<games, Long> {
    List<games> findByNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String name, String email);
    @Query(
            value = "SELECT * FROM Person p WHERE p.name LIKE ?1 or p.email LIKE ?1",
            nativeQuery = true)
    List<games> findByLikeTermNative(String term);
}
