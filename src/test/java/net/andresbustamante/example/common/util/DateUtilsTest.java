package net.andresbustamante.example.common.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

public class DateUtilsTest {

    @Test
    public void getCurrentDateTime() {
        ZonedDateTime now = DateUtils.getCurrentDateTime();
        assertNotNull(now);
        assertEquals("CET", now.getZone().getId());
        assertTrue(now.isBefore(ZonedDateTime.now(DateUtils.CET)));
    }
}