package uz.jvh.userservice.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.jvh.userservice.domain.entity.User;
import uz.jvh.userservice.domain.enumerators.UserRole;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    Boolean CheckByUsernameAndEmail(String username , String password);

    Boolean existsByEnabledTrueAndUsernameOrEmail(String username, String email);

    Optional<List<User>> findUserByRole(UserRole role);

    Optional<User> findByUsername(String username);

    Optional<User>findUserByVerificationToken(String verificationToken);

}
