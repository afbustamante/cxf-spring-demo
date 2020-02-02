package net.andresbustamante.example.common.util;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class DateUtilsTest {

    @Test
    public void getCurrentDateTime() {
        ZonedDateTime now = DateUtils.getCurrentDateTime();
        assertNotNull(now);
        assertEquals("CET", now.getZone().getId());
        assertTrue(now.isBefore(ZonedDateTime.now(DateUtils.CET)));
    }
}