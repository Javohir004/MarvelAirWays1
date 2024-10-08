package uz.jvh.userservice.domain.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import uz.jvh.userservice.domain.enumerators.ClassType;
import uz.jvh.userservice.domain.enumerators.TicketStatus;


import java.time.LocalDateTime;

//@Entity
//@Table(name = "tickets")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ticket extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    private double price;
    private String seatNumber;

    @Enumerated(EnumType.STRING)
    private ClassType classType;

    private boolean nearWindow;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

    @CreationTimestamp
    private LocalDateTime bookingDate;

}
