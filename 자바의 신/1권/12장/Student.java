public class Student {

    String name, address, phone, email;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address, String phone, String email) {
        super();
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return name+" "+address+" "+phone+" "+email;
    }

    @Override
    public boolean equals(Object obj) {
         if (this == obj)
                return true;
         if (obj == null)
                return false;
         if (getClass() != obj.getClass())
                return false;
         Student other = (Student) obj;
         if (address == null) {
              if (other.address != null)
                  return false;
         } else if (!email.equals(other.address))
                return false;
         if (name == null){
            if (other.name != null)
                   return false;
         } else if (!name.equals(other.name))
                return false;
         if (phone == null) {
            if (other.phone != null)
                    return false;
         } else if (!phone.equals(other.phone))
                return false;
         return true;
        }
}
