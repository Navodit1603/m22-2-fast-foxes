package com.example.sping_portfolio.controllers.nick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class gamesSqlRepository {

    @Autowired
    private gamesJpaRepository jpa;

    public List<games>listAll() {
        return jpa.findAll();
    }

    // custom query to find anything containing term in name or email ignoring case
    public  List<games>listLike(String term) {
        return jpa.findByNameContainingIgnoreCaseOrEmailContainingIgnoreCase(term, term);
    }

    // custom query to find anything containing term in name or email ignoring case
    public  List<games>listLikeNative(String term) {
        String like_term = String.format("%%%s%%",term);  // Like required % rappers
        return jpa.findByLikeTermNative(like_term);
    }

    public void save(games person) {
        jpa.save(person);
    }

    public games get(long id) {
        return (jpa.findById(id).isPresent())
                ? jpa.findById(id).get()
                : null;
    }

    public void delete(long id) {
        jpa.deleteById(id);
    }
}