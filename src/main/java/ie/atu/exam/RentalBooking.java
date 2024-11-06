package ie.atu.exam;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RentalBooking {

    @NotBlank private String rentalCode;
    @NotBlank private String carModel;
    @NotBlank private String name;
    @Email private String email;
    @PositiveOrZero private int StartDate;
    @PositiveOrZero private int EndDate;
    @PositiveOrZero private int dailyRate;
}
