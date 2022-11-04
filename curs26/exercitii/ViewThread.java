package curs26.exercitii;

import java.util.List;

public class ViewThread extends Thread{

    List<String> names;

    public ViewThread(List<String> names) {
        this.names = names;
    }

    public ViewThread(String name, List<String> names) {
        super(name);
        this.names = names;
    }

    @Override
    public void run() {
        names.forEach(name ->
                System.out.println(Thread.currentThread().getName() + " : " + name));
    }
}
