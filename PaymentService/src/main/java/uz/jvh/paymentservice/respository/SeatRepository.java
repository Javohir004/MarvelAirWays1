package uz.jvh.paymentservice.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.taskmanagement.domain.entity.Seat;

import java.util.UUID;
@Repository
public interface SeatRepository extends JpaRepository<Seat, UUID> {

}
