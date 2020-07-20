package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Verordnung302Kopf;

@Repository
public interface Verordnung302KopfRepository extends JpaRepository<Verordnung302Kopf, Long> {


}