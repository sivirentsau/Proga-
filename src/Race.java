public class Race {
    private String data;
    private int members;
    private boolean prises;

    public void setData(String data) {
        this.data = data;
    }

    public void setPrises(boolean prises) {
        this.prises = prises;
    }

    public void setMembers(int members) {
        this.members = members;
    }


    public String getData() {
        return data;
    }

    public boolean isPrises() {
        return prises;
    }

    public int getMembers() {
        return members;
    }

    public void Print() {
        System.out.println("Дата: " + data);
        if (prises) {
            System.out.println("Есть призы.");
        } else {
            System.out.println("Нет призов.");
        }
        System.out.println("Количество участников: " + members);
    }

}
