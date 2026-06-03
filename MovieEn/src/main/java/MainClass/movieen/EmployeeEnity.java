package MainClass.movieen;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEnity {

    @Id
    private int id;
    private String name;
    private double salarly ;
    private int experiance ;


}
