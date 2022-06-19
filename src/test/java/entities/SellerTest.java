package entities;

import model.entities.Department;
import model.entities.Seller;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class SellerTest {

    @Test
    void shouldTestGettersSettersAndToString() {
        //GIVEN
        Seller expected = mockSeller();

        //WHEN
        Seller actual = new Seller();
        actual.setId(1);
        actual.setName("Montgomery Burns");
        actual.setEmail("monty@gmail.com");
        actual.setBirthDate(new Date());
        actual.setBaseSalary(1600.00);
        actual.setDepartment(new Department(1, "Tecnologia da Informação"));

        //THEN
        assertEquals(expected, actual);
        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getName(), actual.getName());
        assertEquals(expected.getEmail(), actual.getEmail());
        assertEquals(expected.getBirthDate(), actual.getBirthDate());
        assertEquals(expected.getBaseSalary(), actual.getBaseSalary());
        assertEquals(expected.getDepartment(), actual.getDepartment());
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void shouldTestHashCode() {
        //GIVEN
        Seller expected = mockSeller();

        //WHEN
        Seller actual = new Seller(
                1,
                "Montgomery Burns",
                "monty@gmail.com",
                new Date(),
                1600.00,
                new Department(
                        1,
                        "Tecnologia da Informação"
                )
        );

        //THEN
        assertEquals(expected.hashCode(), actual.hashCode());
    }

    private Seller mockSeller() {
        return new Seller(
                1,
                "Montgomery Burns",
                "monty@gmail.com",
                new Date(),
                1600.00,
                new Department(
                        1,
                        "Tecnologia da Informação"
                )
        );
    }

}
