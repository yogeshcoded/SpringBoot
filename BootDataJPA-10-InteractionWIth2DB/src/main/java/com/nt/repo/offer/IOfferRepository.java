package com.nt.repo.offer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.offer.Offer;

public interface IOfferRepository extends JpaRepository<Offer, Integer> {

}
