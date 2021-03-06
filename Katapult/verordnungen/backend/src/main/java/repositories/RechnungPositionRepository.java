package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.RechnungPosition;

@Repository
public interface RechnungPositionRepository extends JpaRepository<RechnungPosition, Long> {


}