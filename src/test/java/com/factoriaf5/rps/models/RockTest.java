package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {
    Player player = new Player();

    @Test
    public void test_is_a_rock() {
        assertTrue(player instanceof Player);
        // assertEquals("Rock", rock.getType());
    }
}
