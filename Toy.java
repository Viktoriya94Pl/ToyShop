public class Toy {
    
    private int id;
    private String name;
    private int freguency;

    public Toy (int id, String name, int freguency){
    this.id = id;
    this.name = name;
    this.freguency = freguency;
}

public int getId() {
    return id;
}

public String getName (){
    return name;
}

public int getFrequency (){
    return freguency;
}

public void setFreguency(int freguency) {
    this.freguency = freguency;
}

}

