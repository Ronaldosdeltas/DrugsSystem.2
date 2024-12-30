package backfirststeps.model;

public class Itens {
    private int code;
    private String name;
    private int amount;
    private String type;

    public Itens(String name, int amount, String type) {
        this.name = name;
        this.amount = amount;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Itens{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}
