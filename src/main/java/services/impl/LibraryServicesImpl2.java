package services.impl;

import models.Library;
import models.SchoolPersonnel;
import services.LibraryServices;
import utilities.PersonStatusComparator;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class LibraryServicesImpl2 implements LibraryServices {

    public PriorityQueue<SchoolPersonnel> personQ2 = new PriorityQueue<>();
    ArrayList<Library> allMybooks = new ArrayList<Library>();

    public LibraryServicesImpl2(String bookName, int bookQty) {

        this.personQ2 = new PriorityQueue<>();
    }

    @Override
    public void addPersonToQueue(SchoolPersonnel schPerson) {
        personQ2.add(schPerson);
    }

    @Override
    public void addBooksToList(Library library) {
        allMybooks.add(library);
    }

    public ArrayList<Library> getAllMybooks() {
        return allMybooks;
    }

    @Override
    public String borrowBook() {
        SchoolPersonnel schoolPersonnelhere2 = personQ2.peek();
        try {
            if (allMybooks.contains(schoolPersonnelhere2.getBookToBorrow())){ // && (Integer.parseInt(String.valueOf(allMybooks.contains(schoolPersonnelhere.getBookToBorrow())))) < 1) {
                return "This book is all lent out";
            } else {

                schoolPersonnelhere2 = personQ2.poll();

                return schoolPersonnelhere2.getName() + " has borrowed " + getAllMybooks().toString();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
