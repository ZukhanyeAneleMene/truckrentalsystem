package za.ac.cput.service;


import za.ac.cput.domain.Mechanic;

import java.util.Set;

/**
 * IMechanicService.java
 * This is the service interface
 * @aurthor Zukhanye Anele Mene (219404275)
 * Date: 18 May 2024
 */
public interface  IMechanicService extends IService<Mechanic,Integer>{

    Mechanic update(Mechanic mechanic);
    Set<Mechanic> getAll();
}