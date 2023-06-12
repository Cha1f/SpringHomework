package springdemocom.example.springdemo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class ShopService {
    private final List <Integer> repository = new ArrayList<>();

    public void add(List<Integer> shop) {
        repository.addAll(shop);
    }

    public List<Integer> get() {
        return Collections.unmodifiableList(repository);
    }
}
