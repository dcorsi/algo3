package algo3;

import java.util.*;

// 1) Knows its observers. Any number of Observer objects may observe a subject.
// 2) Provides an interface for attaching and detaching Observer objects.

public abstract class ObservableSubject {

	private List<Observer> observers = new ArrayList<>();

	public void registrarObserver(Observer observer) {
		observers.add(observer);
	}

	public void removerObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notificarObservers() {
		for (Observer observer : observers)
			observer.actualizar();
	}
}
