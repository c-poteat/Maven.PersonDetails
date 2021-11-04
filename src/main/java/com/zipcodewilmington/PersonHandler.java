package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;


    }

    public String whileLoop() {
        String result = "";
        // creater a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        // begin loop
        while (counter < personArray.length) {

            String list = String.valueOf(personArray[counter]);
            result = result + list;
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
            counter++;
        }

        return result;

    }


    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        // use the above clauses to declare for-loop signature
        // begin loop
        for (int i = 0; i < personArray.length; i++) {
            String list = String.valueOf(personArray[i]);
            result = result + list;
        }
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
            return result;
        }


        public String forEachLoop () {
            String result = "";
            // identify array's type
            // identify array's variable-name

            for (Person person : personArray) {
             result = result + person;
            }
            return result;
        }
            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop


        public Person[] getPersonArray () {
            return personArray;
        }
    }

