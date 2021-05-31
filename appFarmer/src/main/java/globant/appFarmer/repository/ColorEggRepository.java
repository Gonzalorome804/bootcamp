package globant.appFarmer.repository;

import globant.appFarmer.entities.ColorEgg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorEggRepository extends JpaRepository<ColorEgg,Long> {

    ColorEgg findById(long id);

}
