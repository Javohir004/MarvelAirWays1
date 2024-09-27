package uz.jvh.bookingservice.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.taskmanagement.domain.entity.AirPlane;

import java.util.UUID;

@Repository
public interface AirPlaneRepository extends JpaRepository<AirPlane, UUID> {

}
