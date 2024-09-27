package uz.jvh.flightservice.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.taskmanagement.domain.entity.Flight;

import java.util.UUID;

@Repository
public interface FlightRepository extends JpaRepository<Flight, UUID> {

}
