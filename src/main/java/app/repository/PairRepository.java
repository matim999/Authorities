package app.repository;

import app.entity.Pair;
import app.entity.Rolee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PairRepository extends JpaRepository<Pair, Integer> {
    List<Pair> findAllByStaffId(int id);
}
