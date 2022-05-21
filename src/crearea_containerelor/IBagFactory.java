package crearea_containerelor;

import depozitarea_surprizelor.IBag;

public interface IBagFactory {

    // Create a new container, according to the specified type
    IBag makeBag(String type);
}
