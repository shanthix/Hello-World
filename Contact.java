package sample.DataModel;

import javafx.beans.property.SimpleStringProperty;

public class Contact {
    private SimpleStringProperty firstName=new SimpleStringProperty("");
    private SimpleStringProperty lastName = new SimpleStringProperty("");
    private SimpleStringProperty phoneNumber=new SimpleStringProperty("");
    private SimpleStringProperty notes=new SimpleStringProperty("");

    public Contact() {
    }

    public Contact(String firstName, String lastName,String phoneNumber, String notes){
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.phoneNumber.set(phoneNumber);
        this.notes.set(notes);
    }

    public SimpleStringProperty getFirstNameProperty() {
        return firstName;
    }

    public void setFirstNameProperty(SimpleStringProperty firstName) {
        this.firstName = firstName;
    }

    public SimpleStringProperty getLastNameProperty() {
        return lastName;
    }

    public void setLastNameProperty(SimpleStringProperty lastName) {
        this.lastName = lastName;
    }

    public SimpleStringProperty getPhoneNumberProperty() {
        return phoneNumber;
    }

    public void setPhoneNumberProerty(SimpleStringProperty phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SimpleStringProperty getNotesProperty() {
        return notes;
    }

    public void setNotesProperty(SimpleStringProperty notes) {
        this.notes = notes;
    }

    public void setFirstName(String firstName){
        this.firstName.set(firstName);
    }

    public String getFirstName(){
        return firstName.get();
    }

    public void setLastName(String lastName){
        this.lastName.set(lastName);
    }

    public String getLastName(){
        return lastName.get();
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber.set(phoneNumber);
    }

    public String getPhoneNumber(){
        return phoneNumber.get();
    }

    public void setNotes(String notes){
        this.notes.set(notes);
    }

    public String getNotes(){
        return this.notes.get();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", phoneNumber=" + phoneNumber +
                ", notes=" + notes +
                '}';
    }
}
