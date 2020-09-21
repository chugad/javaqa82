package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int currentStationNumber;
    private int minStationNumber;
    private int maxStationNumber;
    private int currentSoundVolume;
    private int minSoundVolume;
    private int maxSoundVolume;
    private boolean mute;

    // station

    public Radio(int currentStationNumber, int minStationNumber, int maxStationNumber) {
        this.minStationNumber = minStationNumber;
        this.maxStationNumber = maxStationNumber;
        if (currentStationNumber > maxStationNumber) {
            currentStationNumber = minStationNumber;
        }
        if (currentStationNumber < minStationNumber) {
            currentStationNumber = minStationNumber;
        } else {
            this.currentStationNumber = currentStationNumber;
        }
    }

    public void next() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber;
        } else {
            currentStationNumber = currentStationNumber + 1;
        }
    }

    public void prev() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
    }

//     volume


    public Radio(int currentSoundVolume, int minSoundVolume, int maxSoundVolume, boolean mute) {
        this.minSoundVolume = minSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
        if (currentSoundVolume > maxSoundVolume) {
            return;
        }
        if(currentSoundVolume < minSoundVolume) {
            return;
        } else {
            this.currentSoundVolume = currentSoundVolume;
        }
        this.mute = mute;
    }

    public void plus() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume = currentSoundVolume + 1;
        } else {
            currentSoundVolume = maxSoundVolume;
        }
    }

    public void minus() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        } else {
            currentSoundVolume = minSoundVolume;
        }
    }
}
