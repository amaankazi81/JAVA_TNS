package com.yourname.assignment.employees;

public class Developer extends Employee {
    private String programmingLanguage;

    /**
     * Gets the developer's programming language.
     * @return the programming language of the developer
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /**
     * Sets the developer's programming language.
     * @param programmingLanguage the programming language to set
     */
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
