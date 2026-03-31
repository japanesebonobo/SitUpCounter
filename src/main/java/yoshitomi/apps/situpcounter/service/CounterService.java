package yoshitomi.apps.situpcounter.service;

import org.springframework.stereotype.Service;
import yoshitomi.apps.situpcounter.repository.CounterDataRepository;

@Service
public class CounterService {

    private final CounterDataRepository counterDataRepository;

    public CounterService(CounterDataRepository counterDataRepository) {
        this.counterDataRepository = counterDataRepository;
    }

    public String getCounterValue() {
        return String.valueOf(counterDataRepository.getCounter());
    }

    public void updateCounterValue() {
        counterDataRepository.updateCounter();
    }

    public void setCounterValue(int value) {
        counterDataRepository.setCounter(value);
    }

    public void decrementCounterValue() {
        counterDataRepository.decrementCounter();
    }
}
