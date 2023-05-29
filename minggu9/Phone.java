/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package minggu9;

/**
 *
 * @author D2J-00
 */
public interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    int MAX_BATTERY = 100;
    
    
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    void contact();
    void pulsa();
    void topupPulsa();
    void battery();
    void chargeBattery();
}
