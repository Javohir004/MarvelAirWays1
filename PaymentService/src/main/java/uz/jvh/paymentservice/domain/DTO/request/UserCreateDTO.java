package uz.jvh.paymentservice.domain.DTO.request;
import lombok.*;
import uz.pdp.taskmanagement.domain.enumerators.RolePermission;
import uz.pdp.taskmanagement.domain.enumerators.UserRole;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserCreateDTO {
    private String username;
    private String surname;
    private String password;
    private UserRole role;
    private String email;
    private LocalDate birthDate;
    private String phoneNumber;
    private boolean enabled;
    private String address;
    private List<RolePermission> permissions;

}
