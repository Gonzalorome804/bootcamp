package globant.appFarmer.repository;

import globant.appFarmer.entities.BoxEgg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxEggRepository extends JpaRepository<BoxEgg,Long> {
    BoxEgg findById(long id);
}
