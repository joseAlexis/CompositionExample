package com.company;

/**
 * Created by joseb on 5/21/2017.
 */
public class PC {
    private Case theCase; //Instead of extends
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

}
