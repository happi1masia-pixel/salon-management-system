package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import main.java.salon.SalonService;

class SalonServiceTest {

    @Test
    void testConstructor() {
        SalonService service = new SalonService(
                1,
                "Haircut",
                250.00,
                45
        );

        assertEquals(1, service.getServiceId());
        assertEquals("Haircut", service.getServiceName());
        assertEquals(250.00, service.getPrice());
        assertEquals(45, service.getDuration());
    }

    @Test
    void testSetters() {
        SalonService service = new SalonService();

        service.setServiceId(2);
        service.setServiceName("Manicure");
        service.setPrice(180.00);
        service.setDuration(30);

        assertEquals(2, service.getServiceId());
        assertEquals("Manicure", service.getServiceName());
        assertEquals(180.00, service.getPrice());
        assertEquals(30, service.getDuration());
    }

    @Test
    void testToString() {
        SalonService service = new SalonService(
                3,
                "Pedicure",
                220.00,
                60
        );

        String result = service.toString();

        assertTrue(result.contains("Pedicure"));
        assertTrue(result.contains("220.0"));
    }
}