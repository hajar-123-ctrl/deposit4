package com.monnom.personnage;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonnageTest {

    @Test
    void testTourner1() {
        Personnage personnage = new Personnage();
        assertThat(personnage.tourner(1)).isEqualTo("EST");
    }

    @Test
    void testTourner2() {
        Personnage personnage = new Personnage();
        personnage.tourner(1);
        assertThat(personnage.tourner(1)).isEqualTo("SUD");
    }
    @Test
    void testTourner4() {
        Personnage personnage = new Personnage();
        personnage.tourner(4);
        assertThat(personnage.tourner(0)).isEqualTo("NORD");
    }
    @Test
    void testTourner8() {
        Personnage personnage = new Personnage();
        assertThat(personnage.tourner(8)).isEqualTo("NORD");  // 8 rotations = 2 tours complets
    }


}


