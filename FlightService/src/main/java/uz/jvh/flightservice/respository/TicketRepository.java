package uz.jvh.flightservice.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.taskmanagement.domain.entity.Ticket;
import uz.pdp.taskmanagement.domain.enumerators.ClassType;

import java.util.List;
import java.util.UUID;
@Repository
public interface TicketRepository extends JpaRepository<Ticket, UUID> {

    List<Ticket>findTicketByOwnerId(UUID ownerId);

    List<Ticket> findTicketByClassTypeAndNearWindowAndTicketStatusFalse(ClassType classType, boolean nearWindow);


}
