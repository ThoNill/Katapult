package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.RechnungKopf;

@Repository
public interface RechnungKopfRepository extends JpaRepository<RechnungKopf, Long> {


}