package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

//    station

//    next

    @Test
    public void shouldNextStationNumberUnderLimitUp() {
        Radio radio = new Radio(8, 0, 9);
        radio.next();
        assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumberIfCurrentStationNine() {
        Radio radio = new Radio(9, 0, 9);
        radio.next();
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumberUnderLimitDown() {
        Radio radio = new Radio(0, 0, 9);
        radio.next();
        assertEquals(1, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumberAfterLimitDown() {
        Radio radio = new Radio(-100, 0, 9);
        radio.next();
        assertEquals(1, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumberAfterLimitUp() {
        Radio radio = new Radio(100, 0, 9);
        radio.next();
        assertEquals(1, radio.getCurrentStationNumber());
    }

// prev

    @Test
    public void shouldPrevStationNumberUnderLimitUp() {
        Radio radio = new Radio(9,0,9);
        radio.prev();
        assertEquals(8, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevStationNumberIfCurrentStationZero() {
        Radio radio = new Radio(0,0,9);
        radio.prev();
        assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevStationNumberUnderLimitDown() {
        Radio radio = new Radio(1,0,9);
        radio.prev();
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevStationNumberAfterLimitDown() {
        Radio radio = new Radio(-100,0,9);
        radio.prev();
        assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevStationNumberAfterLimitUp() {
        Radio radio = new Radio(100,0,9);
        radio.prev();
        assertEquals(9, radio.getCurrentStationNumber());
    }

//    volume

//    minus

    @Test
    public void shouldMinusSoundVolumeUnderLimitUp() {
        Radio radio = new Radio(10,0,10, false);
        radio.minus();
        assertEquals(9, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldMinusSoundVolumeUnderLimitDown() {
        Radio radio = new Radio(1,0,10,false);
        radio.minus();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldMinusSoundVolumeAfterLimitDown() {
        Radio radio = new Radio(-1,0,10,false);
        radio.minus();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

//    plus

    @Test
    public void shouldPlusSoundVolumeUnderLimitUp() {
        Radio radio = new Radio(9,0,10,false);
        radio.plus();
        assertEquals(10, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldPlusSoundVolumeUnderLimitDown() {
        Radio radio = new Radio(0,0,10,false);
        radio.plus();
        assertEquals(1, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldPlusSoundVolumeBoardLineUp() {
        Radio radio = new Radio(10,0,10,false);
        radio.plus();
        assertEquals(10, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldPlusSoundVolumeAfterLimitUp() {
        Radio radio = new Radio(100,0,10,false);
        radio.plus();
        assertEquals(1, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldPlusSoundVolumeAfterLimitDown() {
        Radio radio = new Radio(-100,0,10,false);
        radio.plus();
        assertEquals(1, radio.getCurrentSoundVolume());
    }
}