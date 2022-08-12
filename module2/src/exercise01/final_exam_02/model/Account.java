package exercise01.final_exam_02.model;

public abstract class Account {
    private int id;
    private String code;
    private String name;
    private String date;

    public Account() {
    }

    public Account(int id, String code, String name, String date) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return id + "," + code + "," + name + "," + date;
    }


//    @Override
//    public String toString() {
//        return "Account{" +
//                "id=" + id +
//                ", code='" + code + '\'' +
//                ", name='" + name + '\'' +
//                ", date='" + date + '\'' +
//                '}';
//    }
}
