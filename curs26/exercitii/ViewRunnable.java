package curs26.exercitii;

import java.util.List;

public class ViewRunnable implements Runnable{

    private List<String> names;

    public ViewRunnable(List<String> names) {
        this.names = names;
    }

    public ViewRunnable() {
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public void run() {
        names.forEach(name ->
                System.out.println(Thread.currentThread().getName() + " : " + name));
    }
}
