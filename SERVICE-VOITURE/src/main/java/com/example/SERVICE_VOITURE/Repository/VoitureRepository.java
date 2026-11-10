package com.example.SERVICE_VOITURE.Repository;

import com.example.SERVICE_VOITURE.entite.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "voitures")
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
