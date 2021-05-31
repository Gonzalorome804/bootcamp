package globant.appFarmer.repository;

import globant.appFarmer.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {

    Entry findById(long id);

}
