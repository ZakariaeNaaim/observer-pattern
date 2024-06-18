package org.example;


public class Main {
    public static void main(String[] args) throws Exception {

        ObservableImpl observable = new ObservableImpl();
        observable.setState(90);
        observable.setState(30);
        Observer observer = new ObserverImpl();
        observable.subscribe(observer);
        observable.subscribe(new ObserverImpl2());
        observable.setState(30);
        observable.setState(10);
        observable.unsubscribe(observer);
        observable.setState(50);

        observable.subscribe(new Observer() {
            @Override
            public void update(int etat) {
                System.out.println("***************");
                System.out.println("pr" + etat*etat);
                System.out.println("*****************");
            }
        });
        // with lambda expression when we have an interface that have just one function we called the interface 'functional interface'
        // etat is the entry parameter of the function inside The observer implementation
        observable.subscribe(etat -> {
            System.out.println("***************");
            System.out.println("pr" + etat*etat);
            System.out.println("*****************");
        });
        observable.setState(50);
        observable.setState(50);

    }
}