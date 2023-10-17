import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class ToyShop {
    
    private PriorityQueue<Toy> queue;

    public ToyShop (){
        queue = new PriorityQueue<>((t1, t2)-> t2.getFrequency() - t1.getFrequency());
    }

    public void addToy (Toy toy){
        queue.add(toy);
    }

    public void setWeight (int id, int weight){
        for (Toy toy : queue) {
            if(toy.getId() == id){
                toy.setFreguency(weight);
                return;
            }
        }
    }
    public void play (){
        try {
            FileWriter writer = new FileWriter("result.txt");
            for (int i = 0; i < 10; i++) {
                Toy toy = queue.poll();
                writer.write(toy.getName() + "\n");
                toy.setFreguency(toy.getFrequency() - 1);

                if (toy.getFrequency() > 0){
                    queue.add(toy);
                }
                
            }

            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
