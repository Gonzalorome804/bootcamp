package globant.appFarmer.repository;

import globant.appFarmer.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
    User findById(long id);
    List<User> findAllByOrderByFirstName();
    List<User> findByFirstNameContaining(String firstName);
}
