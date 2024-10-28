package services;

import models.Library;
import models.SchoolPersonnel;

public interface LibraryServices {

    void addPersonToQueue(SchoolPersonnel schPerson);

    void addBooksToList(Library library);

    String borrowBook();

}
