package models;

public class Email {
    private String email;
    private String label;

    public Email() {
    }

    public Email(String email, String label) {
        this.email = email;
        this.label = label;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
