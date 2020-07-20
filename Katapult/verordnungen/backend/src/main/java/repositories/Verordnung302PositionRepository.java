package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Verordnung302Position;

@Repository
public interface Verordnung302PositionRepository extends JpaRepository<Verordnung302Position, Long> {


}