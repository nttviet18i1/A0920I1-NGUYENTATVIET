package Model;

import java.util.Date;

public class Custormer {
    private int custormer_id;
    private String custormer_name;
    private Date custormer_birthday;
    private int custormer_gender;
    private int custormer_id_card;
    private int custormer_phone;
    private String custormer_email;
    private String custormer_type_id;
    private String custormer_address;
    private String custormer_type;


    public Custormer() {
    }

    public Custormer(int custormer_id, String custormer_name, Date custormer_birthday, int custormer_gender, int custormer_id_card, int custormer_phone, String custormer_email, String custormer_type_id, String custormer_address, String custormer_type) {
        this.custormer_id = custormer_id;
        this.custormer_name = custormer_name;
        this.custormer_birthday = custormer_birthday;
        this.custormer_gender = custormer_gender;
        this.custormer_id_card = custormer_id_card;
        this.custormer_phone = custormer_phone;
        this.custormer_email = custormer_email;
        this.custormer_type_id = custormer_type_id;
        this.custormer_address = custormer_address;
        this.custormer_type = custormer_type;
    }

    public int getCustormer_id() {
        return custormer_id;
    }

    public void setCustormer_id(int custormer_id) {
        this.custormer_id = custormer_id;
    }

    public String getCustormer_name() {
        return custormer_name;
    }

    public void setCustormer_name(String custormer_name) {
        this.custormer_name = custormer_name;
    }

    public Date getCustormer_birthday() {
        return custormer_birthday;
    }

    public void setCustormer_birthday(Date custormer_birthday) {
        this.custormer_birthday = custormer_birthday;
    }

    public int getCustormer_gender() {
        return custormer_gender;
    }

    public void setCustormer_gender(int custormer_gender) {
        this.custormer_gender = custormer_gender;
    }

    public int getCustormer_id_card() {
        return custormer_id_card;
    }

    public void setCustormer_id_card(int custormer_id_card) {
        this.custormer_id_card = custormer_id_card;
    }

    public int getCustormer_phone() {
        return custormer_phone;
    }

    public void setCustormer_phone(int custormer_phone) {
        this.custormer_phone = custormer_phone;
    }

    public String getCustormer_email() {
        return custormer_email;
    }

    public void setCustormer_email(String custormer_email) {
        this.custormer_email = custormer_email;
    }

    public String getCustormer_type_id() {
        return custormer_type_id;
    }

    public void setCustormer_type_id(String custormer_type_id) {
        this.custormer_type_id = custormer_type_id;
    }

    public String getCustormer_address() {
        return custormer_address;
    }

    public void setCustormer_address(String custormer_address) {
        this.custormer_address = custormer_address;
    }

    public String getCustormer_type() {
        return custormer_type;
    }

    public void setCustormer_type(String custormer_type) {
        this.custormer_type = custormer_type;
    }
}
