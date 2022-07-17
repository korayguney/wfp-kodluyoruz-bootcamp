package dev.patika.patika06.repository;

import dev.patika.patika06.models.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccidentRepository extends JpaRepository<Accident, Integer> {
}
