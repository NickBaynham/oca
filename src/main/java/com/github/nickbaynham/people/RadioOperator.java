package com.github.nickbaynham.people;

import com.github.nickbaynham.skills.RadioTransmitting;
import com.github.nickbaynham.tools.Radio;

public class RadioOperator extends Person implements RadioTransmitting {
    private Radio radio = new Radio();

    public void transmitAMessage(String message) {
        radio.transmit(message);
    }
}
