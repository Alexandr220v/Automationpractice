package model;

public class Account {
    private  String gender;
    private  String firstCustomerName;
    private  String lastCustomerName;
    private  String pass;
    private  String email;
    private  String day;
    private  String month;
    private  String year;
    private  String firstName;
    private  String lastName;
    private  String company;
    private  String address1;
    private  String address2;
    private  String city;
    private  String state;
    private  String postcode;
    private  String country;
    private  String phone_mobile;
    private  String alias;

    public Account() {
    }

    public Account(String gender, String firstCustomerName, String lastCustomerName, String pass, String email,
                   String day, String month, String year, String firstName, String lastName, String company,
                   String address1, String address2, String city, String state, String postcode, String country,
                   String phone_mobile, String alias) {
        this.gender = gender;
        this.firstCustomerName = firstCustomerName;
        this.lastCustomerName = lastCustomerName;
        this.pass = pass;
        this.email = email;
        this.day = day;
        this.month = month;
        this.year = year;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.phone_mobile = phone_mobile;
        this.alias = alias;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstCustomerName() {
        return firstCustomerName;
    }

    public String getLastCustomerName() {
        return lastCustomerName;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone_mobile() {
        return phone_mobile;
    }

    public String getAlias() {
        return alias;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstCustomerName(String firstCustomerName) {
        this.firstCustomerName = firstCustomerName;
    }

    public void setLastCustomerName(String lastCustomerName) {
        this.lastCustomerName = lastCustomerName;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPhone_mobile(String phone_mobile) {
        this.phone_mobile = phone_mobile;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }


    public static class AccountBuilder {
        private String gender;
        private String firstCustomerName;
        private String lastCustomerName;
        private String pass;
        private String email;
        private String day;
        private String month;
        private String year;
        private String firstName;
        private String lastName;
        private String company;
        private String address1;
        private String address2;
        private String city;
        private String state;
        private String postcode;
        private String country;
        private String phone_mobile;
        private String alias;

        public AccountBuilder withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public AccountBuilder withFirstCustomerName(String firstCustomerName) {
            this.firstCustomerName = firstCustomerName;
            return this;
        }

        public AccountBuilder withLastCustomerName(String lastCustomerName) {
            this.lastCustomerName = lastCustomerName;
            return this;
        }

        public AccountBuilder withPass(String pass) {
            this.pass = pass;
            return this;
        }

        public AccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public AccountBuilder withDay(String day) {
            this.day = day;
            return this;
        }

        public AccountBuilder withMonth(String month) {
            this.month = month;
            return this;
        }

        public AccountBuilder withYear(String year) {
            this.year = year;
            return this;
        }

        public AccountBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public AccountBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public AccountBuilder withCompany(String company) {
            this.company = company;
            return this;
        }

        public AccountBuilder withAddress1(String address1) {
            this.address1 = address1;
            return this;
        }

        public AccountBuilder withAddress2(String address2) {
            this.address2 = address2;
            return this;
        }

        public AccountBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public AccountBuilder withState(String state) {
            this.state = state;
            return this;
        }

        public AccountBuilder withPostcode(String postcode) {
            this.postcode = postcode;
            return this;
        }

        public AccountBuilder withCountry(String country) {
            this.country = country;
            return this;
        }

        public AccountBuilder withPhone_mobile(String phone_mobile) {
            this.phone_mobile = phone_mobile;
            return this;
        }

        public AccountBuilder withAlias(String alias) {
            this.alias = alias;
            return this;
        }

        public Account create() {
            return new Account(gender, firstCustomerName, lastCustomerName, pass, email, day, month, year, firstName, lastName, company, address1, address2, city, state, postcode, country, phone_mobile, alias);
        }
    }
}
