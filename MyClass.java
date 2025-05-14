import java.io.*;

class MyClass implements Serializable {
    private String name;
    private transient String password;

    public MyClass(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass("example", "secret");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {

            oos.writeObject(obj);

            MyClass deserializedObj = (MyClass) ois.readObject();
            System.out.println("Name: " + deserializedObj.getName());
            System.out.println("Password: " + deserializedObj.getPassword());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}