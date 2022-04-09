package observer_pattern;

import java.util.ArrayList;
import java.util.List;


public class MessagePublisher  {

    private Message message;

    private List<Observer> observers = new ArrayList<>();

    public MessagePublisher(Message m){
        this.message=m;
        notifyUpdate();

    }


    public void attach(Observer o) {
        observers.add(o);
    }


    public void detach(Observer o) {
        observers.remove(o);
    }

    public void setMessage(Message m){
        this.message=m;
        notifyUpdate();

    }


    private void notifyUpdate() {
        for(Observer o: observers) {
            o.update(message);
        }
    }
}